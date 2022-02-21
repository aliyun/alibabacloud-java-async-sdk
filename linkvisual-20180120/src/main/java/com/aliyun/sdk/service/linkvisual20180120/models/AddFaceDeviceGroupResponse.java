// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>AddFaceDeviceGroupResponse</p>
 */
public class AddFaceDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFaceDeviceGroupResponseBody body;

    private AddFaceDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFaceDeviceGroupResponse create() {
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
    public AddFaceDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFaceDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFaceDeviceGroupResponseBody body);

        @Override
        AddFaceDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFaceDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFaceDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFaceDeviceGroupResponse response) {
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
        public Builder body(AddFaceDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFaceDeviceGroupResponse build() {
            return new AddFaceDeviceGroupResponse(this);
        } 

    } 

}
