// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVulGlobalConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListVulGlobalConfigResponseBody</p>
 */
public class ListVulGlobalConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VulGlobalConfigList")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VulGlobalConfigList.
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
        @NameInMap("ConfigKey")
        private String configKey;

        @NameInMap("ConfigValue")
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
             * ConfigKey.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * ConfigValue.
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
