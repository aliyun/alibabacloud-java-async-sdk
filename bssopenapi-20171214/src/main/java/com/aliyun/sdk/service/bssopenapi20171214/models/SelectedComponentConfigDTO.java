// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link SelectedComponentConfigDTO} extends {@link TeaModel}
 *
 * <p>SelectedComponentConfigDTO</p>
 */
public class SelectedComponentConfigDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttributeConfigs")
    private java.util.List<AttributeConfigs> attributeConfigs;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private SelectedComponentConfigDTO(Builder builder) {
        this.attributeConfigs = builder.attributeConfigs;
        this.code = builder.code;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectedComponentConfigDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeConfigs
     */
    public java.util.List<AttributeConfigs> getAttributeConfigs() {
        return this.attributeConfigs;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private java.util.List<AttributeConfigs> attributeConfigs; 
        private String code; 
        private String tag; 

        private Builder() {
        } 

        private Builder(SelectedComponentConfigDTO model) {
            this.attributeConfigs = model.attributeConfigs;
            this.code = model.code;
            this.tag = model.tag;
        } 

        /**
         * <p>The property configuration list.</p>
         */
        public Builder attributeConfigs(java.util.List<AttributeConfigs> attributeConfigs) {
            this.attributeConfigs = attributeConfigs;
            return this;
        }

        /**
         * <p>The component code.</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The unique identifier of the component, used in multi-node and multi-disk scenarios.</p>
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public SelectedComponentConfigDTO build() {
            return new SelectedComponentConfigDTO(this);
        } 

    } 

    /**
     * 
     * {@link SelectedComponentConfigDTO} extends {@link TeaModel}
     *
     * <p>SelectedComponentConfigDTO</p>
     */
    public static class LowerBound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private LowerBound(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LowerBound create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(LowerBound model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * <p>The property code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LowerBound build() {
                return new LowerBound(this);
            } 

        } 

    }
    /**
     * 
     * {@link SelectedComponentConfigDTO} extends {@link TeaModel}
     *
     * <p>SelectedComponentConfigDTO</p>
     */
    public static class UpperBound extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private UpperBound(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpperBound create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(UpperBound model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * <p>The property code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UpperBound build() {
                return new UpperBound(this);
            } 

        } 

    }
    /**
     * 
     * {@link SelectedComponentConfigDTO} extends {@link TeaModel}
     *
     * <p>SelectedComponentConfigDTO</p>
     */
    public static class BoundedValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LowerBound")
        private LowerBound lowerBound;

        @com.aliyun.core.annotation.NameInMap("UpperBound")
        private UpperBound upperBound;

        private BoundedValue(Builder builder) {
            this.lowerBound = builder.lowerBound;
            this.upperBound = builder.upperBound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BoundedValue create() {
            return builder().build();
        }

        /**
         * @return lowerBound
         */
        public LowerBound getLowerBound() {
            return this.lowerBound;
        }

        /**
         * @return upperBound
         */
        public UpperBound getUpperBound() {
            return this.upperBound;
        }

        public static final class Builder {
            private LowerBound lowerBound; 
            private UpperBound upperBound; 

            private Builder() {
            } 

            private Builder(BoundedValue model) {
                this.lowerBound = model.lowerBound;
                this.upperBound = model.upperBound;
            } 

            /**
             * <p>The lower bound.</p>
             */
            public Builder lowerBound(LowerBound lowerBound) {
                this.lowerBound = lowerBound;
                return this;
            }

            /**
             * <p>The upper bound.</p>
             */
            public Builder upperBound(UpperBound upperBound) {
                this.upperBound = upperBound;
                return this;
            }

            public BoundedValue build() {
                return new BoundedValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link SelectedComponentConfigDTO} extends {@link TeaModel}
     *
     * <p>SelectedComponentConfigDTO</p>
     */
    public static class AttributeConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundedValue")
        private BoundedValue boundedValue;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AttributeConfigs(Builder builder) {
            this.boundedValue = builder.boundedValue;
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeConfigs create() {
            return builder().build();
        }

        /**
         * @return boundedValue
         */
        public BoundedValue getBoundedValue() {
            return this.boundedValue;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private BoundedValue boundedValue; 
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(AttributeConfigs model) {
                this.boundedValue = model.boundedValue;
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * <p>The upper and lower bound values, used for bounded properties.</p>
             */
            public Builder boundedValue(BoundedValue boundedValue) {
                this.boundedValue = boundedValue;
                return this;
            }

            /**
             * <p>The property code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The property value.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AttributeConfigs build() {
                return new AttributeConfigs(this);
            } 

        } 

    }
}
