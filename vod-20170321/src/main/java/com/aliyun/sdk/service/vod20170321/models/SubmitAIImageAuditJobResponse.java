// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAIImageAuditJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitAIImageAuditJobResponse</p>
 */
public class SubmitAIImageAuditJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitAIImageAuditJobResponseBody body;

    private SubmitAIImageAuditJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitAIImageAuditJobResponse create() {
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
    public SubmitAIImageAuditJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitAIImageAuditJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitAIImageAuditJobResponseBody body);

        @Override
        SubmitAIImageAuditJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitAIImageAuditJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitAIImageAuditJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitAIImageAuditJobResponse response) {
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
        public Builder body(SubmitAIImageAuditJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitAIImageAuditJobResponse build() {
            return new SubmitAIImageAuditJobResponse(this);
        } 

    } 

}
