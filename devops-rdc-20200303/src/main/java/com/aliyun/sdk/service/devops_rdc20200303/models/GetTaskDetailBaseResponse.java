// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskDetailBaseResponse} extends {@link TeaModel}
 *
 * <p>GetTaskDetailBaseResponse</p>
 */
public class GetTaskDetailBaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTaskDetailBaseResponseBody body;

    private GetTaskDetailBaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTaskDetailBaseResponse create() {
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
    public GetTaskDetailBaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskDetailBaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTaskDetailBaseResponseBody body);

        @Override
        GetTaskDetailBaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskDetailBaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTaskDetailBaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskDetailBaseResponse response) {
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
        public Builder body(GetTaskDetailBaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskDetailBaseResponse build() {
            return new GetTaskDetailBaseResponse(this);
        } 

    } 

}
