// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVersionWhiteDevicesByDeviceGroupsResponse} extends {@link TeaModel}
 *
 * <p>AddVersionWhiteDevicesByDeviceGroupsResponse</p>
 */
public class AddVersionWhiteDevicesByDeviceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddVersionWhiteDevicesByDeviceGroupsResponseBody body;

    private AddVersionWhiteDevicesByDeviceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddVersionWhiteDevicesByDeviceGroupsResponse create() {
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
    public AddVersionWhiteDevicesByDeviceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddVersionWhiteDevicesByDeviceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddVersionWhiteDevicesByDeviceGroupsResponseBody body);

        @Override
        AddVersionWhiteDevicesByDeviceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddVersionWhiteDevicesByDeviceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddVersionWhiteDevicesByDeviceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddVersionWhiteDevicesByDeviceGroupsResponse response) {
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
        public Builder body(AddVersionWhiteDevicesByDeviceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddVersionWhiteDevicesByDeviceGroupsResponse build() {
            return new AddVersionWhiteDevicesByDeviceGroupsResponse(this);
        } 

    } 

}
