// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostEventDisposeAndWhiteruleListResponse} extends {@link TeaModel}
 *
 * <p>PostEventDisposeAndWhiteruleListResponse</p>
 */
public class PostEventDisposeAndWhiteruleListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private PostEventDisposeAndWhiteruleListResponseBody body;

    private PostEventDisposeAndWhiteruleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PostEventDisposeAndWhiteruleListResponse create() {
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
    public PostEventDisposeAndWhiteruleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PostEventDisposeAndWhiteruleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PostEventDisposeAndWhiteruleListResponseBody body);

        @Override
        PostEventDisposeAndWhiteruleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PostEventDisposeAndWhiteruleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PostEventDisposeAndWhiteruleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PostEventDisposeAndWhiteruleListResponse response) {
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
        public Builder body(PostEventDisposeAndWhiteruleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PostEventDisposeAndWhiteruleListResponse build() {
            return new PostEventDisposeAndWhiteruleListResponse(this);
        } 

    } 

}
