// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinBoardResponse} extends {@link TeaModel}
 *
 * <p>JoinBoardResponse</p>
 */
public class JoinBoardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinBoardResponseBody body;

    private JoinBoardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinBoardResponse create() {
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
    public JoinBoardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinBoardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinBoardResponseBody body);

        @Override
        JoinBoardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinBoardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinBoardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinBoardResponse response) {
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
        public Builder body(JoinBoardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinBoardResponse build() {
            return new JoinBoardResponse(this);
        } 

    } 

}
