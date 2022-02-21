// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WithdrawPublishedRouteEntriesResponse} extends {@link TeaModel}
 *
 * <p>WithdrawPublishedRouteEntriesResponse</p>
 */
public class WithdrawPublishedRouteEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private WithdrawPublishedRouteEntriesResponseBody body;

    private WithdrawPublishedRouteEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static WithdrawPublishedRouteEntriesResponse create() {
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
    public WithdrawPublishedRouteEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<WithdrawPublishedRouteEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(WithdrawPublishedRouteEntriesResponseBody body);

        @Override
        WithdrawPublishedRouteEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WithdrawPublishedRouteEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private WithdrawPublishedRouteEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WithdrawPublishedRouteEntriesResponse response) {
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
        public Builder body(WithdrawPublishedRouteEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public WithdrawPublishedRouteEntriesResponse build() {
            return new WithdrawPublishedRouteEntriesResponse(this);
        } 

    } 

}
