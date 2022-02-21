// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHotWordsTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateHotWordsTaskResponse</p>
 */
public class UpdateHotWordsTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHotWordsTaskResponseBody body;

    private UpdateHotWordsTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHotWordsTaskResponse create() {
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
    public UpdateHotWordsTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHotWordsTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHotWordsTaskResponseBody body);

        @Override
        UpdateHotWordsTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHotWordsTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHotWordsTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHotWordsTaskResponse response) {
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
        public Builder body(UpdateHotWordsTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHotWordsTaskResponse build() {
            return new UpdateHotWordsTaskResponse(this);
        } 

    } 

}
