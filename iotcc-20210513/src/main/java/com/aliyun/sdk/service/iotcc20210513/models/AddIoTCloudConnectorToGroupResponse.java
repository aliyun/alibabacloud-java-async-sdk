// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIoTCloudConnectorToGroupResponse} extends {@link TeaModel}
 *
 * <p>AddIoTCloudConnectorToGroupResponse</p>
 */
public class AddIoTCloudConnectorToGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddIoTCloudConnectorToGroupResponseBody body;

    private AddIoTCloudConnectorToGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddIoTCloudConnectorToGroupResponse create() {
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
    public AddIoTCloudConnectorToGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddIoTCloudConnectorToGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddIoTCloudConnectorToGroupResponseBody body);

        @Override
        AddIoTCloudConnectorToGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddIoTCloudConnectorToGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddIoTCloudConnectorToGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddIoTCloudConnectorToGroupResponse response) {
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
        public Builder body(AddIoTCloudConnectorToGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddIoTCloudConnectorToGroupResponse build() {
            return new AddIoTCloudConnectorToGroupResponse(this);
        } 

    } 

}
