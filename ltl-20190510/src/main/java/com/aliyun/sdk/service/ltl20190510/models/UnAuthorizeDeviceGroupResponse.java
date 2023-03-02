// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnAuthorizeDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>UnAuthorizeDeviceGroupResponse</p>
 */
public class UnAuthorizeDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnAuthorizeDeviceGroupResponseBody body;

    private UnAuthorizeDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnAuthorizeDeviceGroupResponse create() {
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
    public UnAuthorizeDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnAuthorizeDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnAuthorizeDeviceGroupResponseBody body);

        @Override
        UnAuthorizeDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnAuthorizeDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnAuthorizeDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnAuthorizeDeviceGroupResponse response) {
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
        public Builder body(UnAuthorizeDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnAuthorizeDeviceGroupResponse build() {
            return new UnAuthorizeDeviceGroupResponse(this);
        } 

    } 

}
