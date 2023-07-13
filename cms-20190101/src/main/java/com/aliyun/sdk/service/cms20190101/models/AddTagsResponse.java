// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsResponse} extends {@link TeaModel}
 *
 * <p>AddTagsResponse</p>
 */
public class AddTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddTagsResponseBody body;

    private AddTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddTagsResponse create() {
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
    public AddTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddTagsResponseBody body);

        @Override
        AddTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddTagsResponse response) {
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
        public Builder body(AddTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddTagsResponse build() {
            return new AddTagsResponse(this);
        } 

    } 

}
