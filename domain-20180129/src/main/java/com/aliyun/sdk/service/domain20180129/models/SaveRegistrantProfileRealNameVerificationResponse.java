// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveRegistrantProfileRealNameVerificationResponse} extends {@link TeaModel}
 *
 * <p>SaveRegistrantProfileRealNameVerificationResponse</p>
 */
public class SaveRegistrantProfileRealNameVerificationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveRegistrantProfileRealNameVerificationResponseBody body;

    private SaveRegistrantProfileRealNameVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveRegistrantProfileRealNameVerificationResponse create() {
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
    public SaveRegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveRegistrantProfileRealNameVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveRegistrantProfileRealNameVerificationResponseBody body);

        @Override
        SaveRegistrantProfileRealNameVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveRegistrantProfileRealNameVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveRegistrantProfileRealNameVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveRegistrantProfileRealNameVerificationResponse response) {
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
        public Builder body(SaveRegistrantProfileRealNameVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveRegistrantProfileRealNameVerificationResponse build() {
            return new SaveRegistrantProfileRealNameVerificationResponse(this);
        } 

    } 

}
