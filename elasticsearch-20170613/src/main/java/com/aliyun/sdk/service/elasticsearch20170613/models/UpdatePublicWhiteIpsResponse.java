// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePublicWhiteIpsResponse} extends {@link TeaModel}
 *
 * <p>UpdatePublicWhiteIpsResponse</p>
 */
public class UpdatePublicWhiteIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePublicWhiteIpsResponseBody body;

    private UpdatePublicWhiteIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePublicWhiteIpsResponse create() {
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
    public UpdatePublicWhiteIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePublicWhiteIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePublicWhiteIpsResponseBody body);

        @Override
        UpdatePublicWhiteIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePublicWhiteIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePublicWhiteIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePublicWhiteIpsResponse response) {
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
        public Builder body(UpdatePublicWhiteIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePublicWhiteIpsResponse build() {
            return new UpdatePublicWhiteIpsResponse(this);
        } 

    } 

}
