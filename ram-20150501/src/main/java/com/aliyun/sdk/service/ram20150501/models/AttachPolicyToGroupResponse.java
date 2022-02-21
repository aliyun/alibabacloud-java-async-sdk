// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachPolicyToGroupResponse} extends {@link TeaModel}
 *
 * <p>AttachPolicyToGroupResponse</p>
 */
public class AttachPolicyToGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachPolicyToGroupResponseBody body;

    private AttachPolicyToGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachPolicyToGroupResponse create() {
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
    public AttachPolicyToGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachPolicyToGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachPolicyToGroupResponseBody body);

        @Override
        AttachPolicyToGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachPolicyToGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachPolicyToGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachPolicyToGroupResponse response) {
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
        public Builder body(AttachPolicyToGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachPolicyToGroupResponse build() {
            return new AttachPolicyToGroupResponse(this);
        } 

    } 

}
