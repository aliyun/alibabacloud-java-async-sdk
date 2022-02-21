// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductDimensionGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListProductDimensionGroupsResponse</p>
 */
public class ListProductDimensionGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProductDimensionGroupsResponseBody body;

    private ListProductDimensionGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProductDimensionGroupsResponse create() {
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
    public ListProductDimensionGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductDimensionGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProductDimensionGroupsResponseBody body);

        @Override
        ListProductDimensionGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductDimensionGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProductDimensionGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductDimensionGroupsResponse response) {
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
        public Builder body(ListProductDimensionGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductDimensionGroupsResponse build() {
            return new ListProductDimensionGroupsResponse(this);
        } 

    } 

}
