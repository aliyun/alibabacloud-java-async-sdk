// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetRangeResponseBody} extends {@link TeaModel}
 *
 * <p>GetRangeResponseBody</p>
 */
public class GetRangeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backgroundColors")
    private java.util.List<java.util.List<BackgroundColors>> backgroundColors;

    @com.aliyun.core.annotation.NameInMap("displayValues")
    private java.util.List<java.util.List<String>> displayValues;

    @com.aliyun.core.annotation.NameInMap("formulas")
    private java.util.List<java.util.List<String>> formulas;

    @com.aliyun.core.annotation.NameInMap("hyperlinks")
    private java.util.List<java.util.List<Hyperlinks>> hyperlinks;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("values")
    private java.util.List<java.util.List<?>> values;

    private GetRangeResponseBody(Builder builder) {
        this.backgroundColors = builder.backgroundColors;
        this.displayValues = builder.displayValues;
        this.formulas = builder.formulas;
        this.hyperlinks = builder.hyperlinks;
        this.requestId = builder.requestId;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRangeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backgroundColors
     */
    public java.util.List<java.util.List<BackgroundColors>> getBackgroundColors() {
        return this.backgroundColors;
    }

    /**
     * @return displayValues
     */
    public java.util.List<java.util.List<String>> getDisplayValues() {
        return this.displayValues;
    }

    /**
     * @return formulas
     */
    public java.util.List<java.util.List<String>> getFormulas() {
        return this.formulas;
    }

    /**
     * @return hyperlinks
     */
    public java.util.List<java.util.List<Hyperlinks>> getHyperlinks() {
        return this.hyperlinks;
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
    public java.util.List<java.util.List<?>> getValues() {
        return this.values;
    }

    public static final class Builder {
        private java.util.List<java.util.List<BackgroundColors>> backgroundColors; 
        private java.util.List<java.util.List<String>> displayValues; 
        private java.util.List<java.util.List<String>> formulas; 
        private java.util.List<java.util.List<Hyperlinks>> hyperlinks; 
        private String requestId; 
        private java.util.List<java.util.List<?>> values; 

        private Builder() {
        } 

        private Builder(GetRangeResponseBody model) {
            this.backgroundColors = model.backgroundColors;
            this.displayValues = model.displayValues;
            this.formulas = model.formulas;
            this.hyperlinks = model.hyperlinks;
            this.requestId = model.requestId;
            this.values = model.values;
        } 

        /**
         * backgroundColors.
         */
        public Builder backgroundColors(java.util.List<java.util.List<BackgroundColors>> backgroundColors) {
            this.backgroundColors = backgroundColors;
            return this;
        }

        /**
         * displayValues.
         */
        public Builder displayValues(java.util.List<java.util.List<String>> displayValues) {
            this.displayValues = displayValues;
            return this;
        }

        /**
         * formulas.
         */
        public Builder formulas(java.util.List<java.util.List<String>> formulas) {
            this.formulas = formulas;
            return this;
        }

        /**
         * hyperlinks.
         */
        public Builder hyperlinks(java.util.List<java.util.List<Hyperlinks>> hyperlinks) {
            this.hyperlinks = hyperlinks;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * values.
         */
        public Builder values(java.util.List<java.util.List<?>> values) {
            this.values = values;
            return this;
        }

        public GetRangeResponseBody build() {
            return new GetRangeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRangeResponseBody} extends {@link TeaModel}
     *
     * <p>GetRangeResponseBody</p>
     */
    public static class BackgroundColors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Red")
        private Integer red;

        @com.aliyun.core.annotation.NameInMap("Green")
        private Integer green;

        @com.aliyun.core.annotation.NameInMap("Blue")
        private Integer blue;

        @com.aliyun.core.annotation.NameInMap("HexString")
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

            private Builder() {
            } 

            private Builder(BackgroundColors model) {
                this.red = model.red;
                this.green = model.green;
                this.blue = model.blue;
                this.hexString = model.hexString;
            } 

            /**
             * <p>red</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder red(Integer red) {
                this.red = red;
                return this;
            }

            /**
             * <p>green</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder green(Integer green) {
                this.green = green;
                return this;
            }

            /**
             * <p>blue</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder blue(Integer blue) {
                this.blue = blue;
                return this;
            }

            /**
             * <p>hexString</p>
             * 
             * <strong>example:</strong>
             * <p>#000000</p>
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
    /**
     * 
     * {@link GetRangeResponseBody} extends {@link TeaModel}
     *
     * <p>GetRangeResponseBody</p>
     */
    public static class Hyperlinks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Hyperlinks(Builder builder) {
            this.type = builder.type;
            this.link = builder.link;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hyperlinks create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String type; 
            private String link; 
            private String text; 

            private Builder() {
            } 

            private Builder(Hyperlinks model) {
                this.type = model.type;
                this.link = model.link;
                this.text = model.text;
            } 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Hyperlinks build() {
                return new Hyperlinks(this);
            } 

        } 

    }
}
