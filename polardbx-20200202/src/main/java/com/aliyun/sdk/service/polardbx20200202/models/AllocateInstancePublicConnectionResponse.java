// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateInstancePublicConnectionResponse} extends {@link TeaModel}
 *
 * <p>AllocateInstancePublicConnectionResponse</p>
 */
public class AllocateInstancePublicConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateInstancePublicConnectionResponseBody body;

    private AllocateInstancePublicConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateInstancePublicConnectionResponse create() {
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
    public AllocateInstancePublicConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateInstancePublicConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateInstancePublicConnectionResponseBody body);

        @Override
        AllocateInstancePublicConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateInstancePublicConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateInstancePublicConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateInstancePublicConnectionResponse response) {
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
        public Builder body(AllocateInstancePublicConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateInstancePublicConnectionResponse build() {
            return new AllocateInstancePublicConnectionResponse(this);
        } 

    } 

}
