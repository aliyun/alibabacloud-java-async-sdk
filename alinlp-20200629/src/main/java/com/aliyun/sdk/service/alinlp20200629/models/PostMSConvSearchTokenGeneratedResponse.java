// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostMSConvSearchTokenGeneratedResponse} extends {@link TeaModel}
 *
 * <p>PostMSConvSearchTokenGeneratedResponse</p>
 */
public class PostMSConvSearchTokenGeneratedResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PostMSConvSearchTokenGeneratedResponseBody body;

    private PostMSConvSearchTokenGeneratedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PostMSConvSearchTokenGeneratedResponse create() {
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
    public PostMSConvSearchTokenGeneratedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PostMSConvSearchTokenGeneratedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PostMSConvSearchTokenGeneratedResponseBody body);

        @Override
        PostMSConvSearchTokenGeneratedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PostMSConvSearchTokenGeneratedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PostMSConvSearchTokenGeneratedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PostMSConvSearchTokenGeneratedResponse response) {
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
        public Builder body(PostMSConvSearchTokenGeneratedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PostMSConvSearchTokenGeneratedResponse build() {
            return new PostMSConvSearchTokenGeneratedResponse(this);
        } 

    } 

}
