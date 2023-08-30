// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendSynchronizationJobResponse} extends {@link TeaModel}
 *
 * <p>SuspendSynchronizationJobResponse</p>
 */
public class SuspendSynchronizationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendSynchronizationJobResponseBody body;

    private SuspendSynchronizationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendSynchronizationJobResponse create() {
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
    public SuspendSynchronizationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendSynchronizationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendSynchronizationJobResponseBody body);

        @Override
        SuspendSynchronizationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendSynchronizationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendSynchronizationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendSynchronizationJobResponse response) {
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
        public Builder body(SuspendSynchronizationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendSynchronizationJobResponse build() {
            return new SuspendSynchronizationJobResponse(this);
        } 

    } 

}
