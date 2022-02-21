// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpControlResponse} extends {@link TeaModel}
 *
 * <p>ModifyIpControlResponse</p>
 */
public class ModifyIpControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIpControlResponseBody body;

    private ModifyIpControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIpControlResponse create() {
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
    public ModifyIpControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIpControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIpControlResponseBody body);

        @Override
        ModifyIpControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIpControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIpControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIpControlResponse response) {
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
        public Builder body(ModifyIpControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIpControlResponse build() {
            return new ModifyIpControlResponse(this);
        } 

    } 

}
