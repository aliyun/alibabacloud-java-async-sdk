// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnswerCallResponse} extends {@link TeaModel}
 *
 * <p>AnswerCallResponse</p>
 */
public class AnswerCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AnswerCallResponseBody body;

    private AnswerCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AnswerCallResponse create() {
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
    public AnswerCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AnswerCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AnswerCallResponseBody body);

        @Override
        AnswerCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AnswerCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AnswerCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AnswerCallResponse response) {
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
        public Builder body(AnswerCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AnswerCallResponse build() {
            return new AnswerCallResponse(this);
        } 

    } 

}
