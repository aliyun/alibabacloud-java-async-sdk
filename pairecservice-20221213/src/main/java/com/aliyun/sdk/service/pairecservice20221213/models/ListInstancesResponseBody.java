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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListInstancesResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BDB621CB-A81E-5D39-8793-39A365CBCC74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned instances.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
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
             * <p>The metadata of the component.</p>
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
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
             * <p>The metadata of the component.</p>
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
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
             * <p>The metadata of the component.</p>
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
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
             * <p>A list of data management configurations.</p>
             */
            public Builder dataManagements(java.util.List<DataManagements> dataManagements) {
                this.dataManagements = dataManagements;
                return this;
            }

            /**
             * <p>A list of service engines.</p>
             */
            public Builder engines(java.util.List<Engines> engines) {
                this.engines = engines;
                return this;
            }

            /**
             * <p>A list of monitoring components.</p>
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
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
             * <p>Specifies whether the operating tool is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><p><code>true</code>: The tool is enabled.</p>
             * </li>
             * <li><p><code>false</code>: The tool is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OperatingTool")
        private OperatingTool operatingTool;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Instances(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.config = builder.config;
            this.expiredTime = builder.expiredTime;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceId = builder.instanceId;
            this.operatingTool = builder.operatingTool;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String instanceId; 
            private OperatingTool operatingTool; 
            private String regionId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.config = model.config;
                this.expiredTime = model.expiredTime;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.instanceId = model.instanceId;
                this.operatingTool = model.operatingTool;
                this.regionId = model.regionId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The billing method of the instance. Only <code>Subscription</code> (prepaid) is supported.</p>
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
             * <p>The time when the instance was last modified.</p>
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
             * <p>The configuration of the operating tool.</p>
             */
            public Builder operatingTool(OperatingTool operatingTool) {
                this.operatingTool = operatingTool;
                return this;
            }

            /**
             * <p>The region ID. Valid values:</p>
             * <ul>
             * <li><p><code>cn-shenzhen</code>: China (Shenzhen)</p>
             * </li>
             * <li><p><code>cn-hangzhou</code>: China (Hangzhou)</p>
             * </li>
             * <li><p><code>cn-beijing</code>: China (Beijing)</p>
             * </li>
             * <li><p><code>cn-shanghai</code>: China (Shanghai)</p>
             * </li>
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
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li><p><code>Initializing</code>: The instance is initializing.</p>
             * </li>
             * <li><p><code>Stopped</code>: The instance is stopped.</p>
             * </li>
             * <li><p><code>Running</code>: The instance is running.</p>
             * </li>
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
             * <li><p><code>basic</code>: Basic Edition</p>
             * </li>
             * <li><p><code>high-level</code>: High-level Edition</p>
             * </li>
             * <li><p><code>advanced</code>: Advanced Edition</p>
             * </li>
             * <li><p><code>standard</code>: Standard Edition</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
