// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCrawlerWorkflowInstanceResponse} extends {@link TeaModel}
 *
 * <p>ListCrawlerWorkflowInstanceResponse</p>
 */
public class ListCrawlerWorkflowInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCrawlerWorkflowInstanceResponseBody body;

    private ListCrawlerWorkflowInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCrawlerWorkflowInstanceResponse create() {
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
    public ListCrawlerWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCrawlerWorkflowInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCrawlerWorkflowInstanceResponseBody body);

        @Override
        ListCrawlerWorkflowInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCrawlerWorkflowInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCrawlerWorkflowInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCrawlerWorkflowInstanceResponse response) {
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
        public Builder body(ListCrawlerWorkflowInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCrawlerWorkflowInstanceResponse build() {
            return new ListCrawlerWorkflowInstanceResponse(this);
        } 

    } 

}
