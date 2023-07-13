// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitServerlessJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitServerlessJobResponse</p>
 */
public class SubmitServerlessJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitServerlessJobResponseBody body;

    private SubmitServerlessJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitServerlessJobResponse create() {
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
    public SubmitServerlessJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitServerlessJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitServerlessJobResponseBody body);

        @Override
        SubmitServerlessJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitServerlessJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitServerlessJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitServerlessJobResponse response) {
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
        public Builder body(SubmitServerlessJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitServerlessJobResponse build() {
            return new SubmitServerlessJobResponse(this);
        } 

    } 

}
