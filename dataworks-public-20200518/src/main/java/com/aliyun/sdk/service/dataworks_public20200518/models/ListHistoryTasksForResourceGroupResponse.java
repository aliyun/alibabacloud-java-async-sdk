// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHistoryTasksForResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>ListHistoryTasksForResourceGroupResponse</p>
 */
public class ListHistoryTasksForResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHistoryTasksForResourceGroupResponseBody body;

    private ListHistoryTasksForResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHistoryTasksForResourceGroupResponse create() {
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
    public ListHistoryTasksForResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHistoryTasksForResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHistoryTasksForResourceGroupResponseBody body);

        @Override
        ListHistoryTasksForResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHistoryTasksForResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHistoryTasksForResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHistoryTasksForResourceGroupResponse response) {
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
        public Builder body(ListHistoryTasksForResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHistoryTasksForResourceGroupResponse build() {
            return new ListHistoryTasksForResourceGroupResponse(this);
        } 

    } 

}
