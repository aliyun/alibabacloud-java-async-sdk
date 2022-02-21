// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMixStreamResponse} extends {@link TeaModel}
 *
 * <p>UpdateMixStreamResponse</p>
 */
public class UpdateMixStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMixStreamResponseBody body;

    private UpdateMixStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMixStreamResponse create() {
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
    public UpdateMixStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMixStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMixStreamResponseBody body);

        @Override
        UpdateMixStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMixStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMixStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMixStreamResponse response) {
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
        public Builder body(UpdateMixStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMixStreamResponse build() {
            return new UpdateMixStreamResponse(this);
        } 

    } 

}
