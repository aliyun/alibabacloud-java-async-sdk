// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DebtStatus")
        private Integer debtStatus;

        @NameInMap("Edition")
        private Integer edition;

        @NameInMap("Enabled")
        private Integer enabled;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpMode")
        private String ipMode;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("IsFirstOpenBw")
        private Long isFirstOpenBw;

        @NameInMap("IsFirstOpenQps")
        private Long isFirstOpenQps;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Integer status;

        private Instances(Builder builder) {
            this.createTime = builder.createTime;
            this.debtStatus = builder.debtStatus;
            this.edition = builder.edition;
            this.enabled = builder.enabled;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.isFirstOpenBw = builder.isFirstOpenBw;
            this.isFirstOpenQps = builder.isFirstOpenQps;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return debtStatus
         */
        public Integer getDebtStatus() {
            return this.debtStatus;
        }

        /**
         * @return edition
         */
        public Integer getEdition() {
            return this.edition;
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return isFirstOpenBw
         */
        public Long getIsFirstOpenBw() {
            return this.isFirstOpenBw;
        }

        /**
         * @return isFirstOpenQps
         */
        public Long getIsFirstOpenQps() {
            return this.isFirstOpenQps;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createTime; 
            private Integer debtStatus; 
            private Integer edition; 
            private Integer enabled; 
            private Long expireTime; 
            private String instanceId; 
            private String ipMode; 
            private String ipVersion; 
            private Long isFirstOpenBw; 
            private Long isFirstOpenQps; 
            private String remark; 
            private Integer status; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DebtStatus.
             */
            public Builder debtStatus(Integer debtStatus) {
                this.debtStatus = debtStatus;
                return this;
            }

            /**
             * Edition.
             */
            public Builder edition(Integer edition) {
                this.edition = edition;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IpMode.
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * IsFirstOpenBw.
             */
            public Builder isFirstOpenBw(Long isFirstOpenBw) {
                this.isFirstOpenBw = isFirstOpenBw;
                return this;
            }

            /**
             * IsFirstOpenQps.
             */
            public Builder isFirstOpenQps(Long isFirstOpenQps) {
                this.isFirstOpenQps = isFirstOpenQps;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
