// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBgpNetworkResponse} extends {@link TeaModel}
 *
 * <p>AddBgpNetworkResponse</p>
 */
public class AddBgpNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddBgpNetworkResponseBody body;

    private AddBgpNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddBgpNetworkResponse create() {
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
    public AddBgpNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddBgpNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddBgpNetworkResponseBody body);

        @Override
        AddBgpNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddBgpNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddBgpNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddBgpNetworkResponse response) {
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
        public Builder body(AddBgpNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddBgpNetworkResponse build() {
            return new AddBgpNetworkResponse(this);
        } 

    } 

}
