// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExtensionProviderResponse} extends {@link TeaModel}
 *
 * <p>UpdateExtensionProviderResponse</p>
 */
public class UpdateExtensionProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateExtensionProviderResponseBody body;

    private UpdateExtensionProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateExtensionProviderResponse create() {
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
    public UpdateExtensionProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateExtensionProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateExtensionProviderResponseBody body);

        @Override
        UpdateExtensionProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateExtensionProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateExtensionProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateExtensionProviderResponse response) {
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
        public Builder body(UpdateExtensionProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateExtensionProviderResponse build() {
            return new UpdateExtensionProviderResponse(this);
        } 

    } 

}
