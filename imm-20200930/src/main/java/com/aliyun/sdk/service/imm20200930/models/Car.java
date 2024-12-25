// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Car} extends {@link TeaModel}
 *
 * <p>Car</p>
 */
public class Car extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Boundary")
    private Boundary boundary;

    @com.aliyun.core.annotation.NameInMap("CarColor")
    private String carColor;

    @com.aliyun.core.annotation.NameInMap("CarColorConfidence")
    private Double carColorConfidence;

    @com.aliyun.core.annotation.NameInMap("CarType")
    private String carType;

    @com.aliyun.core.annotation.NameInMap("CarTypeConfidence")
    private Double carTypeConfidence;

    @com.aliyun.core.annotation.NameInMap("Confidence")
    private Double confidence;

    @com.aliyun.core.annotation.NameInMap("LicensePlates")
    private java.util.List<LicensePlate> licensePlates;

    private Car(Builder builder) {
        this.boundary = builder.boundary;
        this.carColor = builder.carColor;
        this.carColorConfidence = builder.carColorConfidence;
        this.carType = builder.carType;
        this.carTypeConfidence = builder.carTypeConfidence;
        this.confidence = builder.confidence;
        this.licensePlates = builder.licensePlates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Car create() {
        return builder().build();
    }

    /**
     * @return boundary
     */
    public Boundary getBoundary() {
        return this.boundary;
    }

    /**
     * @return carColor
     */
    public String getCarColor() {
        return this.carColor;
    }

    /**
     * @return carColorConfidence
     */
    public Double getCarColorConfidence() {
        return this.carColorConfidence;
    }

    /**
     * @return carType
     */
    public String getCarType() {
        return this.carType;
    }

    /**
     * @return carTypeConfidence
     */
    public Double getCarTypeConfidence() {
        return this.carTypeConfidence;
    }

    /**
     * @return confidence
     */
    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * @return licensePlates
     */
    public java.util.List<LicensePlate> getLicensePlates() {
        return this.licensePlates;
    }

    public static final class Builder {
        private Boundary boundary; 
        private String carColor; 
        private Double carColorConfidence; 
        private String carType; 
        private Double carTypeConfidence; 
        private Double confidence; 
        private java.util.List<LicensePlate> licensePlates; 

        /**
         * Boundary.
         */
        public Builder boundary(Boundary boundary) {
            this.boundary = boundary;
            return this;
        }

        /**
         * CarColor.
         */
        public Builder carColor(String carColor) {
            this.carColor = carColor;
            return this;
        }

        /**
         * CarColorConfidence.
         */
        public Builder carColorConfidence(Double carColorConfidence) {
            this.carColorConfidence = carColorConfidence;
            return this;
        }

        /**
         * CarType.
         */
        public Builder carType(String carType) {
            this.carType = carType;
            return this;
        }

        /**
         * CarTypeConfidence.
         */
        public Builder carTypeConfidence(Double carTypeConfidence) {
            this.carTypeConfidence = carTypeConfidence;
            return this;
        }

        /**
         * Confidence.
         */
        public Builder confidence(Double confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * LicensePlates.
         */
        public Builder licensePlates(java.util.List<LicensePlate> licensePlates) {
            this.licensePlates = licensePlates;
            return this;
        }

        public Car build() {
            return new Car(this);
        } 

    } 

}
