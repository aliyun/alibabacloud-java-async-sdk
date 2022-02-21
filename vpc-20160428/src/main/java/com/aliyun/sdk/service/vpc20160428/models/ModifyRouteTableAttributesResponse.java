// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRouteTableAttributesResponse} extends {@link TeaModel}
 *
 * <p>ModifyRouteTableAttributesResponse</p>
 */
public class ModifyRouteTableAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRouteTableAttributesResponseBody body;

    private ModifyRouteTableAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRouteTableAttributesResponse create() {
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
    public ModifyRouteTableAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRouteTableAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRouteTableAttributesResponseBody body);

        @Override
        ModifyRouteTableAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRouteTableAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRouteTableAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRouteTableAttributesResponse response) {
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
        public Builder body(ModifyRouteTableAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRouteTableAttributesResponse build() {
            return new ModifyRouteTableAttributesResponse(this);
        } 

    } 

}
