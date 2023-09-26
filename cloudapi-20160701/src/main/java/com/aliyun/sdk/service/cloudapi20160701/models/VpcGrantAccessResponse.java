// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcGrantAccessResponse} extends {@link TeaModel}
 *
 * <p>VpcGrantAccessResponse</p>
 */
public class VpcGrantAccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private VpcGrantAccessResponseBody body;

    private VpcGrantAccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static VpcGrantAccessResponse create() {
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
    public VpcGrantAccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VpcGrantAccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(VpcGrantAccessResponseBody body);

        @Override
        VpcGrantAccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VpcGrantAccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private VpcGrantAccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VpcGrantAccessResponse response) {
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
        public Builder body(VpcGrantAccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VpcGrantAccessResponse build() {
            return new VpcGrantAccessResponse(this);
        } 

    } 

}
