// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 
        private Integer totalCount; 

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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class DataManagements extends TeaModel {
        @NameInMap("ComponentCode")
        private String componentCode;

        @NameInMap("Meta")
        private java.util.Map < String, ? > meta;

        @NameInMap("Type")
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
        public java.util.Map < String, ? > getMeta() {
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
            private java.util.Map < String, ? > meta; 
            private String type; 

            /**
             * ComponentCode.
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * Meta.
             */
            public Builder meta(java.util.Map < String, ? > meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Type.
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
    public static class Engines extends TeaModel {
        @NameInMap("ComponentCode")
        private String componentCode;

        @NameInMap("Meta")
        private java.util.Map < String, ? > meta;

        @NameInMap("Type")
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
        public java.util.Map < String, ? > getMeta() {
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
            private java.util.Map < String, ? > meta; 
            private String type; 

            /**
             * ComponentCode.
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * Meta.
             */
            public Builder meta(java.util.Map < String, ? > meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Type.
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
    public static class Monitors extends TeaModel {
        @NameInMap("ComponentCode")
        private String componentCode;

        @NameInMap("Meta")
        private java.util.Map < String, ? > meta;

        @NameInMap("Type")
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
        public java.util.Map < String, ? > getMeta() {
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
            private java.util.Map < String, ? > meta; 
            private String type; 

            /**
             * ComponentCode.
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * Meta.
             */
            public Builder meta(java.util.Map < String, ? > meta) {
                this.meta = meta;
                return this;
            }

            /**
             * Type.
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
    public static class Config extends TeaModel {
        @NameInMap("DataManagements")
        private java.util.List < DataManagements> dataManagements;

        @NameInMap("Engines")
        private java.util.List < Engines> engines;

        @NameInMap("Monitors")
        private java.util.List < Monitors> monitors;

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
        public java.util.List < DataManagements> getDataManagements() {
            return this.dataManagements;
        }

        /**
         * @return engines
         */
        public java.util.List < Engines> getEngines() {
            return this.engines;
        }

        /**
         * @return monitors
         */
        public java.util.List < Monitors> getMonitors() {
            return this.monitors;
        }

        public static final class Builder {
            private java.util.List < DataManagements> dataManagements; 
            private java.util.List < Engines> engines; 
            private java.util.List < Monitors> monitors; 

            /**
             * DataManagements.
             */
            public Builder dataManagements(java.util.List < DataManagements> dataManagements) {
                this.dataManagements = dataManagements;
                return this;
            }

            /**
             * Engines.
             */
            public Builder engines(java.util.List < Engines> engines) {
                this.engines = engines;
                return this;
            }

            /**
             * Monitors.
             */
            public Builder monitors(java.util.List < Monitors> monitors) {
                this.monitors = monitors;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("Config")
        private Config config;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Instances(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.config = builder.config;
            this.expiredTime = builder.expiredTime;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceId = builder.instanceId;
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
            private String regionId; 
            private String status; 
            private String type; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
