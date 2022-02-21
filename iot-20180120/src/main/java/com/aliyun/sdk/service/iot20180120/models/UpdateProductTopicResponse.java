// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductTopicResponse} extends {@link TeaModel}
 *
 * <p>UpdateProductTopicResponse</p>
 */
public class UpdateProductTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProductTopicResponseBody body;

    private UpdateProductTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProductTopicResponse create() {
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
    public UpdateProductTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProductTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProductTopicResponseBody body);

        @Override
        UpdateProductTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProductTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProductTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProductTopicResponse response) {
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
        public Builder body(UpdateProductTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProductTopicResponse build() {
            return new UpdateProductTopicResponse(this);
        } 

    } 

}
