// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetrySoundCodeLabelBatchResponse} extends {@link TeaModel}
 *
 * <p>RetrySoundCodeLabelBatchResponse</p>
 */
public class RetrySoundCodeLabelBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetrySoundCodeLabelBatchResponseBody body;

    private RetrySoundCodeLabelBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetrySoundCodeLabelBatchResponse create() {
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
    public RetrySoundCodeLabelBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetrySoundCodeLabelBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetrySoundCodeLabelBatchResponseBody body);

        @Override
        RetrySoundCodeLabelBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetrySoundCodeLabelBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetrySoundCodeLabelBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetrySoundCodeLabelBatchResponse response) {
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
        public Builder body(RetrySoundCodeLabelBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetrySoundCodeLabelBatchResponse build() {
            return new RetrySoundCodeLabelBatchResponse(this);
        } 

    } 

}
