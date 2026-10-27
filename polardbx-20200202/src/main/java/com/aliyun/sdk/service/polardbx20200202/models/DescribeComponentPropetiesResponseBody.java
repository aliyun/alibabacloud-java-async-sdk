// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeComponentPropetiesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentPropetiesResponseBody</p>
 */
public class DescribeComponentPropetiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.List<Properties> properties;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComponentPropetiesResponseBody(Builder builder) {
        this.properties = builder.properties;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentPropetiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private java.util.List<Properties> properties; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeComponentPropetiesResponseBody model) {
            this.properties = model.properties;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The export parameters of exception events.</p>
         */
        public Builder properties(java.util.List<Properties> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentPropetiesResponseBody build() {
            return new DescribeComponentPropetiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeComponentPropetiesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComponentPropetiesResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderIndex")
        private String orderIndex;

        @com.aliyun.core.annotation.NameInMap("PropertyCode")
        private String propertyCode;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.name = builder.name;
            this.orderIndex = builder.orderIndex;
            this.propertyCode = builder.propertyCode;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderIndex
         */
        public String getOrderIndex() {
            return this.orderIndex;
        }

        /**
         * @return propertyCode
         */
        public String getPropertyCode() {
            return this.propertyCode;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String orderIndex; 
            private String propertyCode; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.name = model.name;
                this.orderIndex = model.orderIndex;
                this.propertyCode = model.propertyCode;
                this.value = model.value;
            } 

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>4C32G</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display order of the commodity module property.</p>
             * <p>The returned content varies depending on the commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderIndex(String orderIndex) {
                this.orderIndex = orderIndex;
                return this;
            }

            /**
             * <p>The commodity module.</p>
             * 
             * <strong>example:</strong>
             * <p>dn_node_spec</p>
             */
            public Builder propertyCode(String propertyCode) {
                this.propertyCode = propertyCode;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>172.27.35.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
}
