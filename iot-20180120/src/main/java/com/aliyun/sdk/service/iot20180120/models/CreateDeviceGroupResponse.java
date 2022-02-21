// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceGroupResponse</p>
 */
public class CreateDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceGroupResponseBody body;

    private CreateDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceGroupResponse create() {
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
    public CreateDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceGroupResponseBody body);

        @Override
        CreateDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceGroupResponse response) {
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
        public Builder body(CreateDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceGroupResponse build() {
            return new CreateDeviceGroupResponse(this);
        } 

    } 

}
