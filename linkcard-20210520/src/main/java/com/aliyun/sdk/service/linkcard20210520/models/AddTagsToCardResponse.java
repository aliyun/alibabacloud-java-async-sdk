// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsToCardResponse} extends {@link TeaModel}
 *
 * <p>AddTagsToCardResponse</p>
 */
public class AddTagsToCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddTagsToCardResponseBody body;

    private AddTagsToCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddTagsToCardResponse create() {
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
    public AddTagsToCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddTagsToCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddTagsToCardResponseBody body);

        @Override
        AddTagsToCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddTagsToCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddTagsToCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddTagsToCardResponse response) {
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
        public Builder body(AddTagsToCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddTagsToCardResponse build() {
            return new AddTagsToCardResponse(this);
        } 

    } 

}
