// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachInstancesResponse} extends {@link TeaModel}
 *
 * <p>AttachInstancesResponse</p>
 */
public class AttachInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachInstancesResponseBody body;

    private AttachInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachInstancesResponse create() {
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
    public AttachInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachInstancesResponseBody body);

        @Override
        AttachInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachInstancesResponse response) {
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
        public Builder body(AttachInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachInstancesResponse build() {
            return new AttachInstancesResponse(this);
        } 

    } 

}
