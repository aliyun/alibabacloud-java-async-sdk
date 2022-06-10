// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSimQuestionResponse} extends {@link TeaModel}
 *
 * <p>UpdateSimQuestionResponse</p>
 */
public class UpdateSimQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSimQuestionResponseBody body;

    private UpdateSimQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSimQuestionResponse create() {
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
    public UpdateSimQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSimQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSimQuestionResponseBody body);

        @Override
        UpdateSimQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSimQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSimQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSimQuestionResponse response) {
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
        public Builder body(UpdateSimQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSimQuestionResponse build() {
            return new UpdateSimQuestionResponse(this);
        } 

    } 

}
