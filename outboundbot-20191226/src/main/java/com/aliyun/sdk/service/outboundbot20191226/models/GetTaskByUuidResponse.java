// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskByUuidResponse} extends {@link TeaModel}
 *
 * <p>GetTaskByUuidResponse</p>
 */
public class GetTaskByUuidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTaskByUuidResponseBody body;

    private GetTaskByUuidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTaskByUuidResponse create() {
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
    public GetTaskByUuidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTaskByUuidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTaskByUuidResponseBody body);

        @Override
        GetTaskByUuidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskByUuidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTaskByUuidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskByUuidResponse response) {
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
        public Builder body(GetTaskByUuidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTaskByUuidResponse build() {
            return new GetTaskByUuidResponse(this);
        } 

    } 

}
