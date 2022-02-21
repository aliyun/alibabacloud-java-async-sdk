// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBoardResponse} extends {@link TeaModel}
 *
 * <p>CreateBoardResponse</p>
 */
public class CreateBoardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBoardResponseBody body;

    private CreateBoardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBoardResponse create() {
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
    public CreateBoardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBoardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBoardResponseBody body);

        @Override
        CreateBoardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBoardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBoardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBoardResponse response) {
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
        public Builder body(CreateBoardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBoardResponse build() {
            return new CreateBoardResponse(this);
        } 

    } 

}
