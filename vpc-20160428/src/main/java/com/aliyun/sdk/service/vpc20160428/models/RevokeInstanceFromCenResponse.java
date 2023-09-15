// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeInstanceFromCenResponse} extends {@link TeaModel}
 *
 * <p>RevokeInstanceFromCenResponse</p>
 */
public class RevokeInstanceFromCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeInstanceFromCenResponseBody body;

    private RevokeInstanceFromCenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RevokeInstanceFromCenResponse create() {
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
    public RevokeInstanceFromCenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeInstanceFromCenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RevokeInstanceFromCenResponseBody body);

        @Override
        RevokeInstanceFromCenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeInstanceFromCenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RevokeInstanceFromCenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeInstanceFromCenResponse response) {
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
        public Builder body(RevokeInstanceFromCenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeInstanceFromCenResponse build() {
            return new RevokeInstanceFromCenResponse(this);
        } 

    } 

}
