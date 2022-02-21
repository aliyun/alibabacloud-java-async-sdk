// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceDeviceToDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>AddFaceDeviceToDeviceGroupResponse</p>
 */
public class AddFaceDeviceToDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFaceDeviceToDeviceGroupResponseBody body;

    private AddFaceDeviceToDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFaceDeviceToDeviceGroupResponse create() {
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
    public AddFaceDeviceToDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFaceDeviceToDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFaceDeviceToDeviceGroupResponseBody body);

        @Override
        AddFaceDeviceToDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFaceDeviceToDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFaceDeviceToDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFaceDeviceToDeviceGroupResponse response) {
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
        public Builder body(AddFaceDeviceToDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFaceDeviceToDeviceGroupResponse build() {
            return new AddFaceDeviceToDeviceGroupResponse(this);
        } 

    } 

}
