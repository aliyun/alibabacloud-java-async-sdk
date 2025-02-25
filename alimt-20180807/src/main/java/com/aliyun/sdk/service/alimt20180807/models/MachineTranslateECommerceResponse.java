// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20180807.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MachineTranslateECommerceResponse} extends {@link TeaModel}
 *
 * <p>MachineTranslateECommerceResponse</p>
 */
public class MachineTranslateECommerceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private MachineTranslateECommerceResponseBody body;

    private MachineTranslateECommerceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static MachineTranslateECommerceResponse create() {
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
    public MachineTranslateECommerceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MachineTranslateECommerceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(MachineTranslateECommerceResponseBody body);

        @Override
        MachineTranslateECommerceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MachineTranslateECommerceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private MachineTranslateECommerceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MachineTranslateECommerceResponse response) {
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
        public Builder body(MachineTranslateECommerceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MachineTranslateECommerceResponse build() {
            return new MachineTranslateECommerceResponse(this);
        } 

    } 

}
