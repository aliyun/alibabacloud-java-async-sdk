// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFpFileDeleteJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitFpFileDeleteJobResponse</p>
 */
public class SubmitFpFileDeleteJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitFpFileDeleteJobResponseBody body;

    private SubmitFpFileDeleteJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitFpFileDeleteJobResponse create() {
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
    public SubmitFpFileDeleteJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitFpFileDeleteJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitFpFileDeleteJobResponseBody body);

        @Override
        SubmitFpFileDeleteJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitFpFileDeleteJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitFpFileDeleteJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitFpFileDeleteJobResponse response) {
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
        public Builder body(SubmitFpFileDeleteJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitFpFileDeleteJobResponse build() {
            return new SubmitFpFileDeleteJobResponse(this);
        } 

    } 

}
