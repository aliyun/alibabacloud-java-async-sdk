// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchOmsOpenAPIMonitorMetricResponse} extends {@link TeaModel}
 *
 * <p>SearchOmsOpenAPIMonitorMetricResponse</p>
 */
public class SearchOmsOpenAPIMonitorMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private SearchOmsOpenAPIMonitorMetricResponseBody body;

    private SearchOmsOpenAPIMonitorMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SearchOmsOpenAPIMonitorMetricResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public SearchOmsOpenAPIMonitorMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SearchOmsOpenAPIMonitorMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SearchOmsOpenAPIMonitorMetricResponseBody body);

        @Override
        SearchOmsOpenAPIMonitorMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SearchOmsOpenAPIMonitorMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SearchOmsOpenAPIMonitorMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SearchOmsOpenAPIMonitorMetricResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(SearchOmsOpenAPIMonitorMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SearchOmsOpenAPIMonitorMetricResponse build() {
            return new SearchOmsOpenAPIMonitorMetricResponse(this);
        } 

    } 

}
