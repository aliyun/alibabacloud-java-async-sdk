// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeUpgradeReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeReportResponseBody</p>
 */
public class DescribeUpgradeReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Details")
    private String details;

    @com.aliyun.core.annotation.NameInMap("DstDBType")
    private String dstDBType;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("ItemsSize")
    private Long itemsSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceDBClusterId")
    private String sourceDBClusterId;

    @com.aliyun.core.annotation.NameInMap("SrcDBType")
    private String srcDBType;

    @com.aliyun.core.annotation.NameInMap("SrcDeleted")
    private String srcDeleted;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Long totalSize;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpgradeReportList")
    private java.util.List<UpgradeReportList> upgradeReportList;

    private DescribeUpgradeReportResponseBody(Builder builder) {
        this.details = builder.details;
        this.dstDBType = builder.dstDBType;
        this.items = builder.items;
        this.itemsSize = builder.itemsSize;
        this.requestId = builder.requestId;
        this.sourceDBClusterId = builder.sourceDBClusterId;
        this.srcDBType = builder.srcDBType;
        this.srcDeleted = builder.srcDeleted;
        this.totalSize = builder.totalSize;
        this.type = builder.type;
        this.upgradeReportList = builder.upgradeReportList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpgradeReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return details
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * @return dstDBType
     */
    public String getDstDBType() {
        return this.dstDBType;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return itemsSize
     */
    public Long getItemsSize() {
        return this.itemsSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceDBClusterId
     */
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    /**
     * @return srcDBType
     */
    public String getSrcDBType() {
        return this.srcDBType;
    }

    /**
     * @return srcDeleted
     */
    public String getSrcDeleted() {
        return this.srcDeleted;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return upgradeReportList
     */
    public java.util.List<UpgradeReportList> getUpgradeReportList() {
        return this.upgradeReportList;
    }

    public static final class Builder {
        private String details; 
        private String dstDBType; 
        private java.util.List<Items> items; 
        private Long itemsSize; 
        private String requestId; 
        private String sourceDBClusterId; 
        private String srcDBType; 
        private String srcDeleted; 
        private Long totalSize; 
        private String type; 
        private java.util.List<UpgradeReportList> upgradeReportList; 

        private Builder() {
        } 

        private Builder(DescribeUpgradeReportResponseBody model) {
            this.details = model.details;
            this.dstDBType = model.dstDBType;
            this.items = model.items;
            this.itemsSize = model.itemsSize;
            this.requestId = model.requestId;
            this.sourceDBClusterId = model.sourceDBClusterId;
            this.srcDBType = model.srcDBType;
            this.srcDeleted = model.srcDeleted;
            this.totalSize = model.totalSize;
            this.type = model.type;
            this.upgradeReportList = model.upgradeReportList;
        } 

        /**
         * <p>The details.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder details(String details) {
            this.details = details;
            return this;
        }

        /**
         * <p>The database type of the destination instance. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder dstDBType(String dstDBType) {
            this.dstDBType = dstDBType;
            return this;
        }

        /**
         * <p>The list of Oracle compatibility evaluation details.</p>
         * <blockquote>
         * <p>This parameter is supported only for <strong>Oracle</strong> instances.</p>
         * </blockquote>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries in the list of Oracle compatibility evaluation details.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder itemsSize(Long itemsSize) {
            this.itemsSize = itemsSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zen5pe5vi56447d0</p>
         */
        public Builder sourceDBClusterId(String sourceDBClusterId) {
            this.sourceDBClusterId = sourceDBClusterId;
            return this;
        }

        /**
         * <p>The database type of the source instance. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder srcDBType(String srcDBType) {
            this.srcDBType = srcDBType;
            return this;
        }

        /**
         * <p>The deletion status of the source instance. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Not deleted.</p>
         * </li>
         * <li><p><strong>1</strong>: Deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder srcDeleted(String srcDeleted) {
            this.srcDeleted = srcDeleted;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>137</p>
         */
        public Builder totalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        /**
         * <p>A special metric. This parameter is supported only for instances that use the Tair architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>tair</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The list of evaluation reports.</p>
         */
        public Builder upgradeReportList(java.util.List<UpgradeReportList> upgradeReportList) {
            this.upgradeReportList = upgradeReportList;
            return this;
        }

        public DescribeUpgradeReportResponseBody build() {
            return new DescribeUpgradeReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpgradeReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpgradeReportResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DDL")
        private String DDL;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Items(Builder builder) {
            this.DDL = builder.DDL;
            this.name = builder.name;
            this.schema = builder.schema;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DDL
         */
        public String getDDL() {
            return this.DDL;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String DDL; 
            private String name; 
            private String schema; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DDL = model.DDL;
                this.name = model.name;
                this.schema = model.schema;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The Data Definition Language (DDL) statements for object synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE XXXX</p>
             */
            public Builder DDL(String DDL) {
                this.DDL = DDL;
                return this;
            }

            /**
             * <p>The name of the evaluation object.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The schema of the evaluation object.</p>
             * 
             * <strong>example:</strong>
             * <p>ny_openapi</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The result of the compatibility evaluation. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Failed.</p>
             * </li>
             * <li><p><strong>1</strong>: Succeeded.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the evaluation object.</p>
             * 
             * <strong>example:</strong>
             * <p>orca</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUpgradeReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpgradeReportResponseBody</p>
     */
    public static class UpgradeReportList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private String checkTime;

        @com.aliyun.core.annotation.NameInMap("DstVersion")
        private String dstVersion;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("SrcInsName")
        private String srcInsName;

        @com.aliyun.core.annotation.NameInMap("SrcVersion")
        private String srcVersion;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UpgradeMode")
        private String upgradeMode;

        private UpgradeReportList(Builder builder) {
            this.checkTime = builder.checkTime;
            this.dstVersion = builder.dstVersion;
            this.effectiveTime = builder.effectiveTime;
            this.endTime = builder.endTime;
            this.result = builder.result;
            this.srcInsName = builder.srcInsName;
            this.srcVersion = builder.srcVersion;
            this.startTime = builder.startTime;
            this.taskId = builder.taskId;
            this.upgradeMode = builder.upgradeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeReportList create() {
            return builder().build();
        }

        /**
         * @return checkTime
         */
        public String getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return dstVersion
         */
        public String getDstVersion() {
            return this.dstVersion;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return srcInsName
         */
        public String getSrcInsName() {
            return this.srcInsName;
        }

        /**
         * @return srcVersion
         */
        public String getSrcVersion() {
            return this.srcVersion;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return upgradeMode
         */
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

        public static final class Builder {
            private String checkTime; 
            private String dstVersion; 
            private String effectiveTime; 
            private String endTime; 
            private String result; 
            private String srcInsName; 
            private String srcVersion; 
            private String startTime; 
            private String taskId; 
            private String upgradeMode; 

            private Builder() {
            } 

            private Builder(UpgradeReportList model) {
                this.checkTime = model.checkTime;
                this.dstVersion = model.dstVersion;
                this.effectiveTime = model.effectiveTime;
                this.endTime = model.endTime;
                this.result = model.result;
                this.srcInsName = model.srcInsName;
                this.srcVersion = model.srcVersion;
                this.startTime = model.startTime;
                this.taskId = model.taskId;
                this.upgradeMode = model.upgradeMode;
            } 

            /**
             * <p>The check time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T06:48:44Z</p>
             */
            public Builder checkTime(String checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * <p>The version of the destination instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder dstVersion(String dstVersion) {
                this.dstVersion = dstVersion;
                return this;
            }

            /**
             * <p>The effective time of the evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-08T06:48:44Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The end time of the evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-08T06:48:44Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The status of the evaluation task.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The name of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-2ze54671qoz830za9</p>
             */
            public Builder srcInsName(String srcInsName) {
                this.srcInsName = srcInsName;
                return this;
            }

            /**
             * <p>The version of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder srcVersion(String srcVersion) {
                this.srcVersion = srcVersion;
                return this;
            }

            /**
             * <p>The start time of the evaluation.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-05T01:56:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>275948</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The upgrade mode.</p>
             * 
             * <strong>example:</strong>
             * <p>rds2polar_pengine_with_dts</p>
             */
            public Builder upgradeMode(String upgradeMode) {
                this.upgradeMode = upgradeMode;
                return this;
            }

            public UpgradeReportList build() {
                return new UpgradeReportList(this);
            } 

        } 

    }
}
