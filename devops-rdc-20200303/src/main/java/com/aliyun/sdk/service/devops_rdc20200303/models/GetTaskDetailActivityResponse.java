// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskDetailActivityResponse} extends {@link TeaModel}
 *
 * <p>GetTaskDetailActivityResponse</p>
 */
public class GetTaskDetailActivityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTaskDetailActivityResponseBody body;

    private GetTaskDetailActivityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTaskDetailActivityResponse create() {
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
    public GetTaskDetailActivityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskDetailActivityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTaskDetailActivityResponseBody body);

        @Override
        GetTaskDetailActivityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskDetailActivityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTaskDetailActivityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskDetailActivityResponse response) {
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
        public Builder body(GetTaskDetailActivityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskDetailActivityResponse build() {
            return new GetTaskDetailActivityResponse(this);
        } 

    } 

}
