// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditPlaylistResponse} extends {@link TeaModel}
 *
 * <p>EditPlaylistResponse</p>
 */
public class EditPlaylistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditPlaylistResponseBody body;

    private EditPlaylistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditPlaylistResponse create() {
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
    public EditPlaylistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditPlaylistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditPlaylistResponseBody body);

        @Override
        EditPlaylistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditPlaylistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditPlaylistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditPlaylistResponse response) {
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
        public Builder body(EditPlaylistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditPlaylistResponse build() {
            return new EditPlaylistResponse(this);
        } 

    } 

}
