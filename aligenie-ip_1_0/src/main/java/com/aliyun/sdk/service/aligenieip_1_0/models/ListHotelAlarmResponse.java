// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelAlarmResponse} extends {@link TeaModel}
 *
 * <p>ListHotelAlarmResponse</p>
 */
public class ListHotelAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelAlarmResponseBody body;

    private ListHotelAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelAlarmResponse create() {
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
    public ListHotelAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelAlarmResponseBody body);

        @Override
        ListHotelAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelAlarmResponse response) {
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
        public Builder body(ListHotelAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelAlarmResponse build() {
            return new ListHotelAlarmResponse(this);
        } 

    } 

}
