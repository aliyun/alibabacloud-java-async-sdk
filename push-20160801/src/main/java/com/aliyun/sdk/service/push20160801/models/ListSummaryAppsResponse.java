// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSummaryAppsResponse} extends {@link TeaModel}
 *
 * <p>ListSummaryAppsResponse</p>
 */
public class ListSummaryAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSummaryAppsResponseBody body;

    private ListSummaryAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSummaryAppsResponse create() {
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
    public ListSummaryAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSummaryAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSummaryAppsResponseBody body);

        @Override
        ListSummaryAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSummaryAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSummaryAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSummaryAppsResponse response) {
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
        public Builder body(ListSummaryAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSummaryAppsResponse build() {
            return new ListSummaryAppsResponse(this);
        } 

    } 

}
