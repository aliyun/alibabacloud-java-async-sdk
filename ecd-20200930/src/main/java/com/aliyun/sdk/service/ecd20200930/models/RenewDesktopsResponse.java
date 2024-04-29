// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewDesktopsResponse} extends {@link TeaModel}
 *
 * <p>RenewDesktopsResponse</p>
 */
public class RenewDesktopsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RenewDesktopsResponseBody body;

    private RenewDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RenewDesktopsResponse create() {
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
    public RenewDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RenewDesktopsResponseBody body);

        @Override
        RenewDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RenewDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewDesktopsResponse response) {
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
        public Builder body(RenewDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewDesktopsResponse build() {
            return new RenewDesktopsResponse(this);
        } 

    } 

}
