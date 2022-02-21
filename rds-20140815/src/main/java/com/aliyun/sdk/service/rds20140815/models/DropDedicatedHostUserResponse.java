// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DropDedicatedHostUserResponse} extends {@link TeaModel}
 *
 * <p>DropDedicatedHostUserResponse</p>
 */
public class DropDedicatedHostUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DropDedicatedHostUserResponseBody body;

    private DropDedicatedHostUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DropDedicatedHostUserResponse create() {
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
    public DropDedicatedHostUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DropDedicatedHostUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DropDedicatedHostUserResponseBody body);

        @Override
        DropDedicatedHostUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DropDedicatedHostUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DropDedicatedHostUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DropDedicatedHostUserResponse response) {
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
        public Builder body(DropDedicatedHostUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DropDedicatedHostUserResponse build() {
            return new DropDedicatedHostUserResponse(this);
        } 

    } 

}
