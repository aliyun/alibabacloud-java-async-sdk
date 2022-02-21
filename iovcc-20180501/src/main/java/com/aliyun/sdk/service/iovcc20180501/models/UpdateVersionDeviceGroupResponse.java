// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVersionDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateVersionDeviceGroupResponse</p>
 */
public class UpdateVersionDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVersionDeviceGroupResponseBody body;

    private UpdateVersionDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVersionDeviceGroupResponse create() {
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
    public UpdateVersionDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVersionDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVersionDeviceGroupResponseBody body);

        @Override
        UpdateVersionDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVersionDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVersionDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVersionDeviceGroupResponse response) {
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
        public Builder body(UpdateVersionDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVersionDeviceGroupResponse build() {
            return new UpdateVersionDeviceGroupResponse(this);
        } 

    } 

}
