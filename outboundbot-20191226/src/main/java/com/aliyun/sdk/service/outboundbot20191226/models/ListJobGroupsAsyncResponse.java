// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobGroupsAsyncResponse} extends {@link TeaModel}
 *
 * <p>ListJobGroupsAsyncResponse</p>
 */
public class ListJobGroupsAsyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJobGroupsAsyncResponseBody body;

    private ListJobGroupsAsyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJobGroupsAsyncResponse create() {
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
    public ListJobGroupsAsyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJobGroupsAsyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJobGroupsAsyncResponseBody body);

        @Override
        ListJobGroupsAsyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJobGroupsAsyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJobGroupsAsyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJobGroupsAsyncResponse response) {
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
        public Builder body(ListJobGroupsAsyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJobGroupsAsyncResponse build() {
            return new ListJobGroupsAsyncResponse(this);
        } 

    } 

}
