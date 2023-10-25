// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTLSCipherPolicyAttributeResponse} extends {@link TeaModel}
 *
 * <p>SetTLSCipherPolicyAttributeResponse</p>
 */
public class SetTLSCipherPolicyAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private SetTLSCipherPolicyAttributeResponseBody body;

    private SetTLSCipherPolicyAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetTLSCipherPolicyAttributeResponse create() {
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
    public SetTLSCipherPolicyAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetTLSCipherPolicyAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetTLSCipherPolicyAttributeResponseBody body);

        @Override
        SetTLSCipherPolicyAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetTLSCipherPolicyAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SetTLSCipherPolicyAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetTLSCipherPolicyAttributeResponse response) {
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
        public Builder body(SetTLSCipherPolicyAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetTLSCipherPolicyAttributeResponse build() {
            return new SetTLSCipherPolicyAttributeResponse(this);
        } 

    } 

}
