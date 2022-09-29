// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveReceiverDetailResponse} extends {@link TeaModel}
 *
 * <p>SaveReceiverDetailResponse</p>
 */
public class SaveReceiverDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveReceiverDetailResponseBody body;

    private SaveReceiverDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveReceiverDetailResponse create() {
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
    public SaveReceiverDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveReceiverDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveReceiverDetailResponseBody body);

        @Override
        SaveReceiverDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveReceiverDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveReceiverDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveReceiverDetailResponse response) {
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
        public Builder body(SaveReceiverDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveReceiverDetailResponse build() {
            return new SaveReceiverDetailResponse(this);
        } 

    } 

}
