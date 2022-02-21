// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFpShotJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitFpShotJobResponse</p>
 */
public class SubmitFpShotJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitFpShotJobResponseBody body;

    private SubmitFpShotJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitFpShotJobResponse create() {
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
    public SubmitFpShotJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitFpShotJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitFpShotJobResponseBody body);

        @Override
        SubmitFpShotJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitFpShotJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitFpShotJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitFpShotJobResponse response) {
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
        public Builder body(SubmitFpShotJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitFpShotJobResponse build() {
            return new SubmitFpShotJobResponse(this);
        } 

    } 

}
