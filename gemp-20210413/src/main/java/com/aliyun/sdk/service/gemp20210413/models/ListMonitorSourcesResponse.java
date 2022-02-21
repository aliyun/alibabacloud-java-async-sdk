// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMonitorSourcesResponse} extends {@link TeaModel}
 *
 * <p>ListMonitorSourcesResponse</p>
 */
public class ListMonitorSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMonitorSourcesResponseBody body;

    private ListMonitorSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMonitorSourcesResponse create() {
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
    public ListMonitorSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMonitorSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMonitorSourcesResponseBody body);

        @Override
        ListMonitorSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMonitorSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMonitorSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMonitorSourcesResponse response) {
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
        public Builder body(ListMonitorSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMonitorSourcesResponse build() {
            return new ListMonitorSourcesResponse(this);
        } 

    } 

}
