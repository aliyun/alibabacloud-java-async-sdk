// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlarmStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlarmStatusResponseBody</p>
 */
public class GetAlarmStatusResponseBody extends TeaModel {
    @NameInMap("AlarmStatus")
    private AlarmStatus alarmStatus;

    @NameInMap("RequestId")
    private String requestId;

    private GetAlarmStatusResponseBody(Builder builder) {
        this.alarmStatus = builder.alarmStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlarmStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmStatus
     */
    public AlarmStatus getAlarmStatus() {
        return this.alarmStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlarmStatus alarmStatus; 
        private String requestId; 

        /**
         * AlarmStatus.
         */
        public Builder alarmStatus(AlarmStatus alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAlarmStatusResponseBody build() {
            return new GetAlarmStatusResponseBody(this);
        } 

    } 

    public static class AggregateData extends TeaModel {
        @NameInMap("AggregateDataDescription")
        private String aggregateDataDescription;

        @NameInMap("AggregateDataId")
        private String aggregateDataId;

        @NameInMap("AggregateDataName")
        private String aggregateDataName;

        @NameInMap("AggregateMode")
        private String aggregateMode;

        @NameInMap("DataItem")
        private String dataItem;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("IsAllDevice")
        private Integer isAllDevice;

        @NameInMap("MonitorItemId")
        private String monitorItemId;

        private AggregateData(Builder builder) {
            this.aggregateDataDescription = builder.aggregateDataDescription;
            this.aggregateDataId = builder.aggregateDataId;
            this.aggregateDataName = builder.aggregateDataName;
            this.aggregateMode = builder.aggregateMode;
            this.dataItem = builder.dataItem;
            this.deviceId = builder.deviceId;
            this.isAllDevice = builder.isAllDevice;
            this.monitorItemId = builder.monitorItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregateData create() {
            return builder().build();
        }

        /**
         * @return aggregateDataDescription
         */
        public String getAggregateDataDescription() {
            return this.aggregateDataDescription;
        }

        /**
         * @return aggregateDataId
         */
        public String getAggregateDataId() {
            return this.aggregateDataId;
        }

        /**
         * @return aggregateDataName
         */
        public String getAggregateDataName() {
            return this.aggregateDataName;
        }

        /**
         * @return aggregateMode
         */
        public String getAggregateMode() {
            return this.aggregateMode;
        }

        /**
         * @return dataItem
         */
        public String getDataItem() {
            return this.dataItem;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return isAllDevice
         */
        public Integer getIsAllDevice() {
            return this.isAllDevice;
        }

        /**
         * @return monitorItemId
         */
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public static final class Builder {
            private String aggregateDataDescription; 
            private String aggregateDataId; 
            private String aggregateDataName; 
            private String aggregateMode; 
            private String dataItem; 
            private String deviceId; 
            private Integer isAllDevice; 
            private String monitorItemId; 

            /**
             * 描述
             */
            public Builder aggregateDataDescription(String aggregateDataDescription) {
                this.aggregateDataDescription = aggregateDataDescription;
                return this;
            }

            /**
             * 聚合数据ID
             */
            public Builder aggregateDataId(String aggregateDataId) {
                this.aggregateDataId = aggregateDataId;
                return this;
            }

            /**
             * 聚合数据名称
             */
            public Builder aggregateDataName(String aggregateDataName) {
                this.aggregateDataName = aggregateDataName;
                return this;
            }

            /**
             * 聚合方式
             */
            public Builder aggregateMode(String aggregateMode) {
                this.aggregateMode = aggregateMode;
                return this;
            }

            /**
             * 数据项
             */
            public Builder dataItem(String dataItem) {
                this.dataItem = dataItem;
                return this;
            }

            /**
             * 设备ID
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * 是否聚合全部设备
             */
            public Builder isAllDevice(Integer isAllDevice) {
                this.isAllDevice = isAllDevice;
                return this;
            }

            /**
             * 监控项ID
             */
            public Builder monitorItemId(String monitorItemId) {
                this.monitorItemId = monitorItemId;
                return this;
            }

            public AggregateData build() {
                return new AggregateData(this);
            } 

        } 

    }
    public static class DedicatedLine extends TeaModel {
        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("DedicatedLineGateway")
        private String dedicatedLineGateway;

        @NameInMap("DedicatedLineName")
        private String dedicatedLineName;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("PortName")
        private String portName;

        @NameInMap("Space")
        private String space;

        private DedicatedLine(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.dedicatedLineGateway = builder.dedicatedLineGateway;
            this.dedicatedLineName = builder.dedicatedLineName;
            this.deviceId = builder.deviceId;
            this.ip = builder.ip;
            this.portName = builder.portName;
            this.space = builder.space;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedLine create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return dedicatedLineGateway
         */
        public String getDedicatedLineGateway() {
            return this.dedicatedLineGateway;
        }

        /**
         * @return dedicatedLineName
         */
        public String getDedicatedLineName() {
            return this.dedicatedLineName;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return space
         */
        public String getSpace() {
            return this.space;
        }

        public static final class Builder {
            private String bandwidth; 
            private String dedicatedLineGateway; 
            private String dedicatedLineName; 
            private String deviceId; 
            private String ip; 
            private String portName; 
            private String space; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * DedicatedLineGateway.
             */
            public Builder dedicatedLineGateway(String dedicatedLineGateway) {
                this.dedicatedLineGateway = dedicatedLineGateway;
                return this;
            }

            /**
             * DedicatedLineName.
             */
            public Builder dedicatedLineName(String dedicatedLineName) {
                this.dedicatedLineName = dedicatedLineName;
                return this;
            }

            /**
             * 设备ID
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * PortName.
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * Space.
             */
            public Builder space(String space) {
                this.space = space;
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

        @NameInMap("DeviceForm")
        private String deviceForm;

        @NameInMap("Effective")
        private Long effective;

        @NameInMap("ExecInterval")
        private String execInterval;

        @NameInMap("MonitorItemDescription")
        private String monitorItemDescription;

        @NameInMap("MonitorItemId")
        private String monitorItemId;

        @NameInMap("MonitorItemName")
        private String monitorItemName;

        @NameInMap("SecurityDomain")
        private String securityDomain;

        private MonitorItem(Builder builder) {
            this.collectionType = builder.collectionType;
            this.deviceForm = builder.deviceForm;
            this.effective = builder.effective;
            this.execInterval = builder.execInterval;
            this.monitorItemDescription = builder.monitorItemDescription;
            this.monitorItemId = builder.monitorItemId;
            this.monitorItemName = builder.monitorItemName;
            this.securityDomain = builder.securityDomain;
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
         * @return deviceForm
         */
        public String getDeviceForm() {
            return this.deviceForm;
        }

        /**
         * @return effective
         */
        public Long getEffective() {
            return this.effective;
        }

        /**
         * @return execInterval
         */
        public String getExecInterval() {
            return this.execInterval;
        }

        /**
         * @return monitorItemDescription
         */
        public String getMonitorItemDescription() {
            return this.monitorItemDescription;
        }

        /**
         * @return monitorItemId
         */
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        /**
         * @return monitorItemName
         */
        public String getMonitorItemName() {
            return this.monitorItemName;
        }

        /**
         * @return securityDomain
         */
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public static final class Builder {
            private String collectionType; 
            private String deviceForm; 
            private Long effective; 
            private String execInterval; 
            private String monitorItemDescription; 
            private String monitorItemId; 
            private String monitorItemName; 
            private String securityDomain; 

            /**
             * CollectionType.
             */
            public Builder collectionType(String collectionType) {
                this.collectionType = collectionType;
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
             * Effective.
             */
            public Builder effective(Long effective) {
                this.effective = effective;
                return this;
            }

            /**
             * ExecInterval.
             */
            public Builder execInterval(String execInterval) {
                this.execInterval = execInterval;
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
             * 监控项ID
             */
            public Builder monitorItemId(String monitorItemId) {
                this.monitorItemId = monitorItemId;
                return this;
            }

            /**
             * MonitorItemName.
             */
            public Builder monitorItemName(String monitorItemName) {
                this.monitorItemName = monitorItemName;
                return this;
            }

            /**
             * SecurityDomain.
             */
            public Builder securityDomain(String securityDomain) {
                this.securityDomain = securityDomain;
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
    public static class ResourceDevice extends TeaModel {
        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("SecurityDomain")
        private String securityDomain;

        private ResourceDevice(Builder builder) {
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.securityDomain = builder.securityDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDevice create() {
            return builder().build();
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return securityDomain
         */
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public static final class Builder {
            private String hostName; 
            private String ip; 
            private String securityDomain; 

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
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
             * SecurityDomain.
             */
            public Builder securityDomain(String securityDomain) {
                this.securityDomain = securityDomain;
                return this;
            }

            public ResourceDevice build() {
                return new ResourceDevice(this);
            } 

        } 

    }
    public static class PortList extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("PortName")
        private String portName;

        @NameInMap("ResourceDevice")
        private ResourceDevice resourceDevice;

        private PortList(Builder builder) {
            this.deviceId = builder.deviceId;
            this.portName = builder.portName;
            this.resourceDevice = builder.resourceDevice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortList create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return resourceDevice
         */
        public ResourceDevice getResourceDevice() {
            return this.resourceDevice;
        }

        public static final class Builder {
            private String deviceId; 
            private String portName; 
            private ResourceDevice resourceDevice; 

            /**
             * 设备ID
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * PortName.
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * ResourceDevice.
             */
            public Builder resourceDevice(ResourceDevice resourceDevice) {
                this.resourceDevice = resourceDevice;
                return this;
            }

            public PortList build() {
                return new PortList(this);
            } 

        } 

    }
    public static class PortCollection extends TeaModel {
        @NameInMap("PortCollectionDescription")
        private String portCollectionDescription;

        @NameInMap("PortCollectionId")
        private String portCollectionId;

        @NameInMap("PortCollectionName")
        private String portCollectionName;

        @NameInMap("PortList")
        private java.util.List < PortList> portList;

        private PortCollection(Builder builder) {
            this.portCollectionDescription = builder.portCollectionDescription;
            this.portCollectionId = builder.portCollectionId;
            this.portCollectionName = builder.portCollectionName;
            this.portList = builder.portList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortCollection create() {
            return builder().build();
        }

        /**
         * @return portCollectionDescription
         */
        public String getPortCollectionDescription() {
            return this.portCollectionDescription;
        }

        /**
         * @return portCollectionId
         */
        public String getPortCollectionId() {
            return this.portCollectionId;
        }

        /**
         * @return portCollectionName
         */
        public String getPortCollectionName() {
            return this.portCollectionName;
        }

        /**
         * @return portList
         */
        public java.util.List < PortList> getPortList() {
            return this.portList;
        }

        public static final class Builder {
            private String portCollectionDescription; 
            private String portCollectionId; 
            private String portCollectionName; 
            private java.util.List < PortList> portList; 

            /**
             * PortCollectionDescription.
             */
            public Builder portCollectionDescription(String portCollectionDescription) {
                this.portCollectionDescription = portCollectionDescription;
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
             * PortCollectionName.
             */
            public Builder portCollectionName(String portCollectionName) {
                this.portCollectionName = portCollectionName;
                return this;
            }

            /**
             * PortList.
             */
            public Builder portList(java.util.List < PortList> portList) {
                this.portList = portList;
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
    public static class AlarmStatusResourceDevice extends TeaModel {
        @NameInMap("DeviceForm")
        private String deviceForm;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Model")
        private String model;

        @NameInMap("SecurityDomain")
        private String securityDomain;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("Space")
        private String space;

        @NameInMap("Status")
        private String status;

        @NameInMap("Vendor")
        private String vendor;

        private AlarmStatusResourceDevice(Builder builder) {
            this.deviceForm = builder.deviceForm;
            this.deviceId = builder.deviceId;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.model = builder.model;
            this.securityDomain = builder.securityDomain;
            this.sn = builder.sn;
            this.space = builder.space;
            this.status = builder.status;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmStatusResourceDevice create() {
            return builder().build();
        }

        /**
         * @return deviceForm
         */
        public String getDeviceForm() {
            return this.deviceForm;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return securityDomain
         */
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return space
         */
        public String getSpace() {
            return this.space;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String deviceForm; 
            private String deviceId; 
            private String hostName; 
            private String ip; 
            private String model; 
            private String securityDomain; 
            private String sn; 
            private String space; 
            private String status; 
            private String vendor; 

            /**
             * DeviceForm.
             */
            public Builder deviceForm(String deviceForm) {
                this.deviceForm = deviceForm;
                return this;
            }

            /**
             * 设备ID
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
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
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * Space.
             */
            public Builder space(String space) {
                this.space = space;
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
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public AlarmStatusResourceDevice build() {
                return new AlarmStatusResourceDevice(this);
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
        private AlarmStatusResourceDevice resourceDevice;

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
        public AlarmStatusResourceDevice getResourceDevice() {
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
            private AlarmStatusResourceDevice resourceDevice; 
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
             * 聚合数据ID
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
             * 设备ID
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
             * 监控项ID
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
            public Builder resourceDevice(AlarmStatusResourceDevice resourceDevice) {
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
}
