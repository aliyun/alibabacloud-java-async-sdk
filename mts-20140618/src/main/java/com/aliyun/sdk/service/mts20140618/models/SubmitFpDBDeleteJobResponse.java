// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFpDBDeleteJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitFpDBDeleteJobResponse</p>
 */
public class SubmitFpDBDeleteJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitFpDBDeleteJobResponseBody body;

    private SubmitFpDBDeleteJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitFpDBDeleteJobResponse create() {
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
    public SubmitFpDBDeleteJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitFpDBDeleteJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitFpDBDeleteJobResponseBody body);

        @Override
        SubmitFpDBDeleteJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitFpDBDeleteJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitFpDBDeleteJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitFpDBDeleteJobResponse response) {
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
        public Builder body(SubmitFpDBDeleteJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitFpDBDeleteJobResponse build() {
            return new SubmitFpDBDeleteJobResponse(this);
        } 

    } 

}
