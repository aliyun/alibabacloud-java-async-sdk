// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("FeatureStoreInfo")
    private FeatureStoreInfo featureStoreInfo;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("OperatingTool")
    private OperatingTool operatingTool;

    @com.aliyun.core.annotation.NameInMap("RecommendCustomization")
    private RecommendCustomization recommendCustomization;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetInstanceResponseBody(Builder builder) {
        this.chargeType = builder.chargeType;
        this.commodityCode = builder.commodityCode;
        this.config = builder.config;
        this.expiredTime = builder.expiredTime;
        this.featureStoreInfo = builder.featureStoreInfo;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.instanceId = builder.instanceId;
        this.operatingTool = builder.operatingTool;
        this.recommendCustomization = builder.recommendCustomization;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return featureStoreInfo
     */
    public FeatureStoreInfo getFeatureStoreInfo() {
        return this.featureStoreInfo;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operatingTool
     */
    public OperatingTool getOperatingTool() {
        return this.operatingTool;
    }

    /**
     * @return recommendCustomization
     */
    public RecommendCustomization getRecommendCustomization() {
        return this.recommendCustomization;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String chargeType; 
        private String commodityCode; 
        private Config config; 
        private String expiredTime; 
        private FeatureStoreInfo featureStoreInfo; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String instanceId; 
        private OperatingTool operatingTool; 
        private RecommendCustomization recommendCustomization; 
        private String regionId; 
        private String requestId; 
        private String status; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetInstanceResponseBody model) {
            this.chargeType = model.chargeType;
            this.commodityCode = model.commodityCode;
            this.config = model.config;
            this.expiredTime = model.expiredTime;
            this.featureStoreInfo = model.featureStoreInfo;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.instanceId = model.instanceId;
            this.operatingTool = model.operatingTool;
            this.recommendCustomization = model.recommendCustomization;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.status = model.status;
            this.type = model.type;
        } 

        /**
         * <p>The billing type of the instance. Currently, only Subscription (prepayment) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The commodity code of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>airec_developers_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The instance configuration.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-14 00:00:00.0</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * FeatureStoreInfo.
         */
        public Builder featureStoreInfo(FeatureStoreInfo featureStoreInfo) {
            this.featureStoreInfo = featureStoreInfo;
            return this;
        }

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-13 17:34:52.0</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-05 09:02:30.0</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configuration of the operations tool.</p>
         */
        public Builder operatingTool(OperatingTool operatingTool) {
            this.operatingTool = operatingTool;
            return this;
        }

        /**
         * RecommendCustomization.
         */
        public Builder recommendCustomization(RecommendCustomization recommendCustomization) {
            this.recommendCustomization = recommendCustomization;
            return this;
        }

        /**
         * <p>The region ID. Valid values:</p>
         * <ul>
         * <li>cn-shenzhen: China (Shenzhen).</li>
         * <li>cn-hangzhou: China (Hangzhou).</li>
         * <li>cn-beijing: China (Beijing).</li>
         * <li>cn-shanghai: China (Shanghai).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>Initializing: The instance is being initialized.</li>
         * <li>Stopped: The instance is stopped.</li>
         * <li>Running: The instance is running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initializing</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li>basic: Basic Edition.</li>
         * <li>highleve: Upgraded Edition.</li>
         * <li>advance: Advanced Edition.</li>
         * <li>standard: Standard Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class DataManagements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.Map<String, ?> meta;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataManagements(Builder builder) {
            this.componentCode = builder.componentCode;
            this.meta = builder.meta;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataManagements create() {
            return builder().build();
        }

        /**
         * @return componentCode
         */
        public String getComponentCode() {
            return this.componentCode;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String componentCode; 
            private java.util.Map<String, ?> meta; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataManagements model) {
                this.componentCode = model.componentCode;
                this.meta = model.meta;
                this.type = model.type;
            } 

            /**
             * <p>The component code.</p>
             * 
             * <strong>example:</strong>
             * <p>storage</p>
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * <p>The metadata.</p>
             */
            public Builder meta(java.util.Map<String, ?> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The component type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataManagements build() {
                return new DataManagements(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Engines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.Map<String, ?> meta;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Engines(Builder builder) {
            this.componentCode = builder.componentCode;
            this.meta = builder.meta;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Engines create() {
            return builder().build();
        }

        /**
         * @return componentCode
         */
        public String getComponentCode() {
            return this.componentCode;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String componentCode; 
            private java.util.Map<String, ?> meta; 
            private String type; 

            private Builder() {
            } 

            private Builder(Engines model) {
                this.componentCode = model.componentCode;
                this.meta = model.meta;
                this.type = model.type;
            } 

            /**
             * <p>The component code.</p>
             * 
             * <strong>example:</strong>
             * <p>feature</p>
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * <p>The metadata.</p>
             */
            public Builder meta(java.util.Map<String, ?> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The component type.</p>
             * 
             * <strong>example:</strong>
             * <p>Hologres</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Engines build() {
                return new Engines(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Monitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.Map<String, ?> meta;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Monitors(Builder builder) {
            this.componentCode = builder.componentCode;
            this.meta = builder.meta;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Monitors create() {
            return builder().build();
        }

        /**
         * @return componentCode
         */
        public String getComponentCode() {
            return this.componentCode;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String componentCode; 
            private java.util.Map<String, ?> meta; 
            private String type; 

            private Builder() {
            } 

            private Builder(Monitors model) {
                this.componentCode = model.componentCode;
                this.meta = model.meta;
                this.type = model.type;
            } 

            /**
             * <p>The component code.</p>
             * 
             * <strong>example:</strong>
             * <p>featuresets</p>
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * <p>The metadata.</p>
             */
            public Builder meta(java.util.Map<String, ?> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The component type.</p>
             * 
             * <strong>example:</strong>
             * <p>Platform</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Monitors build() {
                return new Monitors(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataManagements")
        private java.util.List<DataManagements> dataManagements;

        @com.aliyun.core.annotation.NameInMap("Engines")
        private java.util.List<Engines> engines;

        @com.aliyun.core.annotation.NameInMap("Monitors")
        private java.util.List<Monitors> monitors;

        private Config(Builder builder) {
            this.dataManagements = builder.dataManagements;
            this.engines = builder.engines;
            this.monitors = builder.monitors;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return dataManagements
         */
        public java.util.List<DataManagements> getDataManagements() {
            return this.dataManagements;
        }

        /**
         * @return engines
         */
        public java.util.List<Engines> getEngines() {
            return this.engines;
        }

        /**
         * @return monitors
         */
        public java.util.List<Monitors> getMonitors() {
            return this.monitors;
        }

        public static final class Builder {
            private java.util.List<DataManagements> dataManagements; 
            private java.util.List<Engines> engines; 
            private java.util.List<Monitors> monitors; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.dataManagements = model.dataManagements;
                this.engines = model.engines;
                this.monitors = model.monitors;
            } 

            /**
             * <p>The list of modeling environments.</p>
             */
            public Builder dataManagements(java.util.List<DataManagements> dataManagements) {
                this.dataManagements = dataManagements;
                return this;
            }

            /**
             * <p>The list of service engines.</p>
             */
            public Builder engines(java.util.List<Engines> engines) {
                this.engines = engines;
                return this;
            }

            /**
             * <p>The list of supporting features.</p>
             */
            public Builder monitors(java.util.List<Monitors> monitors) {
                this.monitors = monitors;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class FeatureStoreInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureDBStatus")
        private String featureDBStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private FeatureStoreInfo(Builder builder) {
            this.featureDBStatus = builder.featureDBStatus;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureStoreInfo create() {
            return builder().build();
        }

        /**
         * @return featureDBStatus
         */
        public String getFeatureDBStatus() {
            return this.featureDBStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String featureDBStatus; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(FeatureStoreInfo model) {
                this.featureDBStatus = model.featureDBStatus;
                this.instanceId = model.instanceId;
            } 

            /**
             * FeatureDBStatus.
             */
            public Builder featureDBStatus(String featureDBStatus) {
                this.featureDBStatus = featureDBStatus;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pairec-test1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public FeatureStoreInfo build() {
                return new FeatureStoreInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class OperatingTool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEnable")
        private Boolean isEnable;

        private OperatingTool(Builder builder) {
            this.isEnable = builder.isEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatingTool create() {
            return builder().build();
        }

        /**
         * @return isEnable
         */
        public Boolean getIsEnable() {
            return this.isEnable;
        }

        public static final class Builder {
            private Boolean isEnable; 

            private Builder() {
            } 

            private Builder(OperatingTool model) {
                this.isEnable = model.isEnable;
            } 

            /**
             * <p>Indicates whether the operations tool is enabled for the instance. Valid values:</p>
             * <ul>
             * <li>True: Enabled.</li>
             * <li>False: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isEnable(Boolean isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            public OperatingTool build() {
                return new OperatingTool(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class RecommendCustomization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEnable")
        private Boolean isEnable;

        private RecommendCustomization(Builder builder) {
            this.isEnable = builder.isEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendCustomization create() {
            return builder().build();
        }

        /**
         * @return isEnable
         */
        public Boolean getIsEnable() {
            return this.isEnable;
        }

        public static final class Builder {
            private Boolean isEnable; 

            private Builder() {
            } 

            private Builder(RecommendCustomization model) {
                this.isEnable = model.isEnable;
            } 

            /**
             * <p>Indicates whether the operations tool is enabled for the instance. Valid values:</p>
             * <ul>
             * <li>True: Enabled.</li>
             * <li>False: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isEnable(Boolean isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            public RecommendCustomization build() {
                return new RecommendCustomization(this);
            } 

        } 

    }
}
