// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitURLUploadJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitURLUploadJobResponse</p>
 */
public class SubmitURLUploadJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitURLUploadJobResponseBody body;

    private SubmitURLUploadJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitURLUploadJobResponse create() {
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
    public SubmitURLUploadJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitURLUploadJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitURLUploadJobResponseBody body);

        @Override
        SubmitURLUploadJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitURLUploadJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitURLUploadJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitURLUploadJobResponse response) {
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
        public Builder body(SubmitURLUploadJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitURLUploadJobResponse build() {
            return new SubmitURLUploadJobResponse(this);
        } 

    } 

}
