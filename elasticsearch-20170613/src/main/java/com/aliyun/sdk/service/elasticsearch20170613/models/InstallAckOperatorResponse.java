// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAckOperatorResponse} extends {@link TeaModel}
 *
 * <p>InstallAckOperatorResponse</p>
 */
public class InstallAckOperatorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallAckOperatorResponseBody body;

    private InstallAckOperatorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallAckOperatorResponse create() {
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
    public InstallAckOperatorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallAckOperatorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallAckOperatorResponseBody body);

        @Override
        InstallAckOperatorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallAckOperatorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallAckOperatorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallAckOperatorResponse response) {
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
        public Builder body(InstallAckOperatorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallAckOperatorResponse build() {
            return new InstallAckOperatorResponse(this);
        } 

    } 

}
