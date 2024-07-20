// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommodityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommodityResponseBody</p>
 */
public class DescribeCommodityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("CommodityName")
    private String commodityName;

    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List < Components> components;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCommodityResponseBody(Builder builder) {
        this.commodityCode = builder.commodityCode;
        this.commodityName = builder.commodityName;
        this.components = builder.components;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommodityResponseBody create() {
        return builder().build();
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return commodityName
     */
    public String getCommodityName() {
        return this.commodityName;
    }

    /**
     * @return components
     */
    public java.util.List < Components> getComponents() {
        return this.components;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String commodityCode; 
        private String commodityName; 
        private java.util.List < Components> components; 
        private String requestId; 

        /**
         * The commodity code.
         * <p>
         * 
         * Examples for the China site (aliyun.com):
         * 
         * *   **ga_gapluspre_public_cn**: GA instance.
         * *   **ga_plusbwppre_public_cn**: basic bandwidth plan.
         * 
         * Examples for the international site (alibabacloud.com):
         * 
         * *   **ga_pluspre_public_intl**: GA instance.
         * *   **ga_bwppreintl_public_intl**: basic bandwidth plan.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The name of the commodity.
         */
        public Builder commodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }

        /**
         * The information about the commodity modules.
         * <p>
         * 
         * The returned information varies based on the commodity.
         */
        public Builder components(java.util.List < Components> components) {
            this.components = components;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCommodityResponseBody build() {
            return new DescribeCommodityResponseBody(this);
        } 

    } 

    public static class PropertyValueList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderIndex")
        private Long orderIndex;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private String tips;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PropertyValueList(Builder builder) {
            this.orderIndex = builder.orderIndex;
            this.text = builder.text;
            this.tips = builder.tips;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValueList create() {
            return builder().build();
        }

        /**
         * @return orderIndex
         */
        public Long getOrderIndex() {
            return this.orderIndex;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return tips
         */
        public String getTips() {
            return this.tips;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long orderIndex; 
            private String text; 
            private String tips; 
            private String value; 

            /**
             * The sequence number of the attribute.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder orderIndex(Long orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * The content of the attribute.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The message of the attribute.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * The value of the attribute.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyValueList build() {
                return new PropertyValueList(this);
            } 

        } 

    }
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PropertyValueList")
        private java.util.List < PropertyValueList> propertyValueList;

        private Properties(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.propertyValueList = builder.propertyValueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return propertyValueList
         */
        public java.util.List < PropertyValueList> getPropertyValueList() {
            return this.propertyValueList;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private java.util.List < PropertyValueList> propertyValueList; 

            /**
             * The code of the attribute.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the attribute.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The list of attribute values of the commodity module.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder propertyValueList(java.util.List < PropertyValueList> propertyValueList) {
                this.propertyValueList = propertyValueList;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List < Properties> properties;

        private Components(Builder builder) {
            this.componentCode = builder.componentCode;
            this.componentName = builder.componentName;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentCode
         */
        public String getComponentCode() {
            return this.componentCode;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return properties
         */
        public java.util.List < Properties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String componentCode; 
            private String componentName; 
            private java.util.List < Properties> properties; 

            /**
             * The code of the commodity module.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * The name of the commodity module.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * The attributes of the commodity module.
             * <p>
             * 
             * The returned information varies based on the commodity module.
             */
            public Builder properties(java.util.List < Properties> properties) {
                this.properties = properties;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
