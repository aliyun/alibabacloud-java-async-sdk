// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpBlocksResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpBlocksResponseBody</p>
 */
public class ListIpBlocksResponseBody extends TeaModel {
    @NameInMap("IpBlock")
    private java.util.List < IpBlock> ipBlock;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIpBlocksResponseBody(Builder builder) {
        this.ipBlock = builder.ipBlock;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpBlocksResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipBlock
     */
    public java.util.List < IpBlock> getIpBlock() {
        return this.ipBlock;
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
    public Integer getNextToken() {
        return this.nextToken;
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
        private java.util.List < IpBlock> ipBlock; 
        private Integer maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IpBlock.
         */
        public Builder ipBlock(java.util.List < IpBlock> ipBlock) {
            this.ipBlock = ipBlock;
            return this;
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
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
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

        public ListIpBlocksResponseBody build() {
            return new ListIpBlocksResponseBody(this);
        } 

    } 

    public static class IpList extends TeaModel {
        @NameInMap("DevId")
        private String devId;

        @NameInMap("DevName")
        private String devName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Origin")
        private String origin;

        @NameInMap("Ping")
        private String ping;

        private IpList(Builder builder) {
            this.devId = builder.devId;
            this.devName = builder.devName;
            this.ip = builder.ip;
            this.origin = builder.origin;
            this.ping = builder.ping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return devId
         */
        public String getDevId() {
            return this.devId;
        }

        /**
         * @return devName
         */
        public String getDevName() {
            return this.devName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return ping
         */
        public String getPing() {
            return this.ping;
        }

        public static final class Builder {
            private String devId; 
            private String devName; 
            private String ip; 
            private String origin; 
            private String ping; 

            /**
             * DevId.
             */
            public Builder devId(String devId) {
                this.devId = devId;
                return this;
            }

            /**
             * DevName.
             */
            public Builder devName(String devName) {
                this.devName = devName;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * Ping.
             */
            public Builder ping(String ping) {
                this.ping = ping;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IpList")
        private java.util.List < IpList> ipList;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TotalIpCount")
        private Long totalIpCount;

        private Tasks(Builder builder) {
            this.domain = builder.domain;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.ip = builder.ip;
            this.ipList = builder.ipList;
            this.msg = builder.msg;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.totalIpCount = builder.totalIpCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ipList
         */
        public java.util.List < IpList> getIpList() {
            return this.ipList;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalIpCount
         */
        public Long getTotalIpCount() {
            return this.totalIpCount;
        }

        public static final class Builder {
            private String domain; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String ip; 
            private java.util.List < IpList> ipList; 
            private String msg; 
            private String status; 
            private String taskId; 
            private Long totalIpCount; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(java.util.List < IpList> ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TotalIpCount.
             */
            public Builder totalIpCount(Long totalIpCount) {
                this.totalIpCount = totalIpCount;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
    public static class ZoneLayer extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private ZoneLayer(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneLayer create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * 园区层级名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 园区层级值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ZoneLayer build() {
                return new ZoneLayer(this);
            } 

        } 

    }
    public static class IpBlock extends TeaModel {
        @NameInMap("Abbr")
        private String abbr;

        @NameInMap("Application")
        private String application;

        @NameInMap("BackupDeviceName")
        private String backupDeviceName;

        @NameInMap("BusinessTypeId")
        private String businessTypeId;

        @NameInMap("BusinessTypeName")
        private String businessTypeName;

        @NameInMap("Category")
        private String category;

        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("ExtAttributes")
        private java.util.Map < String, ? > extAttributes;

        @NameInMap("IpBlockCode")
        private String ipBlockCode;

        @NameInMap("IpBlockId")
        private String ipBlockId;

        @NameInMap("IpBlocks")
        private java.util.List < String > ipBlocks;

        @NameInMap("IsLock")
        private Long isLock;

        @NameInMap("LimitZoneTypes")
        private String limitZoneTypes;

        @NameInMap("NetBusiness")
        private String netBusiness;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("Ownership")
        private String ownership;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("QueryIpList")
        private java.util.List < String > queryIpList;

        @NameInMap("SplitRate")
        private Double splitRate;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubBusinessTypeName")
        private String subBusinessTypeName;

        @NameInMap("Tasks")
        private java.util.List < Tasks> tasks;

        @NameInMap("ZoneLayer")
        private java.util.List < ZoneLayer> zoneLayer;

        @NameInMap("ZoneName")
        private String zoneName;

        private IpBlock(Builder builder) {
            this.abbr = builder.abbr;
            this.application = builder.application;
            this.backupDeviceName = builder.backupDeviceName;
            this.businessTypeId = builder.businessTypeId;
            this.businessTypeName = builder.businessTypeName;
            this.category = builder.category;
            this.description = builder.description;
            this.deviceName = builder.deviceName;
            this.extAttributes = builder.extAttributes;
            this.ipBlockCode = builder.ipBlockCode;
            this.ipBlockId = builder.ipBlockId;
            this.ipBlocks = builder.ipBlocks;
            this.isLock = builder.isLock;
            this.limitZoneTypes = builder.limitZoneTypes;
            this.netBusiness = builder.netBusiness;
            this.netType = builder.netType;
            this.ownership = builder.ownership;
            this.parentId = builder.parentId;
            this.queryIpList = builder.queryIpList;
            this.splitRate = builder.splitRate;
            this.status = builder.status;
            this.subBusinessTypeName = builder.subBusinessTypeName;
            this.tasks = builder.tasks;
            this.zoneLayer = builder.zoneLayer;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpBlock create() {
            return builder().build();
        }

        /**
         * @return abbr
         */
        public String getAbbr() {
            return this.abbr;
        }

        /**
         * @return application
         */
        public String getApplication() {
            return this.application;
        }

        /**
         * @return backupDeviceName
         */
        public String getBackupDeviceName() {
            return this.backupDeviceName;
        }

        /**
         * @return businessTypeId
         */
        public String getBusinessTypeId() {
            return this.businessTypeId;
        }

        /**
         * @return businessTypeName
         */
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return extAttributes
         */
        public java.util.Map < String, ? > getExtAttributes() {
            return this.extAttributes;
        }

        /**
         * @return ipBlockCode
         */
        public String getIpBlockCode() {
            return this.ipBlockCode;
        }

        /**
         * @return ipBlockId
         */
        public String getIpBlockId() {
            return this.ipBlockId;
        }

        /**
         * @return ipBlocks
         */
        public java.util.List < String > getIpBlocks() {
            return this.ipBlocks;
        }

        /**
         * @return isLock
         */
        public Long getIsLock() {
            return this.isLock;
        }

        /**
         * @return limitZoneTypes
         */
        public String getLimitZoneTypes() {
            return this.limitZoneTypes;
        }

        /**
         * @return netBusiness
         */
        public String getNetBusiness() {
            return this.netBusiness;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return ownership
         */
        public String getOwnership() {
            return this.ownership;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return queryIpList
         */
        public java.util.List < String > getQueryIpList() {
            return this.queryIpList;
        }

        /**
         * @return splitRate
         */
        public Double getSplitRate() {
            return this.splitRate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subBusinessTypeName
         */
        public String getSubBusinessTypeName() {
            return this.subBusinessTypeName;
        }

        /**
         * @return tasks
         */
        public java.util.List < Tasks> getTasks() {
            return this.tasks;
        }

        /**
         * @return zoneLayer
         */
        public java.util.List < ZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private String abbr; 
            private String application; 
            private String backupDeviceName; 
            private String businessTypeId; 
            private String businessTypeName; 
            private String category; 
            private String description; 
            private String deviceName; 
            private java.util.Map < String, ? > extAttributes; 
            private String ipBlockCode; 
            private String ipBlockId; 
            private java.util.List < String > ipBlocks; 
            private Long isLock; 
            private String limitZoneTypes; 
            private String netBusiness; 
            private String netType; 
            private String ownership; 
            private String parentId; 
            private java.util.List < String > queryIpList; 
            private Double splitRate; 
            private String status; 
            private String subBusinessTypeName; 
            private java.util.List < Tasks> tasks; 
            private java.util.List < ZoneLayer> zoneLayer; 
            private String zoneName; 

            /**
             * Abbr.
             */
            public Builder abbr(String abbr) {
                this.abbr = abbr;
                return this;
            }

            /**
             * IP用途
             */
            public Builder application(String application) {
                this.application = application;
                return this;
            }

            /**
             * 备份设备名称
             */
            public Builder backupDeviceName(String backupDeviceName) {
                this.backupDeviceName = backupDeviceName;
                return this;
            }

            /**
             * 业务类型UID
             */
            public Builder businessTypeId(String businessTypeId) {
                this.businessTypeId = businessTypeId;
                return this;
            }

            /**
             * BusinessTypeName.
             */
            public Builder businessTypeName(String businessTypeName) {
                this.businessTypeName = businessTypeName;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 备注
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 设备名称
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ExtAttributes.
             */
            public Builder extAttributes(java.util.Map < String, ? > extAttributes) {
                this.extAttributes = extAttributes;
                return this;
            }

            /**
             * IpBlockCode.
             */
            public Builder ipBlockCode(String ipBlockCode) {
                this.ipBlockCode = ipBlockCode;
                return this;
            }

            /**
             * IpBlockId.
             */
            public Builder ipBlockId(String ipBlockId) {
                this.ipBlockId = ipBlockId;
                return this;
            }

            /**
             * IpBlocks.
             */
            public Builder ipBlocks(java.util.List < String > ipBlocks) {
                this.ipBlocks = ipBlocks;
                return this;
            }

            /**
             * IsLock.
             */
            public Builder isLock(Long isLock) {
                this.isLock = isLock;
                return this;
            }

            /**
             * LimitZoneTypes.
             */
            public Builder limitZoneTypes(String limitZoneTypes) {
                this.limitZoneTypes = limitZoneTypes;
                return this;
            }

            /**
             * 公网地址类型 INC GUEST VIP
             */
            public Builder netBusiness(String netBusiness) {
                this.netBusiness = netBusiness;
                return this;
            }

            /**
             * 公网私网标志 PUBLIC PRIVATE
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * IP归属
             */
            public Builder ownership(String ownership) {
                this.ownership = ownership;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * QueryIpList.
             */
            public Builder queryIpList(java.util.List < String > queryIpList) {
                this.queryIpList = queryIpList;
                return this;
            }

            /**
             * SplitRate.
             */
            public Builder splitRate(Double splitRate) {
                this.splitRate = splitRate;
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
             * SubBusinessTypeName.
             */
            public Builder subBusinessTypeName(String subBusinessTypeName) {
                this.subBusinessTypeName = subBusinessTypeName;
                return this;
            }

            /**
             * Tasks.
             */
            public Builder tasks(java.util.List < Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            /**
             * 园区层级
             */
            public Builder zoneLayer(java.util.List < ZoneLayer> zoneLayer) {
                this.zoneLayer = zoneLayer;
                return this;
            }

            /**
             * ZoneName.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public IpBlock build() {
                return new IpBlock(this);
            } 

        } 

    }
}
