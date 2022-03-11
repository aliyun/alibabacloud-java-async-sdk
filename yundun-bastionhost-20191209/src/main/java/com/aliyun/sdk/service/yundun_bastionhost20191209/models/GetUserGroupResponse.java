// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserGroupResponse} extends {@link TeaModel}
 *
 * <p>GetUserGroupResponse</p>
 */
public class GetUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserGroupResponseBody body;

    private GetUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserGroupResponse create() {
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
    public GetUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserGroupResponseBody body);

        @Override
        GetUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserGroupResponse response) {
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
        public Builder body(GetUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserGroupResponse build() {
            return new GetUserGroupResponse(this);
        } 

    } 

}
