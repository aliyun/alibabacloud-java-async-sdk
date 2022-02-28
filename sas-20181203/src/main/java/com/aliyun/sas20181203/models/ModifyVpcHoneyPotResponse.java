// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcHoneyPotResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpcHoneyPotResponse</p>
 */
public class ModifyVpcHoneyPotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVpcHoneyPotResponseBody body;

    private ModifyVpcHoneyPotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVpcHoneyPotResponse create() {
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
    public ModifyVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpcHoneyPotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVpcHoneyPotResponseBody body);

        @Override
        ModifyVpcHoneyPotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpcHoneyPotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVpcHoneyPotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpcHoneyPotResponse response) {
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
        public Builder body(ModifyVpcHoneyPotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpcHoneyPotResponse build() {
            return new ModifyVpcHoneyPotResponse(this);
        } 

    } 

}
