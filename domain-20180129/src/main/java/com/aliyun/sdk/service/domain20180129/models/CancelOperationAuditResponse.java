// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelOperationAuditResponse} extends {@link TeaModel}
 *
 * <p>CancelOperationAuditResponse</p>
 */
public class CancelOperationAuditResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CancelOperationAuditResponseBody body;

    private CancelOperationAuditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelOperationAuditResponse create() {
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
    public CancelOperationAuditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelOperationAuditResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CancelOperationAuditResponseBody body);

        @Override
        CancelOperationAuditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelOperationAuditResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CancelOperationAuditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelOperationAuditResponse response) {
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
        public Builder body(CancelOperationAuditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelOperationAuditResponse build() {
            return new CancelOperationAuditResponse(this);
        } 

    } 

}
