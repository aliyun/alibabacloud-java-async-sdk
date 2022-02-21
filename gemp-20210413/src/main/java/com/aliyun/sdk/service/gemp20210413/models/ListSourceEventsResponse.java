// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSourceEventsResponse} extends {@link TeaModel}
 *
 * <p>ListSourceEventsResponse</p>
 */
public class ListSourceEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSourceEventsResponseBody body;

    private ListSourceEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSourceEventsResponse create() {
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
    public ListSourceEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSourceEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSourceEventsResponseBody body);

        @Override
        ListSourceEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSourceEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSourceEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSourceEventsResponse response) {
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
        public Builder body(ListSourceEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSourceEventsResponse build() {
            return new ListSourceEventsResponse(this);
        } 

    } 

}
