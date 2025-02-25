// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundCdiBagResponse} extends {@link TeaModel}
 *
 * <p>RefundCdiBagResponse</p>
 */
public class RefundCdiBagResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private RefundCdiBagResponseBody body;

    private RefundCdiBagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RefundCdiBagResponse create() {
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
    public RefundCdiBagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefundCdiBagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RefundCdiBagResponseBody body);

        @Override
        RefundCdiBagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefundCdiBagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RefundCdiBagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefundCdiBagResponse response) {
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
        public Builder body(RefundCdiBagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefundCdiBagResponse build() {
            return new RefundCdiBagResponse(this);
        } 

    } 

}
