// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskStatusByIdResponse} extends {@link TeaModel}
 *
 * <p>GetTaskStatusByIdResponse</p>
 */
public class GetTaskStatusByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTaskStatusByIdResponseBody body;

    private GetTaskStatusByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTaskStatusByIdResponse create() {
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
    public GetTaskStatusByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskStatusByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTaskStatusByIdResponseBody body);

        @Override
        GetTaskStatusByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskStatusByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTaskStatusByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskStatusByIdResponse response) {
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
        public Builder body(GetTaskStatusByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskStatusByIdResponse build() {
            return new GetTaskStatusByIdResponse(this);
        } 

    } 

}
