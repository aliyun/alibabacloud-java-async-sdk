// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateIntantSiteMonitorResponse} extends {@link TeaModel}
 *
 * <p>BatchCreateIntantSiteMonitorResponse</p>
 */
public class BatchCreateIntantSiteMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCreateIntantSiteMonitorResponseBody body;

    private BatchCreateIntantSiteMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCreateIntantSiteMonitorResponse create() {
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
    public BatchCreateIntantSiteMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCreateIntantSiteMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCreateIntantSiteMonitorResponseBody body);

        @Override
        BatchCreateIntantSiteMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCreateIntantSiteMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCreateIntantSiteMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCreateIntantSiteMonitorResponse response) {
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
        public Builder body(BatchCreateIntantSiteMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCreateIntantSiteMonitorResponse build() {
            return new BatchCreateIntantSiteMonitorResponse(this);
        } 

    } 

}
