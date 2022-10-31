// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWirelessCloudConnectorToGroupResponse} extends {@link TeaModel}
 *
 * <p>AddWirelessCloudConnectorToGroupResponse</p>
 */
public class AddWirelessCloudConnectorToGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddWirelessCloudConnectorToGroupResponseBody body;

    private AddWirelessCloudConnectorToGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddWirelessCloudConnectorToGroupResponse create() {
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
    public AddWirelessCloudConnectorToGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddWirelessCloudConnectorToGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddWirelessCloudConnectorToGroupResponseBody body);

        @Override
        AddWirelessCloudConnectorToGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddWirelessCloudConnectorToGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddWirelessCloudConnectorToGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddWirelessCloudConnectorToGroupResponse response) {
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
        public Builder body(AddWirelessCloudConnectorToGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddWirelessCloudConnectorToGroupResponse build() {
            return new AddWirelessCloudConnectorToGroupResponse(this);
        } 

    } 

}
