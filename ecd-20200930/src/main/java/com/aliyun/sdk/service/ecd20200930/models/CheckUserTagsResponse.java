// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUserTagsResponse} extends {@link TeaModel}
 *
 * <p>CheckUserTagsResponse</p>
 */
public class CheckUserTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckUserTagsResponseBody body;

    private CheckUserTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckUserTagsResponse create() {
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
     * @return body
     */
    public CheckUserTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckUserTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckUserTagsResponseBody body);

        @Override
        CheckUserTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckUserTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckUserTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckUserTagsResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(CheckUserTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckUserTagsResponse build() {
            return new CheckUserTagsResponse(this);
        } 

    } 

}
