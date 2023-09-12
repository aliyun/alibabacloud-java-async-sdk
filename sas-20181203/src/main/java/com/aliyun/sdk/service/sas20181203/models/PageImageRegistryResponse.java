// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageImageRegistryResponse} extends {@link TeaModel}
 *
 * <p>PageImageRegistryResponse</p>
 */
public class PageImageRegistryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private PageImageRegistryResponseBody body;

    private PageImageRegistryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PageImageRegistryResponse create() {
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
    public PageImageRegistryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageImageRegistryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PageImageRegistryResponseBody body);

        @Override
        PageImageRegistryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageImageRegistryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PageImageRegistryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageImageRegistryResponse response) {
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
        public Builder body(PageImageRegistryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageImageRegistryResponse build() {
            return new PageImageRegistryResponse(this);
        } 

    } 

}
