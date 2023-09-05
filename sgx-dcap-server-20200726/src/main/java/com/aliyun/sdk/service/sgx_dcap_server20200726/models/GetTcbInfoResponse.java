// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTcbInfoResponse} extends {@link TeaModel}
 *
 * <p>GetTcbInfoResponse</p>
 */
public class GetTcbInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private String body;

    private GetTcbInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTcbInfoResponse create() {
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
    public String getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTcbInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(String body);

        @Override
        GetTcbInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTcbInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private String body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTcbInfoResponse response) {
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
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTcbInfoResponse build() {
            return new GetTcbInfoResponse(this);
        } 

    } 

}
