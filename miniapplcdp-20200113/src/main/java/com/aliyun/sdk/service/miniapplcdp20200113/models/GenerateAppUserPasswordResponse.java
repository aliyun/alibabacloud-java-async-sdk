// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAppUserPasswordResponse} extends {@link TeaModel}
 *
 * <p>GenerateAppUserPasswordResponse</p>
 */
public class GenerateAppUserPasswordResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GenerateAppUserPasswordResponseBody body;

    private GenerateAppUserPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GenerateAppUserPasswordResponse create() {
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
    public GenerateAppUserPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateAppUserPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GenerateAppUserPasswordResponseBody body);

        @Override
        GenerateAppUserPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateAppUserPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GenerateAppUserPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateAppUserPasswordResponse response) {
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
        public Builder body(GenerateAppUserPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateAppUserPasswordResponse build() {
            return new GenerateAppUserPasswordResponse(this);
        } 

    } 

}
