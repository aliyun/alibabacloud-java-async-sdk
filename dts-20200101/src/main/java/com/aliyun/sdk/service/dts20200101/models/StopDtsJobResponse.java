// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDtsJobResponse} extends {@link TeaModel}
 *
 * <p>StopDtsJobResponse</p>
 */
public class StopDtsJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDtsJobResponseBody body;

    private StopDtsJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDtsJobResponse create() {
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
    public StopDtsJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDtsJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDtsJobResponseBody body);

        @Override
        StopDtsJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDtsJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDtsJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDtsJobResponse response) {
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
        public Builder body(StopDtsJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDtsJobResponse build() {
            return new StopDtsJobResponse(this);
        } 

    } 

}
