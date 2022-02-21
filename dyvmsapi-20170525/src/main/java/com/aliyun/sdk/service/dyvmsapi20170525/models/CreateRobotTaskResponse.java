// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRobotTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateRobotTaskResponse</p>
 */
public class CreateRobotTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRobotTaskResponseBody body;

    private CreateRobotTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRobotTaskResponse create() {
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
    public CreateRobotTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRobotTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRobotTaskResponseBody body);

        @Override
        CreateRobotTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRobotTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRobotTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRobotTaskResponse response) {
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
        public Builder body(CreateRobotTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRobotTaskResponse build() {
            return new CreateRobotTaskResponse(this);
        } 

    } 

}
