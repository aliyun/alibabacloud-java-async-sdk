// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorStatisticsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorStatisticsResponse</p>
 */
public class DescribeSiteMonitorStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSiteMonitorStatisticsResponseBody body;

    private DescribeSiteMonitorStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSiteMonitorStatisticsResponse create() {
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
    public DescribeSiteMonitorStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSiteMonitorStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSiteMonitorStatisticsResponseBody body);

        @Override
        DescribeSiteMonitorStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSiteMonitorStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSiteMonitorStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSiteMonitorStatisticsResponse response) {
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
        public Builder body(DescribeSiteMonitorStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSiteMonitorStatisticsResponse build() {
            return new DescribeSiteMonitorStatisticsResponse(this);
        } 

    } 

}
