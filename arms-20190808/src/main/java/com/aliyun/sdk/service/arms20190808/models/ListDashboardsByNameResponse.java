// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardsByNameResponse} extends {@link TeaModel}
 *
 * <p>ListDashboardsByNameResponse</p>
 */
public class ListDashboardsByNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDashboardsByNameResponseBody body;

    private ListDashboardsByNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDashboardsByNameResponse create() {
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
    public ListDashboardsByNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDashboardsByNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDashboardsByNameResponseBody body);

        @Override
        ListDashboardsByNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDashboardsByNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDashboardsByNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDashboardsByNameResponse response) {
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
        public Builder body(ListDashboardsByNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDashboardsByNameResponse build() {
            return new ListDashboardsByNameResponse(this);
        } 

    } 

}
