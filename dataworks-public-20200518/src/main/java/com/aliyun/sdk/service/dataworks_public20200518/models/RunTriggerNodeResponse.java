// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunTriggerNodeResponse} extends {@link TeaModel}
 *
 * <p>RunTriggerNodeResponse</p>
 */
public class RunTriggerNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunTriggerNodeResponseBody body;

    private RunTriggerNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunTriggerNodeResponse create() {
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
    public RunTriggerNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunTriggerNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunTriggerNodeResponseBody body);

        @Override
        RunTriggerNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunTriggerNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunTriggerNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunTriggerNodeResponse response) {
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
        public Builder body(RunTriggerNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunTriggerNodeResponse build() {
            return new RunTriggerNodeResponse(this);
        } 

    } 

}
