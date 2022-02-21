// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeployApisResponse} extends {@link TeaModel}
 *
 * <p>BatchDeployApisResponse</p>
 */
public class BatchDeployApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeployApisResponseBody body;

    private BatchDeployApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeployApisResponse create() {
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
    public BatchDeployApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeployApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeployApisResponseBody body);

        @Override
        BatchDeployApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeployApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeployApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeployApisResponse response) {
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
        public Builder body(BatchDeployApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeployApisResponse build() {
            return new BatchDeployApisResponse(this);
        } 

    } 

}
