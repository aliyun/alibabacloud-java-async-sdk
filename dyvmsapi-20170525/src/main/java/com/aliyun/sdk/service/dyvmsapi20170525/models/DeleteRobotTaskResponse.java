// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRobotTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteRobotTaskResponse</p>
 */
public class DeleteRobotTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRobotTaskResponseBody body;

    private DeleteRobotTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRobotTaskResponse create() {
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
    public DeleteRobotTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRobotTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRobotTaskResponseBody body);

        @Override
        DeleteRobotTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRobotTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRobotTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRobotTaskResponse response) {
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
        public Builder body(DeleteRobotTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRobotTaskResponse build() {
            return new DeleteRobotTaskResponse(this);
        } 

    } 

}
