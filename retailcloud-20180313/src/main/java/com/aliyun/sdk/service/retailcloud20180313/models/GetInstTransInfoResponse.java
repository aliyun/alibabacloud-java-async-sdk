// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstTransInfoResponse} extends {@link TeaModel}
 *
 * <p>GetInstTransInfoResponse</p>
 */
public class GetInstTransInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstTransInfoResponseBody body;

    private GetInstTransInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstTransInfoResponse create() {
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
    public GetInstTransInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstTransInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstTransInfoResponseBody body);

        @Override
        GetInstTransInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstTransInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstTransInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstTransInfoResponse response) {
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
        public Builder body(GetInstTransInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstTransInfoResponse build() {
            return new GetInstTransInfoResponse(this);
        } 

    } 

}
