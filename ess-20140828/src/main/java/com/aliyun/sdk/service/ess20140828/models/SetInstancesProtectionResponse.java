// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstancesProtectionResponse} extends {@link TeaModel}
 *
 * <p>SetInstancesProtectionResponse</p>
 */
public class SetInstancesProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetInstancesProtectionResponseBody body;

    private SetInstancesProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetInstancesProtectionResponse create() {
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
    public SetInstancesProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstancesProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetInstancesProtectionResponseBody body);

        @Override
        SetInstancesProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstancesProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetInstancesProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstancesProtectionResponse response) {
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
        public Builder body(SetInstancesProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstancesProtectionResponse build() {
            return new SetInstancesProtectionResponse(this);
        } 

    } 

}
