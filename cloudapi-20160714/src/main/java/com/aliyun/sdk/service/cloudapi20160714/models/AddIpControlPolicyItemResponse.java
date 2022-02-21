// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpControlPolicyItemResponse} extends {@link TeaModel}
 *
 * <p>AddIpControlPolicyItemResponse</p>
 */
public class AddIpControlPolicyItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddIpControlPolicyItemResponseBody body;

    private AddIpControlPolicyItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddIpControlPolicyItemResponse create() {
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
    public AddIpControlPolicyItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddIpControlPolicyItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddIpControlPolicyItemResponseBody body);

        @Override
        AddIpControlPolicyItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddIpControlPolicyItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddIpControlPolicyItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddIpControlPolicyItemResponse response) {
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
        public Builder body(AddIpControlPolicyItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddIpControlPolicyItemResponse build() {
            return new AddIpControlPolicyItemResponse(this);
        } 

    } 

}
