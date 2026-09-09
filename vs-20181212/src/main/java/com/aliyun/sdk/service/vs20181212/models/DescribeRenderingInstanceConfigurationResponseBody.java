// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeRenderingInstanceConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRenderingInstanceConfigurationResponseBody</p>
 */
public class DescribeRenderingInstanceConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configuration")
    private java.util.List<Configuration> configuration;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public java.util.List<Configuration> getConfiguration() {
        return this.configuration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Configuration> configuration; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRenderingInstanceConfigurationResponseBody model) {
            this.configuration = model.configuration;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration.</p>
         */
        public Builder configuration(java.util.List<Configuration> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRenderingInstanceConfigurationResponseBody build() {
            return new DescribeRenderingInstanceConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRenderingInstanceConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceConfigurationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>lon</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeRenderingInstanceConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRenderingInstanceConfigurationResponseBody</p>
     */
    public static class Configuration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<Attributes> attributes;

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
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        public static final class Builder {
            private java.util.List<Attributes> attributes; 
            private String moduleName; 

            private Builder() {
            } 

            private Builder(Configuration model) {
                this.attributes = model.attributes;
                this.moduleName = model.moduleName;
            } 

            /**
             * <p>The list of properties for the module.</p>
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The name of the device simulation feature module. Valid values:</p>
             * <ol>
             * <li><p>ctl: The control module.</p>
             * </li>
             * <li><p>prop: The property module.</p>
             * </li>
             * <li><p>location: The location module.</p>
             * </li>
             * <li><p>battery: The battery module.</p>
             * </li>
             * <li><p>network: The network module.</p>
             * </li>
             * <li><p>bluetooth: The Bluetooth module.</p>
             * </li>
             * <li><p>sim: The SIM card module.</p>
             * </li>
             * <li><p>display: The device module.</p>
             * </li>
             * <li><p>system: The basic module.</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>location</p>
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
