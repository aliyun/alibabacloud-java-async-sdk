// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAxgGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateAxgGroupResponse</p>
 */
public class CreateAxgGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAxgGroupResponseBody body;

    private CreateAxgGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAxgGroupResponse create() {
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
    public CreateAxgGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAxgGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAxgGroupResponseBody body);

        @Override
        CreateAxgGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAxgGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAxgGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAxgGroupResponse response) {
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
        public Builder body(CreateAxgGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAxgGroupResponse build() {
            return new CreateAxgGroupResponse(this);
        } 

    } 

}
