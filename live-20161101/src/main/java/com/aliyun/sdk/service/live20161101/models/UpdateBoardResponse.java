// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBoardResponse} extends {@link TeaModel}
 *
 * <p>UpdateBoardResponse</p>
 */
public class UpdateBoardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBoardResponseBody body;

    private UpdateBoardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBoardResponse create() {
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
    public UpdateBoardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBoardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBoardResponseBody body);

        @Override
        UpdateBoardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBoardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBoardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBoardResponse response) {
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
        public Builder body(UpdateBoardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBoardResponse build() {
            return new UpdateBoardResponse(this);
        } 

    } 

}
