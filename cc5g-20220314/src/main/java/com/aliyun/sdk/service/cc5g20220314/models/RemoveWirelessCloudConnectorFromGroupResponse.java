// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveWirelessCloudConnectorFromGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveWirelessCloudConnectorFromGroupResponse</p>
 */
public class RemoveWirelessCloudConnectorFromGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveWirelessCloudConnectorFromGroupResponseBody body;

    private RemoveWirelessCloudConnectorFromGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveWirelessCloudConnectorFromGroupResponse create() {
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
    public RemoveWirelessCloudConnectorFromGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveWirelessCloudConnectorFromGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveWirelessCloudConnectorFromGroupResponseBody body);

        @Override
        RemoveWirelessCloudConnectorFromGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveWirelessCloudConnectorFromGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveWirelessCloudConnectorFromGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveWirelessCloudConnectorFromGroupResponse response) {
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
        public Builder body(RemoveWirelessCloudConnectorFromGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveWirelessCloudConnectorFromGroupResponse build() {
            return new RemoveWirelessCloudConnectorFromGroupResponse(this);
        } 

    } 

}
