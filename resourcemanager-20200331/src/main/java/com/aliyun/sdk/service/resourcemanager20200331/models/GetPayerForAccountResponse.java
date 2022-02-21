// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPayerForAccountResponse} extends {@link TeaModel}
 *
 * <p>GetPayerForAccountResponse</p>
 */
public class GetPayerForAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPayerForAccountResponseBody body;

    private GetPayerForAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPayerForAccountResponse create() {
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
    public GetPayerForAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPayerForAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPayerForAccountResponseBody body);

        @Override
        GetPayerForAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPayerForAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPayerForAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPayerForAccountResponse response) {
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
        public Builder body(GetPayerForAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPayerForAccountResponse build() {
            return new GetPayerForAccountResponse(this);
        } 

    } 

}
