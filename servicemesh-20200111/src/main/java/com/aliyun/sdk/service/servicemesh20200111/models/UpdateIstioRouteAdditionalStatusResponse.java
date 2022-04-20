// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioRouteAdditionalStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateIstioRouteAdditionalStatusResponse</p>
 */
public class UpdateIstioRouteAdditionalStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIstioRouteAdditionalStatusResponseBody body;

    private UpdateIstioRouteAdditionalStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIstioRouteAdditionalStatusResponse create() {
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
    public UpdateIstioRouteAdditionalStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIstioRouteAdditionalStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIstioRouteAdditionalStatusResponseBody body);

        @Override
        UpdateIstioRouteAdditionalStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIstioRouteAdditionalStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIstioRouteAdditionalStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIstioRouteAdditionalStatusResponse response) {
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
        public Builder body(UpdateIstioRouteAdditionalStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIstioRouteAdditionalStatusResponse build() {
            return new UpdateIstioRouteAdditionalStatusResponse(this);
        } 

    } 

}
