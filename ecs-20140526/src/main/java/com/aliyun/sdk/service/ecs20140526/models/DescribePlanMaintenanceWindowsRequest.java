// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePlanMaintenanceWindowsRequest} extends {@link RequestModel}
 *
 * <p>DescribePlanMaintenanceWindowsRequest</p>
 */
public class DescribePlanMaintenanceWindowsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanWindowId")
    private String planWindowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanWindowName")
    private String planWindowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceGroupId")
    private String targetResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceTags")
    private TargetResourceTags targetResourceTags;

    private DescribePlanMaintenanceWindowsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.enable = builder.enable;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.planWindowId = builder.planWindowId;
        this.planWindowName = builder.planWindowName;
        this.regionId = builder.regionId;
        this.targetResourceGroupId = builder.targetResourceGroupId;
        this.targetResourceTags = builder.targetResourceTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlanMaintenanceWindowsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return planWindowId
     */
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    /**
     * @return planWindowName
     */
    public String getPlanWindowName() {
        return this.planWindowName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetResourceGroupId
     */
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * @return targetResourceTags
     */
    public TargetResourceTags getTargetResourceTags() {
        return this.targetResourceTags;
    }

    public static final class Builder extends Request.Builder<DescribePlanMaintenanceWindowsRequest, Builder> {
        private String sourceRegionId; 
        private Boolean enable; 
        private Integer maxResults; 
        private String nextToken; 
        private String planWindowId; 
        private String planWindowName; 
        private String regionId; 
        private String targetResourceGroupId; 
        private TargetResourceTags targetResourceTags; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlanMaintenanceWindowsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.enable = request.enable;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.planWindowId = request.planWindowId;
            this.planWindowName = request.planWindowName;
            this.regionId = request.regionId;
            this.targetResourceGroupId = request.targetResourceGroupId;
            this.targetResourceTags = request.targetResourceTags;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>Specifies whether the window is enabled or disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query. Maximum value: 100. Default value: If the value is not specified or is less than 10, the default value is 10. If the value is greater than 100, the default value is 100.</p>
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
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the O&amp;M window.</p>
         * 
         * <strong>example:</strong>
         * <p>pw-bp1jarob1aup7yvlrdt6</p>
         */
        public Builder planWindowId(String planWindowId) {
            this.putQueryParameter("PlanWindowId", planWindowId);
            this.planWindowId = planWindowId;
            return this;
        }

        /**
         * <p>The name of the O&amp;M window.</p>
         * 
         * <strong>example:</strong>
         * <p>WIndowName</p>
         */
        public Builder planWindowName(String planWindowName) {
            this.putQueryParameter("PlanWindowName", planWindowName);
            this.planWindowName = planWindowName;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call DescribeRegions to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the O&amp;M window applies.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-d85g5yocioezmdrll</p>
         */
        public Builder targetResourceGroupId(String targetResourceGroupId) {
            this.putQueryParameter("TargetResourceGroupId", targetResourceGroupId);
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        /**
         * <p>The tags to which the O&amp;M window applies.</p>
         */
        public Builder targetResourceTags(TargetResourceTags targetResourceTags) {
            String targetResourceTagsShrink = shrink(targetResourceTags, "TargetResourceTags", "json");
            this.putQueryParameter("TargetResourceTags", targetResourceTagsShrink);
            this.targetResourceTags = targetResourceTags;
            return this;
        }

        @Override
        public DescribePlanMaintenanceWindowsRequest build() {
            return new DescribePlanMaintenanceWindowsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlanMaintenanceWindowsRequest} extends {@link TeaModel}
     *
     * <p>DescribePlanMaintenanceWindowsRequest</p>
     */
    public static class TargetResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TargetResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetResourceTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TargetResourceTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag to which the window applies.</p>
             * 
             * <strong>example:</strong>
             * <p>tagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag to which the window applies.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TargetResourceTags build() {
                return new TargetResourceTags(this);
            } 

        } 

    }
}
