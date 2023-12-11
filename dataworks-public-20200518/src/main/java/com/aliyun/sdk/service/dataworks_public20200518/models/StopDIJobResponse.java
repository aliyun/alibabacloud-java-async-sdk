// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDIJobResponse} extends {@link TeaModel}
 *
 * <p>StopDIJobResponse</p>
 */
public class StopDIJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDIJobResponseBody body;

    private StopDIJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDIJobResponse create() {
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
    public StopDIJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDIJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDIJobResponseBody body);

        @Override
        StopDIJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDIJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDIJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDIJobResponse response) {
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
        public Builder body(StopDIJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDIJobResponse build() {
            return new StopDIJobResponse(this);
        } 

    } 

}
