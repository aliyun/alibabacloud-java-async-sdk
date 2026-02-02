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
 * {@link CreatePlanMaintenanceWindowRequest} extends {@link RequestModel}
 *
 * <p>CreatePlanMaintenanceWindowRequest</p>
 */
public class CreatePlanMaintenanceWindowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanWindowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planWindowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportMaintenanceAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String supportMaintenanceAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private TargetResource targetResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private TimePeriod timePeriod;

    private CreatePlanMaintenanceWindowRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.enable = builder.enable;
        this.planWindowName = builder.planWindowName;
        this.regionId = builder.regionId;
        this.supportMaintenanceAction = builder.supportMaintenanceAction;
        this.targetResource = builder.targetResource;
        this.timePeriod = builder.timePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePlanMaintenanceWindowRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePlanMaintenanceWindowRequest, Builder> {
        private String sourceRegionId; 
        private Boolean enable; 
        private String planWindowName; 
        private String regionId; 
        private String supportMaintenanceAction; 
        private TargetResource targetResource; 
        private TimePeriod timePeriod; 

        private Builder() {
            super();
        } 

        private Builder(CreatePlanMaintenanceWindowRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.enable = request.enable;
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder targetResource(TargetResource targetResource) {
            String targetResourceShrink = shrink(targetResource, "TargetResource", "json");
            this.putQueryParameter("TargetResource", targetResourceShrink);
            this.targetResource = targetResource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder timePeriod(TimePeriod timePeriod) {
            String timePeriodShrink = shrink(timePeriod, "TimePeriod", "json");
            this.putQueryParameter("TimePeriod", timePeriodShrink);
            this.timePeriod = timePeriod;
            return this;
        }

        @Override
        public CreatePlanMaintenanceWindowRequest build() {
            return new CreatePlanMaintenanceWindowRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>CreatePlanMaintenanceWindowRequest</p>
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>CreatePlanMaintenanceWindowRequest</p>
     */
    public static class TargetResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Scope")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Tag</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Tags.
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
     * {@link CreatePlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>CreatePlanMaintenanceWindowRequest</p>
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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
     * {@link CreatePlanMaintenanceWindowRequest} extends {@link TeaModel}
     *
     * <p>CreatePlanMaintenanceWindowRequest</p>
     */
    public static class TimePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        @com.aliyun.core.annotation.Validation(required = true)
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("RangeList")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Weekly</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
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
