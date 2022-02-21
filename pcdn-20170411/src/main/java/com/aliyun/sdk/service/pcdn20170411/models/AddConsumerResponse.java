// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddConsumerResponse} extends {@link TeaModel}
 *
 * <p>AddConsumerResponse</p>
 */
public class AddConsumerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddConsumerResponseBody body;

    private AddConsumerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddConsumerResponse create() {
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
    public AddConsumerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddConsumerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddConsumerResponseBody body);

        @Override
        AddConsumerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddConsumerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddConsumerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddConsumerResponse response) {
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
        public Builder body(AddConsumerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddConsumerResponse build() {
            return new AddConsumerResponse(this);
        } 

    } 

}
