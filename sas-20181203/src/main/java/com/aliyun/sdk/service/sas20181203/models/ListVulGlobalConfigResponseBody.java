// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVulGlobalConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListVulGlobalConfigResponseBody</p>
 */
public class ListVulGlobalConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulGlobalConfigList")
    private java.util.List < VulGlobalConfigList> vulGlobalConfigList;

    private ListVulGlobalConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vulGlobalConfigList = builder.vulGlobalConfigList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVulGlobalConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vulGlobalConfigList
     */
    public java.util.List < VulGlobalConfigList> getVulGlobalConfigList() {
        return this.vulGlobalConfigList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VulGlobalConfigList> vulGlobalConfigList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations.
         */
        public Builder vulGlobalConfigList(java.util.List < VulGlobalConfigList> vulGlobalConfigList) {
            this.vulGlobalConfigList = vulGlobalConfigList;
            return this;
        }

        public ListVulGlobalConfigResponseBody build() {
            return new ListVulGlobalConfigResponseBody(this);
        } 

    } 

    public static class VulGlobalConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigKey")
        private String configKey;

        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        private VulGlobalConfigList(Builder builder) {
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulGlobalConfigList create() {
            return builder().build();
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        public static final class Builder {
            private String configKey; 
            private String configValue; 

            /**
             * The key of the configuration item.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * The value of the configuration item.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            public VulGlobalConfigList build() {
                return new VulGlobalConfigList(this);
            } 

        } 

    }
}
