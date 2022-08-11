// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddToMetaCategoryResponse} extends {@link TeaModel}
 *
 * <p>AddToMetaCategoryResponse</p>
 */
public class AddToMetaCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddToMetaCategoryResponseBody body;

    private AddToMetaCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddToMetaCategoryResponse create() {
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
    public AddToMetaCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddToMetaCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddToMetaCategoryResponseBody body);

        @Override
        AddToMetaCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddToMetaCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddToMetaCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddToMetaCategoryResponse response) {
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
        public Builder body(AddToMetaCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddToMetaCategoryResponse build() {
            return new AddToMetaCategoryResponse(this);
        } 

    } 

}
