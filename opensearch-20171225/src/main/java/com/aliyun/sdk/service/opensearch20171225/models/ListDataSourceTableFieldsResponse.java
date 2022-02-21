// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceTableFieldsResponse} extends {@link TeaModel}
 *
 * <p>ListDataSourceTableFieldsResponse</p>
 */
public class ListDataSourceTableFieldsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataSourceTableFieldsResponseBody body;

    private ListDataSourceTableFieldsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataSourceTableFieldsResponse create() {
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
    public ListDataSourceTableFieldsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataSourceTableFieldsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataSourceTableFieldsResponseBody body);

        @Override
        ListDataSourceTableFieldsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataSourceTableFieldsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataSourceTableFieldsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataSourceTableFieldsResponse response) {
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
        public Builder body(ListDataSourceTableFieldsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataSourceTableFieldsResponse build() {
            return new ListDataSourceTableFieldsResponse(this);
        } 

    } 

}
