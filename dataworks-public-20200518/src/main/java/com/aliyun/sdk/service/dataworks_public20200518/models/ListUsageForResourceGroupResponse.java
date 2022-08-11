// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsageForResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ListUsageForResourceGroupResponse</p>
 */
public class ListUsageForResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUsageForResourceGroupResponseBody body;

    private ListUsageForResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUsageForResourceGroupResponse create() {
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
    public ListUsageForResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUsageForResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUsageForResourceGroupResponseBody body);

        @Override
        ListUsageForResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUsageForResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUsageForResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUsageForResourceGroupResponse response) {
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
        public Builder body(ListUsageForResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUsageForResourceGroupResponse build() {
            return new ListUsageForResourceGroupResponse(this);
        } 

    } 

}
