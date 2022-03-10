// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserGroupInfoResponse} extends {@link TeaModel}
 *
 * <p>GetUserGroupInfoResponse</p>
 */
public class GetUserGroupInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserGroupInfoResponseBody body;

    private GetUserGroupInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserGroupInfoResponse create() {
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
    public GetUserGroupInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserGroupInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserGroupInfoResponseBody body);

        @Override
        GetUserGroupInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserGroupInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserGroupInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserGroupInfoResponse response) {
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
        public Builder body(GetUserGroupInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserGroupInfoResponse build() {
            return new GetUserGroupInfoResponse(this);
        } 

    } 

}
