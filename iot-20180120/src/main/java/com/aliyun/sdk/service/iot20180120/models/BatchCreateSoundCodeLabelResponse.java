// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateSoundCodeLabelResponse} extends {@link TeaModel}
 *
 * <p>BatchCreateSoundCodeLabelResponse</p>
 */
public class BatchCreateSoundCodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCreateSoundCodeLabelResponseBody body;

    private BatchCreateSoundCodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCreateSoundCodeLabelResponse create() {
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
    public BatchCreateSoundCodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCreateSoundCodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCreateSoundCodeLabelResponseBody body);

        @Override
        BatchCreateSoundCodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCreateSoundCodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCreateSoundCodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCreateSoundCodeLabelResponse response) {
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
        public Builder body(BatchCreateSoundCodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCreateSoundCodeLabelResponse build() {
            return new BatchCreateSoundCodeLabelResponse(this);
        } 

    } 

}
