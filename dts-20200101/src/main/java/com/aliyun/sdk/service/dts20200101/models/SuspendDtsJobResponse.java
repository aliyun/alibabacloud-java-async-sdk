// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendDtsJobResponse} extends {@link TeaModel}
 *
 * <p>SuspendDtsJobResponse</p>
 */
public class SuspendDtsJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendDtsJobResponseBody body;

    private SuspendDtsJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendDtsJobResponse create() {
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
    public SuspendDtsJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendDtsJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendDtsJobResponseBody body);

        @Override
        SuspendDtsJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendDtsJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendDtsJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendDtsJobResponse response) {
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
        public Builder body(SuspendDtsJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendDtsJobResponse build() {
            return new SuspendDtsJobResponse(this);
        } 

    } 

}
