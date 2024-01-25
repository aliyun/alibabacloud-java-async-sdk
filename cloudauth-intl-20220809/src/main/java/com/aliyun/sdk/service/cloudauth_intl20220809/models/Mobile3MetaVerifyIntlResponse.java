// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Mobile3MetaVerifyIntlResponse} extends {@link TeaModel}
 *
 * <p>Mobile3MetaVerifyIntlResponse</p>
 */
public class Mobile3MetaVerifyIntlResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private Mobile3MetaVerifyIntlResponseBody body;

    private Mobile3MetaVerifyIntlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static Mobile3MetaVerifyIntlResponse create() {
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
    public Mobile3MetaVerifyIntlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<Mobile3MetaVerifyIntlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(Mobile3MetaVerifyIntlResponseBody body);

        @Override
        Mobile3MetaVerifyIntlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<Mobile3MetaVerifyIntlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private Mobile3MetaVerifyIntlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(Mobile3MetaVerifyIntlResponse response) {
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
        public Builder body(Mobile3MetaVerifyIntlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public Mobile3MetaVerifyIntlResponse build() {
            return new Mobile3MetaVerifyIntlResponse(this);
        } 

    } 

}
