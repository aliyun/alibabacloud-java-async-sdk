// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVariableGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateVariableGroupResponse</p>
 */
public class CreateVariableGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVariableGroupResponseBody body;

    private CreateVariableGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVariableGroupResponse create() {
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
    public CreateVariableGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVariableGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVariableGroupResponseBody body);

        @Override
        CreateVariableGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVariableGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVariableGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVariableGroupResponse response) {
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
        public Builder body(CreateVariableGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVariableGroupResponse build() {
            return new CreateVariableGroupResponse(this);
        } 

    } 

}
