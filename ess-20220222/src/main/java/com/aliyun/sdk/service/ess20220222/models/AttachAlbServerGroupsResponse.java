// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachAlbServerGroupsResponse} extends {@link TeaModel}
 *
 * <p>AttachAlbServerGroupsResponse</p>
 */
public class AttachAlbServerGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachAlbServerGroupsResponseBody body;

    private AttachAlbServerGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachAlbServerGroupsResponse create() {
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
    public AttachAlbServerGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachAlbServerGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachAlbServerGroupsResponseBody body);

        @Override
        AttachAlbServerGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachAlbServerGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachAlbServerGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachAlbServerGroupsResponse response) {
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
        public Builder body(AttachAlbServerGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachAlbServerGroupsResponse build() {
            return new AttachAlbServerGroupsResponse(this);
        } 

    } 

}
