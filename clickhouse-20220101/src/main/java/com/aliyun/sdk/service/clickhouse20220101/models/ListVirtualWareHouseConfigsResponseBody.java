// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListVirtualWareHouseConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirtualWareHouseConfigsResponseBody</p>
 */
public class ListVirtualWareHouseConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVirtualWareHouseConfigsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualWareHouseConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVirtualWareHouseConfigsResponseBody build() {
            return new ListVirtualWareHouseConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirtualWareHouseConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirtualWareHouseConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFullPath")
        private String configFullPath;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("NeedRestart")
        private Boolean needRestart;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Data(Builder builder) {
            this.configFullPath = builder.configFullPath;
            this.configType = builder.configType;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.needRestart = builder.needRestart;
            this.spec = builder.spec;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configFullPath
         */
        public String getConfigFullPath() {
            return this.configFullPath;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
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
         * @return needRestart
         */
        public Boolean getNeedRestart() {
            return this.needRestart;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String configFullPath; 
            private String configType; 
            private String defaultValue; 
            private String description; 
            private Boolean needRestart; 
            private String spec; 
            private String value; 

            /**
             * ConfigFullPath.
             */
            public Builder configFullPath(String configFullPath) {
                this.configFullPath = configFullPath;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
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
             * NeedRestart.
             */
            public Builder needRestart(Boolean needRestart) {
                this.needRestart = needRestart;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
