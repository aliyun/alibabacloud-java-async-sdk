// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentUsageForResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ListCurrentUsageForResourceGroupResponse</p>
 */
public class ListCurrentUsageForResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCurrentUsageForResourceGroupResponseBody body;

    private ListCurrentUsageForResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCurrentUsageForResourceGroupResponse create() {
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
    public ListCurrentUsageForResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCurrentUsageForResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCurrentUsageForResourceGroupResponseBody body);

        @Override
        ListCurrentUsageForResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCurrentUsageForResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCurrentUsageForResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCurrentUsageForResourceGroupResponse response) {
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
        public Builder body(ListCurrentUsageForResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCurrentUsageForResourceGroupResponse build() {
            return new ListCurrentUsageForResourceGroupResponse(this);
        } 

    } 

}
