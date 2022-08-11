// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentTasksForResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ListCurrentTasksForResourceGroupResponse</p>
 */
public class ListCurrentTasksForResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCurrentTasksForResourceGroupResponseBody body;

    private ListCurrentTasksForResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCurrentTasksForResourceGroupResponse create() {
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
    public ListCurrentTasksForResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCurrentTasksForResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCurrentTasksForResourceGroupResponseBody body);

        @Override
        ListCurrentTasksForResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCurrentTasksForResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCurrentTasksForResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCurrentTasksForResourceGroupResponse response) {
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
        public Builder body(ListCurrentTasksForResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCurrentTasksForResourceGroupResponse build() {
            return new ListCurrentTasksForResourceGroupResponse(this);
        } 

    } 

}
