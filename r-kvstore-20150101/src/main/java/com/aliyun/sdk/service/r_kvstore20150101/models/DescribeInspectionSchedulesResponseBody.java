// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeInspectionSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInspectionSchedulesResponseBody</p>
 */
public class DescribeInspectionSchedulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeInspectionSchedulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionSchedulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeInspectionSchedulesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeInspectionSchedulesResponseBody build() {
            return new DescribeInspectionSchedulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInspectionSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInspectionSchedulesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Long enabled;

        @com.aliyun.core.annotation.NameInMap("InspectionItems")
        private String inspectionItems;

        @com.aliyun.core.annotation.NameInMap("InspectionWindow")
        private String inspectionWindow;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private String instanceIds;

        @com.aliyun.core.annotation.NameInMap("NextFireTime")
        private String nextFireTime;

        @com.aliyun.core.annotation.NameInMap("NotifyConfig")
        private String notifyConfig;

        @com.aliyun.core.annotation.NameInMap("ReportLanguage")
        private String reportLanguage;

        @com.aliyun.core.annotation.NameInMap("ScheduleId")
        private String scheduleId;

        @com.aliyun.core.annotation.NameInMap("ScheduleName")
        private String scheduleName;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.cronExpression = builder.cronExpression;
            this.enabled = builder.enabled;
            this.inspectionItems = builder.inspectionItems;
            this.inspectionWindow = builder.inspectionWindow;
            this.instanceIds = builder.instanceIds;
            this.nextFireTime = builder.nextFireTime;
            this.notifyConfig = builder.notifyConfig;
            this.reportLanguage = builder.reportLanguage;
            this.scheduleId = builder.scheduleId;
            this.scheduleName = builder.scheduleName;
            this.timezone = builder.timezone;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return enabled
         */
        public Long getEnabled() {
            return this.enabled;
        }

        /**
         * @return inspectionItems
         */
        public String getInspectionItems() {
            return this.inspectionItems;
        }

        /**
         * @return inspectionWindow
         */
        public String getInspectionWindow() {
            return this.inspectionWindow;
        }

        /**
         * @return instanceIds
         */
        public String getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return nextFireTime
         */
        public String getNextFireTime() {
            return this.nextFireTime;
        }

        /**
         * @return notifyConfig
         */
        public String getNotifyConfig() {
            return this.notifyConfig;
        }

        /**
         * @return reportLanguage
         */
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        /**
         * @return scheduleId
         */
        public String getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return scheduleName
         */
        public String getScheduleName() {
            return this.scheduleName;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String cronExpression; 
            private Long enabled; 
            private String inspectionItems; 
            private String inspectionWindow; 
            private String instanceIds; 
            private String nextFireTime; 
            private String notifyConfig; 
            private String reportLanguage; 
            private String scheduleId; 
            private String scheduleName; 
            private String timezone; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createTime = model.createTime;
                this.cronExpression = model.cronExpression;
                this.enabled = model.enabled;
                this.inspectionItems = model.inspectionItems;
                this.inspectionWindow = model.inspectionWindow;
                this.instanceIds = model.instanceIds;
                this.nextFireTime = model.nextFireTime;
                this.notifyConfig = model.notifyConfig;
                this.reportLanguage = model.reportLanguage;
                this.scheduleId = model.scheduleId;
                this.scheduleName = model.scheduleName;
                this.timezone = model.timezone;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Long enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * InspectionItems.
             */
            public Builder inspectionItems(String inspectionItems) {
                this.inspectionItems = inspectionItems;
                return this;
            }

            /**
             * InspectionWindow.
             */
            public Builder inspectionWindow(String inspectionWindow) {
                this.inspectionWindow = inspectionWindow;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(String instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * NextFireTime.
             */
            public Builder nextFireTime(String nextFireTime) {
                this.nextFireTime = nextFireTime;
                return this;
            }

            /**
             * NotifyConfig.
             */
            public Builder notifyConfig(String notifyConfig) {
                this.notifyConfig = notifyConfig;
                return this;
            }

            /**
             * ReportLanguage.
             */
            public Builder reportLanguage(String reportLanguage) {
                this.reportLanguage = reportLanguage;
                return this;
            }

            /**
             * ScheduleId.
             */
            public Builder scheduleId(String scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * ScheduleName.
             */
            public Builder scheduleName(String scheduleName) {
                this.scheduleName = scheduleName;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInspectionSchedulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInspectionSchedulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Long pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Long pageNum; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
