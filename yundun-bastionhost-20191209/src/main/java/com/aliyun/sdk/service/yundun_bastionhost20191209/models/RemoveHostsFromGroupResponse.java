// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveHostsFromGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveHostsFromGroupResponse</p>
 */
public class RemoveHostsFromGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveHostsFromGroupResponseBody body;

    private RemoveHostsFromGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveHostsFromGroupResponse create() {
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
    public RemoveHostsFromGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveHostsFromGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveHostsFromGroupResponseBody body);

        @Override
        RemoveHostsFromGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveHostsFromGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveHostsFromGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveHostsFromGroupResponse response) {
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
        public Builder body(RemoveHostsFromGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveHostsFromGroupResponse build() {
            return new RemoveHostsFromGroupResponse(this);
        } 

    } 

}
