// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticMetricsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosticMetricsRequest</p>
 */
public class DescribeDiagnosticMetricsRequest extends Request {
    @Host
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("MetricIds")
    private java.util.List < String > metricIds;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceType")
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MetricIds.
         */
        public Builder metricIds(java.util.List < String > metricIds) {
            this.putQueryParameter("MetricIds", metricIds);
            this.metricIds = metricIds;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
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
