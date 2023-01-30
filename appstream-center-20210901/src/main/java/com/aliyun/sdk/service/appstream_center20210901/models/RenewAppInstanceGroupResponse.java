// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewAppInstanceGroupResponse} extends {@link TeaModel}
 *
 * <p>RenewAppInstanceGroupResponse</p>
 */
public class RenewAppInstanceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewAppInstanceGroupResponseBody body;

    private RenewAppInstanceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewAppInstanceGroupResponse create() {
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
    public RenewAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewAppInstanceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewAppInstanceGroupResponseBody body);

        @Override
        RenewAppInstanceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewAppInstanceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewAppInstanceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewAppInstanceGroupResponse response) {
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
        public Builder body(RenewAppInstanceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewAppInstanceGroupResponse build() {
            return new RenewAppInstanceGroupResponse(this);
        } 

    } 

}
