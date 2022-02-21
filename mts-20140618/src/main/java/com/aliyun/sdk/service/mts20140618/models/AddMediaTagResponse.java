// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaTagResponse} extends {@link TeaModel}
 *
 * <p>AddMediaTagResponse</p>
 */
public class AddMediaTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMediaTagResponseBody body;

    private AddMediaTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMediaTagResponse create() {
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
    public AddMediaTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMediaTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMediaTagResponseBody body);

        @Override
        AddMediaTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMediaTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMediaTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMediaTagResponse response) {
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
        public Builder body(AddMediaTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMediaTagResponse build() {
            return new AddMediaTagResponse(this);
        } 

    } 

}
