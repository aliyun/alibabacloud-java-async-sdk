// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductTagsResponse} extends {@link TeaModel}
 *
 * <p>UpdateProductTagsResponse</p>
 */
public class UpdateProductTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProductTagsResponseBody body;

    private UpdateProductTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProductTagsResponse create() {
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
    public UpdateProductTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProductTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProductTagsResponseBody body);

        @Override
        UpdateProductTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProductTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProductTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProductTagsResponse response) {
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
        public Builder body(UpdateProductTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProductTagsResponse build() {
            return new UpdateProductTagsResponse(this);
        } 

    } 

}
