// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostISRetrieveRouterResponse} extends {@link TeaModel}
 *
 * <p>PostISRetrieveRouterResponse</p>
 */
public class PostISRetrieveRouterResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private PostISRetrieveRouterResponseBody body;

    private PostISRetrieveRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PostISRetrieveRouterResponse create() {
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
    public PostISRetrieveRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PostISRetrieveRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PostISRetrieveRouterResponseBody body);

        @Override
        PostISRetrieveRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PostISRetrieveRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PostISRetrieveRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PostISRetrieveRouterResponse response) {
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
        public Builder body(PostISRetrieveRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PostISRetrieveRouterResponse build() {
            return new PostISRetrieveRouterResponse(this);
        } 

    } 

}
