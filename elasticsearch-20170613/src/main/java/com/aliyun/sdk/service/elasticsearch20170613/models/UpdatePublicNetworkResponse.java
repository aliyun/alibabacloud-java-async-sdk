// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePublicNetworkResponse} extends {@link TeaModel}
 *
 * <p>UpdatePublicNetworkResponse</p>
 */
public class UpdatePublicNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePublicNetworkResponseBody body;

    private UpdatePublicNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePublicNetworkResponse create() {
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
    public UpdatePublicNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePublicNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePublicNetworkResponseBody body);

        @Override
        UpdatePublicNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePublicNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePublicNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePublicNetworkResponse response) {
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
        public Builder body(UpdatePublicNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePublicNetworkResponse build() {
            return new UpdatePublicNetworkResponse(this);
        } 

    } 

}
