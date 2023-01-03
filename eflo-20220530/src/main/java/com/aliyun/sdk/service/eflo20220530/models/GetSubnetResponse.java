// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubnetResponse} extends {@link TeaModel}
 *
 * <p>GetSubnetResponse</p>
 */
public class GetSubnetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSubnetResponseBody body;

    private GetSubnetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSubnetResponse create() {
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
    public GetSubnetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSubnetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSubnetResponseBody body);

        @Override
        GetSubnetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSubnetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSubnetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSubnetResponse response) {
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
        public Builder body(GetSubnetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSubnetResponse build() {
            return new GetSubnetResponse(this);
        } 

    } 

}
