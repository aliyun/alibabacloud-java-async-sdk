// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVariableGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateVariableGroupResponse</p>
 */
public class UpdateVariableGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVariableGroupResponseBody body;

    private UpdateVariableGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVariableGroupResponse create() {
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
    public UpdateVariableGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVariableGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVariableGroupResponseBody body);

        @Override
        UpdateVariableGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVariableGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVariableGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVariableGroupResponse response) {
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
        public Builder body(UpdateVariableGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVariableGroupResponse build() {
            return new UpdateVariableGroupResponse(this);
        } 

    } 

}
