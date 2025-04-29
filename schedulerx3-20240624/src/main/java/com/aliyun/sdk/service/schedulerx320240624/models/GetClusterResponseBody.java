// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterResponseBody</p>
 */
public class GetClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetClusterResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetClusterResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private VSwitches(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterSpec")
        private String clusterSpec;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("InternetDomain")
        private String internetDomain;

        @com.aliyun.core.annotation.NameInMap("IntranetDomain")
        private String intranetDomain;

        @com.aliyun.core.annotation.NameInMap("JobNum")
        private Integer jobNum;

        @com.aliyun.core.annotation.NameInMap("KubeConfig")
        private String kubeConfig;

        @com.aliyun.core.annotation.NameInMap("MaxJobNum")
        private Integer maxJobNum;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private Integer productType;

        @com.aliyun.core.annotation.NameInMap("Spm")
        private Integer spm;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List<VSwitches> vSwitches;

        @com.aliyun.core.annotation.NameInMap("VersionLifecycle")
        private String versionLifecycle;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WorkerNum")
        private Integer workerNum;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<String> zones;

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterSpec = builder.clusterSpec;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.engineType = builder.engineType;
            this.engineVersion = builder.engineVersion;
            this.internetDomain = builder.internetDomain;
            this.intranetDomain = builder.intranetDomain;
            this.jobNum = builder.jobNum;
            this.kubeConfig = builder.kubeConfig;
            this.maxJobNum = builder.maxJobNum;
            this.productType = builder.productType;
            this.spm = builder.spm;
            this.status = builder.status;
            this.vSwitches = builder.vSwitches;
            this.versionLifecycle = builder.versionLifecycle;
            this.vpcId = builder.vpcId;
            this.workerNum = builder.workerNum;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return internetDomain
         */
        public String getInternetDomain() {
            return this.internetDomain;
        }

        /**
         * @return intranetDomain
         */
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        /**
         * @return jobNum
         */
        public Integer getJobNum() {
            return this.jobNum;
        }

        /**
         * @return kubeConfig
         */
        public String getKubeConfig() {
            return this.kubeConfig;
        }

        /**
         * @return maxJobNum
         */
        public Integer getMaxJobNum() {
            return this.maxJobNum;
        }

        /**
         * @return productType
         */
        public Integer getProductType() {
            return this.productType;
        }

        /**
         * @return spm
         */
        public Integer getSpm() {
            return this.spm;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vSwitches
         */
        public java.util.List<VSwitches> getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return versionLifecycle
         */
        public String getVersionLifecycle() {
            return this.versionLifecycle;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return workerNum
         */
        public Integer getWorkerNum() {
            return this.workerNum;
        }

        /**
         * @return zones
         */
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String chargeType; 
            private String clusterId; 
            private String clusterName; 
            private String clusterSpec; 
            private String createTime; 
            private String endTime; 
            private String engineType; 
            private String engineVersion; 
            private String internetDomain; 
            private String intranetDomain; 
            private Integer jobNum; 
            private String kubeConfig; 
            private Integer maxJobNum; 
            private Integer productType; 
            private Integer spm; 
            private Integer status; 
            private java.util.List<VSwitches> vSwitches; 
            private String versionLifecycle; 
            private String vpcId; 
            private Integer workerNum; 
            private java.util.List<String> zones; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chargeType = model.chargeType;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.clusterSpec = model.clusterSpec;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.engineType = model.engineType;
                this.engineVersion = model.engineVersion;
                this.internetDomain = model.internetDomain;
                this.intranetDomain = model.intranetDomain;
                this.jobNum = model.jobNum;
                this.kubeConfig = model.kubeConfig;
                this.maxJobNum = model.maxJobNum;
                this.productType = model.productType;
                this.spm = model.spm;
                this.status = model.status;
                this.vSwitches = model.vSwitches;
                this.versionLifecycle = model.versionLifecycle;
                this.vpcId = model.vpcId;
                this.workerNum = model.workerNum;
                this.zones = model.zones;
            } 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterSpec.
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * InternetDomain.
             */
            public Builder internetDomain(String internetDomain) {
                this.internetDomain = internetDomain;
                return this;
            }

            /**
             * IntranetDomain.
             */
            public Builder intranetDomain(String intranetDomain) {
                this.intranetDomain = intranetDomain;
                return this;
            }

            /**
             * JobNum.
             */
            public Builder jobNum(Integer jobNum) {
                this.jobNum = jobNum;
                return this;
            }

            /**
             * KubeConfig.
             */
            public Builder kubeConfig(String kubeConfig) {
                this.kubeConfig = kubeConfig;
                return this;
            }

            /**
             * MaxJobNum.
             */
            public Builder maxJobNum(Integer maxJobNum) {
                this.maxJobNum = maxJobNum;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(Integer productType) {
                this.productType = productType;
                return this;
            }

            /**
             * Spm.
             */
            public Builder spm(Integer spm) {
                this.spm = spm;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitches.
             */
            public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * VersionLifecycle.
             */
            public Builder versionLifecycle(String versionLifecycle) {
                this.versionLifecycle = versionLifecycle;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1fiz967u39lt8yuxcs0</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WorkerNum.
             */
            public Builder workerNum(Integer workerNum) {
                this.workerNum = workerNum;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(java.util.List<String> zones) {
                this.zones = zones;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
