// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRiskNumResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceRiskNumResponseBody</p>
 */
public class ListInstanceRiskNumResponseBody extends TeaModel {
    @NameInMap("InstanceRiskNum")
    private java.util.List < InstanceRiskNum> instanceRiskNum;

    @NameInMap("RequestId")
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
    public java.util.List < InstanceRiskNum> getInstanceRiskNum() {
        return this.instanceRiskNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceRiskNum> instanceRiskNum; 
        private String requestId; 

        /**
         * The information about the risks in the instance.
         */
        public Builder instanceRiskNum(java.util.List < InstanceRiskNum> instanceRiskNum) {
            this.instanceRiskNum = instanceRiskNum;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceRiskNumResponseBody build() {
            return new ListInstanceRiskNumResponseBody(this);
        } 

    } 

    public static class InstanceItem extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Uuid")
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
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The UUID of the instance.
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
    public static class RiskNumEntity extends TeaModel {
        @NameInMap("SuspiciousHighCount")
        private Integer suspiciousHighCount;

        @NameInMap("SuspiciousLowCount")
        private Integer suspiciousLowCount;

        @NameInMap("SuspiciousMediumCount")
        private Integer suspiciousMediumCount;

        @NameInMap("VulHighCount")
        private Integer vulHighCount;

        @NameInMap("VulLowCount")
        private Integer vulLowCount;

        @NameInMap("VulMediumCount")
        private Integer vulMediumCount;

        @NameInMap("WeakPassWordCount")
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
             * The number of high-risk alerts.
             */
            public Builder suspiciousHighCount(Integer suspiciousHighCount) {
                this.suspiciousHighCount = suspiciousHighCount;
                return this;
            }

            /**
             * The number of low-risk alerts.
             */
            public Builder suspiciousLowCount(Integer suspiciousLowCount) {
                this.suspiciousLowCount = suspiciousLowCount;
                return this;
            }

            /**
             * The number of medium-risk alerts.
             */
            public Builder suspiciousMediumCount(Integer suspiciousMediumCount) {
                this.suspiciousMediumCount = suspiciousMediumCount;
                return this;
            }

            /**
             * The number of high-risk vulnerabilities.
             */
            public Builder vulHighCount(Integer vulHighCount) {
                this.vulHighCount = vulHighCount;
                return this;
            }

            /**
             * The number of low-risk vulnerabilities.
             */
            public Builder vulLowCount(Integer vulLowCount) {
                this.vulLowCount = vulLowCount;
                return this;
            }

            /**
             * The number of medium-risk vulnerabilities.
             */
            public Builder vulMediumCount(Integer vulMediumCount) {
                this.vulMediumCount = vulMediumCount;
                return this;
            }

            /**
             * The number of weak passwords exposed on the Internet.
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
    public static class InstanceRiskNum extends TeaModel {
        @NameInMap("InstanceItem")
        private InstanceItem instanceItem;

        @NameInMap("RiskNumEntity")
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
             * The information about the instance.
             */
            public Builder instanceItem(InstanceItem instanceItem) {
                this.instanceItem = instanceItem;
                return this;
            }

            /**
             * The statistics about the risks.
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
