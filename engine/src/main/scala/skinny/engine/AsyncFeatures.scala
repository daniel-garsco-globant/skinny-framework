package skinny.engine

import skinny.engine.async.{ AsyncBeforeAfterDsl, AsyncSupport }
import skinny.engine.json.JSONOperations
import skinny.engine.routing.AsyncRoutingDsl
import skinny.util.JSONStringOpsConfig

/**
 * Built-in features in SkinnyEngineFilter/SkinnyEngineServlet.
 * These traits should not be mixed in SkinnyEngineBase.
 */
trait AsyncFeatures
    extends AsyncSupport
    with AsyncRoutingDsl
    with AsyncBeforeAfterDsl
    with JSONOperations
    with JSONStringOpsConfig { self: SkinnyEngineBase =>

}
