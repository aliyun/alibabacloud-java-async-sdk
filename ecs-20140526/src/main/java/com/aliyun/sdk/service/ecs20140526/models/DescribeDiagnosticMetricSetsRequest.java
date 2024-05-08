// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticMetricSetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDiagnosticMetricSetsRequest</p>
 */
public class DescribeDiagnosticMetricSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricSetIds")
    private java.util.List < String > metricSetIds;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeDiagnosticMetricSetsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.metricSetIds = builder.metricSetIds;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticMetricSetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return metricSetIds
     */
    public java.util.List < String > getMetricSetIds() {
        return this.metricSetIds;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDiagnosticMetricSetsRequest, Builder> {
        private Integer maxResults; 
        private java.util.List < String > metricSetIds; 
        private String nextToken; 
        private String regionId; 
        private String resourceType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDiagnosticMetricSetsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.metricSetIds = request.metricSetIds;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.type = request.type;
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
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of diagnostic metric set N.
         */
        public Builder metricSetIds(java.util.List < String > metricSetIds) {
            this.putQueryParameter("MetricSetIds", metricSetIds);
            this.metricSetIds = metricSetIds;
            return this;
        }

        /**
         * The query token. Set the value to the `NextToken` value returned in the last call to the DescribeDiagnosticMetricSets operation. Leave this parameter empty the first time you call this operation.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the diagnostic metric set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource type supported by the diagnostic metric set.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The type of the diagnostic metric set. Valid values:
         * <p>
         * 
         * *   User: user-defined diagnostic metric set
         * *   Common: common diagnostic metric set
         * 
         * Default value: user.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDiagnosticMetricSetsRequest build() {
            return new DescribeDiagnosticMetricSetsRequest(this);
        } 

    } 

}
