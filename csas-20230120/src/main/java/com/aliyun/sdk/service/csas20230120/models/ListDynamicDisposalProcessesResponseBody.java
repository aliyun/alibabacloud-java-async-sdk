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
         * <p>List of disposal processes.</p>
         */
        public Builder disposalProcesses(java.util.List<DisposalProcesses> disposalProcesses) {
            this.disposalProcesses = disposalProcesses;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of dynamic disposal processes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>CPU model.</p>
             * 
             * <strong>example:</strong>
             * <p>Intel(R) Core(TM) i5-10210U CPU @ 1.60GHz</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>Device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>A84D0AF0-1ACC-02B8-6A07-FC898F71BE09</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>Device operating system type. Values:</p>
             * <ul>
             * <li><strong>Windows</strong>：Windows system.</li>
             * <li><strong>macOS</strong>：macOS system.</li>
             * <li><strong>Linux</strong>：Linux system.</li>
             * <li><strong>Android</strong>：Android system.</li>
             * <li><strong>iOS</strong>：iOS system.</li>
             * <li><strong>Windows_Wuying</strong>：Wuying cloud desktop system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder devType(String devType) {
                this.devType = devType;
                return this;
            }

            /**
             * <p>Device disk model.</p>
             * 
             * <strong>example:</strong>
             * <p>KXG6AZNV512G TOSHIBA</p>
             */
            public Builder disk(String disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>Device name.</p>
             * 
             * <strong>example:</strong>
             * <p>DESKTOP-ERLV3AK</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Device MAC address.</p>
             * 
             * <strong>example:</strong>
             * <p>CE:3B:<strong>:</strong>:FD:FB</p>
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * <p>Device memory capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Operating system version</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>Client version.</p>
             * 
             * <strong>example:</strong>
             * <p>4.5.1</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>Department to which the user belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>IT运维部</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>Office data protection status. Values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * <li><strong>Unprovisioned</strong>: Not configured.</li>
             * <li><strong>Unauthorized</strong>: Unauthorized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder dlpStatus(String dlpStatus) {
                this.dlpStatus = dlpStatus;
                return this;
            }

            /**
             * <p>Public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>120.26.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>Internet behavior management enablement status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder laStatus(String laStatus) {
                this.laStatus = laStatus;
                return this;
            }

            /**
             * <p>Login status.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder loginStatus(String loginStatus) {
                this.loginStatus = loginStatus;
                return this;
            }

            /**
             * <p>Network access control status. Values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * <li><strong>Unprovisioned</strong>: Not configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder nacStatus(String nacStatus) {
                this.nacStatus = nacStatus;
                return this;
            }

            /**
             * <p>Private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.20.XX.XX</p>
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * <p>Unique ID of the SASE user.</p>
             * 
             * <strong>example:</strong>
             * <p>su_dfsdfsdgasgsgag</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>Identified office area name.</p>
             * 
             * <strong>example:</strong>
             * <p>office</p>
             */
            public Builder workshop(String workshop) {
                this.workshop = workshop;
                return this;
            }

            /**
             * <p>ZTNA enablement status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
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
             * <p>User&quot;s department.</p>
             * 
             * <strong>example:</strong>
             * <p>IT</p>
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>Device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>FD7554AD-4CDE-6359-6B49-4FE950606C2C</p>
             */
            public Builder devTag(String devTag) {
                this.devTag = devTag;
                return this;
            }

            /**
             * <p>Basic device information.</p>
             */
            public Builder deviceBasicInfo(DeviceBasicInfo deviceBasicInfo) {
                this.deviceBasicInfo = deviceBasicInfo;
                return this;
            }

            /**
             * <p>设备状态信息。</p>
             */
            public Builder deviceStatusInfo(DeviceStatusInfo deviceStatusInfo) {
                this.deviceStatusInfo = deviceStatusInfo;
                return this;
            }

            /**
             * <p>List of disposal actions.</p>
             */
            public Builder disposalActions(java.util.List<String> disposalActions) {
                this.disposalActions = disposalActions;
                return this;
            }

            /**
             * <p>Disposal process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dp-xxxxxxxx</p>
             */
            public Builder disposalProcessId(String disposalProcessId) {
                this.disposalProcessId = disposalProcessId;
                return this;
            }

            /**
             * <p>Disposal time, in seconds since the epoch.</p>
             * 
             * <strong>example:</strong>
             * <p>1743059249</p>
             */
            public Builder disposalTime(String disposalTime) {
                this.disposalTime = disposalTime;
                return this;
            }

            /**
             * <p>Dynamic policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dynamic-policy-xxxxxxxx</p>
             */
            public Builder dynamicPolicyId(String dynamicPolicyId) {
                this.dynamicPolicyId = dynamicPolicyId;
                return this;
            }

            /**
             * <p>Dynamic policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>动态策略1</p>
             */
            public Builder dynamicPolicyName(String dynamicPolicyName) {
                this.dynamicPolicyName = dynamicPolicyName;
                return this;
            }

            /**
             * <p>Terminal device name. Length: 1~128 characters, supporting Chinese and uppercase/lowercase English letters, and can include numbers, half-width periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), slashes (/), at (@) symbols, and spaces. Entering an underscore (</em>) alone will additionally query all terminal devices with 4-byte UTF-8 characters in their names.</p>
             * 
             * <strong>example:</strong>
             * <p>WANGCHENCHENNBB</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Recovery type.</p>
             * <ul>
             * <li><strong>auto</strong>：Automatic recovery.</li>
             * <li><strong>console</strong>：Console recovery.</li>
             * <li><strong>auth</strong>：Certification and reporting recovery.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder recoveryType(String recoveryType) {
                this.recoveryType = recoveryType;
                return this;
            }

            /**
             * <p>Rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;Combinator&quot;: &quot;OR&quot;,
             *   &quot;Rules&quot;: [
             *     {
             *       &quot;Operator&quot;: &quot;version_gt&quot;,
             *       &quot;Values&quot;: [
             *         &quot;1&quot;
             *       ],
             *       &quot;RuleType&quot;: &quot;device_info&quot;,
             *       &quot;Id&quot;: &quot;1&quot;,
             *       &quot;RuleSubType&quot;: &quot;basic_info&quot;,
             *       &quot;Name&quot;: &quot;app_version&quot;
             *     }
             *   ]
             * }</p>
             */
            public Builder ruleContent(Object ruleContent) {
                this.ruleContent = ruleContent;
                return this;
            }

            /**
             * <p>SASE用户ID。</p>
             * 
             * <strong>example:</strong>
             * <p>asdqwedg-xzczvzdaf-asfafs</p>
             */
            public Builder saseUserId(String saseUserId) {
                this.saseUserId = saseUserId;
                return this;
            }

            /**
             * <p>Disposal status. Values:</p>
             * <ul>
             * <li><strong>disposal</strong>: In the disposal state.</li>
             * <li><strong>finished</strong>: Already automatically recovered.</li>
             * <li><strong>recovery</strong>: Recovered by authentication and reporting or console recovery.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disposal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Username.</p>
             * 
             * <strong>example:</strong>
             * <p>xiaoming</p>
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
