// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListDashboardResponse} extends {@link TeaModel}
 *
 * <p>ListDashboardResponse</p>
 */
public class ListDashboardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDashboardResponseBody body;

    private ListDashboardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDashboardResponse create() {
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
    public ListDashboardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDashboardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDashboardResponseBody body);

        @Override
        ListDashboardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDashboardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDashboardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDashboardResponse response) {
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
        public Builder body(ListDashboardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDashboardResponse build() {
            return new ListDashboardResponse(this);
        } 

    } 

}
