// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditLogStatusResponse} extends {@link TeaModel}
 *
 * <p>GetAuditLogStatusResponse</p>
 */
public class GetAuditLogStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAuditLogStatusResponseBody body;

    private GetAuditLogStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAuditLogStatusResponse create() {
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
    public GetAuditLogStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuditLogStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAuditLogStatusResponseBody body);

        @Override
        GetAuditLogStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuditLogStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAuditLogStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuditLogStatusResponse response) {
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
        public Builder body(GetAuditLogStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuditLogStatusResponse build() {
            return new GetAuditLogStatusResponse(this);
        } 

    } 

}
