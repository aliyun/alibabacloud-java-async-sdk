// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainExtensionAttributeResponse} extends {@link TeaModel}
 *
 * <p>SetDomainExtensionAttributeResponse</p>
 */
public class SetDomainExtensionAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDomainExtensionAttributeResponseBody body;

    private SetDomainExtensionAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDomainExtensionAttributeResponse create() {
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
    public SetDomainExtensionAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDomainExtensionAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDomainExtensionAttributeResponseBody body);

        @Override
        SetDomainExtensionAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDomainExtensionAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDomainExtensionAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDomainExtensionAttributeResponse response) {
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
        public Builder body(SetDomainExtensionAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDomainExtensionAttributeResponse build() {
            return new SetDomainExtensionAttributeResponse(this);
        } 

    } 

}
