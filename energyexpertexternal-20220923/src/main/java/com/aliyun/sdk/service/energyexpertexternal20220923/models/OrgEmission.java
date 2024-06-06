// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrgEmission} extends {@link TeaModel}
 *
 * <p>OrgEmission</p>
 */
public class OrgEmission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
    private Double carbonEmissionData;

    @com.aliyun.core.annotation.NameInMap("moduleEmissionList")
    private java.util.List < ModuleEmissionList> moduleEmissionList;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("nameKey")
    private String nameKey;

    @com.aliyun.core.annotation.NameInMap("ratio")
    private Double ratio;

    @com.aliyun.core.annotation.NameInMap("subEmissionItems")
    private java.util.List < OrgEmission > subEmissionItems;

    @com.aliyun.core.annotation.NameInMap("weightingCarbonEmissionData")
    private Double weightingCarbonEmissionData;

    @com.aliyun.core.annotation.NameInMap("weightingProportion")
    private Double weightingProportion;

    @com.aliyun.core.annotation.NameInMap("weightingRatio")
    private Double weightingRatio;

    private OrgEmission(Builder builder) {
        this.carbonEmissionData = builder.carbonEmissionData;
        this.moduleEmissionList = builder.moduleEmissionList;
        this.name = builder.name;
        this.nameKey = builder.nameKey;
        this.ratio = builder.ratio;
        this.subEmissionItems = builder.subEmissionItems;
        this.weightingCarbonEmissionData = builder.weightingCarbonEmissionData;
        this.weightingProportion = builder.weightingProportion;
        this.weightingRatio = builder.weightingRatio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrgEmission create() {
        return builder().build();
    }

    /**
     * @return carbonEmissionData
     */
    public Double getCarbonEmissionData() {
        return this.carbonEmissionData;
    }

    /**
     * @return moduleEmissionList
     */
    public java.util.List < ModuleEmissionList> getModuleEmissionList() {
        return this.moduleEmissionList;
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
     * @return subEmissionItems
     */
    public java.util.List < OrgEmission > getSubEmissionItems() {
        return this.subEmissionItems;
    }

    /**
     * @return weightingCarbonEmissionData
     */
    public Double getWeightingCarbonEmissionData() {
        return this.weightingCarbonEmissionData;
    }

    /**
     * @return weightingProportion
     */
    public Double getWeightingProportion() {
        return this.weightingProportion;
    }

    /**
     * @return weightingRatio
     */
    public Double getWeightingRatio() {
        return this.weightingRatio;
    }

    public static final class Builder {
        private Double carbonEmissionData; 
        private java.util.List < ModuleEmissionList> moduleEmissionList; 
        private String name; 
        private String nameKey; 
        private Double ratio; 
        private java.util.List < OrgEmission > subEmissionItems; 
        private Double weightingCarbonEmissionData; 
        private Double weightingProportion; 
        private Double weightingRatio; 

        /**
         * carbonEmissionData.
         */
        public Builder carbonEmissionData(Double carbonEmissionData) {
            this.carbonEmissionData = carbonEmissionData;
            return this;
        }

        /**
         * moduleEmissionList.
         */
        public Builder moduleEmissionList(java.util.List < ModuleEmissionList> moduleEmissionList) {
            this.moduleEmissionList = moduleEmissionList;
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
         * subEmissionItems.
         */
        public Builder subEmissionItems(java.util.List < OrgEmission > subEmissionItems) {
            this.subEmissionItems = subEmissionItems;
            return this;
        }

        /**
         * weightingCarbonEmissionData.
         */
        public Builder weightingCarbonEmissionData(Double weightingCarbonEmissionData) {
            this.weightingCarbonEmissionData = weightingCarbonEmissionData;
            return this;
        }

        /**
         * weightingProportion.
         */
        public Builder weightingProportion(Double weightingProportion) {
            this.weightingProportion = weightingProportion;
            return this;
        }

        /**
         * weightingRatio.
         */
        public Builder weightingRatio(Double weightingRatio) {
            this.weightingRatio = weightingRatio;
            return this;
        }

        public OrgEmission build() {
            return new OrgEmission(this);
        } 

    } 

    public static class ModuleEmissionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
        private Double carbonEmissionData;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("ratio")
        private Double ratio;

        private ModuleEmissionList(Builder builder) {
            this.carbonEmissionData = builder.carbonEmissionData;
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.ratio = builder.ratio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleEmissionList create() {
            return builder().build();
        }

        /**
         * @return carbonEmissionData
         */
        public Double getCarbonEmissionData() {
            return this.carbonEmissionData;
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

        public static final class Builder {
            private Double carbonEmissionData; 
            private String name; 
            private String nameKey; 
            private Double ratio; 

            /**
             * carbonEmissionData.
             */
            public Builder carbonEmissionData(Double carbonEmissionData) {
                this.carbonEmissionData = carbonEmissionData;
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

            public ModuleEmissionList build() {
                return new ModuleEmissionList(this);
            } 

        } 

    }
}
