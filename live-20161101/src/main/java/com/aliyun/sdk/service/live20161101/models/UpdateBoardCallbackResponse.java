// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBoardCallbackResponse} extends {@link TeaModel}
 *
 * <p>UpdateBoardCallbackResponse</p>
 */
public class UpdateBoardCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBoardCallbackResponseBody body;

    private UpdateBoardCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBoardCallbackResponse create() {
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
    public UpdateBoardCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBoardCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBoardCallbackResponseBody body);

        @Override
        UpdateBoardCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBoardCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBoardCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBoardCallbackResponse response) {
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
        public Builder body(UpdateBoardCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBoardCallbackResponse build() {
            return new UpdateBoardCallbackResponse(this);
        } 

    } 

}
