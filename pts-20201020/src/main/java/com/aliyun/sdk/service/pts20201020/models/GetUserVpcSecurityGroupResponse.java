// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserVpcSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>GetUserVpcSecurityGroupResponse</p>
 */
public class GetUserVpcSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserVpcSecurityGroupResponseBody body;

    private GetUserVpcSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserVpcSecurityGroupResponse create() {
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
    public GetUserVpcSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserVpcSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserVpcSecurityGroupResponseBody body);

        @Override
        GetUserVpcSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserVpcSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserVpcSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserVpcSecurityGroupResponse response) {
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
        public Builder body(GetUserVpcSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserVpcSecurityGroupResponse build() {
            return new GetUserVpcSecurityGroupResponse(this);
        } 

    } 

}
