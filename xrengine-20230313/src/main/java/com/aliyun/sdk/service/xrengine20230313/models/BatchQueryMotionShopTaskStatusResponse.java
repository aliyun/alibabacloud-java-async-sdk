// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchQueryMotionShopTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>BatchQueryMotionShopTaskStatusResponse</p>
 */
public class BatchQueryMotionShopTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private BatchQueryMotionShopTaskStatusResponseBody body;

    private BatchQueryMotionShopTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static BatchQueryMotionShopTaskStatusResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public BatchQueryMotionShopTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchQueryMotionShopTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(BatchQueryMotionShopTaskStatusResponseBody body);

        @Override
        BatchQueryMotionShopTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchQueryMotionShopTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private BatchQueryMotionShopTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchQueryMotionShopTaskStatusResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(BatchQueryMotionShopTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchQueryMotionShopTaskStatusResponse build() {
            return new BatchQueryMotionShopTaskStatusResponse(this);
        } 

    } 

}
