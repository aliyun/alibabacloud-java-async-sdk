// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPropertyResponseBody} extends {@link TeaModel}
 *
 * <p>ListPropertyResponseBody</p>
 */
public class ListPropertyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.List < Properties> properties;

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
    public java.util.List < Properties> getProperties() {
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
        private java.util.List < Properties> properties; 
        private String requestId; 

        /**
         * The token that is used for the next query. If this parameter is empty, all results have been returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about the properties.
         */
        public Builder properties(java.util.List < Properties> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPropertyResponseBody build() {
            return new ListPropertyResponseBody(this);
        } 

    } 

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
             * The value of the property.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * The ID of the property value.
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
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyId")
        private Long propertyId;

        @com.aliyun.core.annotation.NameInMap("PropertyKey")
        private String propertyKey;

        @com.aliyun.core.annotation.NameInMap("PropertyValues")
        private java.util.List < PropertyValues> propertyValues;

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
        public java.util.List < PropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyKey; 
            private java.util.List < PropertyValues> propertyValues; 

            /**
             * The ID of the property.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * The name of the property.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * Details about the property values.
             */
            public Builder propertyValues(java.util.List < PropertyValues> propertyValues) {
                this.propertyValues = propertyValues;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
}
