// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSparkJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitSparkJobResponse</p>
 */
public class SubmitSparkJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitSparkJobResponseBody body;

    private SubmitSparkJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitSparkJobResponse create() {
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
    public SubmitSparkJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSparkJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitSparkJobResponseBody body);

        @Override
        SubmitSparkJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSparkJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitSparkJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSparkJobResponse response) {
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
        public Builder body(SubmitSparkJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSparkJobResponse build() {
            return new SubmitSparkJobResponse(this);
        } 

    } 

}
