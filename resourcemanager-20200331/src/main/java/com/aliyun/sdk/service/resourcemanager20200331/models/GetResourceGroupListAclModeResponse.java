// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupListAclModeResponse} extends {@link TeaModel}
 *
 * <p>GetResourceGroupListAclModeResponse</p>
 */
public class GetResourceGroupListAclModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceGroupListAclModeResponseBody body;

    private GetResourceGroupListAclModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceGroupListAclModeResponse create() {
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
    public GetResourceGroupListAclModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceGroupListAclModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceGroupListAclModeResponseBody body);

        @Override
        GetResourceGroupListAclModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceGroupListAclModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceGroupListAclModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceGroupListAclModeResponse response) {
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
        public Builder body(GetResourceGroupListAclModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceGroupListAclModeResponse build() {
            return new GetResourceGroupListAclModeResponse(this);
        } 

    } 

}
