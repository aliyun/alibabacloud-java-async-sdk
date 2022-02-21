// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveFaceDeviceFromDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveFaceDeviceFromDeviceGroupResponse</p>
 */
public class RemoveFaceDeviceFromDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveFaceDeviceFromDeviceGroupResponseBody body;

    private RemoveFaceDeviceFromDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveFaceDeviceFromDeviceGroupResponse create() {
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
    public RemoveFaceDeviceFromDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveFaceDeviceFromDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveFaceDeviceFromDeviceGroupResponseBody body);

        @Override
        RemoveFaceDeviceFromDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveFaceDeviceFromDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveFaceDeviceFromDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveFaceDeviceFromDeviceGroupResponse response) {
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
        public Builder body(RemoveFaceDeviceFromDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveFaceDeviceFromDeviceGroupResponse build() {
            return new RemoveFaceDeviceFromDeviceGroupResponse(this);
        } 

    } 

}
