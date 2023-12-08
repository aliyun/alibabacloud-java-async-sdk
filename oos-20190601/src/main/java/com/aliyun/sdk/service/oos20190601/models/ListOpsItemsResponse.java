// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpsItemsResponse} extends {@link TeaModel}
 *
 * <p>ListOpsItemsResponse</p>
 */
public class ListOpsItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOpsItemsResponseBody body;

    private ListOpsItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOpsItemsResponse create() {
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
    public ListOpsItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOpsItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOpsItemsResponseBody body);

        @Override
        ListOpsItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOpsItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOpsItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOpsItemsResponse response) {
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
        public Builder body(ListOpsItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOpsItemsResponse build() {
            return new ListOpsItemsResponse(this);
        } 

    } 

}
