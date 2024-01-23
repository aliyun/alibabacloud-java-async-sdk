// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Mobile3MetaDetailVerifyResponse} extends {@link TeaModel}
 *
 * <p>Mobile3MetaDetailVerifyResponse</p>
 */
public class Mobile3MetaDetailVerifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private Mobile3MetaDetailVerifyResponseBody body;

    private Mobile3MetaDetailVerifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static Mobile3MetaDetailVerifyResponse create() {
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
    public Mobile3MetaDetailVerifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<Mobile3MetaDetailVerifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(Mobile3MetaDetailVerifyResponseBody body);

        @Override
        Mobile3MetaDetailVerifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<Mobile3MetaDetailVerifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private Mobile3MetaDetailVerifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(Mobile3MetaDetailVerifyResponse response) {
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
        public Builder body(Mobile3MetaDetailVerifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public Mobile3MetaDetailVerifyResponse build() {
            return new Mobile3MetaDetailVerifyResponse(this);
        } 

    } 

}
