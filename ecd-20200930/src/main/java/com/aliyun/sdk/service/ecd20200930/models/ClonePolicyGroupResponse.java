// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClonePolicyGroupResponse} extends {@link TeaModel}
 *
 * <p>ClonePolicyGroupResponse</p>
 */
public class ClonePolicyGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ClonePolicyGroupResponseBody body;

    private ClonePolicyGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ClonePolicyGroupResponse create() {
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
    public ClonePolicyGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClonePolicyGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ClonePolicyGroupResponseBody body);

        @Override
        ClonePolicyGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClonePolicyGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ClonePolicyGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClonePolicyGroupResponse response) {
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
        public Builder body(ClonePolicyGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClonePolicyGroupResponse build() {
            return new ClonePolicyGroupResponse(this);
        } 

    } 

}
