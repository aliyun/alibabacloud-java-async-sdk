// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCategoryResponse} extends {@link TeaModel}
 *
 * <p>UpdateCategoryResponse</p>
 */
public class UpdateCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCategoryResponseBody body;

    private UpdateCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCategoryResponse create() {
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
    public UpdateCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCategoryResponseBody body);

        @Override
        UpdateCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCategoryResponse response) {
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
        public Builder body(UpdateCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCategoryResponse build() {
            return new UpdateCategoryResponse(this);
        } 

    } 

}
