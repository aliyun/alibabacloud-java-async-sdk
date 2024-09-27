// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CarbonEmissionElecSummaryItem} extends {@link TeaModel}
 *
 * <p>CarbonEmissionElecSummaryItem</p>
 */
public class CarbonEmissionElecSummaryItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("carbonEmissionData")
    private Double carbonEmissionData;

    @com.aliyun.core.annotation.NameInMap("dataUnit")
    private String dataUnit;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ratio")
    private Double ratio;

    @com.aliyun.core.annotation.NameInMap("rawData")
    private Double rawData;

    private CarbonEmissionElecSummaryItem(Builder builder) {
        this.carbonEmissionData = builder.carbonEmissionData;
        this.dataUnit = builder.dataUnit;
        this.name = builder.name;
        this.ratio = builder.ratio;
        this.rawData = builder.rawData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarbonEmissionElecSummaryItem create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder {
        private Double carbonEmissionData; 
        private String dataUnit; 
        private String name; 
        private Double ratio; 
        private Double rawData; 

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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
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

        public CarbonEmissionElecSummaryItem build() {
            return new CarbonEmissionElecSummaryItem(this);
        } 

    } 

}
