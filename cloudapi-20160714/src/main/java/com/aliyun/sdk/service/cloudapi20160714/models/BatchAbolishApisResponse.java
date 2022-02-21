// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAbolishApisResponse} extends {@link TeaModel}
 *
 * <p>BatchAbolishApisResponse</p>
 */
public class BatchAbolishApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAbolishApisResponseBody body;

    private BatchAbolishApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAbolishApisResponse create() {
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
    public BatchAbolishApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAbolishApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAbolishApisResponseBody body);

        @Override
        BatchAbolishApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAbolishApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAbolishApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAbolishApisResponse response) {
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
        public Builder body(BatchAbolishApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAbolishApisResponse build() {
            return new BatchAbolishApisResponse(this);
        } 

    } 

}
