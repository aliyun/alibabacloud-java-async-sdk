// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosticMetricsRequest</p>
 */
public class DescribeDiagnosticMetricsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricIds")
    private java.util.List < String > metricIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private DescribeDiagnosticMetricsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.maxResults = builder.maxResults;
        this.metricIds = builder.metricIds;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return metricIds
     */
    public java.util.List < String > getMetricIds() {
        return this.metricIds;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosticMetricsRequest, Builder> {
        private String body; 
        private Integer maxResults; 
        private java.util.List < String > metricIds; 
        private String nextToken; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosticMetricsRequest request) {
            super(request);
            this.body = request.body;
            this.maxResults = request.maxResults;
            this.metricIds = request.metricIds;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putHostParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of diagnostic metric.
         */
        public Builder metricIds(java.util.List < String > metricIds) {
            this.putQueryParameter("MetricIds", metricIds);
            this.metricIds = metricIds;
            return this;
        }

        /**
         * The maximum number of entries to return on each page. Maximum value: 100.
         * <p>
         * 
         * Default value:
         * 
         * *   If this parameter is left empty, the default value is 10.
         * *   If this parameter is set to a value greater than 100, the default value is 100.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The IDs of diagnostic metrics.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The query token. Set the value to the `NextToken` value returned in the last call to the DescribeDiagnosticMetrics operation. Leave this parameter empty the first time you call this operation.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeDiagnosticMetricsRequest build() {
            return new DescribeDiagnosticMetricsRequest(this);
        } 

    } 

}
