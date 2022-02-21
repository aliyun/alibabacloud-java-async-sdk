// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrendForSourceEventResponse} extends {@link TeaModel}
 *
 * <p>ListTrendForSourceEventResponse</p>
 */
public class ListTrendForSourceEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTrendForSourceEventResponseBody body;

    private ListTrendForSourceEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTrendForSourceEventResponse create() {
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
    public ListTrendForSourceEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrendForSourceEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTrendForSourceEventResponseBody body);

        @Override
        ListTrendForSourceEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrendForSourceEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTrendForSourceEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrendForSourceEventResponse response) {
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
        public Builder body(ListTrendForSourceEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrendForSourceEventResponse build() {
            return new ListTrendForSourceEventResponse(this);
        } 

    } 

}
