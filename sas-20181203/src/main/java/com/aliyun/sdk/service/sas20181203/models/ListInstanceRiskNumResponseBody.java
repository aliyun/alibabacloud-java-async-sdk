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
 * {@link ListInstanceRiskNumResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceRiskNumResponseBody</p>
 */
public class ListInstanceRiskNumResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRiskNum")
    private java.util.List<InstanceRiskNum> instanceRiskNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstanceRiskNumResponseBody(Builder builder) {
        this.instanceRiskNum = builder.instanceRiskNum;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRiskNumResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceRiskNum
     */
    public java.util.List<InstanceRiskNum> getInstanceRiskNum() {
        return this.instanceRiskNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceRiskNum> instanceRiskNum; 
        private String requestId; 

        /**
         * <p>The information about the risks in the instance.</p>
         */
        public Builder instanceRiskNum(java.util.List<InstanceRiskNum> instanceRiskNum) {
            this.instanceRiskNum = instanceRiskNum;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>291B49F9-1685-4005-9D34-606B6F78****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceRiskNumResponseBody build() {
            return new ListInstanceRiskNumResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceRiskNumResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceRiskNumResponseBody</p>
     */
    public static class InstanceItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private InstanceItem(Builder builder) {
            this.instanceId = builder.instanceId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceItem create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String instanceId; 
            private String uuid; 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9fdluqx20mp2x7****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The UUID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>f2d6e901-1004-4ca8-9dae-53ec04a9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public InstanceItem build() {
                return new InstanceItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceRiskNumResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceRiskNumResponseBody</p>
     */
    public static class RiskNumEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SuspiciousHighCount")
        private Integer suspiciousHighCount;

        @com.aliyun.core.annotation.NameInMap("SuspiciousLowCount")
        private Integer suspiciousLowCount;

        @com.aliyun.core.annotation.NameInMap("SuspiciousMediumCount")
        private Integer suspiciousMediumCount;

        @com.aliyun.core.annotation.NameInMap("VulHighCount")
        private Integer vulHighCount;

        @com.aliyun.core.annotation.NameInMap("VulLowCount")
        private Integer vulLowCount;

        @com.aliyun.core.annotation.NameInMap("VulMediumCount")
        private Integer vulMediumCount;

        @com.aliyun.core.annotation.NameInMap("WeakPassWordCount")
        private Integer weakPassWordCount;

        private RiskNumEntity(Builder builder) {
            this.suspiciousHighCount = builder.suspiciousHighCount;
            this.suspiciousLowCount = builder.suspiciousLowCount;
            this.suspiciousMediumCount = builder.suspiciousMediumCount;
            this.vulHighCount = builder.vulHighCount;
            this.vulLowCount = builder.vulLowCount;
            this.vulMediumCount = builder.vulMediumCount;
            this.weakPassWordCount = builder.weakPassWordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskNumEntity create() {
            return builder().build();
        }

        /**
         * @return suspiciousHighCount
         */
        public Integer getSuspiciousHighCount() {
            return this.suspiciousHighCount;
        }

        /**
         * @return suspiciousLowCount
         */
        public Integer getSuspiciousLowCount() {
            return this.suspiciousLowCount;
        }

        /**
         * @return suspiciousMediumCount
         */
        public Integer getSuspiciousMediumCount() {
            return this.suspiciousMediumCount;
        }

        /**
         * @return vulHighCount
         */
        public Integer getVulHighCount() {
            return this.vulHighCount;
        }

        /**
         * @return vulLowCount
         */
        public Integer getVulLowCount() {
            return this.vulLowCount;
        }

        /**
         * @return vulMediumCount
         */
        public Integer getVulMediumCount() {
            return this.vulMediumCount;
        }

        /**
         * @return weakPassWordCount
         */
        public Integer getWeakPassWordCount() {
            return this.weakPassWordCount;
        }

        public static final class Builder {
            private Integer suspiciousHighCount; 
            private Integer suspiciousLowCount; 
            private Integer suspiciousMediumCount; 
            private Integer vulHighCount; 
            private Integer vulLowCount; 
            private Integer vulMediumCount; 
            private Integer weakPassWordCount; 

            /**
             * <p>The number of high-risk alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder suspiciousHighCount(Integer suspiciousHighCount) {
                this.suspiciousHighCount = suspiciousHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder suspiciousLowCount(Integer suspiciousLowCount) {
                this.suspiciousLowCount = suspiciousLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder suspiciousMediumCount(Integer suspiciousMediumCount) {
                this.suspiciousMediumCount = suspiciousMediumCount;
                return this;
            }

            /**
             * <p>The number of high-risk vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulHighCount(Integer vulHighCount) {
                this.vulHighCount = vulHighCount;
                return this;
            }

            /**
             * <p>The number of low-risk vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder vulLowCount(Integer vulLowCount) {
                this.vulLowCount = vulLowCount;
                return this;
            }

            /**
             * <p>The number of medium-risk vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder vulMediumCount(Integer vulMediumCount) {
                this.vulMediumCount = vulMediumCount;
                return this;
            }

            /**
             * <p>The number of weak passwords exposed on the Internet.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder weakPassWordCount(Integer weakPassWordCount) {
                this.weakPassWordCount = weakPassWordCount;
                return this;
            }

            public RiskNumEntity build() {
                return new RiskNumEntity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstanceRiskNumResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceRiskNumResponseBody</p>
     */
    public static class InstanceRiskNum extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceItem")
        private InstanceItem instanceItem;

        @com.aliyun.core.annotation.NameInMap("RiskNumEntity")
        private RiskNumEntity riskNumEntity;

        private InstanceRiskNum(Builder builder) {
            this.instanceItem = builder.instanceItem;
            this.riskNumEntity = builder.riskNumEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRiskNum create() {
            return builder().build();
        }

        /**
         * @return instanceItem
         */
        public InstanceItem getInstanceItem() {
            return this.instanceItem;
        }

        /**
         * @return riskNumEntity
         */
        public RiskNumEntity getRiskNumEntity() {
            return this.riskNumEntity;
        }

        public static final class Builder {
            private InstanceItem instanceItem; 
            private RiskNumEntity riskNumEntity; 

            /**
             * <p>The information about the instance.</p>
             */
            public Builder instanceItem(InstanceItem instanceItem) {
                this.instanceItem = instanceItem;
                return this;
            }

            /**
             * <p>The statistics about the risks.</p>
             */
            public Builder riskNumEntity(RiskNumEntity riskNumEntity) {
                this.riskNumEntity = riskNumEntity;
                return this;
            }

            public InstanceRiskNum build() {
                return new InstanceRiskNum(this);
            } 

        } 

    }
}
