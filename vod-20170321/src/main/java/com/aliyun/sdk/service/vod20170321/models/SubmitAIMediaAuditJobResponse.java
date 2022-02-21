// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIMediaAuditJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitAIMediaAuditJobResponse</p>
 */
public class SubmitAIMediaAuditJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitAIMediaAuditJobResponseBody body;

    private SubmitAIMediaAuditJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitAIMediaAuditJobResponse create() {
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
    public SubmitAIMediaAuditJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitAIMediaAuditJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitAIMediaAuditJobResponseBody body);

        @Override
        SubmitAIMediaAuditJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitAIMediaAuditJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitAIMediaAuditJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitAIMediaAuditJobResponse response) {
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
        public Builder body(SubmitAIMediaAuditJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitAIMediaAuditJobResponse build() {
            return new SubmitAIMediaAuditJobResponse(this);
        } 

    } 

}
