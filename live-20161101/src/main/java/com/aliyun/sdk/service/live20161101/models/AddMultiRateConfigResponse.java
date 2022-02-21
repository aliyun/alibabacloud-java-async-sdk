// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMultiRateConfigResponse} extends {@link TeaModel}
 *
 * <p>AddMultiRateConfigResponse</p>
 */
public class AddMultiRateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMultiRateConfigResponseBody body;

    private AddMultiRateConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMultiRateConfigResponse create() {
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
    public AddMultiRateConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMultiRateConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMultiRateConfigResponseBody body);

        @Override
        AddMultiRateConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMultiRateConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMultiRateConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMultiRateConfigResponse response) {
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
        public Builder body(AddMultiRateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMultiRateConfigResponse build() {
            return new AddMultiRateConfigResponse(this);
        } 

    } 

}
