// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupsResponse} extends {@link TeaModel}
 *
 * <p>ModifySecurityGroupsResponse</p>
 */
public class ModifySecurityGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySecurityGroupsResponseBody body;

    private ModifySecurityGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySecurityGroupsResponse create() {
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
    public ModifySecurityGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySecurityGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySecurityGroupsResponseBody body);

        @Override
        ModifySecurityGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySecurityGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySecurityGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySecurityGroupsResponse response) {
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
        public Builder body(ModifySecurityGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySecurityGroupsResponse build() {
            return new ModifySecurityGroupsResponse(this);
        } 

    } 

}
