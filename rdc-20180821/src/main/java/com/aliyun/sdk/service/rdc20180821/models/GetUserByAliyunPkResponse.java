// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserByAliyunPkResponse} extends {@link TeaModel}
 *
 * <p>GetUserByAliyunPkResponse</p>
 */
public class GetUserByAliyunPkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserByAliyunPkResponseBody body;

    private GetUserByAliyunPkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserByAliyunPkResponse create() {
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
    public GetUserByAliyunPkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserByAliyunPkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserByAliyunPkResponseBody body);

        @Override
        GetUserByAliyunPkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserByAliyunPkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserByAliyunPkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserByAliyunPkResponse response) {
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
        public Builder body(GetUserByAliyunPkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserByAliyunPkResponse build() {
            return new GetUserByAliyunPkResponse(this);
        } 

    } 

}
