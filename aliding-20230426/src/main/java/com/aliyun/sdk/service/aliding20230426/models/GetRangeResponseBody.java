// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRangeResponseBody} extends {@link TeaModel}
 *
 * <p>GetRangeResponseBody</p>
 */
public class GetRangeResponseBody extends TeaModel {
    @NameInMap("backgroundColors")
    private java.util.List < java.util.List < BackgroundColors> > backgroundColors;

    @NameInMap("displayValues")
    private java.util.List < java.util.List < String > > displayValues;

    @NameInMap("formulas")
    private java.util.List < java.util.List < String > > formulas;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("values")
    private java.util.List < java.util.List < ? > > values;

    private GetRangeResponseBody(Builder builder) {
        this.backgroundColors = builder.backgroundColors;
        this.displayValues = builder.displayValues;
        this.formulas = builder.formulas;
        this.requestId = builder.requestId;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRangeResponseBody create() {
        return builder().build();
    }

    /**
     * @return backgroundColors
     */
    public java.util.List < java.util.List < BackgroundColors> > getBackgroundColors() {
        return this.backgroundColors;
    }

    /**
     * @return displayValues
     */
    public java.util.List < java.util.List < String > > getDisplayValues() {
        return this.displayValues;
    }

    /**
     * @return formulas
     */
    public java.util.List < java.util.List < String > > getFormulas() {
        return this.formulas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return values
     */
    public java.util.List < java.util.List < ? > > getValues() {
        return this.values;
    }

    public static final class Builder {
        private java.util.List < java.util.List < BackgroundColors> > backgroundColors; 
        private java.util.List < java.util.List < String > > displayValues; 
        private java.util.List < java.util.List < String > > formulas; 
        private String requestId; 
        private java.util.List < java.util.List < ? > > values; 

        /**
         * backgroundColors.
         */
        public Builder backgroundColors(java.util.List < java.util.List < BackgroundColors> > backgroundColors) {
            this.backgroundColors = backgroundColors;
            return this;
        }

        /**
         * displayValues.
         */
        public Builder displayValues(java.util.List < java.util.List < String > > displayValues) {
            this.displayValues = displayValues;
            return this;
        }

        /**
         * formulas.
         */
        public Builder formulas(java.util.List < java.util.List < String > > formulas) {
            this.formulas = formulas;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * values.
         */
        public Builder values(java.util.List < java.util.List < ? > > values) {
            this.values = values;
            return this;
        }

        public GetRangeResponseBody build() {
            return new GetRangeResponseBody(this);
        } 

    } 

    public static class BackgroundColors extends TeaModel {
        @NameInMap("Red")
        private Integer red;

        @NameInMap("Green")
        private Integer green;

        @NameInMap("Blue")
        private Integer blue;

        @NameInMap("HexString")
        private String hexString;

        private BackgroundColors(Builder builder) {
            this.red = builder.red;
            this.green = builder.green;
            this.blue = builder.blue;
            this.hexString = builder.hexString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackgroundColors create() {
            return builder().build();
        }

        /**
         * @return red
         */
        public Integer getRed() {
            return this.red;
        }

        /**
         * @return green
         */
        public Integer getGreen() {
            return this.green;
        }

        /**
         * @return blue
         */
        public Integer getBlue() {
            return this.blue;
        }

        /**
         * @return hexString
         */
        public String getHexString() {
            return this.hexString;
        }

        public static final class Builder {
            private Integer red; 
            private Integer green; 
            private Integer blue; 
            private String hexString; 

            /**
             * red
             */
            public Builder red(Integer red) {
                this.red = red;
                return this;
            }

            /**
             * green
             */
            public Builder green(Integer green) {
                this.green = green;
                return this;
            }

            /**
             * blue
             */
            public Builder blue(Integer blue) {
                this.blue = blue;
                return this;
            }

            /**
             * hexString
             */
            public Builder hexString(String hexString) {
                this.hexString = hexString;
                return this;
            }

            public BackgroundColors build() {
                return new BackgroundColors(this);
            } 

        } 

    }
}
