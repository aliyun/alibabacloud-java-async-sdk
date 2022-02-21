// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotPersonTableItemsResponse} extends {@link TeaModel}
 *
 * <p>AddAiotPersonTableItemsResponse</p>
 */
public class AddAiotPersonTableItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAiotPersonTableItemsResponseBody body;

    private AddAiotPersonTableItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAiotPersonTableItemsResponse create() {
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
    public AddAiotPersonTableItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAiotPersonTableItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAiotPersonTableItemsResponseBody body);

        @Override
        AddAiotPersonTableItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAiotPersonTableItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAiotPersonTableItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAiotPersonTableItemsResponse response) {
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
        public Builder body(AddAiotPersonTableItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAiotPersonTableItemsResponse build() {
            return new AddAiotPersonTableItemsResponse(this);
        } 

    } 

}
