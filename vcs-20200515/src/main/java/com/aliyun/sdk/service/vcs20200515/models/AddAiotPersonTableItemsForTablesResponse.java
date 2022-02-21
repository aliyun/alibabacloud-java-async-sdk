// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotPersonTableItemsForTablesResponse} extends {@link TeaModel}
 *
 * <p>AddAiotPersonTableItemsForTablesResponse</p>
 */
public class AddAiotPersonTableItemsForTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAiotPersonTableItemsForTablesResponseBody body;

    private AddAiotPersonTableItemsForTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAiotPersonTableItemsForTablesResponse create() {
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
    public AddAiotPersonTableItemsForTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAiotPersonTableItemsForTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAiotPersonTableItemsForTablesResponseBody body);

        @Override
        AddAiotPersonTableItemsForTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAiotPersonTableItemsForTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAiotPersonTableItemsForTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAiotPersonTableItemsForTablesResponse response) {
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
        public Builder body(AddAiotPersonTableItemsForTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAiotPersonTableItemsForTablesResponse build() {
            return new AddAiotPersonTableItemsForTablesResponse(this);
        } 

    } 

}
