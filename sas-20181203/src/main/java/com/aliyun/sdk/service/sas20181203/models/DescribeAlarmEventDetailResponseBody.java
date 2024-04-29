// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmEventDetailResponseBody</p>
 */
public class DescribeAlarmEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAlarmEventDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventDetailResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The details of the alert event.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAlarmEventDetailResponseBody build() {
            return new DescribeAlarmEventDetailResponseBody(this);
        } 

    } 

    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Value(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 

            /**
             * The name of the field that displays the tracing information.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the field that displays the tracing information. Valid values:
             * <p>
             * 
             * *   **text**
             * *   **html**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the field that displays the tracing information.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
    public static class CauseDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List < Value> value;

        private CauseDetails(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CauseDetails create() {
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
        public java.util.List < Value> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < Value> value; 

            /**
             * The key that is used to trace the alert event.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value that is used to trace the alert event.
             */
            public Builder value(java.util.List < Value> value) {
                this.value = value;
                return this;
            }

            public CauseDetails build() {
                return new CauseDetails(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmEventAliasName")
        private String alarmEventAliasName;

        @com.aliyun.core.annotation.NameInMap("AlarmEventDesc")
        private String alarmEventDesc;

        @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CanBeDealOnLine")
        private Boolean canBeDealOnLine;

        @com.aliyun.core.annotation.NameInMap("CanCancelFault")
        private Boolean canCancelFault;

        @com.aliyun.core.annotation.NameInMap("CauseDetails")
        private java.util.List < CauseDetails> causeDetails;

        @com.aliyun.core.annotation.NameInMap("ContainHwMode")
        private Boolean containHwMode;

        @com.aliyun.core.annotation.NameInMap("ContainerId")
        private String containerId;

        @com.aliyun.core.annotation.NameInMap("ContainerImageId")
        private String containerImageId;

        @com.aliyun.core.annotation.NameInMap("ContainerImageName")
        private String containerImageName;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private String dataSource;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("K8sClusterId")
        private String k8sClusterId;

        @com.aliyun.core.annotation.NameInMap("K8sClusterName")
        private String k8sClusterName;

        @com.aliyun.core.annotation.NameInMap("K8sNamespace")
        private String k8sNamespace;

        @com.aliyun.core.annotation.NameInMap("K8sNodeId")
        private String k8sNodeId;

        @com.aliyun.core.annotation.NameInMap("K8sNodeName")
        private String k8sNodeName;

        @com.aliyun.core.annotation.NameInMap("K8sPodName")
        private String k8sPodName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.alarmEventAliasName = builder.alarmEventAliasName;
            this.alarmEventDesc = builder.alarmEventDesc;
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.appName = builder.appName;
            this.canBeDealOnLine = builder.canBeDealOnLine;
            this.canCancelFault = builder.canCancelFault;
            this.causeDetails = builder.causeDetails;
            this.containHwMode = builder.containHwMode;
            this.containerId = builder.containerId;
            this.containerImageId = builder.containerImageId;
            this.containerImageName = builder.containerImageName;
            this.dataSource = builder.dataSource;
            this.endTime = builder.endTime;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.k8sClusterId = builder.k8sClusterId;
            this.k8sClusterName = builder.k8sClusterName;
            this.k8sNamespace = builder.k8sNamespace;
            this.k8sNodeId = builder.k8sNodeId;
            this.k8sNodeName = builder.k8sNodeName;
            this.k8sPodName = builder.k8sPodName;
            this.level = builder.level;
            this.solution = builder.solution;
            this.startTime = builder.startTime;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmEventAliasName
         */
        public String getAlarmEventAliasName() {
            return this.alarmEventAliasName;
        }

        /**
         * @return alarmEventDesc
         */
        public String getAlarmEventDesc() {
            return this.alarmEventDesc;
        }

        /**
         * @return alarmUniqueInfo
         */
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return canBeDealOnLine
         */
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        /**
         * @return canCancelFault
         */
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        /**
         * @return causeDetails
         */
        public java.util.List < CauseDetails> getCauseDetails() {
            return this.causeDetails;
        }

        /**
         * @return containHwMode
         */
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return containerImageId
         */
        public String getContainerImageId() {
            return this.containerImageId;
        }

        /**
         * @return containerImageName
         */
        public String getContainerImageName() {
            return this.containerImageName;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return k8sClusterId
         */
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        /**
         * @return k8sClusterName
         */
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        /**
         * @return k8sNamespace
         */
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        /**
         * @return k8sNodeId
         */
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        /**
         * @return k8sNodeName
         */
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        /**
         * @return k8sPodName
         */
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String alarmEventAliasName; 
            private String alarmEventDesc; 
            private String alarmUniqueInfo; 
            private String appName; 
            private Boolean canBeDealOnLine; 
            private Boolean canCancelFault; 
            private java.util.List < CauseDetails> causeDetails; 
            private Boolean containHwMode; 
            private String containerId; 
            private String containerImageId; 
            private String containerImageName; 
            private String dataSource; 
            private Long endTime; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String k8sClusterId; 
            private String k8sClusterName; 
            private String k8sNamespace; 
            private String k8sNodeId; 
            private String k8sNodeName; 
            private String k8sPodName; 
            private String level; 
            private String solution; 
            private Long startTime; 
            private String type; 
            private String uuid; 

            /**
             * The name of the alert event.
             */
            public Builder alarmEventAliasName(String alarmEventAliasName) {
                this.alarmEventAliasName = alarmEventAliasName;
                return this;
            }

            /**
             * The description of the alert event.
             */
            public Builder alarmEventDesc(String alarmEventDesc) {
                this.alarmEventDesc = alarmEventDesc;
                return this;
            }

            /**
             * The unique identifier of the alert event.
             * <p>
             * 
             * > To query the details of an alert event, you must provide the unique identifier of the alert event. You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to obtain the identifier.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * The name of the container application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Indicates whether the online handling of the alert event is supported. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * Indicates whether you can cancel marking the alert event as a false positive. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * An array consisting of the cause of the alert event, which can be used to trace the alert event.
             */
            public Builder causeDetails(java.util.List < CauseDetails> causeDetails) {
                this.causeDetails = causeDetails;
                return this;
            }

            /**
             * Indicates whether the Safeguard Mode For Major Activities mode is enabled.
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * The ID of the container application.
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * The ID of the image to which the container belongs.
             */
            public Builder containerImageId(String containerImageId) {
                this.containerImageId = containerImageId;
                return this;
            }

            /**
             * The name of the image to which the container belongs.
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * The data source of the alert event.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * The timestamp when the alert event ends. Unit: milliseconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the associated instance.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the associated instance.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The ID of the Kubernetes cluster.
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * The name of the Kubernetes cluster.
             */
            public Builder k8sClusterName(String k8sClusterName) {
                this.k8sClusterName = k8sClusterName;
                return this;
            }

            /**
             * The namespace of the Kubernetes cluster.
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * The ID of the Kubernetes cluster node.
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * The name of the Kubernetes cluster node.
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * The name of the Kubernetes pod.
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * The severity of the alert event. Valid values:
             * <p>
             * 
             * *   **serious**
             * *   **suspicious**
             * *   **remind**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The solution to the alert event.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * The timestamp when the alert event starts. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The alert type of the alert event. Valid values:
             * <p>
             * 
             * *   Suspicious process
             * *   Webshell
             * *   Unusual logon
             * *   Exception
             * *   Sensitive file tampering
             * *   Malicious process (cloud threat detection)
             * *   Suspicious network connection
             * *   Other
             * *   Abnormal account
             * *   Application intrusion event
             * *   Cloud threat detection
             * *   Precise defense
             * *   Application whitelist
             * *   Persistent webshell
             * *   Web application threat detection
             * *   Malicious script
             * *   Threat intelligence
             * *   Malicious network activity
             * *   Cluster exception
             * *   Webshell (on-premises threat detection)
             * *   Vulnerability exploitation
             * *   Malicious process (on-premises threat detection)
             * *   Trusted exception
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The instance UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
