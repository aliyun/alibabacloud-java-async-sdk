// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationListWithMetircsResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationListWithMetircsResponse</p>
 */
public class GetApplicationListWithMetircsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApplicationListWithMetircsResponseBody body;

    private GetApplicationListWithMetircsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApplicationListWithMetircsResponse create() {
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
    public GetApplicationListWithMetircsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationListWithMetircsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApplicationListWithMetircsResponseBody body);

        @Override
        GetApplicationListWithMetircsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationListWithMetircsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApplicationListWithMetircsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationListWithMetircsResponse response) {
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
        public Builder body(GetApplicationListWithMetircsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationListWithMetircsResponse build() {
            return new GetApplicationListWithMetircsResponse(this);
        } 

    } 

}
