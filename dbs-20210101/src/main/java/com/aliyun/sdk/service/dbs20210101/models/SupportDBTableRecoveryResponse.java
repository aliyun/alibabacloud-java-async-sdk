// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SupportDBTableRecoveryResponse} extends {@link TeaModel}
 *
 * <p>SupportDBTableRecoveryResponse</p>
 */
public class SupportDBTableRecoveryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SupportDBTableRecoveryResponseBody body;

    private SupportDBTableRecoveryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SupportDBTableRecoveryResponse create() {
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
    public SupportDBTableRecoveryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SupportDBTableRecoveryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SupportDBTableRecoveryResponseBody body);

        @Override
        SupportDBTableRecoveryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SupportDBTableRecoveryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SupportDBTableRecoveryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SupportDBTableRecoveryResponse response) {
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
        public Builder body(SupportDBTableRecoveryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SupportDBTableRecoveryResponse build() {
            return new SupportDBTableRecoveryResponse(this);
        } 

    } 

}
