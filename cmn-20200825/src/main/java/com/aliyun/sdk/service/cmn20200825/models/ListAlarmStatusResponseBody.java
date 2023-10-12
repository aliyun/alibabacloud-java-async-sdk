// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlarmStatusResponseBody</p>
 */
public class ListAlarmStatusResponseBody extends TeaModel {
    @NameInMap("AlarmStatus")
    private java.util.List < AlarmStatus> alarmStatus;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Statistics")
    private java.util.List < Statistics> statistics;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAlarmStatusResponseBody(Builder builder) {
        this.alarmStatus = builder.alarmStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmStatus
     */
    public java.util.List < AlarmStatus> getAlarmStatus() {
        return this.alarmStatus;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public java.util.List < Statistics> getStatistics() {
        return this.statistics;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AlarmStatus> alarmStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Statistics> statistics; 
        private Integer totalCount; 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(java.util.List < AlarmStatus> alarmStatus) {
            this.alarmStatus = alarmStatus;
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
        public Builder nextToken(String nextToken) {
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
         * Statistics.
         */
        public Builder statistics(java.util.List < Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAlarmStatusResponseBody build() {
            return new ListAlarmStatusResponseBody(this);
        } 

    } 

    public static class AggregateData extends TeaModel {
        @NameInMap("AggregateDataName")
        private String aggregateDataName;

        @NameInMap("DataItem")
        private String dataItem;

        private AggregateData(Builder builder) {
            this.aggregateDataName = builder.aggregateDataName;
            this.dataItem = builder.dataItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregateData create() {
            return builder().build();
        }

        /**
         * @return aggregateDataName
         */
        public String getAggregateDataName() {
            return this.aggregateDataName;
        }

        /**
         * @return dataItem
         */
        public String getDataItem() {
            return this.dataItem;
        }

        public static final class Builder {
            private String aggregateDataName; 
            private String dataItem; 

            /**
             * AggregateDataName.
             */
            public Builder aggregateDataName(String aggregateDataName) {
                this.aggregateDataName = aggregateDataName;
                return this;
            }

            /**
             * DataItem.
             */
            public Builder dataItem(String dataItem) {
                this.dataItem = dataItem;
                return this;
            }

            public AggregateData build() {
                return new AggregateData(this);
            } 

        } 

    }
    public static class DedicatedLine extends TeaModel {
        @NameInMap("DedicatedLineName")
        private String dedicatedLineName;

        @NameInMap("PhysicalSpace")
        private String physicalSpace;

        private DedicatedLine(Builder builder) {
            this.dedicatedLineName = builder.dedicatedLineName;
            this.physicalSpace = builder.physicalSpace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedLine create() {
            return builder().build();
        }

        /**
         * @return dedicatedLineName
         */
        public String getDedicatedLineName() {
            return this.dedicatedLineName;
        }

        /**
         * @return physicalSpace
         */
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

        public static final class Builder {
            private String dedicatedLineName; 
            private String physicalSpace; 

            /**
             * DedicatedLineName.
             */
            public Builder dedicatedLineName(String dedicatedLineName) {
                this.dedicatedLineName = dedicatedLineName;
                return this;
            }

            /**
             * PhysicalSpace.
             */
            public Builder physicalSpace(String physicalSpace) {
                this.physicalSpace = physicalSpace;
                return this;
            }

            public DedicatedLine build() {
                return new DedicatedLine(this);
            } 

        } 

    }
    public static class MonitorItem extends TeaModel {
        @NameInMap("CollectionType")
        private String collectionType;

        @NameInMap("MonitorItemDescription")
        private String monitorItemDescription;

        @NameInMap("MonitorItemName")
        private String monitorItemName;

        private MonitorItem(Builder builder) {
            this.collectionType = builder.collectionType;
            this.monitorItemDescription = builder.monitorItemDescription;
            this.monitorItemName = builder.monitorItemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorItem create() {
            return builder().build();
        }

        /**
         * @return collectionType
         */
        public String getCollectionType() {
            return this.collectionType;
        }

        /**
         * @return monitorItemDescription
         */
        public String getMonitorItemDescription() {
            return this.monitorItemDescription;
        }

        /**
         * @return monitorItemName
         */
        public String getMonitorItemName() {
            return this.monitorItemName;
        }

        public static final class Builder {
            private String collectionType; 
            private String monitorItemDescription; 
            private String monitorItemName; 

            /**
             * CollectionType.
             */
            public Builder collectionType(String collectionType) {
                this.collectionType = collectionType;
                return this;
            }

            /**
             * MonitorItemDescription.
             */
            public Builder monitorItemDescription(String monitorItemDescription) {
                this.monitorItemDescription = monitorItemDescription;
                return this;
            }

            /**
             * MonitorItemName.
             */
            public Builder monitorItemName(String monitorItemName) {
                this.monitorItemName = monitorItemName;
                return this;
            }

            public MonitorItem build() {
                return new MonitorItem(this);
            } 

        } 

    }
    public static class NotificationSwitch extends TeaModel {
        @NameInMap("ExpiryTime")
        private String expiryTime;

        @NameInMap("Reason")
        private String reason;

        private NotificationSwitch(Builder builder) {
            this.expiryTime = builder.expiryTime;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotificationSwitch create() {
            return builder().build();
        }

        /**
         * @return expiryTime
         */
        public String getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String expiryTime; 
            private String reason; 

            /**
             * ExpiryTime.
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public NotificationSwitch build() {
                return new NotificationSwitch(this);
            } 

        } 

    }
    public static class PortCollection extends TeaModel {
        @NameInMap("PortCollectionName")
        private String portCollectionName;

        private PortCollection(Builder builder) {
            this.portCollectionName = builder.portCollectionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortCollection create() {
            return builder().build();
        }

        /**
         * @return portCollectionName
         */
        public String getPortCollectionName() {
            return this.portCollectionName;
        }

        public static final class Builder {
            private String portCollectionName; 

            /**
             * PortCollectionName.
             */
            public Builder portCollectionName(String portCollectionName) {
                this.portCollectionName = portCollectionName;
                return this;
            }

            public PortCollection build() {
                return new PortCollection(this);
            } 

        } 

    }
    public static class ResourceApp extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Port")
        private String port;

        @NameInMap("SecurityDomain")
        private String securityDomain;

        @NameInMap("Type")
        private String type;

        private ResourceApp(Builder builder) {
            this.appId = builder.appId;
            this.domain = builder.domain;
            this.port = builder.port;
            this.securityDomain = builder.securityDomain;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceApp create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return securityDomain
         */
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String appId; 
            private String domain; 
            private String port; 
            private String securityDomain; 
            private String type; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * SecurityDomain.
             */
            public Builder securityDomain(String securityDomain) {
                this.securityDomain = securityDomain;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResourceApp build() {
                return new ResourceApp(this);
            } 

        } 

    }
    public static class ResourceDevice extends TeaModel {
        @NameInMap("City")
        private String city;

        @NameInMap("DeviceForm")
        private String deviceForm;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("PhysicalSpace")
        private String physicalSpace;

        private ResourceDevice(Builder builder) {
            this.city = builder.city;
            this.deviceForm = builder.deviceForm;
            this.hostName = builder.hostName;
            this.physicalSpace = builder.physicalSpace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDevice create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return deviceForm
         */
        public String getDeviceForm() {
            return this.deviceForm;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return physicalSpace
         */
        public String getPhysicalSpace() {
            return this.physicalSpace;
        }

        public static final class Builder {
            private String city; 
            private String deviceForm; 
            private String hostName; 
            private String physicalSpace; 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * DeviceForm.
             */
            public Builder deviceForm(String deviceForm) {
                this.deviceForm = deviceForm;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * PhysicalSpace.
             */
            public Builder physicalSpace(String physicalSpace) {
                this.physicalSpace = physicalSpace;
                return this;
            }

            public ResourceDevice build() {
                return new ResourceDevice(this);
            } 

        } 

    }
    public static class AlarmStatus extends TeaModel {
        @NameInMap("AbnormalDataItem")
        private String abnormalDataItem;

        @NameInMap("AgentIp")
        private String agentIp;

        @NameInMap("AggregateData")
        private AggregateData aggregateData;

        @NameInMap("AggregateDataId")
        private String aggregateDataId;

        @NameInMap("AlarmRule")
        private String alarmRule;

        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("CollectionTime")
        private String collectionTime;

        @NameInMap("DedicatedLine")
        private DedicatedLine dedicatedLine;

        @NameInMap("DedicatedLineId")
        private String dedicatedLineId;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("FirstAbnormalTime")
        private String firstAbnormalTime;

        @NameInMap("MonitorItem")
        private MonitorItem monitorItem;

        @NameInMap("MonitorItemId")
        private String monitorItemId;

        @NameInMap("NotificationSwitch")
        private NotificationSwitch notificationSwitch;

        @NameInMap("PortCollection")
        private PortCollection portCollection;

        @NameInMap("PortCollectionId")
        private String portCollectionId;

        @NameInMap("ReceiveTime")
        private String receiveTime;

        @NameInMap("ResourceApp")
        private ResourceApp resourceApp;

        @NameInMap("ResourceDevice")
        private ResourceDevice resourceDevice;

        @NameInMap("ResponseCode")
        private String responseCode;

        @NameInMap("Result")
        private String result;

        @NameInMap("UniqueKey")
        private String uniqueKey;

        private AlarmStatus(Builder builder) {
            this.abnormalDataItem = builder.abnormalDataItem;
            this.agentIp = builder.agentIp;
            this.aggregateData = builder.aggregateData;
            this.aggregateDataId = builder.aggregateDataId;
            this.alarmRule = builder.alarmRule;
            this.alarmStatus = builder.alarmStatus;
            this.appId = builder.appId;
            this.collectionTime = builder.collectionTime;
            this.dedicatedLine = builder.dedicatedLine;
            this.dedicatedLineId = builder.dedicatedLineId;
            this.deviceId = builder.deviceId;
            this.firstAbnormalTime = builder.firstAbnormalTime;
            this.monitorItem = builder.monitorItem;
            this.monitorItemId = builder.monitorItemId;
            this.notificationSwitch = builder.notificationSwitch;
            this.portCollection = builder.portCollection;
            this.portCollectionId = builder.portCollectionId;
            this.receiveTime = builder.receiveTime;
            this.resourceApp = builder.resourceApp;
            this.resourceDevice = builder.resourceDevice;
            this.responseCode = builder.responseCode;
            this.result = builder.result;
            this.uniqueKey = builder.uniqueKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmStatus create() {
            return builder().build();
        }

        /**
         * @return abnormalDataItem
         */
        public String getAbnormalDataItem() {
            return this.abnormalDataItem;
        }

        /**
         * @return agentIp
         */
        public String getAgentIp() {
            return this.agentIp;
        }

        /**
         * @return aggregateData
         */
        public AggregateData getAggregateData() {
            return this.aggregateData;
        }

        /**
         * @return aggregateDataId
         */
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        /**
         * @return alarmRule
         */
        public String getAlarmRule() {
            return this.alarmRule;
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return collectionTime
         */
        public String getCollectionTime() {
            return this.collectionTime;
        }

        /**
         * @return dedicatedLine
         */
        public DedicatedLine getDedicatedLine() {
            return this.dedicatedLine;
        }

        /**
         * @return dedicatedLineId
         */
        public String getDedicatedLineId() {
            return this.dedicatedLineId;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return firstAbnormalTime
         */
        public String getFirstAbnormalTime() {
            return this.firstAbnormalTime;
        }

        /**
         * @return monitorItem
         */
        public MonitorItem getMonitorItem() {
            return this.monitorItem;
        }

        /**
         * @return monitorItemId
         */
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        /**
         * @return notificationSwitch
         */
        public NotificationSwitch getNotificationSwitch() {
            return this.notificationSwitch;
        }

        /**
         * @return portCollection
         */
        public PortCollection getPortCollection() {
            return this.portCollection;
        }

        /**
         * @return portCollectionId
         */
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        /**
         * @return receiveTime
         */
        public String getReceiveTime() {
            return this.receiveTime;
        }

        /**
         * @return resourceApp
         */
        public ResourceApp getResourceApp() {
            return this.resourceApp;
        }

        /**
         * @return resourceDevice
         */
        public ResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        /**
         * @return responseCode
         */
        public String getResponseCode() {
            return this.responseCode;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return uniqueKey
         */
        public String getUniqueKey() {
            return this.uniqueKey;
        }

        public static final class Builder {
            private String abnormalDataItem; 
            private String agentIp; 
            private AggregateData aggregateData; 
            private String aggregateDataId; 
            private String alarmRule; 
            private String alarmStatus; 
            private String appId; 
            private String collectionTime; 
            private DedicatedLine dedicatedLine; 
            private String dedicatedLineId; 
            private String deviceId; 
            private String firstAbnormalTime; 
            private MonitorItem monitorItem; 
            private String monitorItemId; 
            private NotificationSwitch notificationSwitch; 
            private PortCollection portCollection; 
            private String portCollectionId; 
            private String receiveTime; 
            private ResourceApp resourceApp; 
            private ResourceDevice resourceDevice; 
            private String responseCode; 
            private String result; 
            private String uniqueKey; 

            /**
             * AbnormalDataItem.
             */
            public Builder abnormalDataItem(String abnormalDataItem) {
                this.abnormalDataItem = abnormalDataItem;
                return this;
            }

            /**
             * AgentIp.
             */
            public Builder agentIp(String agentIp) {
                this.agentIp = agentIp;
                return this;
            }

            /**
             * AggregateData.
             */
            public Builder aggregateData(AggregateData aggregateData) {
                this.aggregateData = aggregateData;
                return this;
            }

            /**
             * AggregateDataId.
             */
            public Builder aggregateDataId(String aggregateDataId) {
                this.aggregateDataId = aggregateDataId;
                return this;
            }

            /**
             * AlarmRule.
             */
            public Builder alarmRule(String alarmRule) {
                this.alarmRule = alarmRule;
                return this;
            }

            /**
             * AlarmStatus.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CollectionTime.
             */
            public Builder collectionTime(String collectionTime) {
                this.collectionTime = collectionTime;
                return this;
            }

            /**
             * DedicatedLine.
             */
            public Builder dedicatedLine(DedicatedLine dedicatedLine) {
                this.dedicatedLine = dedicatedLine;
                return this;
            }

            /**
             * DedicatedLineId.
             */
            public Builder dedicatedLineId(String dedicatedLineId) {
                this.dedicatedLineId = dedicatedLineId;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * FirstAbnormalTime.
             */
            public Builder firstAbnormalTime(String firstAbnormalTime) {
                this.firstAbnormalTime = firstAbnormalTime;
                return this;
            }

            /**
             * MonitorItem.
             */
            public Builder monitorItem(MonitorItem monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            /**
             * MonitorItemId.
             */
            public Builder monitorItemId(String monitorItemId) {
                this.monitorItemId = monitorItemId;
                return this;
            }

            /**
             * NotificationSwitch.
             */
            public Builder notificationSwitch(NotificationSwitch notificationSwitch) {
                this.notificationSwitch = notificationSwitch;
                return this;
            }

            /**
             * PortCollection.
             */
            public Builder portCollection(PortCollection portCollection) {
                this.portCollection = portCollection;
                return this;
            }

            /**
             * PortCollectionId.
             */
            public Builder portCollectionId(String portCollectionId) {
                this.portCollectionId = portCollectionId;
                return this;
            }

            /**
             * ReceiveTime.
             */
            public Builder receiveTime(String receiveTime) {
                this.receiveTime = receiveTime;
                return this;
            }

            /**
             * ResourceApp.
             */
            public Builder resourceApp(ResourceApp resourceApp) {
                this.resourceApp = resourceApp;
                return this;
            }

            /**
             * ResourceDevice.
             */
            public Builder resourceDevice(ResourceDevice resourceDevice) {
                this.resourceDevice = resourceDevice;
                return this;
            }

            /**
             * ResponseCode.
             */
            public Builder responseCode(String responseCode) {
                this.responseCode = responseCode;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * UniqueKey.
             */
            public Builder uniqueKey(String uniqueKey) {
                this.uniqueKey = uniqueKey;
                return this;
            }

            public AlarmStatus build() {
                return new AlarmStatus(this);
            } 

        } 

    }
    public static class Statistics extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Status")
        private String status;

        private Statistics(Builder builder) {
            this.count = builder.count;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long count; 
            private String status; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
