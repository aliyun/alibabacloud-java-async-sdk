// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTraceAppsResponse} extends {@link TeaModel}
 *
 * <p>ListTraceAppsResponse</p>
 */
public class ListTraceAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTraceAppsResponseBody body;

    private ListTraceAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTraceAppsResponse create() {
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
    public ListTraceAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTraceAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTraceAppsResponseBody body);

        @Override
        ListTraceAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTraceAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTraceAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTraceAppsResponse response) {
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
        public Builder body(ListTraceAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTraceAppsResponse build() {
            return new ListTraceAppsResponse(this);
        } 

    } 

}
