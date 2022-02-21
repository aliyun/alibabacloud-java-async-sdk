// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddServiceSourceResponse} extends {@link TeaModel}
 *
 * <p>AddServiceSourceResponse</p>
 */
public class AddServiceSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddServiceSourceResponseBody body;

    private AddServiceSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddServiceSourceResponse create() {
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
    public AddServiceSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddServiceSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddServiceSourceResponseBody body);

        @Override
        AddServiceSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddServiceSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddServiceSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddServiceSourceResponse response) {
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
        public Builder body(AddServiceSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddServiceSourceResponse build() {
            return new AddServiceSourceResponse(this);
        } 

    } 

}
