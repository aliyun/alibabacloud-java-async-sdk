// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubscriptionsResponse} extends {@link TeaModel}
 *
 * <p>ListSubscriptionsResponse</p>
 */
public class ListSubscriptionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSubscriptionsResponseBody body;

    private ListSubscriptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSubscriptionsResponse create() {
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
    public ListSubscriptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSubscriptionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSubscriptionsResponseBody body);

        @Override
        ListSubscriptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSubscriptionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSubscriptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSubscriptionsResponse response) {
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
        public Builder body(ListSubscriptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSubscriptionsResponse build() {
            return new ListSubscriptionsResponse(this);
        } 

    } 

}
