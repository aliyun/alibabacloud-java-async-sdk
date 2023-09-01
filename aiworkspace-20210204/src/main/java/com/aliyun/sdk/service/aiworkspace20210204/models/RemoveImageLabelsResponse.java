// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveImageLabelsResponse} extends {@link TeaModel}
 *
 * <p>RemoveImageLabelsResponse</p>
 */
public class RemoveImageLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveImageLabelsResponseBody body;

    private RemoveImageLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveImageLabelsResponse create() {
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
    public RemoveImageLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveImageLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveImageLabelsResponseBody body);

        @Override
        RemoveImageLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveImageLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveImageLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveImageLabelsResponse response) {
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
        public Builder body(RemoveImageLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveImageLabelsResponse build() {
            return new RemoveImageLabelsResponse(this);
        } 

    } 

}
