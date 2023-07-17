// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupTotalResponse} extends {@link TeaModel}
 *
 * <p>GetResourceGroupTotalResponse</p>
 */
public class GetResourceGroupTotalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceGroupTotalResponseBody body;

    private GetResourceGroupTotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceGroupTotalResponse create() {
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
    public GetResourceGroupTotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceGroupTotalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceGroupTotalResponseBody body);

        @Override
        GetResourceGroupTotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceGroupTotalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceGroupTotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceGroupTotalResponse response) {
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
        public Builder body(GetResourceGroupTotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceGroupTotalResponse build() {
            return new GetResourceGroupTotalResponse(this);
        } 

    } 

}
