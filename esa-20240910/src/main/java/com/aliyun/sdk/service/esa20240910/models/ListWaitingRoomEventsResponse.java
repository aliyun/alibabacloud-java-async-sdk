// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListWaitingRoomEventsResponse} extends {@link TeaModel}
 *
 * <p>ListWaitingRoomEventsResponse</p>
 */
public class ListWaitingRoomEventsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListWaitingRoomEventsResponseBody body;

    private ListWaitingRoomEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListWaitingRoomEventsResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ListWaitingRoomEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWaitingRoomEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListWaitingRoomEventsResponseBody body);

        @Override
        ListWaitingRoomEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWaitingRoomEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListWaitingRoomEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWaitingRoomEventsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ListWaitingRoomEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWaitingRoomEventsResponse build() {
            return new ListWaitingRoomEventsResponse(this);
        } 

    } 

}
