// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemByIdResponse} extends {@link TeaModel}
 *
 * <p>GetWorkitemByIdResponse</p>
 */
public class GetWorkitemByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWorkitemByIdResponseBody body;

    private GetWorkitemByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWorkitemByIdResponse create() {
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
    public GetWorkitemByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkitemByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWorkitemByIdResponseBody body);

        @Override
        GetWorkitemByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkitemByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWorkitemByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkitemByIdResponse response) {
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
        public Builder body(GetWorkitemByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkitemByIdResponse build() {
            return new GetWorkitemByIdResponse(this);
        } 

    } 

}
