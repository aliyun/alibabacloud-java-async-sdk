// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateSoundCodeLabelWithLabelsResponse} extends {@link TeaModel}
 *
 * <p>BatchCreateSoundCodeLabelWithLabelsResponse</p>
 */
public class BatchCreateSoundCodeLabelWithLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCreateSoundCodeLabelWithLabelsResponseBody body;

    private BatchCreateSoundCodeLabelWithLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCreateSoundCodeLabelWithLabelsResponse create() {
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
    public BatchCreateSoundCodeLabelWithLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCreateSoundCodeLabelWithLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCreateSoundCodeLabelWithLabelsResponseBody body);

        @Override
        BatchCreateSoundCodeLabelWithLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCreateSoundCodeLabelWithLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCreateSoundCodeLabelWithLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCreateSoundCodeLabelWithLabelsResponse response) {
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
        public Builder body(BatchCreateSoundCodeLabelWithLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCreateSoundCodeLabelWithLabelsResponse build() {
            return new BatchCreateSoundCodeLabelWithLabelsResponse(this);
        } 

    } 

}
