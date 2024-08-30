// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelInstanceRefreshResponse} extends {@link TeaModel}
 *
 * <p>CancelInstanceRefreshResponse</p>
 */
public class CancelInstanceRefreshResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CancelInstanceRefreshResponseBody body;

    private CancelInstanceRefreshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelInstanceRefreshResponse create() {
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
    public CancelInstanceRefreshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelInstanceRefreshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CancelInstanceRefreshResponseBody body);

        @Override
        CancelInstanceRefreshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelInstanceRefreshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CancelInstanceRefreshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelInstanceRefreshResponse response) {
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
        public Builder body(CancelInstanceRefreshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelInstanceRefreshResponse build() {
            return new CancelInstanceRefreshResponse(this);
        } 

    } 

}
