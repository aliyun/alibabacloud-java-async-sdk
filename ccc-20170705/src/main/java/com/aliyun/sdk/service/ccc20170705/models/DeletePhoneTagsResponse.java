// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePhoneTagsResponse} extends {@link TeaModel}
 *
 * <p>DeletePhoneTagsResponse</p>
 */
public class DeletePhoneTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePhoneTagsResponseBody body;

    private DeletePhoneTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePhoneTagsResponse create() {
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
    public DeletePhoneTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePhoneTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePhoneTagsResponseBody body);

        @Override
        DeletePhoneTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePhoneTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePhoneTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePhoneTagsResponse response) {
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
        public Builder body(DeletePhoneTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePhoneTagsResponse build() {
            return new DeletePhoneTagsResponse(this);
        } 

    } 

}
