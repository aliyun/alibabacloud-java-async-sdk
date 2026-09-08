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
 * {@link ModifyPlanMaintenanceWindowRequest} extends {@link RequestModel}
 *
 * <p>ModifyPlanMaintenanceWindowRequest</p>
 */
public class ModifyPlanMaintenanceWindowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinMaintenanceInterval")
    private Integer minMaintenanceInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanWindowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planWindowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanWindowName")
    private String planWindowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportMaintenanceAction")
    private String supportMaintenanceAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResource")
    private TargetResource targetResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePeriod")
    private TimePeriod timePeriod;

    private ModifyPlanMaintenanceWindowRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.enable = builder.enable;
        this.minMaintenanceInterval = builder.minMaintenanceInterval;
        this.planWindowId = builder.planWindowId;
        this.planWindowName = builder.planWindowName;
        this.regionId = builder.regionId;
        this.supportMaintenanceAction = builder.supportMaintenanceAction;
        this.targetResource = builder.targetResource;
        this.timePeriod = builder.timePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPlanMaintenanceWindowRequest create() {
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
     * @return minMaintenanceInterval
     */
    public Integer getMinMaintenanceInterval() {
        return this.minMaintenanceInterval;
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
     * @return supportMaintenanceAction
     */
    public String getSupportMaintenanceAction() {
        return this.supportMaintenanceAction;
    }

    /**
     * @return targetResource
     */
    public TargetResource getTargetResource() {
        return this.targetResource;
    }

    /**
     * @return timePeriod
     */
    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public static final class Builder extends Request.Builder<ModifyPlanMaintenanceWindowRequest, Builder> {
        private String sourceRegionId; 
        private Boolean enable; 
        private Integer minMaintenanceInterval; 
        private String planWindowId; 
        private String planWindowName; 
        private String regionId; 
        private String supportMaintenanceAction; 
        private TargetResource targetResource; 
        private TimePeriod timePeriod; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPlanMaintenanceWindowRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.enable = request.enable;
            this.minMaintenanceInterval = request.minMaintenanceInterval;
            this.planWindowId = request.planWindowId;
            this.planWindowName = request.planWindowName;
            this.regionId = request.regionId;
            this.supportMaintenanceAction = request.supportMaintenanceAction;
            this.targetResource = request.targetResource;
            this.timePeriod = request.timePeriod;
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
         * <p>Specifies whether to enable or disable the O&amp;M window. Leave this parameter empty if no modification is needed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * MinMaintenanceInterval.
         */
        public Builder minMaintenanceInterval(Integer minMaintenanceInterval) {
            this.putQueryParameter("MinMaintenanceInterval", minMaintenanceInterval);
            this.minMaintenanceInterval = minMaintenanceInterval;
            return this;
        }

        /**
         * <p>The ID of the O&amp;M window to modify. This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pw-bp1au1w8v8a1yer65g5k</p>
         */
        public Builder planWindowId(String planWindowId) {
            this.putQueryParameter("PlanWindowId", planWindowId);
            this.planWindowId = planWindowId;
            return this;
        }

        /**
         * <p>The name of the O&amp;M window. Leave this parameter empty if no modification is needed.</p>
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
         * <p>The supported O&amp;M actions. Leave this parameter empty if no modification is needed.</p>
         * 
         * <strong>example:</strong>
         * <p>Reboot</p>
         */
        public Builder supportMaintenanceAction(String supportMaintenanceAction) {
            this.putQueryParameter("SupportMaintenanceAction", supportMaintenanceAction);
            this.supportMaintenanceAction = supportMaintenanceAction;
            return this;
        }

        /**
         * <p>The resource to which the O&amp;M window applies. Leave this parameter empty if no modification is needed.</p>
         */
        public Builder targetResource(TargetResource targetResource) {
            String targetResourceShrink = shrink(targetResource, "TargetResource", "json");
            this.putQueryParameter("TargetResource", targetResourceShrink);
            this.targetResource = targetResource;
            return this;
        }

        /**
         * <p>The recurring cycle of the O&amp;M window. Leave this parameter empty if no modification is needed.</p>
         */
        public Builder timePeriod(TimePeriod timePeriod) {
            String timePeriodShrink = shrink(timePeriod, "TimePeriod", "json");
            this.putQueryParameter("TimePeriod", timePeriodShrink);
            this.timePeriod = timePeriod;
            return this;
        }

        @Override
        public ModifyPlanMaintenanceWindowRequest build() {
            return new ModifyPlanMaintenanceWindowRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>ModifyPlanMaintenanceWindowRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag to which the O&amp;M window applies.</p>
             * 
             * <strong>example:</strong>
             * <p>tagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag to which the O&amp;M window applies.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyPlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>ModifyPlanMaintenanceWindowRequest</p>
     */
    public static class TargetResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private TargetResource(Builder builder) {
            this.resourceGroupId = builder.resourceGroupId;
            this.scope = builder.scope;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetResource create() {
            return builder().build();
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String resourceGroupId; 
            private String scope; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(TargetResource model) {
                this.resourceGroupId = model.resourceGroupId;
                this.scope = model.scope;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the resource group to which the O&amp;M window applies. This parameter is required only when Scope is set to ResourceGroup.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmy4cc27vsvia</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of resource to which the O&amp;M window applies.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The tags to which the O&amp;M window applies. This parameter is required only when Scope is set to Tag.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public TargetResource build() {
                return new TargetResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyPlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>ModifyPlanMaintenanceWindowRequest</p>
     */
    public static class RangeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private RangeList(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RangeList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(RangeList model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time of the O&amp;M window.</p>
             * <ul>
             * <li>If PeriodUnit is set to Weekly, the format is Monday,22:00. Monday can be replaced with Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday.</li>
             * <li>If PeriodUnit is set to Daily, the format is 22:00.</li>
             * <li>The comma delimiter separates two parts. The first part represents the hour, with valid values from 00 to 23. The second part represents the minute, which currently supports only 00.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Tuesday,03:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the O&amp;M window.</p>
             * <ul>
             * <li>If PeriodUnit is set to Weekly, the format is Monday,22:00. Monday can be replaced with Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday.</li>
             * <li>If PeriodUnit is set to Daily, the format is 22:00.</li>
             * <li>The comma delimiter separates two parts. The first part represents the hour, with valid values from 00 to 23. The second part represents the minute, which currently supports only 00.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Monday,22:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public RangeList build() {
                return new RangeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyPlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>ModifyPlanMaintenanceWindowRequest</p>
     */
    public static class TimePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("RangeList")
        private java.util.List<RangeList> rangeList;

        private TimePeriod(Builder builder) {
            this.periodUnit = builder.periodUnit;
            this.rangeList = builder.rangeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimePeriod create() {
            return builder().build();
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return rangeList
         */
        public java.util.List<RangeList> getRangeList() {
            return this.rangeList;
        }

        public static final class Builder {
            private String periodUnit; 
            private java.util.List<RangeList> rangeList; 

            private Builder() {
            } 

            private Builder(TimePeriod model) {
                this.periodUnit = model.periodUnit;
                this.rangeList = model.rangeList;
            } 

            /**
             * <p>The type of the cycle. Valid values: Daily and Weekly.</p>
             * 
             * <strong>example:</strong>
             * <p>Year</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The time ranges of the recurring O&amp;M window cycle (UTC time zone).</p>
             */
            public Builder rangeList(java.util.List<RangeList> rangeList) {
                this.rangeList = rangeList;
                return this;
            }

            public TimePeriod build() {
                return new TimePeriod(this);
            } 

        } 

    }
}
