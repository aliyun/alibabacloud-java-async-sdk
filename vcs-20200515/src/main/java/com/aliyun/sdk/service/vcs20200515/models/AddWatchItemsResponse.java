// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWatchItemsResponse} extends {@link TeaModel}
 *
 * <p>AddWatchItemsResponse</p>
 */
public class AddWatchItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddWatchItemsResponseBody body;

    private AddWatchItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddWatchItemsResponse create() {
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
    public AddWatchItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddWatchItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddWatchItemsResponseBody body);

        @Override
        AddWatchItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddWatchItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddWatchItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddWatchItemsResponse response) {
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
        public Builder body(AddWatchItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddWatchItemsResponse build() {
            return new AddWatchItemsResponse(this);
        } 

    } 

}
