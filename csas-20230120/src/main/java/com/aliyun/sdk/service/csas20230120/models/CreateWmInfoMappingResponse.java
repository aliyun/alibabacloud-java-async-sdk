// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWmInfoMappingResponse} extends {@link TeaModel}
 *
 * <p>CreateWmInfoMappingResponse</p>
 */
public class CreateWmInfoMappingResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateWmInfoMappingResponseBody body;

    private CreateWmInfoMappingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateWmInfoMappingResponse create() {
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
    public CreateWmInfoMappingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWmInfoMappingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateWmInfoMappingResponseBody body);

        @Override
        CreateWmInfoMappingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWmInfoMappingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateWmInfoMappingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWmInfoMappingResponse response) {
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
        public Builder body(CreateWmInfoMappingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWmInfoMappingResponse build() {
            return new CreateWmInfoMappingResponse(this);
        } 

    } 

}
