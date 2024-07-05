// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRenderingInstanceConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRenderingInstanceConfigurationResponseBody</p>
 */
public class DescribeRenderingInstanceConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.List < Configuration> configuration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRenderingInstanceConfigurationResponseBody(Builder builder) {
        this.configuration = builder.configuration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingInstanceConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return configuration
     */
    public java.util.List < Configuration> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Configuration> configuration; 
        private String requestId; 

        /**
         * Configuration.
         */
        public Builder configuration(java.util.List < Configuration> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRenderingInstanceConfigurationResponseBody build() {
            return new DescribeRenderingInstanceConfigurationResponseBody(this);
        } 

    } 

    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private Attributes(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Object value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List < Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        private Configuration(Builder builder) {
            this.attributes = builder.attributes;
            this.moduleName = builder.moduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configuration create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List < Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private java.util.List < Attributes> attributes; 
            private String moduleName; 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List < Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            public Configuration build() {
                return new Configuration(this);
            } 

        } 

    }
}
