// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ConstituteItem} extends {@link TeaModel}
 *
 * <p>ConstituteItem</p>
 */
public class ConstituteItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
    private Double carbonEmissionData;

    @com.aliyun.core.annotation.NameInMap("dataUnit")
    private String dataUnit;

    @com.aliyun.core.annotation.NameInMap("emissionSource")
    private String emissionSource;

    @com.aliyun.core.annotation.NameInMap("emissionSourceKey")
    private String emissionSourceKey;

    @com.aliyun.core.annotation.NameInMap("enterpriseName")
    private String enterpriseName;

    @com.aliyun.core.annotation.NameInMap("envGasEmissions")
    private java.util.List<EnvGasEmissions> envGasEmissions;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("nameKey")
    private String nameKey;

    @com.aliyun.core.annotation.NameInMap("ratio")
    private Double ratio;

    @com.aliyun.core.annotation.NameInMap("rawData")
    private Double rawData;

    @com.aliyun.core.annotation.NameInMap("subConstituteItems")
    private java.util.List<ConstituteItem> subConstituteItems;

    private ConstituteItem(Builder builder) {
        this.carbonEmissionData = builder.carbonEmissionData;
        this.dataUnit = builder.dataUnit;
        this.emissionSource = builder.emissionSource;
        this.emissionSourceKey = builder.emissionSourceKey;
        this.enterpriseName = builder.enterpriseName;
        this.envGasEmissions = builder.envGasEmissions;
        this.name = builder.name;
        this.nameKey = builder.nameKey;
        this.ratio = builder.ratio;
        this.rawData = builder.rawData;
        this.subConstituteItems = builder.subConstituteItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConstituteItem create() {
        return builder().build();
    }

    /**
     * @return carbonEmissionData
     */
    public Double getCarbonEmissionData() {
        return this.carbonEmissionData;
    }

    /**
     * @return dataUnit
     */
    public String getDataUnit() {
        return this.dataUnit;
    }

    /**
     * @return emissionSource
     */
    public String getEmissionSource() {
        return this.emissionSource;
    }

    /**
     * @return emissionSourceKey
     */
    public String getEmissionSourceKey() {
        return this.emissionSourceKey;
    }

    /**
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    /**
     * @return envGasEmissions
     */
    public java.util.List<EnvGasEmissions> getEnvGasEmissions() {
        return this.envGasEmissions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nameKey
     */
    public String getNameKey() {
        return this.nameKey;
    }

    /**
     * @return ratio
     */
    public Double getRatio() {
        return this.ratio;
    }

    /**
     * @return rawData
     */
    public Double getRawData() {
        return this.rawData;
    }

    /**
     * @return subConstituteItems
     */
    public java.util.List<ConstituteItem> getSubConstituteItems() {
        return this.subConstituteItems;
    }

    public static final class Builder {
        private Double carbonEmissionData; 
        private String dataUnit; 
        private String emissionSource; 
        private String emissionSourceKey; 
        private String enterpriseName; 
        private java.util.List<EnvGasEmissions> envGasEmissions; 
        private String name; 
        private String nameKey; 
        private Double ratio; 
        private Double rawData; 
        private java.util.List<ConstituteItem> subConstituteItems; 

        /**
         * carbonEmissionData.
         */
        public Builder carbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }

        /**
         * dataUnit.
         */
        public Builder dataUnit(String dataUnit) {
            this.dataUnit = dataUnit;
            return this;
        }

        /**
         * emissionSource.
         */
        public Builder emissionSource(String emissionSource) {
            this.emissionSource = emissionSource;
            return this;
        }

        /**
         * emissionSourceKey.
         */
        public Builder emissionSourceKey(String emissionSourceKey) {
            this.emissionSourceKey = emissionSourceKey;
            return this;
        }

        /**
         * enterpriseName.
         */
        public Builder enterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }

        /**
         * envGasEmissions.
         */
        public Builder envGasEmissions(java.util.List<EnvGasEmissions> envGasEmissions) {
            this.envGasEmissions = envGasEmissions;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * nameKey.
         */
        public Builder nameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }

        /**
         * ratio.
         */
        public Builder ratio(Double ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * rawData.
         */
        public Builder rawData(Double rawData) {
            this.rawData = rawData;
            return this;
        }

        /**
         * subConstituteItems.
         */
        public Builder subConstituteItems(java.util.List<ConstituteItem> subConstituteItems) {
            this.subConstituteItems = subConstituteItems;
            return this;
        }

        public ConstituteItem build() {
            return new ConstituteItem(this);
        } 

    } 

    /**
     * 
     * {@link ConstituteItem} extends {@link TeaModel}
     *
     * <p>ConstituteItem</p>
     */
    public static class EnvGasEmissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("gasEmissionData")
        private Double gasEmissionData;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private EnvGasEmissions(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.gasEmissionData = builder.gasEmissionData;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvGasEmissions create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
        }

        /**
         * @return gasEmissionData
         */
        public Double getGasEmissionData() {
            return this.gasEmissionData;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double carbonEmissionData; 
            private Double gasEmissionData; 
            private String name; 
            private String type; 

            /**
             * carbonEmissionData.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
                return this;
            }

            /**
             * gasEmissionData.
             */
            public Builder gasEmissionData(Double gasEmissionData) {
                this.gasEmissionData = gasEmissionData;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EnvGasEmissions build() {
                return new EnvGasEmissions(this);
            } 

        } 

    }
}
