// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRelativePositionResponse} extends {@link TeaModel}
 *
 * <p>AddRelativePositionResponse</p>
 */
public class AddRelativePositionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRelativePositionResponseBody body;

    private AddRelativePositionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRelativePositionResponse create() {
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
    public AddRelativePositionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRelativePositionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRelativePositionResponseBody body);

        @Override
        AddRelativePositionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRelativePositionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRelativePositionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRelativePositionResponse response) {
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
        public Builder body(AddRelativePositionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRelativePositionResponse build() {
            return new AddRelativePositionResponse(this);
        } 

    } 

}
