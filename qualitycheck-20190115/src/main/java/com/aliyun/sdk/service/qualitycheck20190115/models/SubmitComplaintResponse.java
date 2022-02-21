// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitComplaintResponse} extends {@link TeaModel}
 *
 * <p>SubmitComplaintResponse</p>
 */
public class SubmitComplaintResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitComplaintResponseBody body;

    private SubmitComplaintResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitComplaintResponse create() {
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
    public SubmitComplaintResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitComplaintResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitComplaintResponseBody body);

        @Override
        SubmitComplaintResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitComplaintResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitComplaintResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitComplaintResponse response) {
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
        public Builder body(SubmitComplaintResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitComplaintResponse build() {
            return new SubmitComplaintResponse(this);
        } 

    } 

}
