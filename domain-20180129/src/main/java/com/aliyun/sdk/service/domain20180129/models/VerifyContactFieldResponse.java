// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyContactFieldResponse} extends {@link TeaModel}
 *
 * <p>VerifyContactFieldResponse</p>
 */
public class VerifyContactFieldResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private VerifyContactFieldResponseBody body;

    private VerifyContactFieldResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static VerifyContactFieldResponse create() {
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
    public VerifyContactFieldResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyContactFieldResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(VerifyContactFieldResponseBody body);

        @Override
        VerifyContactFieldResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyContactFieldResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private VerifyContactFieldResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyContactFieldResponse response) {
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
        public Builder body(VerifyContactFieldResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyContactFieldResponse build() {
            return new VerifyContactFieldResponse(this);
        } 

    } 

}
