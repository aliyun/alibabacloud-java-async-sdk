// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBindedUserByDingIdResponse} extends {@link TeaModel}
 *
 * <p>GetBindedUserByDingIdResponse</p>
 */
public class GetBindedUserByDingIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBindedUserByDingIdResponseBody body;

    private GetBindedUserByDingIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBindedUserByDingIdResponse create() {
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
    public GetBindedUserByDingIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBindedUserByDingIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBindedUserByDingIdResponseBody body);

        @Override
        GetBindedUserByDingIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBindedUserByDingIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBindedUserByDingIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBindedUserByDingIdResponse response) {
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
        public Builder body(GetBindedUserByDingIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBindedUserByDingIdResponse build() {
            return new GetBindedUserByDingIdResponse(this);
        } 

    } 

}
