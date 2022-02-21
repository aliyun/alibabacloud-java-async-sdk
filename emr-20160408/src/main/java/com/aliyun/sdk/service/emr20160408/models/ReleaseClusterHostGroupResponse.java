// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseClusterHostGroupResponse} extends {@link TeaModel}
 *
 * <p>ReleaseClusterHostGroupResponse</p>
 */
public class ReleaseClusterHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseClusterHostGroupResponseBody body;

    private ReleaseClusterHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseClusterHostGroupResponse create() {
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
    public ReleaseClusterHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseClusterHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseClusterHostGroupResponseBody body);

        @Override
        ReleaseClusterHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseClusterHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseClusterHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseClusterHostGroupResponse response) {
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
        public Builder body(ReleaseClusterHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseClusterHostGroupResponse build() {
            return new ReleaseClusterHostGroupResponse(this);
        } 

    } 

}
