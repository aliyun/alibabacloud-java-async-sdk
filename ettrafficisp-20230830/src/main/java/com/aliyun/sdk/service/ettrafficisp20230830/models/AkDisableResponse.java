// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ettrafficisp20230830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AkDisableResponse} extends {@link TeaModel}
 *
 * <p>AkDisableResponse</p>
 */
public class AkDisableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private AkDisableResponseBody body;

    private AkDisableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AkDisableResponse create() {
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
    public AkDisableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AkDisableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AkDisableResponseBody body);

        @Override
        AkDisableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AkDisableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AkDisableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AkDisableResponse response) {
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
        public Builder body(AkDisableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AkDisableResponse build() {
            return new AkDisableResponse(this);
        } 

    } 

}
