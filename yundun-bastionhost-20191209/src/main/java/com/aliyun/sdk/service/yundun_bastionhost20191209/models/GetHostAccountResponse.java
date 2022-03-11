// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostAccountResponse} extends {@link TeaModel}
 *
 * <p>GetHostAccountResponse</p>
 */
public class GetHostAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHostAccountResponseBody body;

    private GetHostAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHostAccountResponse create() {
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
    public GetHostAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHostAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHostAccountResponseBody body);

        @Override
        GetHostAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHostAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHostAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHostAccountResponse response) {
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
        public Builder body(GetHostAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHostAccountResponse build() {
            return new GetHostAccountResponse(this);
        } 

    } 

}
