// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDtsJobResponse} extends {@link TeaModel}
 *
 * <p>ResetDtsJobResponse</p>
 */
public class ResetDtsJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetDtsJobResponseBody body;

    private ResetDtsJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetDtsJobResponse create() {
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
    public ResetDtsJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetDtsJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetDtsJobResponseBody body);

        @Override
        ResetDtsJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetDtsJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetDtsJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetDtsJobResponse response) {
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
        public Builder body(ResetDtsJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetDtsJobResponse build() {
            return new ResetDtsJobResponse(this);
        } 

    } 

}
