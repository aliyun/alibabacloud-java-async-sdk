// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCorpGroupMetricsResponse} extends {@link TeaModel}
 *
 * <p>ListCorpGroupMetricsResponse</p>
 */
public class ListCorpGroupMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCorpGroupMetricsResponseBody body;

    private ListCorpGroupMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCorpGroupMetricsResponse create() {
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
    public ListCorpGroupMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCorpGroupMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCorpGroupMetricsResponseBody body);

        @Override
        ListCorpGroupMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCorpGroupMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCorpGroupMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCorpGroupMetricsResponse response) {
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
        public Builder body(ListCorpGroupMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCorpGroupMetricsResponse build() {
            return new ListCorpGroupMetricsResponse(this);
        } 

    } 

}
