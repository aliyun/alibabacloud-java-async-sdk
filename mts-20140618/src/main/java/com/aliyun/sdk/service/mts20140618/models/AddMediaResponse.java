// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaResponse} extends {@link TeaModel}
 *
 * <p>AddMediaResponse</p>
 */
public class AddMediaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMediaResponseBody body;

    private AddMediaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMediaResponse create() {
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
    public AddMediaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMediaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMediaResponseBody body);

        @Override
        AddMediaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMediaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMediaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMediaResponse response) {
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
        public Builder body(AddMediaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMediaResponse build() {
            return new AddMediaResponse(this);
        } 

    } 

}
