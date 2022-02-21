// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListDashboardDetailsResponse</p>
 */
public class ListDashboardDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDashboardDetailsResponseBody body;

    private ListDashboardDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDashboardDetailsResponse create() {
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
    public ListDashboardDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDashboardDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDashboardDetailsResponseBody body);

        @Override
        ListDashboardDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDashboardDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDashboardDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDashboardDetailsResponse response) {
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
        public Builder body(ListDashboardDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDashboardDetailsResponse build() {
            return new ListDashboardDetailsResponse(this);
        } 

    } 

}
