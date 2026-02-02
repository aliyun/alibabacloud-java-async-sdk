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
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PlanWindowId.
         */
        public Builder planWindowId(String planWindowId) {
            this.putQueryParameter("PlanWindowId", planWindowId);
            this.planWindowId = planWindowId;
            return this;
        }

        /**
         * PlanWindowName.
         */
        public Builder planWindowName(String planWindowName) {
            this.putQueryParameter("PlanWindowName", planWindowName);
            this.planWindowName = planWindowName;
            return this;
        }

        /**
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
         * TargetResourceGroupId.
         */
        public Builder targetResourceGroupId(String targetResourceGroupId) {
            this.putQueryParameter("TargetResourceGroupId", targetResourceGroupId);
            this.targetResourceGroupId = targetResourceGroupId;
            return this;
        }

        /**
         * TargetResourceTags.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
