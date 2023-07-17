// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsResponse</p>
 */
public class ListResourceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceGroupsResponseBody body;

    private ListResourceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceGroupsResponse create() {
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
    public ListResourceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceGroupsResponseBody body);

        @Override
        ListResourceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceGroupsResponse response) {
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
        public Builder body(ListResourceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceGroupsResponse build() {
            return new ListResourceGroupsResponse(this);
        } 

    } 

}
