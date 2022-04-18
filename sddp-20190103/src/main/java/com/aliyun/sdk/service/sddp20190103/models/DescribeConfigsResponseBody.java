// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigsResponseBody</p>
 */
public class DescribeConfigsResponseBody extends TeaModel {
    @NameInMap("ConfigList")
    private java.util.List < ConfigList> configList;

    @NameInMap("RequestId")
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
    public java.util.List < ConfigList> getConfigList() {
        return this.configList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConfigList> configList; 
        private String requestId; 

        /**
         * ConfigList.
         */
        public Builder configList(java.util.List < ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigsResponseBody build() {
            return new DescribeConfigsResponseBody(this);
        } 

    } 

    public static class ConfigList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Value")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Value.
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
