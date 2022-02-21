// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopBlueprintInstanceWorkflowResponse} extends {@link TeaModel}
 *
 * <p>StopBlueprintInstanceWorkflowResponse</p>
 */
public class StopBlueprintInstanceWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopBlueprintInstanceWorkflowResponseBody body;

    private StopBlueprintInstanceWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopBlueprintInstanceWorkflowResponse create() {
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
    public StopBlueprintInstanceWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopBlueprintInstanceWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopBlueprintInstanceWorkflowResponseBody body);

        @Override
        StopBlueprintInstanceWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopBlueprintInstanceWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopBlueprintInstanceWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopBlueprintInstanceWorkflowResponse response) {
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
        public Builder body(StopBlueprintInstanceWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopBlueprintInstanceWorkflowResponse build() {
            return new StopBlueprintInstanceWorkflowResponse(this);
        } 

    } 

}
