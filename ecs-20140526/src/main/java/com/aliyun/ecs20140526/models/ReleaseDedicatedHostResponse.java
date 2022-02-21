// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseDedicatedHostResponse} extends {@link TeaModel}
 *
 * <p>ReleaseDedicatedHostResponse</p>
 */
public class ReleaseDedicatedHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseDedicatedHostResponseBody body;

    private ReleaseDedicatedHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseDedicatedHostResponse create() {
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
    public ReleaseDedicatedHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseDedicatedHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseDedicatedHostResponseBody body);

        @Override
        ReleaseDedicatedHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseDedicatedHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseDedicatedHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseDedicatedHostResponse response) {
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
        public Builder body(ReleaseDedicatedHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseDedicatedHostResponse build() {
            return new ReleaseDedicatedHostResponse(this);
        } 

    } 

}
