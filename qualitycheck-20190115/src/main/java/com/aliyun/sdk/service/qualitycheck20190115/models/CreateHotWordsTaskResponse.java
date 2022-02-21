// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotWordsTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateHotWordsTaskResponse</p>
 */
public class CreateHotWordsTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHotWordsTaskResponseBody body;

    private CreateHotWordsTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHotWordsTaskResponse create() {
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
    public CreateHotWordsTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHotWordsTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHotWordsTaskResponseBody body);

        @Override
        CreateHotWordsTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHotWordsTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHotWordsTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHotWordsTaskResponse response) {
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
        public Builder body(CreateHotWordsTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHotWordsTaskResponse build() {
            return new CreateHotWordsTaskResponse(this);
        } 

    } 

}
