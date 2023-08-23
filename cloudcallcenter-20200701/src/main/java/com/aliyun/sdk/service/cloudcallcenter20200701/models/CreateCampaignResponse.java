// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCampaignResponse} extends {@link TeaModel}
 *
 * <p>CreateCampaignResponse</p>
 */
public class CreateCampaignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCampaignResponseBody body;

    private CreateCampaignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCampaignResponse create() {
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
    public CreateCampaignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCampaignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCampaignResponseBody body);

        @Override
        CreateCampaignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCampaignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCampaignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCampaignResponse response) {
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
        public Builder body(CreateCampaignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCampaignResponse build() {
            return new CreateCampaignResponse(this);
        } 

    } 

}
