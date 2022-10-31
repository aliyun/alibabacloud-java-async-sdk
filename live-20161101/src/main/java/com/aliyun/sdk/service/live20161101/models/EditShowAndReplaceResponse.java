// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditShowAndReplaceResponse} extends {@link TeaModel}
 *
 * <p>EditShowAndReplaceResponse</p>
 */
public class EditShowAndReplaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditShowAndReplaceResponseBody body;

    private EditShowAndReplaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditShowAndReplaceResponse create() {
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
    public EditShowAndReplaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditShowAndReplaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditShowAndReplaceResponseBody body);

        @Override
        EditShowAndReplaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditShowAndReplaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditShowAndReplaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditShowAndReplaceResponse response) {
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
        public Builder body(EditShowAndReplaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditShowAndReplaceResponse build() {
            return new EditShowAndReplaceResponse(this);
        } 

    } 

}
