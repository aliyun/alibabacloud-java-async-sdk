// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListVulGlobalConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListVulGlobalConfigResponseBody</p>
 */
public class ListVulGlobalConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulGlobalConfigList")
    private java.util.List<VulGlobalConfigList> vulGlobalConfigList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VulGlobalConfigList> getVulGlobalConfigList() {
        return this.vulGlobalConfigList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VulGlobalConfigList> vulGlobalConfigList; 

        private Builder() {
        } 

        private Builder(ListVulGlobalConfigResponseBody model) {
            this.requestId = model.requestId;
            this.vulGlobalConfigList = model.vulGlobalConfigList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations.</p>
         */
        public Builder vulGlobalConfigList(java.util.List<VulGlobalConfigList> vulGlobalConfigList) {
            this.vulGlobalConfigList = vulGlobalConfigList;
            return this;
        }

        public ListVulGlobalConfigResponseBody build() {
            return new ListVulGlobalConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVulGlobalConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListVulGlobalConfigResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VulGlobalConfigList model) {
                this.configKey = model.configKey;
                this.configValue = model.configValue;
            } 

            /**
             * <p>The key of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>vul_scan_ip_list</p>
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.<em>.</em>,127.0.<em>.</em></p>
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
