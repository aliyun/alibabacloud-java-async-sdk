// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountResourceGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListMultiAccountResourceGroupsResponse</p>
 */
public class ListMultiAccountResourceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMultiAccountResourceGroupsResponseBody body;

    private ListMultiAccountResourceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMultiAccountResourceGroupsResponse create() {
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
    public ListMultiAccountResourceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMultiAccountResourceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMultiAccountResourceGroupsResponseBody body);

        @Override
        ListMultiAccountResourceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMultiAccountResourceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMultiAccountResourceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMultiAccountResourceGroupsResponse response) {
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
        public Builder body(ListMultiAccountResourceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMultiAccountResourceGroupsResponse build() {
            return new ListMultiAccountResourceGroupsResponse(this);
        } 

    } 

}
