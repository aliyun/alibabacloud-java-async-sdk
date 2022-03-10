// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveFavoritesResponse} extends {@link TeaModel}
 *
 * <p>SaveFavoritesResponse</p>
 */
public class SaveFavoritesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveFavoritesResponseBody body;

    private SaveFavoritesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveFavoritesResponse create() {
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
    public SaveFavoritesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveFavoritesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveFavoritesResponseBody body);

        @Override
        SaveFavoritesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveFavoritesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveFavoritesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveFavoritesResponse response) {
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
        public Builder body(SaveFavoritesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveFavoritesResponse build() {
            return new SaveFavoritesResponse(this);
        } 

    } 

}
