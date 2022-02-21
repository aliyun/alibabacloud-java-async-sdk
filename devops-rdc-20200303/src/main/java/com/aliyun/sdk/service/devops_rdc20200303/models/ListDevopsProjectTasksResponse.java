// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTasksResponse} extends {@link TeaModel}
 *
 * <p>ListDevopsProjectTasksResponse</p>
 */
public class ListDevopsProjectTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDevopsProjectTasksResponseBody body;

    private ListDevopsProjectTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDevopsProjectTasksResponse create() {
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
    public ListDevopsProjectTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDevopsProjectTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDevopsProjectTasksResponseBody body);

        @Override
        ListDevopsProjectTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDevopsProjectTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDevopsProjectTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDevopsProjectTasksResponse response) {
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
        public Builder body(ListDevopsProjectTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDevopsProjectTasksResponse build() {
            return new ListDevopsProjectTasksResponse(this);
        } 

    } 

}
