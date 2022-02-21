// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardParametersResponse} extends {@link TeaModel}
 *
 * <p>ListDashboardParametersResponse</p>
 */
public class ListDashboardParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDashboardParametersResponseBody body;

    private ListDashboardParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDashboardParametersResponse create() {
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
    public ListDashboardParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDashboardParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDashboardParametersResponseBody body);

        @Override
        ListDashboardParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDashboardParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDashboardParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDashboardParametersResponse response) {
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
        public Builder body(ListDashboardParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDashboardParametersResponse build() {
            return new ListDashboardParametersResponse(this);
        } 

    } 

}
