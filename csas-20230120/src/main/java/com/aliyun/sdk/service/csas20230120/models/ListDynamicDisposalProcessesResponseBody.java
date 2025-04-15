// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDynamicDisposalProcessesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDynamicDisposalProcessesResponseBody</p>
 */
public class ListDynamicDisposalProcessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DisposalProcesses")
    private java.util.List<DisposalProcesses> disposalProcesses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListDynamicDisposalProcessesResponseBody(Builder builder) {
        this.disposalProcesses = builder.disposalProcesses;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicDisposalProcessesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disposalProcesses
     */
    public java.util.List<DisposalProcesses> getDisposalProcesses() {
        return this.disposalProcesses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<DisposalProcesses> disposalProcesses; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListDynamicDisposalProcessesResponseBody model) {
            this.disposalProcesses = model.disposalProcesses;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * DisposalProcesses.
         */
        public Builder disposalProcesses(java.util.List<DisposalProcesses> disposalProcesses) {
            this.disposalProcesses = disposalProcesses;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListDynamicDisposalProcessesResponseBody build() {
            return new ListDynamicDisposalProcessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDynamicDisposalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicDisposalProcessesResponseBody</p>
     */
    public static class DeviceBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DevType")
        private String devType;

        @com.aliyun.core.annotation.NameInMap("Disk")
        private String disk;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        private DeviceBasicInfo(Builder builder) {
            this.cpu = builder.cpu;
            this.devTag = builder.devTag;
            this.devType = builder.devType;
            this.disk = builder.disk;
            this.hostname = builder.hostname;
            this.mac = builder.mac;
            this.memory = builder.memory;
            this.osVersion = builder.osVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceBasicInfo create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return devType
         */
        public String getDevType() {
            return this.devType;
        }

        /**
         * @return disk
         */
        public String getDisk() {
            return this.disk;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        public static final class Builder {
            private String cpu; 
            private String devTag; 
            private String devType; 
            private String disk; 
            private String hostname; 
            private String mac; 
            private String memory; 
            private String osVersion; 

            private Builder() {
            } 

            private Builder(DeviceBasicInfo model) {
                this.cpu = model.cpu;
                this.devTag = model.devTag;
                this.devType = model.devType;
                this.disk = model.disk;
                this.hostname = model.hostname;
                this.mac = model.mac;
                this.memory = model.memory;
                this.osVersion = model.osVersion;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * DevTag.
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * DevType.
             */
            public Builder devType(String devType) {
                this.devType = devType;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(String disk) {
                this.disk = disk;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            public DeviceBasicInfo build() {
                return new DeviceBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDynamicDisposalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicDisposalProcessesResponseBody</p>
     */
    public static class DeviceStatusInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DlpStatus")
        private String dlpStatus;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("LaStatus")
        private String laStatus;

        @com.aliyun.core.annotation.NameInMap("LoginStatus")
        private String loginStatus;

        @com.aliyun.core.annotation.NameInMap("NacStatus")
        private String nacStatus;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("Username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("Workshop")
        private String workshop;

        @com.aliyun.core.annotation.NameInMap("ZtnaStatus")
        private String ztnaStatus;

        private DeviceStatusInfo(Builder builder) {
            this.appVersion = builder.appVersion;
            this.department = builder.department;
            this.dlpStatus = builder.dlpStatus;
            this.internetIp = builder.internetIp;
            this.laStatus = builder.laStatus;
            this.loginStatus = builder.loginStatus;
            this.nacStatus = builder.nacStatus;
            this.privateIp = builder.privateIp;
            this.saseUserId = builder.saseUserId;
            this.username = builder.username;
            this.workshop = builder.workshop;
            this.ztnaStatus = builder.ztnaStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceStatusInfo create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return dlpStatus
         */
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return laStatus
         */
        public String getLaStatus() {
            return this.laStatus;
        }

        /**
         * @return loginStatus
         */
        public String getLoginStatus() {
            return this.loginStatus;
        }

        /**
         * @return nacStatus
         */
        public String getNacStatus() {
            return this.nacStatus;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return workshop
         */
        public String getWorkshop() {
            return this.workshop;
        }

        /**
         * @return ztnaStatus
         */
        public String getZtnaStatus() {
            return this.ztnaStatus;
        }

        public static final class Builder {
            private String appVersion; 
            private String department; 
            private String dlpStatus; 
            private String internetIp; 
            private String laStatus; 
            private String loginStatus; 
            private String nacStatus; 
            private String privateIp; 
            private String saseUserId; 
            private String username; 
            private String workshop; 
            private String ztnaStatus; 

            private Builder() {
            } 

            private Builder(DeviceStatusInfo model) {
                this.appVersion = model.appVersion;
                this.department = model.department;
                this.dlpStatus = model.dlpStatus;
                this.internetIp = model.internetIp;
                this.laStatus = model.laStatus;
                this.loginStatus = model.loginStatus;
                this.nacStatus = model.nacStatus;
                this.privateIp = model.privateIp;
                this.saseUserId = model.saseUserId;
                this.username = model.username;
                this.workshop = model.workshop;
                this.ztnaStatus = model.ztnaStatus;
            } 

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * DlpStatus.
             */
            public Builder dlpStatus(String dlpStatus) {
                this.dlpStatus = dlpStatus;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * LaStatus.
             */
            public Builder laStatus(String laStatus) {
                this.laStatus = laStatus;
                return this;
            }

            /**
             * LoginStatus.
             */
            public Builder loginStatus(String loginStatus) {
                this.loginStatus = loginStatus;
                return this;
            }

            /**
             * NacStatus.
             */
            public Builder nacStatus(String nacStatus) {
                this.nacStatus = nacStatus;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * Workshop.
             */
            public Builder workshop(String workshop) {
                this.workshop = workshop;
                return this;
            }

            /**
             * ZtnaStatus.
             */
            public Builder ztnaStatus(String ztnaStatus) {
                this.ztnaStatus = ztnaStatus;
                return this;
            }

            public DeviceStatusInfo build() {
                return new DeviceStatusInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDynamicDisposalProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDynamicDisposalProcessesResponseBody</p>
     */
    public static class DisposalProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DevTag")
        private String devTag;

        @com.aliyun.core.annotation.NameInMap("DeviceBasicInfo")
        private DeviceBasicInfo deviceBasicInfo;

        @com.aliyun.core.annotation.NameInMap("DeviceStatusInfo")
        private DeviceStatusInfo deviceStatusInfo;

        @com.aliyun.core.annotation.NameInMap("DisposalActions")
        private java.util.List<String> disposalActions;

        @com.aliyun.core.annotation.NameInMap("DisposalProcessId")
        private String disposalProcessId;

        @com.aliyun.core.annotation.NameInMap("DisposalTime")
        private String disposalTime;

        @com.aliyun.core.annotation.NameInMap("DynamicPolicyId")
        private String dynamicPolicyId;

        @com.aliyun.core.annotation.NameInMap("DynamicPolicyName")
        private String dynamicPolicyName;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("RecoveryType")
        private String recoveryType;

        @com.aliyun.core.annotation.NameInMap("RuleContent")
        private Object ruleContent;

        @com.aliyun.core.annotation.NameInMap("SaseUserId")
        private String saseUserId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private DisposalProcesses(Builder builder) {
            this.department = builder.department;
            this.devTag = builder.devTag;
            this.deviceBasicInfo = builder.deviceBasicInfo;
            this.deviceStatusInfo = builder.deviceStatusInfo;
            this.disposalActions = builder.disposalActions;
            this.disposalProcessId = builder.disposalProcessId;
            this.disposalTime = builder.disposalTime;
            this.dynamicPolicyId = builder.dynamicPolicyId;
            this.dynamicPolicyName = builder.dynamicPolicyName;
            this.hostname = builder.hostname;
            this.recoveryType = builder.recoveryType;
            this.ruleContent = builder.ruleContent;
            this.saseUserId = builder.saseUserId;
            this.status = builder.status;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisposalProcesses create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return devTag
         */
        public String getDevTag() {
            return this.devTag;
        }

        /**
         * @return deviceBasicInfo
         */
        public DeviceBasicInfo getDeviceBasicInfo() {
            return this.deviceBasicInfo;
        }

        /**
         * @return deviceStatusInfo
         */
        public DeviceStatusInfo getDeviceStatusInfo() {
            return this.deviceStatusInfo;
        }

        /**
         * @return disposalActions
         */
        public java.util.List<String> getDisposalActions() {
            return this.disposalActions;
        }

        /**
         * @return disposalProcessId
         */
        public String getDisposalProcessId() {
            return this.disposalProcessId;
        }

        /**
         * @return disposalTime
         */
        public String getDisposalTime() {
            return this.disposalTime;
        }

        /**
         * @return dynamicPolicyId
         */
        public String getDynamicPolicyId() {
            return this.dynamicPolicyId;
        }

        /**
         * @return dynamicPolicyName
         */
        public String getDynamicPolicyName() {
            return this.dynamicPolicyName;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return recoveryType
         */
        public String getRecoveryType() {
            return this.recoveryType;
        }

        /**
         * @return ruleContent
         */
        public Object getRuleContent() {
            return this.ruleContent;
        }

        /**
         * @return saseUserId
         */
        public String getSaseUserId() {
            return this.saseUserId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String department; 
            private String devTag; 
            private DeviceBasicInfo deviceBasicInfo; 
            private DeviceStatusInfo deviceStatusInfo; 
            private java.util.List<String> disposalActions; 
            private String disposalProcessId; 
            private String disposalTime; 
            private String dynamicPolicyId; 
            private String dynamicPolicyName; 
            private String hostname; 
            private String recoveryType; 
            private Object ruleContent; 
            private String saseUserId; 
            private String status; 
            private String userName; 

            private Builder() {
            } 

            private Builder(DisposalProcesses model) {
                this.department = model.department;
                this.devTag = model.devTag;
                this.deviceBasicInfo = model.deviceBasicInfo;
                this.deviceStatusInfo = model.deviceStatusInfo;
                this.disposalActions = model.disposalActions;
                this.disposalProcessId = model.disposalProcessId;
                this.disposalTime = model.disposalTime;
                this.dynamicPolicyId = model.dynamicPolicyId;
                this.dynamicPolicyName = model.dynamicPolicyName;
                this.hostname = model.hostname;
                this.recoveryType = model.recoveryType;
                this.ruleContent = model.ruleContent;
                this.saseUserId = model.saseUserId;
                this.status = model.status;
                this.userName = model.userName;
            } 

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * DevTag.
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * DeviceBasicInfo.
             */
            public Builder deviceBasicInfo(DeviceBasicInfo deviceBasicInfo) {
                this.deviceBasicInfo = deviceBasicInfo;
                return this;
            }

            /**
             * DeviceStatusInfo.
             */
            public Builder deviceStatusInfo(DeviceStatusInfo deviceStatusInfo) {
                this.deviceStatusInfo = deviceStatusInfo;
                return this;
            }

            /**
             * DisposalActions.
             */
            public Builder disposalActions(java.util.List<String> disposalActions) {
                this.disposalActions = disposalActions;
                return this;
            }

            /**
             * DisposalProcessId.
             */
            public Builder disposalProcessId(String disposalProcessId) {
                this.disposalProcessId = disposalProcessId;
                return this;
            }

            /**
             * DisposalTime.
             */
            public Builder disposalTime(String disposalTime) {
                this.disposalTime = disposalTime;
                return this;
            }

            /**
             * DynamicPolicyId.
             */
            public Builder dynamicPolicyId(String dynamicPolicyId) {
                this.dynamicPolicyId = dynamicPolicyId;
                return this;
            }

            /**
             * DynamicPolicyName.
             */
            public Builder dynamicPolicyName(String dynamicPolicyName) {
                this.dynamicPolicyName = dynamicPolicyName;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * RecoveryType.
             */
            public Builder recoveryType(String recoveryType) {
                this.recoveryType = recoveryType;
                return this;
            }

            /**
             * RuleContent.
             */
            public Builder ruleContent(Object ruleContent) {
                this.ruleContent = ruleContent;
                return this;
            }

            /**
             * SaseUserId.
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
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
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public DisposalProcesses build() {
                return new DisposalProcesses(this);
            } 

        } 

    }
}
