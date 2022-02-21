// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetSynchronizationJobResponse} extends {@link TeaModel}
 *
 * <p>ResetSynchronizationJobResponse</p>
 */
public class ResetSynchronizationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetSynchronizationJobResponseBody body;

    private ResetSynchronizationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetSynchronizationJobResponse create() {
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
    public ResetSynchronizationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetSynchronizationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetSynchronizationJobResponseBody body);

        @Override
        ResetSynchronizationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetSynchronizationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetSynchronizationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetSynchronizationJobResponse response) {
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
        public Builder body(ResetSynchronizationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetSynchronizationJobResponse build() {
            return new ResetSynchronizationJobResponse(this);
        } 

    } 

}
