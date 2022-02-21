// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIProductionJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitIProductionJobResponse</p>
 */
public class SubmitIProductionJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitIProductionJobResponseBody body;

    private SubmitIProductionJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitIProductionJobResponse create() {
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
    public SubmitIProductionJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitIProductionJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitIProductionJobResponseBody body);

        @Override
        SubmitIProductionJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitIProductionJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitIProductionJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitIProductionJobResponse response) {
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
        public Builder body(SubmitIProductionJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitIProductionJobResponse build() {
            return new SubmitIProductionJobResponse(this);
        } 

    } 

}
