// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ListUserCustomLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserCustomLogConfigResponseBody</p>
 */
public class ListUserCustomLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigIds")
    private ConfigIds configIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserCustomLogConfigResponseBody(Builder builder) {
        this.configIds = builder.configIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserCustomLogConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configIds
     */
    public ConfigIds getConfigIds() {
        return this.configIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigIds configIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUserCustomLogConfigResponseBody model) {
            this.configIds = model.configIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of log configuration IDs.</p>
         */
        public Builder configIds(ConfigIds configIds) {
            this.configIds = configIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>95D5B69F-8AEC-419B-8F3A-612B35032B0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserCustomLogConfigResponseBody build() {
            return new ListUserCustomLogConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserCustomLogConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserCustomLogConfigResponseBody</p>
     */
    public static class ConfigIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private java.util.List<String> configId;

        private ConfigIds(Builder builder) {
            this.configId = builder.configId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigIds create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public java.util.List<String> getConfigId() {
            return this.configId;
        }

        public static final class Builder {
            private java.util.List<String> configId; 

            private Builder() {
            } 

            private Builder(ConfigIds model) {
                this.configId = model.configId;
            } 

            /**
             * ConfigId.
             */
            public Builder configId(java.util.List<String> configId) {
                this.configId = configId;
                return this;
            }

            public ConfigIds build() {
                return new ConfigIds(this);
            } 

        } 

    }
}
