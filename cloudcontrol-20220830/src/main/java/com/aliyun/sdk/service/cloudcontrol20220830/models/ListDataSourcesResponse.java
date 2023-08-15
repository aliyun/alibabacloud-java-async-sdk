// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourcesResponse} extends {@link TeaModel}
 *
 * <p>ListDataSourcesResponse</p>
 */
public class ListDataSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataSourcesResponseBody body;

    private ListDataSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataSourcesResponse create() {
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
    public ListDataSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataSourcesResponseBody body);

        @Override
        ListDataSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataSourcesResponse response) {
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
        public Builder body(ListDataSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataSourcesResponse build() {
            return new ListDataSourcesResponse(this);
        } 

    } 

}
