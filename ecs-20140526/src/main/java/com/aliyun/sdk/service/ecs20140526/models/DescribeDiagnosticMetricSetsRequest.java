// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The maximum number of entries to return on each page. Maximum value: 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li>If this parameter is left empty, the default value is 10.</li>
         * <li>If this parameter is set to a value greater than 100, the default value is 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The ID of diagnostic metric set N.</p>
         */
        public Builder metricSetIds(java.util.List < String > metricSetIds) {
            this.putQueryParameter("MetricSetIds", metricSetIds);
            this.metricSetIds = metricSetIds;
            return this;
        }

        /**
         * <p>The query token. Set the value to the <code>NextToken</code> value returned in the last call to the DescribeDiagnosticMetricSets operation. Leave this parameter empty the first time you call this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the diagnostic metric set. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource type supported by the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The type of the diagnostic metric set. Valid values:</p>
         * <ul>
         * <li>User: user-defined diagnostic metric set</li>
         * <li>Common: common diagnostic metric set</li>
         * </ul>
         * <p>Default value: user.</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
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
