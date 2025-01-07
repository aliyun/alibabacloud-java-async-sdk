// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The details of the alert event.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7EA50837-2F0B-5BCC-AB61-4968D88D75AD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAlarmEventDetailResponseBody build() {
            return new DescribeAlarmEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlarmEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmEventDetailResponseBody</p>
     */
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
             * <p>The name of the field that displays the tracing information.</p>
             * 
             * <strong>example:</strong>
             * <p>sshd</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the field that displays the tracing information. Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>html</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>html</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the field that displays the tracing information.</p>
             * 
             * <strong>example:</strong>
             * <p>under a certain small probability, yundun may mistakenly judge the repeated attempts caused by the administrator forgetting or entering the wrong password as successful blasting. Please check according to the account number and time shown in the alarm details. Once it is confirmed that it is not the initiative of the administrator, it is recommended to immediately block the IP, and you can open it at the same time<a href="https://yundun.console.aliyun.com/?p=pam">PAM</a>, hosting host login password, improving remote connection efficiency and security control ability, and according to<a href="https://click.aliyun.com/m/1000226086/">best practice of ECS account security protection</a>Modify login password and convergence asset.</p>↵
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
    /**
     * 
     * {@link DescribeAlarmEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmEventDetailResponseBody</p>
     */
    public static class CauseDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<Value> value;

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
        public java.util.List<Value> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<Value> value; 

            /**
             * <p>The key that is used to trace the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>842e314e69b1a2c45d5c1a2f88a16***</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value that is used to trace the alert event.</p>
             */
            public Builder value(java.util.List<Value> value) {
                this.value = value;
                return this;
            }

            public CauseDetails build() {
                return new CauseDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlarmEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmEventDetailResponseBody</p>
     */
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
        private java.util.List<CauseDetails> causeDetails;

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
        public java.util.List<CauseDetails> getCauseDetails() {
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
            private java.util.List<CauseDetails> causeDetails; 
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
             * <p>The name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Login with unusual location</p>
             */
            public Builder alarmEventAliasName(String alarmEventAliasName) {
                this.alarmEventAliasName = alarmEventAliasName;
                return this;
            }

            /**
             * <p>The description of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>The detection model finds that self-mutation is running on your server. A self-mutation Trojan is a Trojan horse program with self-mutation function. It will change its hash or copy a large number of itself to different paths, and run in the background to avoid cleaning.</p>
             */
            public Builder alarmEventDesc(String alarmEventDesc) {
                this.alarmEventDesc = alarmEventDesc;
                return this;
            }

            /**
             * <p>The unique identifier of the alert event.</p>
             * <blockquote>
             * <p>To query the details of an alert event, you must provide the unique identifier of the alert event. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the identifier.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>9f62555666f177aa84ee1eaf465a****</p>
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * <p>The name of the container application.</p>
             * 
             * <strong>example:</strong>
             * <p>app:msdp-uat-service</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>Indicates whether the online handling of the alert event is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * <p>Indicates whether you can cancel marking the alert event as a false positive. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * <p>An array consisting of the cause of the alert event, which can be used to trace the alert event.</p>
             */
            public Builder causeDetails(java.util.List<CauseDetails> causeDetails) {
                this.causeDetails = causeDetails;
                return this;
            }

            /**
             * <p>Indicates whether the Safeguard Mode For Major Activities mode is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * <p>The ID of the container application.</p>
             * 
             * <strong>example:</strong>
             * <p>container_1606995441910_394868_01_000***</p>
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * <p>The ID of the image to which the container belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cadb7a725641</p>
             */
            public Builder containerImageId(String containerImageId) {
                this.containerImageId = containerImageId;
                return this;
            }

            /**
             * <p>The name of the image to which the container belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>jenkins/jenkins:latest</p>
             */
            public Builder containerImageName(String containerImageName) {
                this.containerImageName = containerImageName;
                return this;
            }

            /**
             * <p>The data source of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis_***</p>
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The timestamp when the alert event ends. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1542366542000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92q7m5hsbgfhdss***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.25.30.**</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The ID of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c562cf0d68e9749ee9fe544a7ab2f****</p>
             */
            public Builder k8sClusterId(String k8sClusterId) {
                this.k8sClusterId = k8sClusterId;
                return this;
            }

            /**
             * <p>The name of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>TestK8sCluser</p>
             */
            public Builder k8sClusterName(String k8sClusterName) {
                this.k8sClusterName = k8sClusterName;
                return this;
            }

            /**
             * <p>The namespace of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>sit-saic-trip</p>
             */
            public Builder k8sNamespace(String k8sNamespace) {
                this.k8sNamespace = k8sNamespace;
                return this;
            }

            /**
             * <p>The ID of the Kubernetes cluster node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp14a1ay8e0aa9t0l***</p>
             */
            public Builder k8sNodeId(String k8sNodeId) {
                this.k8sNodeId = k8sNodeId;
                return this;
            }

            /**
             * <p>The name of the Kubernetes cluster node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou.10.188.139.**</p>
             */
            public Builder k8sNodeName(String k8sNodeName) {
                this.k8sNodeName = k8sNodeName;
                return this;
            }

            /**
             * <p>The name of the Kubernetes pod.</p>
             * 
             * <strong>example:</strong>
             * <p>myapp-pod</p>
             */
            public Builder k8sPodName(String k8sPodName) {
                this.k8sPodName = k8sPodName;
                return this;
            }

            /**
             * <p>The severity of the alert event. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>suspicious</strong></li>
             * <li><strong>remind</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The solution to the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>An invalid logon source IP has been detected. If you recognize this logon attempt, we recommend that you add the current logon source IP to the valid logon source IP list to avoid future alerts. If you do not recognize this logon attempt, we recommend that you modify the password.</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>The timestamp when the alert event starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1542378601000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The alert type of the alert event. Valid values:</p>
             * <ul>
             * <li>Suspicious process</li>
             * <li>Webshell</li>
             * <li>Unusual logon</li>
             * <li>Exception</li>
             * <li>Sensitive file tampering</li>
             * <li>Malicious process (cloud threat detection)</li>
             * <li>Suspicious network connection</li>
             * <li>Other</li>
             * <li>Abnormal account</li>
             * <li>Application intrusion event</li>
             * <li>Cloud threat detection</li>
             * <li>Precise defense</li>
             * <li>Application whitelist</li>
             * <li>Persistent webshell</li>
             * <li>Web application threat detection</li>
             * <li>Malicious script</li>
             * <li>Threat intelligence</li>
             * <li>Malicious network activity</li>
             * <li>Cluster exception</li>
             * <li>Webshell (on-premises threat detection)</li>
             * <li>Vulnerability exploitation</li>
             * <li>Malicious process (on-premises threat detection)</li>
             * <li>Trusted exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Webshell</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The instance UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
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
