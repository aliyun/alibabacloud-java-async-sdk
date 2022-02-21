// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyNetworkAclEntriesResponse} extends {@link TeaModel}
 *
 * <p>CopyNetworkAclEntriesResponse</p>
 */
public class CopyNetworkAclEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyNetworkAclEntriesResponseBody body;

    private CopyNetworkAclEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyNetworkAclEntriesResponse create() {
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
    public CopyNetworkAclEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyNetworkAclEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyNetworkAclEntriesResponseBody body);

        @Override
        CopyNetworkAclEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyNetworkAclEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyNetworkAclEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyNetworkAclEntriesResponse response) {
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
        public Builder body(CopyNetworkAclEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyNetworkAclEntriesResponse build() {
            return new CopyNetworkAclEntriesResponse(this);
        } 

    } 

}
