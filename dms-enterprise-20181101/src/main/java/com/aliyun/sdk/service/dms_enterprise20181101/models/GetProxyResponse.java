// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProxyResponse} extends {@link TeaModel}
 *
 * <p>GetProxyResponse</p>
 */
public class GetProxyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProxyResponseBody body;

    private GetProxyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProxyResponse create() {
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
    public GetProxyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProxyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProxyResponseBody body);

        @Override
        GetProxyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProxyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProxyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProxyResponse response) {
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
        public Builder body(GetProxyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProxyResponse build() {
            return new GetProxyResponse(this);
        } 

    } 

}
