// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksResponse} extends {@link TeaModel}
 *
 * <p>ListTasksResponse</p>
 */
public class ListTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private ListTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static ListTasksResponse create() {
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

    public interface Builder extends Response.Builder<ListTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        ListTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTasksResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public ListTasksResponse build() {
            return new ListTasksResponse(this);
        } 

    } 

}
