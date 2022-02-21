// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVariableGroupResponse} extends {@link TeaModel}
 *
 * <p>GetVariableGroupResponse</p>
 */
public class GetVariableGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVariableGroupResponseBody body;

    private GetVariableGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVariableGroupResponse create() {
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
    public GetVariableGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVariableGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVariableGroupResponseBody body);

        @Override
        GetVariableGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVariableGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVariableGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVariableGroupResponse response) {
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
        public Builder body(GetVariableGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVariableGroupResponse build() {
            return new GetVariableGroupResponse(this);
        } 

    } 

}
