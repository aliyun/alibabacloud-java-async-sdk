// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveShowFromShowListResponse} extends {@link TeaModel}
 *
 * <p>RemoveShowFromShowListResponse</p>
 */
public class RemoveShowFromShowListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveShowFromShowListResponseBody body;

    private RemoveShowFromShowListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveShowFromShowListResponse create() {
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
    public RemoveShowFromShowListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveShowFromShowListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveShowFromShowListResponseBody body);

        @Override
        RemoveShowFromShowListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveShowFromShowListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveShowFromShowListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveShowFromShowListResponse response) {
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
        public Builder body(RemoveShowFromShowListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveShowFromShowListResponse build() {
            return new RemoveShowFromShowListResponse(this);
        } 

    } 

}
