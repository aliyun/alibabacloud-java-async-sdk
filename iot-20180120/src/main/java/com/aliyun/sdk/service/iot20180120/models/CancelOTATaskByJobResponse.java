// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOTATaskByJobResponse} extends {@link TeaModel}
 *
 * <p>CancelOTATaskByJobResponse</p>
 */
public class CancelOTATaskByJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelOTATaskByJobResponseBody body;

    private CancelOTATaskByJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelOTATaskByJobResponse create() {
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
    public CancelOTATaskByJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelOTATaskByJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelOTATaskByJobResponseBody body);

        @Override
        CancelOTATaskByJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelOTATaskByJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelOTATaskByJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelOTATaskByJobResponse response) {
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
        public Builder body(CancelOTATaskByJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelOTATaskByJobResponse build() {
            return new CancelOTATaskByJobResponse(this);
        } 

    } 

}
