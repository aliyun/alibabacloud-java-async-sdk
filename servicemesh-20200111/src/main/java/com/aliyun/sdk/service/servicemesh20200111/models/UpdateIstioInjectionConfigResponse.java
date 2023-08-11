// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioInjectionConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateIstioInjectionConfigResponse</p>
 */
public class UpdateIstioInjectionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIstioInjectionConfigResponseBody body;

    private UpdateIstioInjectionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIstioInjectionConfigResponse create() {
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
    public UpdateIstioInjectionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIstioInjectionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIstioInjectionConfigResponseBody body);

        @Override
        UpdateIstioInjectionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIstioInjectionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIstioInjectionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIstioInjectionConfigResponse response) {
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
        public Builder body(UpdateIstioInjectionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIstioInjectionConfigResponse build() {
            return new UpdateIstioInjectionConfigResponse(this);
        } 

    } 

}
