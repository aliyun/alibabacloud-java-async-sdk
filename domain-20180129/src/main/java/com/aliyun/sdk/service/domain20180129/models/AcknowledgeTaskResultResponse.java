// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcknowledgeTaskResultResponse} extends {@link TeaModel}
 *
 * <p>AcknowledgeTaskResultResponse</p>
 */
public class AcknowledgeTaskResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcknowledgeTaskResultResponseBody body;

    private AcknowledgeTaskResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcknowledgeTaskResultResponse create() {
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
    public AcknowledgeTaskResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcknowledgeTaskResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcknowledgeTaskResultResponseBody body);

        @Override
        AcknowledgeTaskResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcknowledgeTaskResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcknowledgeTaskResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcknowledgeTaskResultResponse response) {
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
        public Builder body(AcknowledgeTaskResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcknowledgeTaskResultResponse build() {
            return new AcknowledgeTaskResultResponse(this);
        } 

    } 

}
