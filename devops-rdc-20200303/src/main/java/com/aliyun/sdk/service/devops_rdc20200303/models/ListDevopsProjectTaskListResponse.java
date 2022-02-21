// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTaskListResponse} extends {@link TeaModel}
 *
 * <p>ListDevopsProjectTaskListResponse</p>
 */
public class ListDevopsProjectTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDevopsProjectTaskListResponseBody body;

    private ListDevopsProjectTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDevopsProjectTaskListResponse create() {
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
    public ListDevopsProjectTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDevopsProjectTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDevopsProjectTaskListResponseBody body);

        @Override
        ListDevopsProjectTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDevopsProjectTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDevopsProjectTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDevopsProjectTaskListResponse response) {
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
        public Builder body(ListDevopsProjectTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDevopsProjectTaskListResponse build() {
            return new ListDevopsProjectTaskListResponse(this);
        } 

    } 

}
