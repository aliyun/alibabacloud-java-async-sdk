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
 * {@link DescribePlanMaintenanceWindowsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlanMaintenanceWindowsResponseBody</p>
 */
public class DescribePlanMaintenanceWindowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PlanMaintenanceWindowList")
    private java.util.List<PlanMaintenanceWindowList> planMaintenanceWindowList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePlanMaintenanceWindowsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.planMaintenanceWindowList = builder.planMaintenanceWindowList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlanMaintenanceWindowsResponseBody create() {
        return builder().build();
    }

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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return planMaintenanceWindowList
     */
    public java.util.List<PlanMaintenanceWindowList> getPlanMaintenanceWindowList() {
        return this.planMaintenanceWindowList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<PlanMaintenanceWindowList> planMaintenanceWindowList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribePlanMaintenanceWindowsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.planMaintenanceWindowList = model.planMaintenanceWindowList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PlanMaintenanceWindowList.
         */
        public Builder planMaintenanceWindowList(java.util.List<PlanMaintenanceWindowList> planMaintenanceWindowList) {
            this.planMaintenanceWindowList = planMaintenanceWindowList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePlanMaintenanceWindowsResponseBody build() {
            return new DescribePlanMaintenanceWindowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePlanMaintenanceWindowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlanMaintenanceWindowsResponseBody</p>
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
     * {@link DescribePlanMaintenanceWindowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlanMaintenanceWindowsResponseBody</p>
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Scope.
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
     * {@link DescribePlanMaintenanceWindowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlanMaintenanceWindowsResponseBody</p>
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
     * {@link DescribePlanMaintenanceWindowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlanMaintenanceWindowsResponseBody</p>
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
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * RangeList.
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
    /**
     * 
     * {@link DescribePlanMaintenanceWindowsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePlanMaintenanceWindowsResponseBody</p>
     */
    public static class PlanMaintenanceWindowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("PlanWindowId")
        private String planWindowId;

        @com.aliyun.core.annotation.NameInMap("PlanWindowName")
        private String planWindowName;

        @com.aliyun.core.annotation.NameInMap("SupportMaintenanceAction")
        private String supportMaintenanceAction;

        @com.aliyun.core.annotation.NameInMap("TargetResource")
        private TargetResource targetResource;

        @com.aliyun.core.annotation.NameInMap("TimePeriod")
        private TimePeriod timePeriod;

        private PlanMaintenanceWindowList(Builder builder) {
            this.createTime = builder.createTime;
            this.enable = builder.enable;
            this.modifiedTime = builder.modifiedTime;
            this.planWindowId = builder.planWindowId;
            this.planWindowName = builder.planWindowName;
            this.supportMaintenanceAction = builder.supportMaintenanceAction;
            this.targetResource = builder.targetResource;
            this.timePeriod = builder.timePeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanMaintenanceWindowList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
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

        public static final class Builder {
            private String createTime; 
            private Boolean enable; 
            private String modifiedTime; 
            private String planWindowId; 
            private String planWindowName; 
            private String supportMaintenanceAction; 
            private TargetResource targetResource; 
            private TimePeriod timePeriod; 

            private Builder() {
            } 

            private Builder(PlanMaintenanceWindowList model) {
                this.createTime = model.createTime;
                this.enable = model.enable;
                this.modifiedTime = model.modifiedTime;
                this.planWindowId = model.planWindowId;
                this.planWindowName = model.planWindowName;
                this.supportMaintenanceAction = model.supportMaintenanceAction;
                this.targetResource = model.targetResource;
                this.timePeriod = model.timePeriod;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PlanWindowId.
             */
            public Builder planWindowId(String planWindowId) {
                this.planWindowId = planWindowId;
                return this;
            }

            /**
             * PlanWindowName.
             */
            public Builder planWindowName(String planWindowName) {
                this.planWindowName = planWindowName;
                return this;
            }

            /**
             * SupportMaintenanceAction.
             */
            public Builder supportMaintenanceAction(String supportMaintenanceAction) {
                this.supportMaintenanceAction = supportMaintenanceAction;
                return this;
            }

            /**
             * TargetResource.
             */
            public Builder targetResource(TargetResource targetResource) {
                this.targetResource = targetResource;
                return this;
            }

            /**
             * TimePeriod.
             */
            public Builder timePeriod(TimePeriod timePeriod) {
                this.timePeriod = timePeriod;
                return this;
            }

            public PlanMaintenanceWindowList build() {
                return new PlanMaintenanceWindowList(this);
            } 

        } 

    }
}
