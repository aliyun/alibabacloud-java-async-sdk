// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDataKeyWithoutPlaintextResponse} extends {@link TeaModel}
 *
 * <p>GenerateDataKeyWithoutPlaintextResponse</p>
 */
public class GenerateDataKeyWithoutPlaintextResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GenerateDataKeyWithoutPlaintextResponseBody body;

    private GenerateDataKeyWithoutPlaintextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GenerateDataKeyWithoutPlaintextResponse create() {
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
    public GenerateDataKeyWithoutPlaintextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateDataKeyWithoutPlaintextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GenerateDataKeyWithoutPlaintextResponseBody body);

        @Override
        GenerateDataKeyWithoutPlaintextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateDataKeyWithoutPlaintextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GenerateDataKeyWithoutPlaintextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateDataKeyWithoutPlaintextResponse response) {
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
        public Builder body(GenerateDataKeyWithoutPlaintextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateDataKeyWithoutPlaintextResponse build() {
            return new GenerateDataKeyWithoutPlaintextResponse(this);
        } 

    } 

}
