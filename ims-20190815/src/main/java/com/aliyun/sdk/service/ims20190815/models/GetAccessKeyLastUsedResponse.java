// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedResponse} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedResponse</p>
 */
public class GetAccessKeyLastUsedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccessKeyLastUsedResponseBody body;

    private GetAccessKeyLastUsedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccessKeyLastUsedResponse create() {
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
    public GetAccessKeyLastUsedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccessKeyLastUsedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccessKeyLastUsedResponseBody body);

        @Override
        GetAccessKeyLastUsedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccessKeyLastUsedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccessKeyLastUsedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccessKeyLastUsedResponse response) {
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
        public Builder body(GetAccessKeyLastUsedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccessKeyLastUsedResponse build() {
            return new GetAccessKeyLastUsedResponse(this);
        } 

    } 

}
