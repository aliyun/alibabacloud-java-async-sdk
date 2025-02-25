// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRiskPatrolStatisticalTrendsResponse} extends {@link TeaModel}
 *
 * <p>GetRiskPatrolStatisticalTrendsResponse</p>
 */
public class GetRiskPatrolStatisticalTrendsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetRiskPatrolStatisticalTrendsResponseBody body;

    private GetRiskPatrolStatisticalTrendsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetRiskPatrolStatisticalTrendsResponse create() {
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
    public GetRiskPatrolStatisticalTrendsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRiskPatrolStatisticalTrendsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetRiskPatrolStatisticalTrendsResponseBody body);

        @Override
        GetRiskPatrolStatisticalTrendsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRiskPatrolStatisticalTrendsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetRiskPatrolStatisticalTrendsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRiskPatrolStatisticalTrendsResponse response) {
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
        public Builder body(GetRiskPatrolStatisticalTrendsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRiskPatrolStatisticalTrendsResponse build() {
            return new GetRiskPatrolStatisticalTrendsResponse(this);
        } 

    } 

}
