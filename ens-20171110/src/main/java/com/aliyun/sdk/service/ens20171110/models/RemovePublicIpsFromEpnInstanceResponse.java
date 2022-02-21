// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePublicIpsFromEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>RemovePublicIpsFromEpnInstanceResponse</p>
 */
public class RemovePublicIpsFromEpnInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemovePublicIpsFromEpnInstanceResponseBody body;

    private RemovePublicIpsFromEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemovePublicIpsFromEpnInstanceResponse create() {
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
    public RemovePublicIpsFromEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemovePublicIpsFromEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemovePublicIpsFromEpnInstanceResponseBody body);

        @Override
        RemovePublicIpsFromEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemovePublicIpsFromEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemovePublicIpsFromEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemovePublicIpsFromEpnInstanceResponse response) {
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
        public Builder body(RemovePublicIpsFromEpnInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemovePublicIpsFromEpnInstanceResponse build() {
            return new RemovePublicIpsFromEpnInstanceResponse(this);
        } 

    } 

}
