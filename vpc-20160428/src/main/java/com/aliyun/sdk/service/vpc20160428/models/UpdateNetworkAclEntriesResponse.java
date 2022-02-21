// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNetworkAclEntriesResponse} extends {@link TeaModel}
 *
 * <p>UpdateNetworkAclEntriesResponse</p>
 */
public class UpdateNetworkAclEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNetworkAclEntriesResponseBody body;

    private UpdateNetworkAclEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNetworkAclEntriesResponse create() {
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
    public UpdateNetworkAclEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNetworkAclEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNetworkAclEntriesResponseBody body);

        @Override
        UpdateNetworkAclEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNetworkAclEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNetworkAclEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNetworkAclEntriesResponse response) {
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
        public Builder body(UpdateNetworkAclEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNetworkAclEntriesResponse build() {
            return new UpdateNetworkAclEntriesResponse(this);
        } 

    } 

}
