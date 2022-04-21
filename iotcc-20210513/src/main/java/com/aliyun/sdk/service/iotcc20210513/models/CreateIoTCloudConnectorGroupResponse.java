// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIoTCloudConnectorGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateIoTCloudConnectorGroupResponse</p>
 */
public class CreateIoTCloudConnectorGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIoTCloudConnectorGroupResponseBody body;

    private CreateIoTCloudConnectorGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIoTCloudConnectorGroupResponse create() {
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
    public CreateIoTCloudConnectorGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIoTCloudConnectorGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIoTCloudConnectorGroupResponseBody body);

        @Override
        CreateIoTCloudConnectorGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIoTCloudConnectorGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIoTCloudConnectorGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIoTCloudConnectorGroupResponse response) {
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
        public Builder body(CreateIoTCloudConnectorGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIoTCloudConnectorGroupResponse build() {
            return new CreateIoTCloudConnectorGroupResponse(this);
        } 

    } 

}
