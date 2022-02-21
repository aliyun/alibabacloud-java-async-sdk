// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>GetTaskStatusResponse</p>
 */
public class GetTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTaskStatusResponseBody body;

    private GetTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTaskStatusResponse create() {
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
    public GetTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTaskStatusResponseBody body);

        @Override
        GetTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskStatusResponse response) {
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
        public Builder body(GetTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskStatusResponse build() {
            return new GetTaskStatusResponse(this);
        } 

    } 

}
