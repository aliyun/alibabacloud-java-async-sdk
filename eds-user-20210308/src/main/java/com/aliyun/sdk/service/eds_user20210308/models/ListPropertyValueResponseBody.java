// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPropertyValueResponseBody} extends {@link TeaModel}
 *
 * <p>ListPropertyValueResponseBody</p>
 */
public class ListPropertyValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PropertyValueInfos")
    private java.util.List < PropertyValueInfos> propertyValueInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPropertyValueResponseBody(Builder builder) {
        this.propertyValueInfos = builder.propertyValueInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPropertyValueResponseBody create() {
        return builder().build();
    }

    /**
     * @return propertyValueInfos
     */
    public java.util.List < PropertyValueInfos> getPropertyValueInfos() {
        return this.propertyValueInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PropertyValueInfos> propertyValueInfos; 
        private String requestId; 

        /**
         * Details about property values.
         */
        public Builder propertyValueInfos(java.util.List < PropertyValueInfos> propertyValueInfos) {
            this.propertyValueInfos = propertyValueInfos;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPropertyValueResponseBody build() {
            return new ListPropertyValueResponseBody(this);
        } 

    } 

    public static class PropertyValueInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        @com.aliyun.core.annotation.NameInMap("PropertyValueId")
        private Long propertyValueId;

        private PropertyValueInfos(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValueInfos create() {
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

            public PropertyValueInfos build() {
                return new PropertyValueInfos(this);
            } 

        } 

    }
}
