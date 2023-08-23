// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendProcessesResponse} extends {@link TeaModel}
 *
 * <p>SuspendProcessesResponse</p>
 */
public class SuspendProcessesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendProcessesResponseBody body;

    private SuspendProcessesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendProcessesResponse create() {
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
    public SuspendProcessesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendProcessesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendProcessesResponseBody body);

        @Override
        SuspendProcessesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendProcessesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendProcessesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendProcessesResponse response) {
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
        public Builder body(SuspendProcessesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendProcessesResponse build() {
            return new SuspendProcessesResponse(this);
        } 

    } 

}
