// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeUserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserStatusResponseBody</p>
 */
public class DescribeUserStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private UserStatus userStatus;

    private DescribeUserStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userStatus
     */
    public UserStatus getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder {
        private String requestId; 
        private UserStatus userStatus; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the current account.</p>
         */
        public Builder userStatus(UserStatus userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public DescribeUserStatusResponseBody build() {
            return new DescribeUserStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserStatusResponseBody</p>
     */
    public static class UserStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AuditClosable")
        private Boolean auditClosable;

        @com.aliyun.core.annotation.NameInMap("AuditReleasable")
        private Boolean auditReleasable;

        @com.aliyun.core.annotation.NameInMap("Authed")
        private Boolean authed;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DataManagerRole")
        private Integer dataManagerRole;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceNum")
        private Integer instanceNum;

        @com.aliyun.core.annotation.NameInMap("InstanceTotalCount")
        private Long instanceTotalCount;

        @com.aliyun.core.annotation.NameInMap("LabStatus")
        private Integer labStatus;

        @com.aliyun.core.annotation.NameInMap("OssTotalSize")
        private Long ossTotalSize;

        @com.aliyun.core.annotation.NameInMap("ProtectionDays")
        private Integer protectionDays;

        @com.aliyun.core.annotation.NameInMap("Purchased")
        private Boolean purchased;

        @com.aliyun.core.annotation.NameInMap("ReleaseDays")
        private Integer releaseDays;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("RemainDays")
        private Integer remainDays;

        @com.aliyun.core.annotation.NameInMap("Trail")
        private Boolean trail;

        @com.aliyun.core.annotation.NameInMap("UseAgentAudit")
        private Boolean useAgentAudit;

        @com.aliyun.core.annotation.NameInMap("UseInstanceNum")
        private Integer useInstanceNum;

        @com.aliyun.core.annotation.NameInMap("UseOssSize")
        private Long useOssSize;

        private UserStatus(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.auditClosable = builder.auditClosable;
            this.auditReleasable = builder.auditReleasable;
            this.authed = builder.authed;
            this.chargeType = builder.chargeType;
            this.dataManagerRole = builder.dataManagerRole;
            this.instanceId = builder.instanceId;
            this.instanceNum = builder.instanceNum;
            this.instanceTotalCount = builder.instanceTotalCount;
            this.labStatus = builder.labStatus;
            this.ossTotalSize = builder.ossTotalSize;
            this.protectionDays = builder.protectionDays;
            this.purchased = builder.purchased;
            this.releaseDays = builder.releaseDays;
            this.releaseTime = builder.releaseTime;
            this.remainDays = builder.remainDays;
            this.trail = builder.trail;
            this.useAgentAudit = builder.useAgentAudit;
            this.useInstanceNum = builder.useInstanceNum;
            this.useOssSize = builder.useOssSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatus create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return auditClosable
         */
        public Boolean getAuditClosable() {
            return this.auditClosable;
        }

        /**
         * @return auditReleasable
         */
        public Boolean getAuditReleasable() {
            return this.auditReleasable;
        }

        /**
         * @return authed
         */
        public Boolean getAuthed() {
            return this.authed;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return dataManagerRole
         */
        public Integer getDataManagerRole() {
            return this.dataManagerRole;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return instanceTotalCount
         */
        public Long getInstanceTotalCount() {
            return this.instanceTotalCount;
        }

        /**
         * @return labStatus
         */
        public Integer getLabStatus() {
            return this.labStatus;
        }

        /**
         * @return ossTotalSize
         */
        public Long getOssTotalSize() {
            return this.ossTotalSize;
        }

        /**
         * @return protectionDays
         */
        public Integer getProtectionDays() {
            return this.protectionDays;
        }

        /**
         * @return purchased
         */
        public Boolean getPurchased() {
            return this.purchased;
        }

        /**
         * @return releaseDays
         */
        public Integer getReleaseDays() {
            return this.releaseDays;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return remainDays
         */
        public Integer getRemainDays() {
            return this.remainDays;
        }

        /**
         * @return trail
         */
        public Boolean getTrail() {
            return this.trail;
        }

        /**
         * @return useAgentAudit
         */
        public Boolean getUseAgentAudit() {
            return this.useAgentAudit;
        }

        /**
         * @return useInstanceNum
         */
        public Integer getUseInstanceNum() {
            return this.useInstanceNum;
        }

        /**
         * @return useOssSize
         */
        public Long getUseOssSize() {
            return this.useOssSize;
        }

        public static final class Builder {
            private String accessKeyId; 
            private Boolean auditClosable; 
            private Boolean auditReleasable; 
            private Boolean authed; 
            private String chargeType; 
            private Integer dataManagerRole; 
            private String instanceId; 
            private Integer instanceNum; 
            private Long instanceTotalCount; 
            private Integer labStatus; 
            private Long ossTotalSize; 
            private Integer protectionDays; 
            private Boolean purchased; 
            private Integer releaseDays; 
            private Long releaseTime; 
            private Integer remainDays; 
            private Boolean trail; 
            private Boolean useAgentAudit; 
            private Integer useInstanceNum; 
            private Long useOssSize; 

            /**
             * <p>The AccessKey ID of the current account.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI4G67HRBzNRmMhfyv****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>Indicates whether the SQL Explorer feature can be disabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder auditClosable(Boolean auditClosable) {
                this.auditClosable = auditClosable;
                return this;
            }

            /**
             * <p>Indicates whether the audit resources can be released.</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder auditReleasable(Boolean auditReleasable) {
                this.auditReleasable = auditReleasable;
                return this;
            }

            /**
             * <p>Indicates whether DSC has permission to access user resources within the current account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authed(Boolean authed) {
                this.authed = authed;
                return this;
            }

            /**
             * <p>The billing method of DCS that is purchased by using the current account. Valid values:</p>
             * <ul>
             * <li><strong>PREPAY</strong>: subscription</li>
             * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The permissions that the current account has. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The current account has the administrative permissions or read-only permissions on Data Security Center.</li>
             * <li><strong>1</strong>: The current account has the permissions to manage data domains.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataManagerRole(Integer dataManagerRole) {
                this.dataManagerRole = dataManagerRole;
                return this;
            }

            /**
             * <p>The ID of the data security center instance purchased by the main account.</p>
             * 
             * <strong>example:</strong>
             * <p>sddp-cn-****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of instances within the current account.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * <p>The total number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instanceTotalCount(Long instanceTotalCount) {
                this.instanceTotalCount = instanceTotalCount;
                return this;
            }

            /**
             * <p>Indicates whether the data security lab feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder labStatus(Integer labStatus) {
                this.labStatus = labStatus;
                return this;
            }

            /**
             * <p>OSS total storage capacity. Unit: Bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder ossTotalSize(Long ossTotalSize) {
                this.ossTotalSize = ossTotalSize;
                return this;
            }

            /**
             * <p>Accumulate the number of days to protect user assets.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder protectionDays(Integer protectionDays) {
                this.protectionDays = protectionDays;
                return this;
            }

            /**
             * <p>Indicates whether DSC is purchased. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder purchased(Boolean purchased) {
                this.purchased = purchased;
                return this;
            }

            /**
             * <p>The grace period between when DSC is expired and when DSC is released. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder releaseDays(Integer releaseDays) {
                this.releaseDays = releaseDays;
                return this;
            }

            /**
             * <p>The time when the audit resources are released. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>15000</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The remaining period for which the data assets within the current account can be protected by DSC.</p>
             * 
             * <strong>example:</strong>
             * <p>131</p>
             */
            public Builder remainDays(Integer remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            /**
             * <p>Indicates whether the current account uses a free trial of DSC. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder trail(Boolean trail) {
                this.trail = trail;
                return this;
            }

            /**
             * <p>Indicates whether the agent audit feature is used. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder useAgentAudit(Boolean useAgentAudit) {
                this.useAgentAudit = useAgentAudit;
                return this;
            }

            /**
             * <p>The number of instances that are used.</p>
             * 
             * <strong>example:</strong>
             * <p>125</p>
             */
            public Builder useInstanceNum(Integer useInstanceNum) {
                this.useInstanceNum = useInstanceNum;
                return this;
            }

            /**
             * <p>The occupied space of the Object Storage Service (OSS) bucket. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>234</p>
             */
            public Builder useOssSize(Long useOssSize) {
                this.useOssSize = useOssSize;
                return this;
            }

            public UserStatus build() {
                return new UserStatus(this);
            } 

        } 

    }
}
