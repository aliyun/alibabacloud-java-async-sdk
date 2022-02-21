// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlertsResponse} extends {@link TeaModel}
 *
 * <p>ListAlertsResponse</p>
 */
public class ListAlertsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlertsResponseBody body;

    private ListAlertsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlertsResponse create() {
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
    public ListAlertsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlertsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlertsResponseBody body);

        @Override
        ListAlertsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlertsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlertsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlertsResponse response) {
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
        public Builder body(ListAlertsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlertsResponse build() {
            return new ListAlertsResponse(this);
        } 

    } 

}
