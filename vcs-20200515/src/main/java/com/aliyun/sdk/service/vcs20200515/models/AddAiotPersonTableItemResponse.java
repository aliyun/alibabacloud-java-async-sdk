// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotPersonTableItemResponse} extends {@link TeaModel}
 *
 * <p>AddAiotPersonTableItemResponse</p>
 */
public class AddAiotPersonTableItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAiotPersonTableItemResponseBody body;

    private AddAiotPersonTableItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAiotPersonTableItemResponse create() {
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
    public AddAiotPersonTableItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAiotPersonTableItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAiotPersonTableItemResponseBody body);

        @Override
        AddAiotPersonTableItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAiotPersonTableItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAiotPersonTableItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAiotPersonTableItemResponse response) {
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
        public Builder body(AddAiotPersonTableItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAiotPersonTableItemResponse build() {
            return new AddAiotPersonTableItemResponse(this);
        } 

    } 

}
