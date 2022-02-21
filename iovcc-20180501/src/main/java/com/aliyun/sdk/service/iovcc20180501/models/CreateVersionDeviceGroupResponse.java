// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVersionDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateVersionDeviceGroupResponse</p>
 */
public class CreateVersionDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVersionDeviceGroupResponseBody body;

    private CreateVersionDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVersionDeviceGroupResponse create() {
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
    public CreateVersionDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVersionDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVersionDeviceGroupResponseBody body);

        @Override
        CreateVersionDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVersionDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVersionDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVersionDeviceGroupResponse response) {
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
        public Builder body(CreateVersionDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVersionDeviceGroupResponse build() {
            return new CreateVersionDeviceGroupResponse(this);
        } 

    } 

}
