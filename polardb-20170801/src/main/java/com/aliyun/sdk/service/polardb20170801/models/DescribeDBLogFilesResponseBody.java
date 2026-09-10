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
 * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBLogFilesResponseBody</p>
 */
public class DescribeDBLogFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBInstanceType")
    private String DBInstanceType;

    @com.aliyun.core.annotation.NameInMap("HaLogItems")
    private java.util.List<HaLogItems> haLogItems;

    @com.aliyun.core.annotation.NameInMap("HaStatus")
    private Integer haStatus;

    @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
    private Integer itemsNumbers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SwitchListItems")
    private java.util.List<SwitchListItems> switchListItems;

    @com.aliyun.core.annotation.NameInMap("SwitchLogItems")
    private java.util.List<SwitchLogItems> switchLogItems;

    @com.aliyun.core.annotation.NameInMap("TotalRecords")
    private Integer totalRecords;

    private DescribeDBLogFilesResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.DBInstanceType = builder.DBInstanceType;
        this.haLogItems = builder.haLogItems;
        this.haStatus = builder.haStatus;
        this.itemsNumbers = builder.itemsNumbers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.switchListItems = builder.switchListItems;
        this.switchLogItems = builder.switchLogItems;
        this.totalRecords = builder.totalRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBLogFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBInstanceType
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * @return haLogItems
     */
    public java.util.List<HaLogItems> getHaLogItems() {
        return this.haLogItems;
    }

    /**
     * @return haStatus
     */
    public Integer getHaStatus() {
        return this.haStatus;
    }

    /**
     * @return itemsNumbers
     */
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return switchListItems
     */
    public java.util.List<SwitchListItems> getSwitchListItems() {
        return this.switchListItems;
    }

    /**
     * @return switchLogItems
     */
    public java.util.List<SwitchLogItems> getSwitchLogItems() {
        return this.switchLogItems;
    }

    /**
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private String DBInstanceType; 
        private java.util.List<HaLogItems> haLogItems; 
        private Integer haStatus; 
        private Integer itemsNumbers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SwitchListItems> switchListItems; 
        private java.util.List<SwitchLogItems> switchLogItems; 
        private Integer totalRecords; 

        private Builder() {
        } 

        private Builder(DescribeDBLogFilesResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.DBInstanceType = model.DBInstanceType;
            this.haLogItems = model.haLogItems;
            this.haStatus = model.haStatus;
            this.itemsNumbers = model.itemsNumbers;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.switchListItems = model.switchListItems;
            this.switchLogItems = model.switchLogItems;
            this.totalRecords = model.totalRecords;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><p><strong>polardb_mysql_rw</strong>: read-write instance.</p>
         * </li>
         * <li><p><strong>polardb_mysql_ro</strong>: read-only instance.</p>
         * </li>
         * <li><p><strong>polardb_mysql_standby</strong>: standby instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polardb_mysql_rw</p>
         */
        public Builder DBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }

        /**
         * <p>A list of failover logs.</p>
         */
        public Builder haLogItems(java.util.List<HaLogItems> haLogItems) {
            this.haLogItems = haLogItems;
            return this;
        }

        /**
         * <p>Indicates whether a failover record exists. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: No</p>
         * </li>
         * <li><p><strong>0</strong>: Yes</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder haStatus(Integer haStatus) {
            this.haStatus = haStatus;
            return this;
        }

        /**
         * <p>The number of log items on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder itemsNumbers(Integer itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }

        /**
         * <p>The page number. It must be a positive integer that does not exceed the maximum value of the Integer data type. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 5 to 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of fault simulation records.</p>
         */
        public Builder switchListItems(java.util.List<SwitchListItems> switchListItems) {
            this.switchListItems = switchListItems;
            return this;
        }

        /**
         * <p>A list of fault simulation logs.</p>
         */
        public Builder switchLogItems(java.util.List<SwitchLogItems> switchLogItems) {
            this.switchLogItems = switchLogItems;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        public DescribeDBLogFilesResponseBody build() {
            return new DescribeDBLogFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class HaLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedSessions")
        private Long affectedSessions;

        @com.aliyun.core.annotation.NameInMap("FromDBType")
        private String fromDBType;

        @com.aliyun.core.annotation.NameInMap("SwitchCauseCode")
        private String switchCauseCode;

        @com.aliyun.core.annotation.NameInMap("SwitchCauseDetail")
        private String switchCauseDetail;

        @com.aliyun.core.annotation.NameInMap("SwitchFinishTime")
        private String switchFinishTime;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("SwitchStartTime")
        private String switchStartTime;

        @com.aliyun.core.annotation.NameInMap("SwitchType")
        private Long switchType;

        @com.aliyun.core.annotation.NameInMap("TotalSessions")
        private Long totalSessions;

        private HaLogItems(Builder builder) {
            this.affectedSessions = builder.affectedSessions;
            this.fromDBType = builder.fromDBType;
            this.switchCauseCode = builder.switchCauseCode;
            this.switchCauseDetail = builder.switchCauseDetail;
            this.switchFinishTime = builder.switchFinishTime;
            this.switchId = builder.switchId;
            this.switchStartTime = builder.switchStartTime;
            this.switchType = builder.switchType;
            this.totalSessions = builder.totalSessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaLogItems create() {
            return builder().build();
        }

        /**
         * @return affectedSessions
         */
        public Long getAffectedSessions() {
            return this.affectedSessions;
        }

        /**
         * @return fromDBType
         */
        public String getFromDBType() {
            return this.fromDBType;
        }

        /**
         * @return switchCauseCode
         */
        public String getSwitchCauseCode() {
            return this.switchCauseCode;
        }

        /**
         * @return switchCauseDetail
         */
        public String getSwitchCauseDetail() {
            return this.switchCauseDetail;
        }

        /**
         * @return switchFinishTime
         */
        public String getSwitchFinishTime() {
            return this.switchFinishTime;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return switchStartTime
         */
        public String getSwitchStartTime() {
            return this.switchStartTime;
        }

        /**
         * @return switchType
         */
        public Long getSwitchType() {
            return this.switchType;
        }

        /**
         * @return totalSessions
         */
        public Long getTotalSessions() {
            return this.totalSessions;
        }

        public static final class Builder {
            private Long affectedSessions; 
            private String fromDBType; 
            private String switchCauseCode; 
            private String switchCauseDetail; 
            private String switchFinishTime; 
            private String switchId; 
            private String switchStartTime; 
            private Long switchType; 
            private Long totalSessions; 

            private Builder() {
            } 

            private Builder(HaLogItems model) {
                this.affectedSessions = model.affectedSessions;
                this.fromDBType = model.fromDBType;
                this.switchCauseCode = model.switchCauseCode;
                this.switchCauseDetail = model.switchCauseDetail;
                this.switchFinishTime = model.switchFinishTime;
                this.switchId = model.switchId;
                this.switchStartTime = model.switchStartTime;
                this.switchType = model.switchType;
                this.totalSessions = model.totalSessions;
            } 

            /**
             * <p>The number of affected sessions during the failover.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder affectedSessions(Long affectedSessions) {
                this.affectedSessions = affectedSessions;
                return this;
            }

            /**
             * <p>The instance type before the failover. Valid values:</p>
             * <ul>
             * <li><p><strong>polardb_mysql_rw</strong>: read-write instance.</p>
             * </li>
             * <li><p><strong>polardb_mysql_ro</strong>: read-only instance.</p>
             * </li>
             * <li><p><strong>polardb_mysql_standby</strong>: standby instance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polardb_mysql_rw</p>
             */
            public Builder fromDBType(String fromDBType) {
                this.fromDBType = fromDBType;
                return this;
            }

            /**
             * <p>The error code for the failover cause.</p>
             * 
             * <strong>example:</strong>
             * <p>Platform.Ha.AuroraService.ManualOperations</p>
             */
            public Builder switchCauseCode(String switchCauseCode) {
                this.switchCauseCode = switchCauseCode;
                return this;
            }

            /**
             * <p>Details about the failover cause.</p>
             * 
             * <strong>example:</strong>
             * <p>Platform.Ha.ManuallyTriggered</p>
             */
            public Builder switchCauseDetail(String switchCauseDetail) {
                this.switchCauseDetail = switchCauseDetail;
                return this;
            }

            /**
             * <p>The time when the failover was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-20T03:09:56Z</p>
             */
            public Builder switchFinishTime(String switchFinishTime) {
                this.switchFinishTime = switchFinishTime;
                return this;
            }

            /**
             * <p>The failover log ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e571f897-9b3c-4012-9470-88333832dec4</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * <p>The time when the failover started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-20T03:09:45Z</p>
             */
            public Builder switchStartTime(String switchStartTime) {
                this.switchStartTime = switchStartTime;
                return this;
            }

            /**
             * <p>The failover type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder switchType(Long switchType) {
                this.switchType = switchType;
                return this;
            }

            /**
             * <p>The total number of sessions during the failover.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder totalSessions(Long totalSessions) {
                this.totalSessions = totalSessions;
                return this;
            }

            public HaLogItems build() {
                return new HaLogItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchStepItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private String isSuccess;

        @com.aliyun.core.annotation.NameInMap("SimulatePhase")
        private String simulatePhase;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private String timeCost;

        private SwitchStepItems(Builder builder) {
            this.endTime = builder.endTime;
            this.isSuccess = builder.isSuccess;
            this.simulatePhase = builder.simulatePhase;
            this.startTime = builder.startTime;
            this.stepName = builder.stepName;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchStepItems create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isSuccess
         */
        public String getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return simulatePhase
         */
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return timeCost
         */
        public String getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String endTime; 
            private String isSuccess; 
            private String simulatePhase; 
            private String startTime; 
            private String stepName; 
            private String timeCost; 

            private Builder() {
            } 

            private Builder(SwitchStepItems model) {
                this.endTime = model.endTime;
                this.isSuccess = model.isSuccess;
                this.simulatePhase = model.simulatePhase;
                this.startTime = model.startTime;
                this.stepName = model.stepName;
                this.timeCost = model.timeCost;
            } 

            /**
             * <p>The time when the step was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-14T02:07:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the step was successful. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: The step was successful.</p>
             * </li>
             * <li><p><code>false</code>: The step failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSuccess(String isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * <p>The fault simulation phase. Valid values:</p>
             * <ul>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</strong>: The fault injection phase.</p>
             * </li>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.RECOVERY</strong>: The recovery phase.</p>
             * </li>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.POST_PROCESS</strong>: The post-processing phase.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</p>
             */
            public Builder simulatePhase(String simulatePhase) {
                this.simulatePhase = simulatePhase;
                return this;
            }

            /**
             * <p>The time when the step started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T02:12:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The name of the current step. You can call the <a href="https://help.aliyun.com/document_detail/2400077.html">DescribeHistoryTasks</a> operation to query the current step of a specified task. A common value is <strong>do_pause</strong>, which indicates that the system waits for a specified period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>init_task_info</p>
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * <p>The duration of the step in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public SwitchStepItems build() {
                return new SwitchStepItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchListItemsSwitchLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DstDbType")
        private String dstDbType;

        @com.aliyun.core.annotation.NameInMap("EventFinishTime")
        private String eventFinishTime;

        @com.aliyun.core.annotation.NameInMap("EventStartTime")
        private String eventStartTime;

        @com.aliyun.core.annotation.NameInMap("SimulateListId")
        private String simulateListId;

        @com.aliyun.core.annotation.NameInMap("SimulateLogId")
        private String simulateLogId;

        @com.aliyun.core.annotation.NameInMap("SimulateStatus")
        private String simulateStatus;

        @com.aliyun.core.annotation.NameInMap("SrcDbType")
        private String srcDbType;

        @com.aliyun.core.annotation.NameInMap("SwitchStepItems")
        private java.util.List<SwitchStepItems> switchStepItems;

        private SwitchListItemsSwitchLogItems(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.dstDbType = builder.dstDbType;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventStartTime = builder.eventStartTime;
            this.simulateListId = builder.simulateListId;
            this.simulateLogId = builder.simulateLogId;
            this.simulateStatus = builder.simulateStatus;
            this.srcDbType = builder.srcDbType;
            this.switchStepItems = builder.switchStepItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchListItemsSwitchLogItems create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return dstDbType
         */
        public String getDstDbType() {
            return this.dstDbType;
        }

        /**
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return eventStartTime
         */
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        /**
         * @return simulateListId
         */
        public String getSimulateListId() {
            return this.simulateListId;
        }

        /**
         * @return simulateLogId
         */
        public String getSimulateLogId() {
            return this.simulateLogId;
        }

        /**
         * @return simulateStatus
         */
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        /**
         * @return srcDbType
         */
        public String getSrcDbType() {
            return this.srcDbType;
        }

        /**
         * @return switchStepItems
         */
        public java.util.List<SwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String dstDbType; 
            private String eventFinishTime; 
            private String eventStartTime; 
            private String simulateListId; 
            private String simulateLogId; 
            private String simulateStatus; 
            private String srcDbType; 
            private java.util.List<SwitchStepItems> switchStepItems; 

            private Builder() {
            } 

            private Builder(SwitchListItemsSwitchLogItems model) {
                this.DBInstanceId = model.DBInstanceId;
                this.dstDbType = model.dstDbType;
                this.eventFinishTime = model.eventFinishTime;
                this.eventStartTime = model.eventStartTime;
                this.simulateListId = model.simulateListId;
                this.simulateLogId = model.simulateLogId;
                this.simulateStatus = model.simulateStatus;
                this.srcDbType = model.srcDbType;
                this.switchStepItems = model.switchStepItems;
            } 

            /**
             * <p>The cluster ID.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of your clusters, including the cluster IDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pc-*************</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The destination database type. Valid values:</p>
             * <ul>
             * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
             * </li>
             * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PolarDBMySQL</p>
             */
            public Builder dstDbType(String dstDbType) {
                this.dstDbType = dstDbType;
                return this;
            }

            /**
             * <p>The time when the system event was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T02:12:00Z</p>
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * <p>The time when the system event started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T01:12:00Z</p>
             */
            public Builder eventStartTime(String eventStartTime) {
                this.eventStartTime = eventStartTime;
                return this;
            }

            /**
             * <p>The simulation list ID.</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder simulateListId(String simulateListId) {
                this.simulateListId = simulateListId;
                return this;
            }

            /**
             * <p>The simulation log ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder simulateLogId(String simulateLogId) {
                this.simulateLogId = simulateLogId;
                return this;
            }

            /**
             * <p>The fault simulation status. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Pending</p>
             * </li>
             * <li><p><strong>1</strong>: Success</p>
             * </li>
             * <li><p><strong>2</strong>: Running</p>
             * </li>
             * <li><p><strong>3</strong>: Failed</p>
             * </li>
             * <li><p><strong>4</strong>: Aborted</p>
             * </li>
             * <li><p><strong>5</strong>: Awaiting rollback</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder simulateStatus(String simulateStatus) {
                this.simulateStatus = simulateStatus;
                return this;
            }

            /**
             * <p>The source database type. Valid values:</p>
             * <ul>
             * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
             * </li>
             * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PolarDBMySQL</p>
             */
            public Builder srcDbType(String srcDbType) {
                this.srcDbType = srcDbType;
                return this;
            }

            /**
             * <p>A list of fault simulation steps.</p>
             */
            public Builder switchStepItems(java.util.List<SwitchStepItems> switchStepItems) {
                this.switchStepItems = switchStepItems;
                return this;
            }

            public SwitchListItemsSwitchLogItems build() {
                return new SwitchListItemsSwitchLogItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchListItemsSwitchStepItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private String isSuccess;

        @com.aliyun.core.annotation.NameInMap("SimulatePhase")
        private String simulatePhase;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private String timeCost;

        private SwitchListItemsSwitchStepItems(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.endTime = builder.endTime;
            this.isSuccess = builder.isSuccess;
            this.simulatePhase = builder.simulatePhase;
            this.startTime = builder.startTime;
            this.stepName = builder.stepName;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchListItemsSwitchStepItems create() {
            return builder().build();
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isSuccess
         */
        public String getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return simulatePhase
         */
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return timeCost
         */
        public String getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String DBNodeId; 
            private String endTime; 
            private String isSuccess; 
            private String simulatePhase; 
            private String startTime; 
            private String stepName; 
            private String timeCost; 

            private Builder() {
            } 

            private Builder(SwitchListItemsSwitchStepItems model) {
                this.DBNodeId = model.DBNodeId;
                this.endTime = model.endTime;
                this.isSuccess = model.isSuccess;
                this.simulatePhase = model.simulatePhase;
                this.startTime = model.startTime;
                this.stepName = model.stepName;
                this.timeCost = model.timeCost;
            } 

            /**
             * <p>The cluster node ID.</p>
             * <blockquote>
             * <p>This parameter is returned only when the <code>Key</code> parameter in the request is not set to <code>PolarDBDiskUsage</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pi-*************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The time when the step was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-23T02:30:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the step was successful. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: The step was successful.</p>
             * </li>
             * <li><p><code>false</code>: The step failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSuccess(String isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * <p>The fault simulation phase. Valid values:</p>
             * <ul>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</strong>: The fault injection phase.</p>
             * </li>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.RECOVERY</strong>: The recovery phase.</p>
             * </li>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.POST_PROCESS</strong>: The post-processing phase.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</p>
             */
            public Builder simulatePhase(String simulatePhase) {
                this.simulatePhase = simulatePhase;
                return this;
            }

            /**
             * <p>The time when the step started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-16T02:12:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The name of the current step. You can call the <a href="https://help.aliyun.com/document_detail/2400077.html">DescribeHistoryTasks</a> operation to query the current step of a specified task. A common value is <strong>do_pause</strong>, which indicates that the system waits for a specified period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>init_task_info</p>
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * <p>The duration of the step in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public SwitchListItemsSwitchStepItems build() {
                return new SwitchListItemsSwitchStepItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchListItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeCrashList")
        private java.util.List<String> DBNodeCrashList;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EventFinishTime")
        private String eventFinishTime;

        @com.aliyun.core.annotation.NameInMap("EventStartTime")
        private String eventStartTime;

        @com.aliyun.core.annotation.NameInMap("FaultInjectionType")
        private String faultInjectionType;

        @com.aliyun.core.annotation.NameInMap("SimulateListId")
        private String simulateListId;

        @com.aliyun.core.annotation.NameInMap("SimulateMode")
        private String simulateMode;

        @com.aliyun.core.annotation.NameInMap("SimulateStatus")
        private String simulateStatus;

        @com.aliyun.core.annotation.NameInMap("SimulateTaskId")
        private String simulateTaskId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SwitchLogItems")
        private java.util.List<SwitchListItemsSwitchLogItems> switchLogItems;

        @com.aliyun.core.annotation.NameInMap("SwitchStepItems")
        private java.util.List<SwitchListItemsSwitchStepItems> switchStepItems;

        private SwitchListItems(Builder builder) {
            this.DBNodeCrashList = builder.DBNodeCrashList;
            this.endTime = builder.endTime;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventStartTime = builder.eventStartTime;
            this.faultInjectionType = builder.faultInjectionType;
            this.simulateListId = builder.simulateListId;
            this.simulateMode = builder.simulateMode;
            this.simulateStatus = builder.simulateStatus;
            this.simulateTaskId = builder.simulateTaskId;
            this.startTime = builder.startTime;
            this.switchLogItems = builder.switchLogItems;
            this.switchStepItems = builder.switchStepItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchListItems create() {
            return builder().build();
        }

        /**
         * @return DBNodeCrashList
         */
        public java.util.List<String> getDBNodeCrashList() {
            return this.DBNodeCrashList;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return eventStartTime
         */
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        /**
         * @return faultInjectionType
         */
        public String getFaultInjectionType() {
            return this.faultInjectionType;
        }

        /**
         * @return simulateListId
         */
        public String getSimulateListId() {
            return this.simulateListId;
        }

        /**
         * @return simulateMode
         */
        public String getSimulateMode() {
            return this.simulateMode;
        }

        /**
         * @return simulateStatus
         */
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        /**
         * @return simulateTaskId
         */
        public String getSimulateTaskId() {
            return this.simulateTaskId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return switchLogItems
         */
        public java.util.List<SwitchListItemsSwitchLogItems> getSwitchLogItems() {
            return this.switchLogItems;
        }

        /**
         * @return switchStepItems
         */
        public java.util.List<SwitchListItemsSwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

        public static final class Builder {
            private java.util.List<String> DBNodeCrashList; 
            private String endTime; 
            private String eventFinishTime; 
            private String eventStartTime; 
            private String faultInjectionType; 
            private String simulateListId; 
            private String simulateMode; 
            private String simulateStatus; 
            private String simulateTaskId; 
            private String startTime; 
            private java.util.List<SwitchListItemsSwitchLogItems> switchLogItems; 
            private java.util.List<SwitchListItemsSwitchStepItems> switchStepItems; 

            private Builder() {
            } 

            private Builder(SwitchListItems model) {
                this.DBNodeCrashList = model.DBNodeCrashList;
                this.endTime = model.endTime;
                this.eventFinishTime = model.eventFinishTime;
                this.eventStartTime = model.eventStartTime;
                this.faultInjectionType = model.faultInjectionType;
                this.simulateListId = model.simulateListId;
                this.simulateMode = model.simulateMode;
                this.simulateStatus = model.simulateStatus;
                this.simulateTaskId = model.simulateTaskId;
                this.startTime = model.startTime;
                this.switchLogItems = model.switchLogItems;
                this.switchStepItems = model.switchStepItems;
            } 

            /**
             * <p>The IDs of nodes on which to simulate a fault.</p>
             * <blockquote>
             * <p>For a node-level fault simulation, specify the ID of a single node. For an availability zone-level fault simulation, you can either omit this parameter or specify the IDs of all nodes in the zone.</p>
             * </blockquote>
             */
            public Builder DBNodeCrashList(java.util.List<String> DBNodeCrashList) {
                this.DBNodeCrashList = DBNodeCrashList;
                return this;
            }

            /**
             * <p>The time when the fault simulation was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-10T02:25:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the system event was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T02:12:00Z</p>
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * <p>The time when the system event started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T01:12:00Z</p>
             */
            public Builder eventStartTime(String eventStartTime) {
                this.eventStartTime = eventStartTime;
                return this;
            }

            /**
             * <p>The fault injection method. Valid values:</p>
             * <ul>
             * <li>CrashSQLInjection: Injects a fault into the instance by using <code>Crash SQL</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CrashSQLInjection</p>
             */
            public Builder faultInjectionType(String faultInjectionType) {
                this.faultInjectionType = faultInjectionType;
                return this;
            }

            /**
             * <p>The fault simulation record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder simulateListId(String simulateListId) {
                this.simulateListId = simulateListId;
                return this;
            }

            /**
             * <p>The fault simulation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder simulateMode(String simulateMode) {
                this.simulateMode = simulateMode;
                return this;
            }

            /**
             * <p>The fault simulation status. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Pending</p>
             * </li>
             * <li><p><strong>1</strong>: Success</p>
             * </li>
             * <li><p><strong>2</strong>: Running</p>
             * </li>
             * <li><p><strong>3</strong>: Failed</p>
             * </li>
             * <li><p><strong>4</strong>: Aborted</p>
             * </li>
             * <li><p><strong>5</strong>: Awaiting rollback</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder simulateStatus(String simulateStatus) {
                this.simulateStatus = simulateStatus;
                return this;
            }

            /**
             * <p>The fault simulation task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder simulateTaskId(String simulateTaskId) {
                this.simulateTaskId = simulateTaskId;
                return this;
            }

            /**
             * <p>The time when the fault simulation started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-25T01:05:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>A list of fault simulation logs.</p>
             */
            public Builder switchLogItems(java.util.List<SwitchListItemsSwitchLogItems> switchLogItems) {
                this.switchLogItems = switchLogItems;
                return this;
            }

            /**
             * <p>A list of failover steps.</p>
             */
            public Builder switchStepItems(java.util.List<SwitchListItemsSwitchStepItems> switchStepItems) {
                this.switchStepItems = switchStepItems;
                return this;
            }

            public SwitchListItems build() {
                return new SwitchListItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchLogItemsSwitchStepItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private String isSuccess;

        @com.aliyun.core.annotation.NameInMap("SimulatePhase")
        private String simulatePhase;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepMsg")
        private String stepMsg;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private String timeCost;

        private SwitchLogItemsSwitchStepItems(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.endTime = builder.endTime;
            this.isSuccess = builder.isSuccess;
            this.simulatePhase = builder.simulatePhase;
            this.startTime = builder.startTime;
            this.stepMsg = builder.stepMsg;
            this.stepName = builder.stepName;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchLogItemsSwitchStepItems create() {
            return builder().build();
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isSuccess
         */
        public String getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return simulatePhase
         */
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepMsg
         */
        public String getStepMsg() {
            return this.stepMsg;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return timeCost
         */
        public String getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String DBNodeId; 
            private String endTime; 
            private String isSuccess; 
            private String simulatePhase; 
            private String startTime; 
            private String stepMsg; 
            private String stepName; 
            private String timeCost; 

            private Builder() {
            } 

            private Builder(SwitchLogItemsSwitchStepItems model) {
                this.DBNodeId = model.DBNodeId;
                this.endTime = model.endTime;
                this.isSuccess = model.isSuccess;
                this.simulatePhase = model.simulatePhase;
                this.startTime = model.startTime;
                this.stepMsg = model.stepMsg;
                this.stepName = model.stepName;
                this.timeCost = model.timeCost;
            } 

            /**
             * <p>The node ID.</p>
             * <blockquote>
             * <p>You must specify either the <code>DBNodeId</code> or <code>DBClusterId</code> parameter. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of your clusters, including the node IDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pi-*************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The time when the step was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-27T02:27:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the step was successful. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: The step was successful.</p>
             * </li>
             * <li><p><code>false</code>: The step failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isSuccess(String isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * <p>The fault simulation phase. Valid values:</p>
             * <ul>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</strong>: The fault injection phase.</p>
             * </li>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.RECOVERY</strong>: The recovery phase.</p>
             * </li>
             * <li><p><strong>PolarDB.MySQL.FaultSimulate.Phase.POST_PROCESS</strong>: The post-processing phase.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PolarDB.MySQL.FaultSimulate.Phase.FAULT_INJECTION</p>
             */
            public Builder simulatePhase(String simulatePhase) {
                this.simulatePhase = simulatePhase;
                return this;
            }

            /**
             * <p>The time when the step started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-21T02:12:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>A message about the execution status of the step.</p>
             * 
             * <strong>example:</strong>
             * <p>This step exec success</p>
             */
            public Builder stepMsg(String stepMsg) {
                this.stepMsg = stepMsg;
                return this;
            }

            /**
             * <p>The name of the step.</p>
             * 
             * <strong>example:</strong>
             * <p>init_task_info</p>
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * <p>The duration of the step in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public SwitchLogItemsSwitchStepItems build() {
                return new SwitchLogItemsSwitchStepItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DstDbType")
        private String dstDbType;

        @com.aliyun.core.annotation.NameInMap("EventFinishTime")
        private String eventFinishTime;

        @com.aliyun.core.annotation.NameInMap("EventStartTime")
        private String eventStartTime;

        @com.aliyun.core.annotation.NameInMap("SimulateListId")
        private String simulateListId;

        @com.aliyun.core.annotation.NameInMap("SimulateStatus")
        private String simulateStatus;

        @com.aliyun.core.annotation.NameInMap("Simulatecode")
        private String simulatecode;

        @com.aliyun.core.annotation.NameInMap("SrcDbType")
        private String srcDbType;

        @com.aliyun.core.annotation.NameInMap("SwitchStepItems")
        private java.util.List<SwitchLogItemsSwitchStepItems> switchStepItems;

        private SwitchLogItems(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.dstDbType = builder.dstDbType;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventStartTime = builder.eventStartTime;
            this.simulateListId = builder.simulateListId;
            this.simulateStatus = builder.simulateStatus;
            this.simulatecode = builder.simulatecode;
            this.srcDbType = builder.srcDbType;
            this.switchStepItems = builder.switchStepItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchLogItems create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return dstDbType
         */
        public String getDstDbType() {
            return this.dstDbType;
        }

        /**
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return eventStartTime
         */
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        /**
         * @return simulateListId
         */
        public String getSimulateListId() {
            return this.simulateListId;
        }

        /**
         * @return simulateStatus
         */
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        /**
         * @return simulatecode
         */
        public String getSimulatecode() {
            return this.simulatecode;
        }

        /**
         * @return srcDbType
         */
        public String getSrcDbType() {
            return this.srcDbType;
        }

        /**
         * @return switchStepItems
         */
        public java.util.List<SwitchLogItemsSwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String dstDbType; 
            private String eventFinishTime; 
            private String eventStartTime; 
            private String simulateListId; 
            private String simulateStatus; 
            private String simulatecode; 
            private String srcDbType; 
            private java.util.List<SwitchLogItemsSwitchStepItems> switchStepItems; 

            private Builder() {
            } 

            private Builder(SwitchLogItems model) {
                this.DBInstanceId = model.DBInstanceId;
                this.dstDbType = model.dstDbType;
                this.eventFinishTime = model.eventFinishTime;
                this.eventStartTime = model.eventStartTime;
                this.simulateListId = model.simulateListId;
                this.simulateStatus = model.simulateStatus;
                this.simulatecode = model.simulatecode;
                this.srcDbType = model.srcDbType;
                this.switchStepItems = model.switchStepItems;
            } 

            /**
             * <p>The cluster ID.</p>
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of your clusters, including the cluster IDs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pc-*************</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The destination database type. Valid values:</p>
             * <ul>
             * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
             * </li>
             * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PolarDBMySQL</p>
             */
            public Builder dstDbType(String dstDbType) {
                this.dstDbType = dstDbType;
                return this;
            }

            /**
             * <p>The time when the system event was complete. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T02:12:00Z</p>
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * <p>The time when the system event started. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-19T01:12:00Z</p>
             */
            public Builder eventStartTime(String eventStartTime) {
                this.eventStartTime = eventStartTime;
                return this;
            }

            /**
             * <p>The simulation list ID.</p>
             * 
             * <strong>example:</strong>
             * <p>231</p>
             */
            public Builder simulateListId(String simulateListId) {
                this.simulateListId = simulateListId;
                return this;
            }

            /**
             * <p>The fault simulation status. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Pending</p>
             * </li>
             * <li><p><strong>1</strong>: Success</p>
             * </li>
             * <li><p><strong>2</strong>: Running</p>
             * </li>
             * <li><p><strong>3</strong>: Failed</p>
             * </li>
             * <li><p><strong>4</strong>: Aborted</p>
             * </li>
             * <li><p><strong>5</strong>: Awaiting rollback</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder simulateStatus(String simulateStatus) {
                this.simulateStatus = simulateStatus;
                return this;
            }

            /**
             * <p>The status code of the fault simulation.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder simulatecode(String simulatecode) {
                this.simulatecode = simulatecode;
                return this;
            }

            /**
             * <p>The source database type. Valid values:</p>
             * <ul>
             * <li><p><strong>PolarDBMySQL</strong>: A major version upgrade of PolarDB for MySQL.</p>
             * </li>
             * <li><p><strong>RDS</strong>: A migration from RDS to PolarDB for MySQL.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PolarDBMySQL</p>
             */
            public Builder srcDbType(String srcDbType) {
                this.srcDbType = srcDbType;
                return this;
            }

            /**
             * <p>A list of failover steps.</p>
             */
            public Builder switchStepItems(java.util.List<SwitchLogItemsSwitchStepItems> switchStepItems) {
                this.switchStepItems = switchStepItems;
                return this;
            }

            public SwitchLogItems build() {
                return new SwitchLogItems(this);
            } 

        } 

    }
}
