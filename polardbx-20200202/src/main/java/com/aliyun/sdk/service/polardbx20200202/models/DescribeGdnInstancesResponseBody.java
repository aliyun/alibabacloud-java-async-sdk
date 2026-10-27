// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeGdnInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGdnInstancesResponseBody</p>
 */
public class DescribeGdnInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeGdnInstancesResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGdnInstancesResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeGdnInstancesResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of instance details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * <blockquote>
         * <p>This parameter is empty if the request is successful. If the request fails, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B044BD1-6402-5DE9-9AED-63D15A994E37</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGdnInstancesResponseBody build() {
            return new DescribeGdnInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGdnInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGdnInstancesResponseBody</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("CnNodeClassCode")
        private String cnNodeClassCode;

        @com.aliyun.core.annotation.NameInMap("CnNodeCount")
        private String cnNodeCount;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("DataSyncStatus")
        private String dataSyncStatus;

        @com.aliyun.core.annotation.NameInMap("DnNodeClassCode")
        private String dnNodeClassCode;

        @com.aliyun.core.annotation.NameInMap("DnNodeCount")
        private String dnNodeCount;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("PrimaryZone")
        private String primaryZone;

        @com.aliyun.core.annotation.NameInMap("ReadWriteStatus")
        private String readWriteStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SecondaryZone")
        private String secondaryZone;

        @com.aliyun.core.annotation.NameInMap("SecondsBehindMaster")
        private String secondsBehindMaster;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TertiaryZone")
        private String tertiaryZone;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private MemberList(Builder builder) {
            this.classCode = builder.classCode;
            this.cnNodeClassCode = builder.cnNodeClassCode;
            this.cnNodeCount = builder.cnNodeCount;
            this.commodityCode = builder.commodityCode;
            this.dataSyncStatus = builder.dataSyncStatus;
            this.dnNodeClassCode = builder.dnNodeClassCode;
            this.dnNodeCount = builder.dnNodeCount;
            this.expireTime = builder.expireTime;
            this.gmtCreated = builder.gmtCreated;
            this.memberName = builder.memberName;
            this.payType = builder.payType;
            this.primaryZone = builder.primaryZone;
            this.readWriteStatus = builder.readWriteStatus;
            this.regionId = builder.regionId;
            this.role = builder.role;
            this.secondaryZone = builder.secondaryZone;
            this.secondsBehindMaster = builder.secondsBehindMaster;
            this.status = builder.status;
            this.taskStatus = builder.taskStatus;
            this.tertiaryZone = builder.tertiaryZone;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return cnNodeClassCode
         */
        public String getCnNodeClassCode() {
            return this.cnNodeClassCode;
        }

        /**
         * @return cnNodeCount
         */
        public String getCnNodeCount() {
            return this.cnNodeCount;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return dataSyncStatus
         */
        public String getDataSyncStatus() {
            return this.dataSyncStatus;
        }

        /**
         * @return dnNodeClassCode
         */
        public String getDnNodeClassCode() {
            return this.dnNodeClassCode;
        }

        /**
         * @return dnNodeCount
         */
        public String getDnNodeCount() {
            return this.dnNodeCount;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return primaryZone
         */
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        /**
         * @return readWriteStatus
         */
        public String getReadWriteStatus() {
            return this.readWriteStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return secondaryZone
         */
        public String getSecondaryZone() {
            return this.secondaryZone;
        }

        /**
         * @return secondsBehindMaster
         */
        public String getSecondsBehindMaster() {
            return this.secondsBehindMaster;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return tertiaryZone
         */
        public String getTertiaryZone() {
            return this.tertiaryZone;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String classCode; 
            private String cnNodeClassCode; 
            private String cnNodeCount; 
            private String commodityCode; 
            private String dataSyncStatus; 
            private String dnNodeClassCode; 
            private String dnNodeCount; 
            private String expireTime; 
            private String gmtCreated; 
            private String memberName; 
            private String payType; 
            private String primaryZone; 
            private String readWriteStatus; 
            private String regionId; 
            private String role; 
            private String secondaryZone; 
            private String secondsBehindMaster; 
            private String status; 
            private String taskStatus; 
            private String tertiaryZone; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.classCode = model.classCode;
                this.cnNodeClassCode = model.cnNodeClassCode;
                this.cnNodeCount = model.cnNodeCount;
                this.commodityCode = model.commodityCode;
                this.dataSyncStatus = model.dataSyncStatus;
                this.dnNodeClassCode = model.dnNodeClassCode;
                this.dnNodeCount = model.dnNodeCount;
                this.expireTime = model.expireTime;
                this.gmtCreated = model.gmtCreated;
                this.memberName = model.memberName;
                this.payType = model.payType;
                this.primaryZone = model.primaryZone;
                this.readWriteStatus = model.readWriteStatus;
                this.regionId = model.regionId;
                this.role = model.role;
                this.secondaryZone = model.secondaryZone;
                this.secondsBehindMaster = model.secondsBehindMaster;
                this.status = model.status;
                this.taskStatus = model.taskStatus;
                this.tertiaryZone = model.tertiaryZone;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>polarx.x4.medium.2e</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The CN node specifications. Valid values:</p>
             * <ul>
             * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB</li>
             * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB</li>
             * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB</li>
             * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB</li>
             * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB</li>
             * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB</li>
             * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB</li>
             * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB</li>
             * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB</li>
             * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB</li>
             * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polarx.x4.medium.2e</p>
             */
            public Builder cnNodeClassCode(String cnNodeClassCode) {
                this.cnNodeClassCode = cnNodeClassCode;
                return this;
            }

            /**
             * <p>The number of compute nodes (CNs).</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cnNodeCount(String cnNodeCount) {
                this.cnNodeCount = cnNodeCount;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_polarxpre_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The data synchronization status of the member.</p>
             */
            public Builder dataSyncStatus(String dataSyncStatus) {
                this.dataSyncStatus = dataSyncStatus;
                return this;
            }

            /**
             * <p>The DN node specifications. Valid values:</p>
             * <ul>
             * <li><strong>mysql.n2.medium.25</strong>: 2 cores, 4 GB</li>
             * <li><strong>mysql.n4.medium.25</strong>: 2 cores, 8 GB</li>
             * <li><strong>mysql.x8.medium.25</strong>: 2 cores, 16 GB</li>
             * <li><strong>mysql.n2.large.25</strong>: 4 cores, 8 GB</li>
             * <li><strong>mysql.n4.large.25</strong>: 4 cores, 16 GB</li>
             * <li><strong>mysql.x8.large.25</strong>: 4 cores, 32 GB</li>
             * <li><strong>mysql.n2.xlarge.25</strong>: 8 cores, 16 GB</li>
             * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores, 32 GB</li>
             * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores, 64 GB</li>
             * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores, 64 GB</li>
             * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores, 128 GB</li>
             * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores, 128 GB</li>
             * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores, 256 GB</li>
             * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores, 470 GB</li>
             * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores, 720 GB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mysql.n4.medium.25</p>
             */
            public Builder dnNodeClassCode(String dnNodeClassCode) {
                this.dnNodeClassCode = dnNodeClassCode;
                return this;
            }

            /**
             * <p>The number of data nodes (DNs).</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dnNodeCount(String dnNodeCount) {
                this.dnNodeCount = dnNodeCount;
                return this;
            }

            /**
             * <p>The expiration time. The format is YYYY-MM-DDTHH:mm:ss.SSS±HHmm, which includes the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-02T13:11:10.000+0000</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-02T13:11:10.000+0000</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The name of the member, which is the name of the PolarDB-X instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-***</p>
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go</li>
             * <li><strong>Prepaid</strong>: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The primary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-a</p>
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * <p>The read/write status of the member.</p>
             */
            public Builder readWriteStatus(String readWriteStatus) {
                this.readWriteStatus = readWriteStatus;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The role of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>primary、
             * standby</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The secondary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-a</p>
             */
            public Builder secondaryZone(String secondaryZone) {
                this.secondaryZone = secondaryZone;
                return this;
            }

            /**
             * <p>The data synchronization latency.</p>
             * 
             * <strong>example:</strong>
             * <p>1s</p>
             */
            public Builder secondsBehindMaster(String secondsBehindMaster) {
                this.secondsBehindMaster = secondsBehindMaster;
                return this;
            }

            /**
             * <p>The status of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status of the switchover task.</p>
             * 
             * <strong>example:</strong>
             * <p>prepared: Parameter initialization completed
             * set_old_primary_readonly: Write operations disabled on the original primary instance
             * set_new_primary_read_write: Switchover completed
             * timeout: Task timed out
             * rollback: Rolled back</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The third active zone in a three-zone deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-a</p>
             */
            public Builder tertiaryZone(String tertiaryZone) {
                this.tertiaryZone = tertiaryZone;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGdnInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGdnInstancesResponseBody</p>
     */
    public static class GdnInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GdnInstanceName")
        private String gdnInstanceName;

        @com.aliyun.core.annotation.NameInMap("GdnMode")
        private String gdnMode;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("MemberList")
        private java.util.List<MemberList> memberList;

        @com.aliyun.core.annotation.NameInMap("MysqlVersion")
        private String mysqlVersion;

        @com.aliyun.core.annotation.NameInMap("RplConflictStrategy")
        private String rplConflictStrategy;

        @com.aliyun.core.annotation.NameInMap("RplDmlStrategy")
        private String rplDmlStrategy;

        @com.aliyun.core.annotation.NameInMap("RplSyncDdl")
        private Boolean rplSyncDdl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SwitchHistory")
        private String switchHistory;

        private GdnInstanceList(Builder builder) {
            this.description = builder.description;
            this.gdnInstanceName = builder.gdnInstanceName;
            this.gdnMode = builder.gdnMode;
            this.gmtCreated = builder.gmtCreated;
            this.memberList = builder.memberList;
            this.mysqlVersion = builder.mysqlVersion;
            this.rplConflictStrategy = builder.rplConflictStrategy;
            this.rplDmlStrategy = builder.rplDmlStrategy;
            this.rplSyncDdl = builder.rplSyncDdl;
            this.status = builder.status;
            this.switchHistory = builder.switchHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GdnInstanceList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gdnInstanceName
         */
        public String getGdnInstanceName() {
            return this.gdnInstanceName;
        }

        /**
         * @return gdnMode
         */
        public String getGdnMode() {
            return this.gdnMode;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return memberList
         */
        public java.util.List<MemberList> getMemberList() {
            return this.memberList;
        }

        /**
         * @return mysqlVersion
         */
        public String getMysqlVersion() {
            return this.mysqlVersion;
        }

        /**
         * @return rplConflictStrategy
         */
        public String getRplConflictStrategy() {
            return this.rplConflictStrategy;
        }

        /**
         * @return rplDmlStrategy
         */
        public String getRplDmlStrategy() {
            return this.rplDmlStrategy;
        }

        /**
         * @return rplSyncDdl
         */
        public Boolean getRplSyncDdl() {
            return this.rplSyncDdl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return switchHistory
         */
        public String getSwitchHistory() {
            return this.switchHistory;
        }

        public static final class Builder {
            private String description; 
            private String gdnInstanceName; 
            private String gdnMode; 
            private String gmtCreated; 
            private java.util.List<MemberList> memberList; 
            private String mysqlVersion; 
            private String rplConflictStrategy; 
            private String rplDmlStrategy; 
            private Boolean rplSyncDdl; 
            private String status; 
            private String switchHistory; 

            private Builder() {
            } 

            private Builder(GdnInstanceList model) {
                this.description = model.description;
                this.gdnInstanceName = model.gdnInstanceName;
                this.gdnMode = model.gdnMode;
                this.gmtCreated = model.gmtCreated;
                this.memberList = model.memberList;
                this.mysqlVersion = model.mysqlVersion;
                this.rplConflictStrategy = model.rplConflictStrategy;
                this.rplDmlStrategy = model.rplDmlStrategy;
                this.rplSyncDdl = model.rplSyncDdl;
                this.status = model.status;
                this.switchHistory = model.switchHistory;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the GDN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gdn-***</p>
             */
            public Builder gdnInstanceName(String gdnInstanceName) {
                this.gdnInstanceName = gdnInstanceName;
                return this;
            }

            /**
             * <p>The replication mode of the GDN. Valid values: gdn_mode_master_slave and gdn_mode_bidirectional.</p>
             * 
             * <strong>example:</strong>
             * <p>gdn_mode_master_slave</p>
             */
            public Builder gdnMode(String gdnMode) {
                this.gdnMode = gdnMode;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-02T13:11:10.000+0000</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The list of members.</p>
             */
            public Builder memberList(java.util.List<MemberList> memberList) {
                this.memberList = memberList;
                return this;
            }

            /**
             * <p>The MySQL version supported by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder mysqlVersion(String mysqlVersion) {
                this.mysqlVersion = mysqlVersion;
                return this;
            }

            /**
             * <p>The replication conflict handling strategy. Valid values: DIRECT_OVERWRITE, OVERWRITE, IGNORE, and INTERRUPT.</p>
             * 
             * <strong>example:</strong>
             * <p>OVERWRITE</p>
             */
            public Builder rplConflictStrategy(String rplConflictStrategy) {
                this.rplConflictStrategy = rplConflictStrategy;
                return this;
            }

            /**
             * <p>The DML replication policy. Valid values: MERGE, SERIAL, TRANSACTION, and SPLIT.</p>
             * 
             * <strong>example:</strong>
             * <p>SPLIT</p>
             */
            public Builder rplDmlStrategy(String rplDmlStrategy) {
                this.rplDmlStrategy = rplDmlStrategy;
                return this;
            }

            /**
             * <p>Specifies whether to synchronously replicate DDL operations.</p>
             */
            public Builder rplSyncDdl(Boolean rplSyncDdl) {
                this.rplSyncDdl = rplSyncDdl;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The switchover logs.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder switchHistory(String switchHistory) {
                this.switchHistory = switchHistory;
                return this;
            }

            public GdnInstanceList build() {
                return new GdnInstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGdnInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGdnInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GdnInstanceList")
        private java.util.List<GdnInstanceList> gdnInstanceList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalNumber")
        private String totalNumber;

        private Data(Builder builder) {
            this.gdnInstanceList = builder.gdnInstanceList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gdnInstanceList
         */
        public java.util.List<GdnInstanceList> getGdnInstanceList() {
            return this.gdnInstanceList;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNumber
         */
        public String getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private java.util.List<GdnInstanceList> gdnInstanceList; 
            private String pageNumber; 
            private String pageSize; 
            private String totalNumber; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gdnInstanceList = model.gdnInstanceList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalNumber = model.totalNumber;
            } 

            /**
             * <p>The list of GDN instances.</p>
             */
            public Builder gdnInstanceList(java.util.List<GdnInstanceList> gdnInstanceList) {
                this.gdnInstanceList = gdnInstanceList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>130</p>
             */
            public Builder totalNumber(String totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
