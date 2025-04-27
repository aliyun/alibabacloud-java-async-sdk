// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

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
 * {@link DataSubImagesKvInfoKvDetailsValue} extends {@link TeaModel}
 *
 * <p>DataSubImagesKvInfoKvDetailsValue</p>
 */
public class DataSubImagesKvInfoKvDetailsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.NameInMap("KeyConfidence")
    private Integer keyConfidence;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("ValueConfidence")
    private Integer valueConfidence;

    @com.aliyun.core.annotation.NameInMap("ValuePoints")
    private java.util.List<ValuePoints> valuePoints;

    @com.aliyun.core.annotation.NameInMap("ValueRect")
    private ValueRect valueRect;

    @com.aliyun.core.annotation.NameInMap("ValueAngle")
    private Integer valueAngle;

    private DataSubImagesKvInfoKvDetailsValue(Builder builder) {
        this.keyName = builder.keyName;
        this.keyConfidence = builder.keyConfidence;
        this.value = builder.value;
        this.valueConfidence = builder.valueConfidence;
        this.valuePoints = builder.valuePoints;
        this.valueRect = builder.valueRect;
        this.valueAngle = builder.valueAngle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSubImagesKvInfoKvDetailsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return keyConfidence
     */
    public Integer getKeyConfidence() {
        return this.keyConfidence;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueConfidence
     */
    public Integer getValueConfidence() {
        return this.valueConfidence;
    }

    /**
     * @return valuePoints
     */
    public java.util.List<ValuePoints> getValuePoints() {
        return this.valuePoints;
    }

    /**
     * @return valueRect
     */
    public ValueRect getValueRect() {
        return this.valueRect;
    }

    /**
     * @return valueAngle
     */
    public Integer getValueAngle() {
        return this.valueAngle;
    }

    public static final class Builder {
        private String keyName; 
        private Integer keyConfidence; 
        private String value; 
        private Integer valueConfidence; 
        private java.util.List<ValuePoints> valuePoints; 
        private ValueRect valueRect; 
        private Integer valueAngle; 

        private Builder() {
        } 

        private Builder(DataSubImagesKvInfoKvDetailsValue model) {
            this.keyName = model.keyName;
            this.keyConfidence = model.keyConfidence;
            this.value = model.value;
            this.valueConfidence = model.valueConfidence;
            this.valuePoints = model.valuePoints;
            this.valueRect = model.valueRect;
            this.valueAngle = model.valueAngle;
        } 

        /**
         * KeyName.
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            return this;
        }

        /**
         * KeyConfidence.
         */
        public Builder keyConfidence(Integer keyConfidence) {
            this.keyConfidence = keyConfidence;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * ValueConfidence.
         */
        public Builder valueConfidence(Integer valueConfidence) {
            this.valueConfidence = valueConfidence;
            return this;
        }

        /**
         * ValuePoints.
         */
        public Builder valuePoints(java.util.List<ValuePoints> valuePoints) {
            this.valuePoints = valuePoints;
            return this;
        }

        /**
         * ValueRect.
         */
        public Builder valueRect(ValueRect valueRect) {
            this.valueRect = valueRect;
            return this;
        }

        /**
         * ValueAngle.
         */
        public Builder valueAngle(Integer valueAngle) {
            this.valueAngle = valueAngle;
            return this;
        }

        public DataSubImagesKvInfoKvDetailsValue build() {
            return new DataSubImagesKvInfoKvDetailsValue(this);
        } 

    } 

    /**
     * 
     * {@link DataSubImagesKvInfoKvDetailsValue} extends {@link TeaModel}
     *
     * <p>DataSubImagesKvInfoKvDetailsValue</p>
     */
    public static class ValuePoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        private ValuePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValuePoints create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer x; 
            private Integer y; 

            private Builder() {
            } 

            private Builder(ValuePoints model) {
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public ValuePoints build() {
                return new ValuePoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataSubImagesKvInfoKvDetailsValue} extends {@link TeaModel}
     *
     * <p>DataSubImagesKvInfoKvDetailsValue</p>
     */
    public static class ValueRect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenterX")
        private Integer centerX;

        @com.aliyun.core.annotation.NameInMap("CenterY")
        private Integer centerY;

        @com.aliyun.core.annotation.NameInMap("Width")
        private Integer width;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        private ValueRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.width = builder.width;
            this.height = builder.height;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueRect create() {
            return builder().build();
        }

        /**
         * @return centerX
         */
        public Integer getCenterX() {
            return this.centerX;
        }

        /**
         * @return centerY
         */
        public Integer getCenterY() {
            return this.centerY;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        public static final class Builder {
            private Integer centerX; 
            private Integer centerY; 
            private Integer width; 
            private Integer height; 

            private Builder() {
            } 

            private Builder(ValueRect model) {
                this.centerX = model.centerX;
                this.centerY = model.centerY;
                this.width = model.width;
                this.height = model.height;
            } 

            /**
             * CenterX.
             */
            public Builder centerX(Integer centerX) {
                this.centerX = centerX;
                return this;
            }

            /**
             * CenterY.
             */
            public Builder centerY(Integer centerY) {
                this.centerY = centerY;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            public ValueRect build() {
                return new ValueRect(this);
            } 

        } 

    }
}
