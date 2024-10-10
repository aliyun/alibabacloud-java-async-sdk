// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateK8sAccessInfoResponse} extends {@link TeaModel}
 *
 * <p>GenerateK8sAccessInfoResponse</p>
 */
public class GenerateK8sAccessInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GenerateK8sAccessInfoResponseBody body;

    private GenerateK8sAccessInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GenerateK8sAccessInfoResponse create() {
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
    public GenerateK8sAccessInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateK8sAccessInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GenerateK8sAccessInfoResponseBody body);

        @Override
        GenerateK8sAccessInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateK8sAccessInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GenerateK8sAccessInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateK8sAccessInfoResponse response) {
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
        public Builder body(GenerateK8sAccessInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateK8sAccessInfoResponse build() {
            return new GenerateK8sAccessInfoResponse(this);
        } 

    } 

}
