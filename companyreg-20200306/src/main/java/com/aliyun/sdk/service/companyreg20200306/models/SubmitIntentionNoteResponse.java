// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitIntentionNoteResponse} extends {@link TeaModel}
 *
 * <p>SubmitIntentionNoteResponse</p>
 */
public class SubmitIntentionNoteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitIntentionNoteResponseBody body;

    private SubmitIntentionNoteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitIntentionNoteResponse create() {
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
    public SubmitIntentionNoteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitIntentionNoteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitIntentionNoteResponseBody body);

        @Override
        SubmitIntentionNoteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitIntentionNoteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitIntentionNoteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitIntentionNoteResponse response) {
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
        public Builder body(SubmitIntentionNoteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitIntentionNoteResponse build() {
            return new SubmitIntentionNoteResponse(this);
        } 

    } 

}
