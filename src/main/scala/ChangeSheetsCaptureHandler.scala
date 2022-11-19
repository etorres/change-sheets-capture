package es.eriktorr.sheets

import cats.effect.IO
import feral.lambda.events.ApiGatewayProxyEventV2
import feral.lambda.{Context, INothing, IOLambda}
import smithy4s.aws._
import smithy4s.aws.http4s._
import com.amazonaws.s3._

object ChangeSheetsCaptureHandler extends IOLambda.Simple[ApiGatewayProxyEventV2, INothing] {
  override def apply(
      event: ApiGatewayProxyEventV2,
      context: Context[IO],
      init: Init
  ): IO[Option[INothing]] =
    IO.println(s"Received event with body content: ${event.body.getOrElse("<empty>")}").as(None)
}
