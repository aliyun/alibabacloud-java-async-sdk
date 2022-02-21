// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOfficeSitesResponse} extends {@link TeaModel}
 *
 * <p>DeleteOfficeSitesResponse</p>
 */
public class DeleteOfficeSitesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteOfficeSitesResponseBody body;

    private DeleteOfficeSitesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteOfficeSitesResponse create() {
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
    public DeleteOfficeSitesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteOfficeSitesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteOfficeSitesResponseBody body);

        @Override
        DeleteOfficeSitesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteOfficeSitesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteOfficeSitesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteOfficeSitesResponse response) {
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
        public Builder body(DeleteOfficeSitesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteOfficeSitesResponse build() {
            return new DeleteOfficeSitesResponse(this);
        } 

    } 

}
