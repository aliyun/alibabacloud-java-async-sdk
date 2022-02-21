// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserNameResponse} extends {@link TeaModel}
 *
 * <p>GetUserNameResponse</p>
 */
public class GetUserNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserNameResponseBody body;

    private GetUserNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserNameResponse create() {
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
    public GetUserNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserNameResponseBody body);

        @Override
        GetUserNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserNameResponse response) {
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
        public Builder body(GetUserNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserNameResponse build() {
            return new GetUserNameResponse(this);
        } 

    } 

}
