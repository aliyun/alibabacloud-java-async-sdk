// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIoTCloudConnetorBackhaulRouteResponse} extends {@link TeaModel}
 *
 * <p>DeleteIoTCloudConnetorBackhaulRouteResponse</p>
 */
public class DeleteIoTCloudConnetorBackhaulRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIoTCloudConnetorBackhaulRouteResponseBody body;

    private DeleteIoTCloudConnetorBackhaulRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIoTCloudConnetorBackhaulRouteResponse create() {
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
    public DeleteIoTCloudConnetorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIoTCloudConnetorBackhaulRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIoTCloudConnetorBackhaulRouteResponseBody body);

        @Override
        DeleteIoTCloudConnetorBackhaulRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIoTCloudConnetorBackhaulRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIoTCloudConnetorBackhaulRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIoTCloudConnetorBackhaulRouteResponse response) {
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
        public Builder body(DeleteIoTCloudConnetorBackhaulRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIoTCloudConnetorBackhaulRouteResponse build() {
            return new DeleteIoTCloudConnetorBackhaulRouteResponse(this);
        } 

    } 

}
