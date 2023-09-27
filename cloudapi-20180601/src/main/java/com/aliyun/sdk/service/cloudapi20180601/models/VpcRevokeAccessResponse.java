// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcRevokeAccessResponse} extends {@link TeaModel}
 *
 * <p>VpcRevokeAccessResponse</p>
 */
public class VpcRevokeAccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private VpcRevokeAccessResponseBody body;

    private VpcRevokeAccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static VpcRevokeAccessResponse create() {
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
    public VpcRevokeAccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VpcRevokeAccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(VpcRevokeAccessResponseBody body);

        @Override
        VpcRevokeAccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VpcRevokeAccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private VpcRevokeAccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VpcRevokeAccessResponse response) {
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
        public Builder body(VpcRevokeAccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VpcRevokeAccessResponse build() {
            return new VpcRevokeAccessResponse(this);
        } 

    } 

}
