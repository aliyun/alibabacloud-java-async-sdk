// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserCustomLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserCustomLogConfigResponseBody</p>
 */
public class ListUserCustomLogConfigResponseBody extends TeaModel {
    @NameInMap("ConfigIds")
    private ConfigIds configIds;

    @NameInMap("RequestId")
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

        /**
         * ConfigIds.
         */
        public Builder configIds(ConfigIds configIds) {
            this.configIds = configIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserCustomLogConfigResponseBody build() {
            return new ListUserCustomLogConfigResponseBody(this);
        } 

    } 

    public static class ConfigIds extends TeaModel {
        @NameInMap("ConfigId")
        private java.util.List < String > configId;

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
        public java.util.List < String > getConfigId() {
            return this.configId;
        }

        public static final class Builder {
            private java.util.List < String > configId; 

            /**
             * ConfigId.
             */
            public Builder configId(java.util.List < String > configId) {
                this.configId = configId;
                return this;
            }

            public ConfigIds build() {
                return new ConfigIds(this);
            } 

        } 

    }
}
