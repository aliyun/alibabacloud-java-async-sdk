// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSubImagesFigureInfoValue} extends {@link TeaModel}
 *
 * <p>DataSubImagesFigureInfoValue</p>
 */
public class DataSubImagesFigureInfoValue extends TeaModel {
    @NameInMap("FigureCount")
    private Integer figureCount;

    @NameInMap("FigureDetails")
    private java.util.List < FigureDetails> figureDetails;

    private DataSubImagesFigureInfoValue(Builder builder) {
        this.figureCount = builder.figureCount;
        this.figureDetails = builder.figureDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSubImagesFigureInfoValue create() {
        return builder().build();
    }

    /**
     * @return figureCount
     */
    public Integer getFigureCount() {
        return this.figureCount;
    }

    /**
     * @return figureDetails
     */
    public java.util.List < FigureDetails> getFigureDetails() {
        return this.figureDetails;
    }

    public static final class Builder {
        private Integer figureCount; 
        private java.util.List < FigureDetails> figureDetails; 

        /**
         * FigureCount.
         */
        public Builder figureCount(Integer figureCount) {
            this.figureCount = figureCount;
            return this;
        }

        /**
         * FigureDetails.
         */
        public Builder figureDetails(java.util.List < FigureDetails> figureDetails) {
            this.figureDetails = figureDetails;
            return this;
        }

        public DataSubImagesFigureInfoValue build() {
            return new DataSubImagesFigureInfoValue(this);
        } 

    } 

    public static class FigurePoints extends TeaModel {
        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private FigurePoints(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FigurePoints create() {
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

            public FigurePoints build() {
                return new FigurePoints(this);
            } 

        } 

    }
    public static class FigureRect extends TeaModel {
        @NameInMap("CenterX")
        private Integer centerX;

        @NameInMap("CenterY")
        private Integer centerY;

        @NameInMap("Width")
        private Integer width;

        @NameInMap("Height")
        private Integer height;

        private FigureRect(Builder builder) {
            this.centerX = builder.centerX;
            this.centerY = builder.centerY;
            this.width = builder.width;
            this.height = builder.height;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FigureRect create() {
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

            public FigureRect build() {
                return new FigureRect(this);
            } 

        } 

    }
    public static class FigureDetails extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Data")
        private Object data;

        @NameInMap("FigurePoints")
        private java.util.List < FigurePoints> figurePoints;

        @NameInMap("FigureRect")
        private FigureRect figureRect;

        @NameInMap("FigureAngle")
        private Integer figureAngle;

        private FigureDetails(Builder builder) {
            this.type = builder.type;
            this.data = builder.data;
            this.figurePoints = builder.figurePoints;
            this.figureRect = builder.figureRect;
            this.figureAngle = builder.figureAngle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FigureDetails create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return figurePoints
         */
        public java.util.List < FigurePoints> getFigurePoints() {
            return this.figurePoints;
        }

        /**
         * @return figureRect
         */
        public FigureRect getFigureRect() {
            return this.figureRect;
        }

        /**
         * @return figureAngle
         */
        public Integer getFigureAngle() {
            return this.figureAngle;
        }

        public static final class Builder {
            private String type; 
            private Object data; 
            private java.util.List < FigurePoints> figurePoints; 
            private FigureRect figureRect; 
            private Integer figureAngle; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * FigurePoints.
             */
            public Builder figurePoints(java.util.List < FigurePoints> figurePoints) {
                this.figurePoints = figurePoints;
                return this;
            }

            /**
             * FigureRect.
             */
            public Builder figureRect(FigureRect figureRect) {
                this.figureRect = figureRect;
                return this;
            }

            /**
             * FigureAngle.
             */
            public Builder figureAngle(Integer figureAngle) {
                this.figureAngle = figureAngle;
                return this;
            }

            public FigureDetails build() {
                return new FigureDetails(this);
            } 

        } 

    }
}
