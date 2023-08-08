// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPropertyResponseBody} extends {@link TeaModel}
 *
 * <p>ListPropertyResponseBody</p>
 */
public class ListPropertyResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Properties")
    private java.util.List < Properties> properties;

    @NameInMap("RequestId")
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
         * The information about the properties.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder properties(java.util.List < Properties> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * The ID of the property.
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
        @NameInMap("PropertyValue")
        private String propertyValue;

        @NameInMap("PropertyValueId")
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
             * PropertyValue.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * PropertyValueId.
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
        @NameInMap("PropertyId")
        private Long propertyId;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("PropertyValues")
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
             * The operation that you want to perform. Set the value to **ListProperty**.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * Queries all user properties within an Alibaba Cloud account.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * ListProperty
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
