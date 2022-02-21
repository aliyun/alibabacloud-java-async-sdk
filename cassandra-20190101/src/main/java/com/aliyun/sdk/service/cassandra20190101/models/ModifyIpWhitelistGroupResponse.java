// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpWhitelistGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyIpWhitelistGroupResponse</p>
 */
public class ModifyIpWhitelistGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIpWhitelistGroupResponseBody body;

    private ModifyIpWhitelistGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIpWhitelistGroupResponse create() {
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
    public ModifyIpWhitelistGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIpWhitelistGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIpWhitelistGroupResponseBody body);

        @Override
        ModifyIpWhitelistGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIpWhitelistGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIpWhitelistGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIpWhitelistGroupResponse response) {
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
        public Builder body(ModifyIpWhitelistGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIpWhitelistGroupResponse build() {
            return new ModifyIpWhitelistGroupResponse(this);
        } 

    } 

}
