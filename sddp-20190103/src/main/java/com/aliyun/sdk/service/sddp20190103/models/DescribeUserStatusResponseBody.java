// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the current account.
         */
        public Builder userStatus(UserStatus userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public DescribeUserStatusResponseBody build() {
            return new DescribeUserStatusResponseBody(this);
        } 

    } 

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
             * The AccessKey ID of the current account.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * Indicates whether the SQL Explorer feature can be disabled. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder auditClosable(Boolean auditClosable) {
                this.auditClosable = auditClosable;
                return this;
            }

            /**
             * Indicates whether the audit resources can be released.
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder auditReleasable(Boolean auditReleasable) {
                this.auditReleasable = auditReleasable;
                return this;
            }

            /**
             * Indicates whether DSC has permission to access user resources within the current account. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder authed(Boolean authed) {
                this.authed = authed;
                return this;
            }

            /**
             * The billing method of DCS that is purchased by using the current account. Valid values:
             * <p>
             * 
             * *   **PREPAY**: subscription
             * *   **POSTPAY**: pay-as-you-go
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The permissions that the current account has. Valid values:
             * <p>
             * 
             * *   **0**: The current account has the administrative permissions or read-only permissions on Data Security Center.
             * *   **1**: The current account has the permissions to manage data domains.
             */
            public Builder dataManagerRole(Integer dataManagerRole) {
                this.dataManagerRole = dataManagerRole;
                return this;
            }

            /**
             * The ID of the data security center instance purchased by the main account.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of instances within the current account.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * The total number of instances.
             */
            public Builder instanceTotalCount(Long instanceTotalCount) {
                this.instanceTotalCount = instanceTotalCount;
                return this;
            }

            /**
             * Indicates whether the data security lab feature is enabled. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder labStatus(Integer labStatus) {
                this.labStatus = labStatus;
                return this;
            }

            /**
             * OSS total storage capacity. Unit: Bytes.
             */
            public Builder ossTotalSize(Long ossTotalSize) {
                this.ossTotalSize = ossTotalSize;
                return this;
            }

            /**
             * Accumulate the number of days to protect user assets.
             */
            public Builder protectionDays(Integer protectionDays) {
                this.protectionDays = protectionDays;
                return this;
            }

            /**
             * Indicates whether DSC is purchased. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder purchased(Boolean purchased) {
                this.purchased = purchased;
                return this;
            }

            /**
             * The grace period between when DSC is expired and when DSC is released. Unit: days.
             */
            public Builder releaseDays(Integer releaseDays) {
                this.releaseDays = releaseDays;
                return this;
            }

            /**
             * The time when the audit resources are released. Unit: milliseconds.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The remaining period for which the data assets within the current account can be protected by DSC.
             */
            public Builder remainDays(Integer remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            /**
             * Indicates whether the current account uses a free trial of DSC. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder trail(Boolean trail) {
                this.trail = trail;
                return this;
            }

            /**
             * Indicates whether the agent audit feature is used. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder useAgentAudit(Boolean useAgentAudit) {
                this.useAgentAudit = useAgentAudit;
                return this;
            }

            /**
             * The number of instances that are used.
             */
            public Builder useInstanceNum(Integer useInstanceNum) {
                this.useInstanceNum = useInstanceNum;
                return this;
            }

            /**
             * The occupied space of the Object Storage Service (OSS) bucket. Unit: bytes.
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
