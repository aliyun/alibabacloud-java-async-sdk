// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelHandshakeResponse} extends {@link TeaModel}
 *
 * <p>CancelHandshakeResponse</p>
 */
public class CancelHandshakeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private CancelHandshakeResponseBody body;

    private CancelHandshakeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelHandshakeResponse create() {
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
    public CancelHandshakeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelHandshakeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CancelHandshakeResponseBody body);

        @Override
        CancelHandshakeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelHandshakeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CancelHandshakeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelHandshakeResponse response) {
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
        public Builder body(CancelHandshakeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelHandshakeResponse build() {
            return new CancelHandshakeResponse(this);
        } 

    } 

}
