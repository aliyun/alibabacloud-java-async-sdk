// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetBoardCallbackResponse} extends {@link TeaModel}
 *
 * <p>SetBoardCallbackResponse</p>
 */
public class SetBoardCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetBoardCallbackResponseBody body;

    private SetBoardCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetBoardCallbackResponse create() {
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
    public SetBoardCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetBoardCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetBoardCallbackResponseBody body);

        @Override
        SetBoardCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetBoardCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetBoardCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetBoardCallbackResponse response) {
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
        public Builder body(SetBoardCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetBoardCallbackResponse build() {
            return new SetBoardCallbackResponse(this);
        } 

    } 

}
