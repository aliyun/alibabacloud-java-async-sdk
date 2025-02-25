// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRetcodeAppResponse} extends {@link TeaModel}
 *
 * <p>CreateRetcodeAppResponse</p>
 */
public class CreateRetcodeAppResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateRetcodeAppResponseBody body;

    private CreateRetcodeAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateRetcodeAppResponse create() {
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
    public CreateRetcodeAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRetcodeAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateRetcodeAppResponseBody body);

        @Override
        CreateRetcodeAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRetcodeAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateRetcodeAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRetcodeAppResponse response) {
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
        public Builder body(CreateRetcodeAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRetcodeAppResponse build() {
            return new CreateRetcodeAppResponse(this);
        } 

    } 

}
