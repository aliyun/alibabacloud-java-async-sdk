// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListByMonitorSourceIdResponse} extends {@link TeaModel}
 *
 * <p>ListByMonitorSourceIdResponse</p>
 */
public class ListByMonitorSourceIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListByMonitorSourceIdResponseBody body;

    private ListByMonitorSourceIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListByMonitorSourceIdResponse create() {
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
    public ListByMonitorSourceIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListByMonitorSourceIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListByMonitorSourceIdResponseBody body);

        @Override
        ListByMonitorSourceIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListByMonitorSourceIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListByMonitorSourceIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListByMonitorSourceIdResponse response) {
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
        public Builder body(ListByMonitorSourceIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListByMonitorSourceIdResponse build() {
            return new ListByMonitorSourceIdResponse(this);
        } 

    } 

}
