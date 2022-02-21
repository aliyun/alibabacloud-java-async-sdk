// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterComponentResponse} extends {@link TeaModel}
 *
 * <p>AddCasterComponentResponse</p>
 */
public class AddCasterComponentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCasterComponentResponseBody body;

    private AddCasterComponentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCasterComponentResponse create() {
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
    public AddCasterComponentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCasterComponentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCasterComponentResponseBody body);

        @Override
        AddCasterComponentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCasterComponentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCasterComponentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCasterComponentResponse response) {
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
        public Builder body(AddCasterComponentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCasterComponentResponse build() {
            return new AddCasterComponentResponse(this);
        } 

    } 

}
