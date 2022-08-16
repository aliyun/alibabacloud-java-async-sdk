// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotAlarmEventsResponse} extends {@link TeaModel}
 *
 * <p>ListHoneypotAlarmEventsResponse</p>
 */
public class ListHoneypotAlarmEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHoneypotAlarmEventsResponseBody body;

    private ListHoneypotAlarmEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHoneypotAlarmEventsResponse create() {
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
    public ListHoneypotAlarmEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHoneypotAlarmEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHoneypotAlarmEventsResponseBody body);

        @Override
        ListHoneypotAlarmEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHoneypotAlarmEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHoneypotAlarmEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHoneypotAlarmEventsResponse response) {
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
        public Builder body(ListHoneypotAlarmEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHoneypotAlarmEventsResponse build() {
            return new ListHoneypotAlarmEventsResponse(this);
        } 

    } 

}
