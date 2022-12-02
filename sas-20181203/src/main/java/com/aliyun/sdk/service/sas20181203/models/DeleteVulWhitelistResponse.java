// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVulWhitelistResponse} extends {@link TeaModel}
 *
 * <p>DeleteVulWhitelistResponse</p>
 */
public class DeleteVulWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVulWhitelistResponseBody body;

    private DeleteVulWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVulWhitelistResponse create() {
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
    public DeleteVulWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVulWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVulWhitelistResponseBody body);

        @Override
        DeleteVulWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVulWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVulWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVulWhitelistResponse response) {
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
        public Builder body(DeleteVulWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVulWhitelistResponse build() {
            return new DeleteVulWhitelistResponse(this);
        } 

    } 

}
