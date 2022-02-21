// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiskOpsEventsResponse} extends {@link TeaModel}
 *
 * <p>ListDiskOpsEventsResponse</p>
 */
public class ListDiskOpsEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDiskOpsEventsResponseBody body;

    private ListDiskOpsEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDiskOpsEventsResponse create() {
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
    public ListDiskOpsEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDiskOpsEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDiskOpsEventsResponseBody body);

        @Override
        ListDiskOpsEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDiskOpsEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDiskOpsEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDiskOpsEventsResponse response) {
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
        public Builder body(ListDiskOpsEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDiskOpsEventsResponse build() {
            return new ListDiskOpsEventsResponse(this);
        } 

    } 

}
