// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTextTo2DAvatarVideoTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitTextTo2DAvatarVideoTaskResponse</p>
 */
public class SubmitTextTo2DAvatarVideoTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitTextTo2DAvatarVideoTaskResponseBody body;

    private SubmitTextTo2DAvatarVideoTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitTextTo2DAvatarVideoTaskResponse create() {
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
    public SubmitTextTo2DAvatarVideoTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitTextTo2DAvatarVideoTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitTextTo2DAvatarVideoTaskResponseBody body);

        @Override
        SubmitTextTo2DAvatarVideoTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitTextTo2DAvatarVideoTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitTextTo2DAvatarVideoTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitTextTo2DAvatarVideoTaskResponse response) {
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
        public Builder body(SubmitTextTo2DAvatarVideoTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitTextTo2DAvatarVideoTaskResponse build() {
            return new SubmitTextTo2DAvatarVideoTaskResponse(this);
        } 

    } 

}
