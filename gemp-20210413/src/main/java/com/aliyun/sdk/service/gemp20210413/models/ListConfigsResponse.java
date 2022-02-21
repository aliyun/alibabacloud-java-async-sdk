// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListConfigsResponse</p>
 */
public class ListConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConfigsResponseBody body;

    private ListConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConfigsResponse create() {
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
    public ListConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConfigsResponseBody body);

        @Override
        ListConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigsResponse response) {
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
        public Builder body(ListConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigsResponse build() {
            return new ListConfigsResponse(this);
        } 

    } 

}
