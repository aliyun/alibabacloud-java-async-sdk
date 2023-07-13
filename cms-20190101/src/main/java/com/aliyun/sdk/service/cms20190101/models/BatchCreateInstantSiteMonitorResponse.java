// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateInstantSiteMonitorResponse} extends {@link TeaModel}
 *
 * <p>BatchCreateInstantSiteMonitorResponse</p>
 */
public class BatchCreateInstantSiteMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCreateInstantSiteMonitorResponseBody body;

    private BatchCreateInstantSiteMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCreateInstantSiteMonitorResponse create() {
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
    public BatchCreateInstantSiteMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCreateInstantSiteMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCreateInstantSiteMonitorResponseBody body);

        @Override
        BatchCreateInstantSiteMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCreateInstantSiteMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCreateInstantSiteMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCreateInstantSiteMonitorResponse response) {
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
        public Builder body(BatchCreateInstantSiteMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCreateInstantSiteMonitorResponse build() {
            return new BatchCreateInstantSiteMonitorResponse(this);
        } 

    } 

}
