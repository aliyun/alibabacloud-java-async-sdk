// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveTaskFlowToScenarioResponse} extends {@link TeaModel}
 *
 * <p>MoveTaskFlowToScenarioResponse</p>
 */
public class MoveTaskFlowToScenarioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveTaskFlowToScenarioResponseBody body;

    private MoveTaskFlowToScenarioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveTaskFlowToScenarioResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public MoveTaskFlowToScenarioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveTaskFlowToScenarioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveTaskFlowToScenarioResponseBody body);

        @Override
        MoveTaskFlowToScenarioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveTaskFlowToScenarioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveTaskFlowToScenarioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveTaskFlowToScenarioResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(MoveTaskFlowToScenarioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveTaskFlowToScenarioResponse build() {
            return new MoveTaskFlowToScenarioResponse(this);
        } 

    } 

}
