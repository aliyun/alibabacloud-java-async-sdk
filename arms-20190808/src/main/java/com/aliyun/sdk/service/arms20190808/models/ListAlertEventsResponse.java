// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertEventsResponse} extends {@link TeaModel}
 *
 * <p>ListAlertEventsResponse</p>
 */
public class ListAlertEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlertEventsResponseBody body;

    private ListAlertEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlertEventsResponse create() {
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
    public ListAlertEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlertEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlertEventsResponseBody body);

        @Override
        ListAlertEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlertEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlertEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlertEventsResponse response) {
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
        public Builder body(ListAlertEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlertEventsResponse build() {
            return new ListAlertEventsResponse(this);
        } 

    } 

}
