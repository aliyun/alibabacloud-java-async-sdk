// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link ListPropertyResponseBody} extends {@link TeaModel}
 *
 * <p>ListPropertyResponseBody</p>
 */
public class ListPropertyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.List<Properties> properties;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPropertyResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.properties = builder.properties;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return properties
     */
    public java.util.List<Properties> getProperties() {
        return this.properties;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Properties> properties; 
        private String requestId; 

        /**
         * <p>The token that is used for the next query. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about the properties.</p>
         */
        public Builder properties(java.util.List<Properties> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPropertyResponseBody build() {
            return new ListPropertyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPropertyResponseBody} extends {@link TeaModel}
     *
     * <p>ListPropertyResponseBody</p>
     */
    public static class PropertyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        @com.aliyun.core.annotation.NameInMap("PropertyValueId")
        private Long propertyValueId;

        private PropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        /**
         * @return propertyValueId
         */
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

        public static final class Builder {
            private String propertyValue; 
            private Long propertyValueId; 

            /**
             * <p>The value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * <p>The ID of the property value.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder propertyValueId(Long propertyValueId) {
                this.propertyValueId = propertyValueId;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPropertyResponseBody} extends {@link TeaModel}
     *
     * <p>ListPropertyResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyId")
        private Long propertyId;

        @com.aliyun.core.annotation.NameInMap("PropertyKey")
        private String propertyKey;

        @com.aliyun.core.annotation.NameInMap("PropertyValues")
        private java.util.List<PropertyValues> propertyValues;

        private Properties(Builder builder) {
            this.propertyId = builder.propertyId;
            this.propertyKey = builder.propertyKey;
            this.propertyValues = builder.propertyValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyValues
         */
        public java.util.List<PropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyKey; 
            private java.util.List<PropertyValues> propertyValues; 

            /**
             * <p>The ID of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * <p>The name of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * <p>Details about the property values.</p>
             */
            public Builder propertyValues(java.util.List<PropertyValues> propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
}
