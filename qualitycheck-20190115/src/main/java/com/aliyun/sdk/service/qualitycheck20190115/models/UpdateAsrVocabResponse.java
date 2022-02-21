// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAsrVocabResponse} extends {@link TeaModel}
 *
 * <p>UpdateAsrVocabResponse</p>
 */
public class UpdateAsrVocabResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAsrVocabResponseBody body;

    private UpdateAsrVocabResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAsrVocabResponse create() {
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
    public UpdateAsrVocabResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAsrVocabResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAsrVocabResponseBody body);

        @Override
        UpdateAsrVocabResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAsrVocabResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAsrVocabResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAsrVocabResponse response) {
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
        public Builder body(UpdateAsrVocabResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAsrVocabResponse build() {
            return new UpdateAsrVocabResponse(this);
        } 

    } 

}
