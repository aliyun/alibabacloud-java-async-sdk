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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
            this.dnNodeClassCode = builder.dnNodeClassCode;
            this.dnNodeCount = builder.dnNodeCount;
            this.expireTime = builder.expireTime;
            this.gmtCreated = builder.gmtCreated;
            this.memberName = builder.memberName;
            this.payType = builder.payType;
            this.primaryZone = builder.primaryZone;
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
            private String dnNodeClassCode; 
            private String dnNodeCount; 
            private String expireTime; 
            private String gmtCreated; 
            private String memberName; 
            private String payType; 
            private String primaryZone; 
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
                this.dnNodeClassCode = model.dnNodeClassCode;
                this.dnNodeCount = model.dnNodeCount;
                this.expireTime = model.expireTime;
                this.gmtCreated = model.gmtCreated;
                this.memberName = model.memberName;
                this.payType = model.payType;
                this.primaryZone = model.primaryZone;
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
             * ClassCode.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * CnNodeClassCode.
             */
            public Builder cnNodeClassCode(String cnNodeClassCode) {
                this.cnNodeClassCode = cnNodeClassCode;
                return this;
            }

            /**
             * CnNodeCount.
             */
            public Builder cnNodeCount(String cnNodeCount) {
                this.cnNodeCount = cnNodeCount;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * DnNodeClassCode.
             */
            public Builder dnNodeClassCode(String dnNodeClassCode) {
                this.dnNodeClassCode = dnNodeClassCode;
                return this;
            }

            /**
             * DnNodeCount.
             */
            public Builder dnNodeCount(String dnNodeCount) {
                this.dnNodeCount = dnNodeCount;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * PrimaryZone.
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * SecondaryZone.
             */
            public Builder secondaryZone(String secondaryZone) {
                this.secondaryZone = secondaryZone;
                return this;
            }

            /**
             * SecondsBehindMaster.
             */
            public Builder secondsBehindMaster(String secondsBehindMaster) {
                this.secondsBehindMaster = secondsBehindMaster;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TertiaryZone.
             */
            public Builder tertiaryZone(String tertiaryZone) {
                this.tertiaryZone = tertiaryZone;
                return this;
            }

            /**
             * ZoneId.
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

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("MemberList")
        private java.util.List<MemberList> memberList;

        @com.aliyun.core.annotation.NameInMap("MysqlVersion")
        private String mysqlVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SwitchHistory")
        private String switchHistory;

        private GdnInstanceList(Builder builder) {
            this.description = builder.description;
            this.gdnInstanceName = builder.gdnInstanceName;
            this.gmtCreated = builder.gmtCreated;
            this.memberList = builder.memberList;
            this.mysqlVersion = builder.mysqlVersion;
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
            private String gmtCreated; 
            private java.util.List<MemberList> memberList; 
            private String mysqlVersion; 
            private String status; 
            private String switchHistory; 

            private Builder() {
            } 

            private Builder(GdnInstanceList model) {
                this.description = model.description;
                this.gdnInstanceName = model.gdnInstanceName;
                this.gmtCreated = model.gmtCreated;
                this.memberList = model.memberList;
                this.mysqlVersion = model.mysqlVersion;
                this.status = model.status;
                this.switchHistory = model.switchHistory;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GdnInstanceName.
             */
            public Builder gdnInstanceName(String gdnInstanceName) {
                this.gdnInstanceName = gdnInstanceName;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * MemberList.
             */
            public Builder memberList(java.util.List<MemberList> memberList) {
                this.memberList = memberList;
                return this;
            }

            /**
             * MysqlVersion.
             */
            public Builder mysqlVersion(String mysqlVersion) {
                this.mysqlVersion = mysqlVersion;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SwitchHistory.
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
             * GdnInstanceList.
             */
            public Builder gdnInstanceList(java.util.List<GdnInstanceList> gdnInstanceList) {
                this.gdnInstanceList = gdnInstanceList;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalNumber.
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
