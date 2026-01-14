// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
    private java.util.List<Components> components;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Components> getComponents() {
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
        private java.util.List<Components> components; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCommodityResponseBody model) {
            this.commodityCode = model.commodityCode;
            this.commodityName = model.commodityName;
            this.components = model.components;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The commodity code.</p>
         * <p>Examples for the China site (aliyun.com):</p>
         * <ul>
         * <li><strong>ga_gapluspre_public_cn</strong>: GA instance.</li>
         * <li><strong>ga_plusbwppre_public_cn</strong>: basic bandwidth plan.</li>
         * </ul>
         * <p>Examples for the international site (alibabacloud.com):</p>
         * <ul>
         * <li><strong>ga_pluspre_public_intl</strong>: GA instance.</li>
         * <li><strong>ga_bwppreintl_public_intl</strong>: basic bandwidth plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ga_gapluspre_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The name of the commodity.</p>
         * 
         * <strong>example:</strong>
         * <p>Global Accelerator_Instance Type (Subscription)</p>
         */
        public Builder commodityName(String commodityName) {
            this.commodityName = commodityName;
            return this;
        }

        /**
         * <p>The information about the commodity modules.</p>
         * <p>The returned information varies based on the commodity.</p>
         */
        public Builder components(java.util.List<Components> components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCommodityResponseBody build() {
            return new DescribeCommodityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PropertyValueList model) {
                this.orderIndex = model.orderIndex;
                this.text = model.text;
                this.tips = model.tips;
                this.value = model.value;
            } 

            /**
             * <p>The sequence number of the attribute.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderIndex(Long orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * <p>The content of the attribute.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>1 Month</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The message of the attribute.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>1 Month</p>
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * <p>The value of the attribute.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>1:Month</p>
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
    /**
     * 
     * {@link DescribeCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PropertyValueList")
        private java.util.List<PropertyValueList> propertyValueList;

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
        public java.util.List<PropertyValueList> getPropertyValueList() {
            return this.propertyValueList;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private java.util.List<PropertyValueList> propertyValueList; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.code = model.code;
                this.name = model.name;
                this.propertyValueList = model.propertyValueList;
            } 

            /**
             * <p>The code of the attribute.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>ord_time</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the attribute.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>Duration</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of attribute values of the commodity module.</p>
             * <p>The returned information varies based on the commodity module.</p>
             */
            public Builder propertyValueList(java.util.List<PropertyValueList> propertyValueList) {
                this.propertyValueList = propertyValueList;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCommodityResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommodityResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

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
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String componentCode; 
            private String componentName; 
            private java.util.List<Properties> properties; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentCode = model.componentCode;
                this.componentName = model.componentName;
                this.properties = model.properties;
            } 

            /**
             * <p>The code of the commodity module.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>Duration</p>
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * <p>The name of the commodity module.</p>
             * <p>The returned information varies based on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>Duration</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>The attributes of the commodity module.</p>
             * <p>The returned information varies based on the commodity module.</p>
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
