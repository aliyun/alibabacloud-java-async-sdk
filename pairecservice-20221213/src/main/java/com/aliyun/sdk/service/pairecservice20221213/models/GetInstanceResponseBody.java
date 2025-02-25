// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.instanceId = builder.instanceId;
        this.operatingTool = builder.operatingTool;
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
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String instanceId; 
        private OperatingTool operatingTool; 
        private String regionId; 
        private String requestId; 
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
         * OperatingTool.
         */
        public Builder operatingTool(OperatingTool operatingTool) {
            this.operatingTool = operatingTool;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class DataManagements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.Map < String, ? > meta;

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
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.Map < String, ? > meta;

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
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.Map < String, ? > meta;

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
        @com.aliyun.core.annotation.NameInMap("DataManagements")
        private java.util.List < DataManagements> dataManagements;

        @com.aliyun.core.annotation.NameInMap("Engines")
        private java.util.List < Engines> engines;

        @com.aliyun.core.annotation.NameInMap("Monitors")
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

            /**
             * IsEnable.
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
}
