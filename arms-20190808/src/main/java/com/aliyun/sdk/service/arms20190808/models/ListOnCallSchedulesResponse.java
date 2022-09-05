// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnCallSchedulesResponse} extends {@link TeaModel}
 *
 * <p>ListOnCallSchedulesResponse</p>
 */
public class ListOnCallSchedulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOnCallSchedulesResponseBody body;

    private ListOnCallSchedulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOnCallSchedulesResponse create() {
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
    public ListOnCallSchedulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOnCallSchedulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOnCallSchedulesResponseBody body);

        @Override
        ListOnCallSchedulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOnCallSchedulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOnCallSchedulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOnCallSchedulesResponse response) {
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
        public Builder body(ListOnCallSchedulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOnCallSchedulesResponse build() {
            return new ListOnCallSchedulesResponse(this);
        } 

    } 

}
