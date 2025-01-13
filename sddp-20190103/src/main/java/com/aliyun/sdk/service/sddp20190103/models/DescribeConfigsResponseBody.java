// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigsResponseBody</p>
 */
public class DescribeConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeConfigsResponseBody(Builder builder) {
        this.configList = builder.configList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configList
     */
    public java.util.List<ConfigList> getConfigList() {
        return this.configList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConfigList> configList; 
        private String requestId; 

        /**
         * <p>An array that consists of common configuration items for alerts.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigsResponseBody build() {
            return new DescribeConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigsResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ConfigList(Builder builder) {
            this.code = builder.code;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.id = builder.id;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String defaultValue; 
            private String description; 
            private Long id; 
            private String value; 

            /**
             * <p>The code of the common configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description of the default value for the common configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>The volume of logs of a specific type that are generated on the current day is less than 30% of the average volume of logs generated in the previous 10 days.</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The description of the common configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>Anomalous log output</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique ID of the common configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>2133</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The value of the common configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
