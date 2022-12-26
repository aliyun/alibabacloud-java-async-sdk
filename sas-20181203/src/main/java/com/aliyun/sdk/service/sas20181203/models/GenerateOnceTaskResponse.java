// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOnceTaskResponse} extends {@link TeaModel}
 *
 * <p>GenerateOnceTaskResponse</p>
 */
public class GenerateOnceTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateOnceTaskResponseBody body;

    private GenerateOnceTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateOnceTaskResponse create() {
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
    public GenerateOnceTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateOnceTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateOnceTaskResponseBody body);

        @Override
        GenerateOnceTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateOnceTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateOnceTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateOnceTaskResponse response) {
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
        public Builder body(GenerateOnceTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateOnceTaskResponse build() {
            return new GenerateOnceTaskResponse(this);
        } 

    } 

}
