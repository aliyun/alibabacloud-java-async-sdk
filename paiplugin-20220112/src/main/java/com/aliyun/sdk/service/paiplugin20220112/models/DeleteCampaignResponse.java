// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCampaignResponse} extends {@link TeaModel}
 *
 * <p>DeleteCampaignResponse</p>
 */
public class DeleteCampaignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCampaignResponseBody body;

    private DeleteCampaignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCampaignResponse create() {
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
    public DeleteCampaignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCampaignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCampaignResponseBody body);

        @Override
        DeleteCampaignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCampaignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCampaignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCampaignResponse response) {
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
        public Builder body(DeleteCampaignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCampaignResponse build() {
            return new DeleteCampaignResponse(this);
        } 

    } 

}
