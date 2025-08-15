// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeLogBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupPolicyResponseBody</p>
 */
public class DescribeLogBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdvancedLogPolicies")
    private AdvancedLogPolicies advancedLogPolicies;

    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private Integer enableBackupLog;

    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRegion")
    private String logBackupAnotherRegionRegion;

    @com.aliyun.core.annotation.NameInMap("LogBackupAnotherRegionRetentionPeriod")
    private String logBackupAnotherRegionRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private Integer logBackupRetentionPeriod;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogBackupPolicyResponseBody(Builder builder) {
        this.advancedLogPolicies = builder.advancedLogPolicies;
        this.enableBackupLog = builder.enableBackupLog;
        this.logBackupAnotherRegionRegion = builder.logBackupAnotherRegionRegion;
        this.logBackupAnotherRegionRetentionPeriod = builder.logBackupAnotherRegionRetentionPeriod;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogBackupPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedLogPolicies
     */
    public AdvancedLogPolicies getAdvancedLogPolicies() {
        return this.advancedLogPolicies;
    }

    /**
     * @return enableBackupLog
     */
    public Integer getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return logBackupAnotherRegionRegion
     */
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    /**
     * @return logBackupAnotherRegionRetentionPeriod
     */
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public Integer getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AdvancedLogPolicies advancedLogPolicies; 
        private Integer enableBackupLog; 
        private String logBackupAnotherRegionRegion; 
        private String logBackupAnotherRegionRetentionPeriod; 
        private Integer logBackupRetentionPeriod; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLogBackupPolicyResponseBody model) {
            this.advancedLogPolicies = model.advancedLogPolicies;
            this.enableBackupLog = model.enableBackupLog;
            this.logBackupAnotherRegionRegion = model.logBackupAnotherRegionRegion;
            this.logBackupAnotherRegionRetentionPeriod = model.logBackupAnotherRegionRetentionPeriod;
            this.logBackupRetentionPeriod = model.logBackupRetentionPeriod;
            this.requestId = model.requestId;
        } 

        /**
         * AdvancedLogPolicies.
         */
        public Builder advancedLogPolicies(AdvancedLogPolicies advancedLogPolicies) {
            this.advancedLogPolicies = advancedLogPolicies;
            return this;
        }

        /**
         * <p>Indicates whether the log backup feature is enabled. Valid values:</p>
         * <ul>
         * <li>0: The log backup feature is disabled.</li>
         * <li>1: The log backup feature is enabled. By default, the log backup feature is enabled and cannot be disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enableBackupLog(Integer enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * <p>The region in which you want to store cross-region log backups. For more information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder logBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
            this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
            return this;
        }

        /**
         * <p>The retention period of cross-region log backups. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The cross-region backup feature is disabled.</li>
         * <li><strong>30 to 7300</strong>: Cross-region log backups are retained for 30 to 7,300 days.</li>
         * <li><strong>-1</strong>: The log backups are permanently retained.</li>
         * </ul>
         * <blockquote>
         * <p> When you create a cluster, the default value of this parameter is <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder logBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
            this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * <p>The retention period of the log backups. Valid values:</p>
         * <ul>
         * <li>3 to 7300: The log backups are retained for 3 to 7,300 days.</li>
         * <li>-1: The log backups are permanently retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder logBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62EE0051-102B-488D-9C79-D607B8******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogBackupPolicyResponseBody build() {
            return new DescribeLogBackupPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogBackupPolicyResponseBody</p>
     */
    public static class AdvancedLogPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("DestType")
        private String destType;

        @com.aliyun.core.annotation.NameInMap("EnableLogBackup")
        private Integer enableLogBackup;

        @com.aliyun.core.annotation.NameInMap("LogRetentionType")
        private String logRetentionType;

        @com.aliyun.core.annotation.NameInMap("LogRetentionValue")
        private String logRetentionValue;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("SrcRegion")
        private String srcRegion;

        @com.aliyun.core.annotation.NameInMap("SrcType")
        private String srcType;

        private AdvancedLogPolicy(Builder builder) {
            this.destRegion = builder.destRegion;
            this.destType = builder.destType;
            this.enableLogBackup = builder.enableLogBackup;
            this.logRetentionType = builder.logRetentionType;
            this.logRetentionValue = builder.logRetentionValue;
            this.policyId = builder.policyId;
            this.srcRegion = builder.srcRegion;
            this.srcType = builder.srcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedLogPolicy create() {
            return builder().build();
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destType
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * @return enableLogBackup
         */
        public Integer getEnableLogBackup() {
            return this.enableLogBackup;
        }

        /**
         * @return logRetentionType
         */
        public String getLogRetentionType() {
            return this.logRetentionType;
        }

        /**
         * @return logRetentionValue
         */
        public String getLogRetentionValue() {
            return this.logRetentionValue;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return srcRegion
         */
        public String getSrcRegion() {
            return this.srcRegion;
        }

        /**
         * @return srcType
         */
        public String getSrcType() {
            return this.srcType;
        }

        public static final class Builder {
            private String destRegion; 
            private String destType; 
            private Integer enableLogBackup; 
            private String logRetentionType; 
            private String logRetentionValue; 
            private String policyId; 
            private String srcRegion; 
            private String srcType; 

            private Builder() {
            } 

            private Builder(AdvancedLogPolicy model) {
                this.destRegion = model.destRegion;
                this.destType = model.destType;
                this.enableLogBackup = model.enableLogBackup;
                this.logRetentionType = model.logRetentionType;
                this.logRetentionValue = model.logRetentionValue;
                this.policyId = model.policyId;
                this.srcRegion = model.srcRegion;
                this.srcType = model.srcType;
            } 

            /**
             * DestRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * DestType.
             */
            public Builder destType(String destType) {
                this.destType = destType;
                return this;
            }

            /**
             * EnableLogBackup.
             */
            public Builder enableLogBackup(Integer enableLogBackup) {
                this.enableLogBackup = enableLogBackup;
                return this;
            }

            /**
             * LogRetentionType.
             */
            public Builder logRetentionType(String logRetentionType) {
                this.logRetentionType = logRetentionType;
                return this;
            }

            /**
             * LogRetentionValue.
             */
            public Builder logRetentionValue(String logRetentionValue) {
                this.logRetentionValue = logRetentionValue;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * SrcRegion.
             */
            public Builder srcRegion(String srcRegion) {
                this.srcRegion = srcRegion;
                return this;
            }

            /**
             * SrcType.
             */
            public Builder srcType(String srcType) {
                this.srcType = srcType;
                return this;
            }

            public AdvancedLogPolicy build() {
                return new AdvancedLogPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogBackupPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogBackupPolicyResponseBody</p>
     */
    public static class AdvancedLogPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedLogPolicy")
        private java.util.List<AdvancedLogPolicy> advancedLogPolicy;

        private AdvancedLogPolicies(Builder builder) {
            this.advancedLogPolicy = builder.advancedLogPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedLogPolicies create() {
            return builder().build();
        }

        /**
         * @return advancedLogPolicy
         */
        public java.util.List<AdvancedLogPolicy> getAdvancedLogPolicy() {
            return this.advancedLogPolicy;
        }

        public static final class Builder {
            private java.util.List<AdvancedLogPolicy> advancedLogPolicy; 

            private Builder() {
            } 

            private Builder(AdvancedLogPolicies model) {
                this.advancedLogPolicy = model.advancedLogPolicy;
            } 

            /**
             * AdvancedLogPolicy.
             */
            public Builder advancedLogPolicy(java.util.List<AdvancedLogPolicy> advancedLogPolicy) {
                this.advancedLogPolicy = advancedLogPolicy;
                return this;
            }

            public AdvancedLogPolicies build() {
                return new AdvancedLogPolicies(this);
            } 

        } 

    }
}
