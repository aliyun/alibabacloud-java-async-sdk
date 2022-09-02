// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcAccessAndUpdateApisResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpcAccessAndUpdateApisResponse</p>
 */
public class ModifyVpcAccessAndUpdateApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVpcAccessAndUpdateApisResponseBody body;

    private ModifyVpcAccessAndUpdateApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVpcAccessAndUpdateApisResponse create() {
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
    public ModifyVpcAccessAndUpdateApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpcAccessAndUpdateApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVpcAccessAndUpdateApisResponseBody body);

        @Override
        ModifyVpcAccessAndUpdateApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpcAccessAndUpdateApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVpcAccessAndUpdateApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpcAccessAndUpdateApisResponse response) {
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
        public Builder body(ModifyVpcAccessAndUpdateApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpcAccessAndUpdateApisResponse build() {
            return new ModifyVpcAccessAndUpdateApisResponse(this);
        } 

    } 

}
