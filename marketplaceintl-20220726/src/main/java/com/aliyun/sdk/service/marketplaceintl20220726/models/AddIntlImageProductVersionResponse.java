// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIntlImageProductVersionResponse} extends {@link TeaModel}
 *
 * <p>AddIntlImageProductVersionResponse</p>
 */
public class AddIntlImageProductVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddIntlImageProductVersionResponseBody body;

    private AddIntlImageProductVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddIntlImageProductVersionResponse create() {
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
    public AddIntlImageProductVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddIntlImageProductVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddIntlImageProductVersionResponseBody body);

        @Override
        AddIntlImageProductVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddIntlImageProductVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddIntlImageProductVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddIntlImageProductVersionResponse response) {
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
        public Builder body(AddIntlImageProductVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddIntlImageProductVersionResponse build() {
            return new AddIntlImageProductVersionResponse(this);
        } 

    } 

}
