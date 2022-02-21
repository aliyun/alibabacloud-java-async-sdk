// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitPornJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitPornJobResponse</p>
 */
public class SubmitPornJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitPornJobResponseBody body;

    private SubmitPornJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitPornJobResponse create() {
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
    public SubmitPornJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitPornJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitPornJobResponseBody body);

        @Override
        SubmitPornJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitPornJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitPornJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitPornJobResponse response) {
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
        public Builder body(SubmitPornJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitPornJobResponse build() {
            return new SubmitPornJobResponse(this);
        } 

    } 

}
