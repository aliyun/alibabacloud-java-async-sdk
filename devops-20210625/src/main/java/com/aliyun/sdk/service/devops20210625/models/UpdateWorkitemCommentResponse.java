// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkitemCommentResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkitemCommentResponse</p>
 */
public class UpdateWorkitemCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkitemCommentResponseBody body;

    private UpdateWorkitemCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkitemCommentResponse create() {
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
    public UpdateWorkitemCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkitemCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkitemCommentResponseBody body);

        @Override
        UpdateWorkitemCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkitemCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkitemCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkitemCommentResponse response) {
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
        public Builder body(UpdateWorkitemCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkitemCommentResponse build() {
            return new UpdateWorkitemCommentResponse(this);
        } 

    } 

}
