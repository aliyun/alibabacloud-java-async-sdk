// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetStorageNotifyConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageNotifyConfigResponseBody</p>
 */
public class GetStorageNotifyConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("OssNotifyConfig")
    private OssNotifyConfig ossNotifyConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetStorageNotifyConfigResponseBody(Builder builder) {
        this.configType = builder.configType;
        this.ossNotifyConfig = builder.ossNotifyConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageNotifyConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return ossNotifyConfig
     */
    public OssNotifyConfig getOssNotifyConfig() {
        return this.ossNotifyConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configType; 
        private OssNotifyConfig ossNotifyConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetStorageNotifyConfigResponseBody model) {
            this.configType = model.configType;
            this.ossNotifyConfig = model.ossNotifyConfig;
            this.requestId = model.requestId;
        } 

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * OssNotifyConfig.
         */
        public Builder ossNotifyConfig(OssNotifyConfig ossNotifyConfig) {
            this.ossNotifyConfig = ossNotifyConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetStorageNotifyConfigResponseBody build() {
            return new GetStorageNotifyConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageNotifyConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageNotifyConfigResponseBody</p>
     */
    public static class OssNotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventList")
        private String eventList;

        @com.aliyun.core.annotation.NameInMap("HttpProcessAddress")
        private String httpProcessAddress;

        @com.aliyun.core.annotation.NameInMap("NotifyName")
        private String notifyName;

        @com.aliyun.core.annotation.NameInMap("ResourcePrefixName")
        private String resourcePrefixName;

        private OssNotifyConfig(Builder builder) {
            this.eventList = builder.eventList;
            this.httpProcessAddress = builder.httpProcessAddress;
            this.notifyName = builder.notifyName;
            this.resourcePrefixName = builder.resourcePrefixName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssNotifyConfig create() {
            return builder().build();
        }

        /**
         * @return eventList
         */
        public String getEventList() {
            return this.eventList;
        }

        /**
         * @return httpProcessAddress
         */
        public String getHttpProcessAddress() {
            return this.httpProcessAddress;
        }

        /**
         * @return notifyName
         */
        public String getNotifyName() {
            return this.notifyName;
        }

        /**
         * @return resourcePrefixName
         */
        public String getResourcePrefixName() {
            return this.resourcePrefixName;
        }

        public static final class Builder {
            private String eventList; 
            private String httpProcessAddress; 
            private String notifyName; 
            private String resourcePrefixName; 

            private Builder() {
            } 

            private Builder(OssNotifyConfig model) {
                this.eventList = model.eventList;
                this.httpProcessAddress = model.httpProcessAddress;
                this.notifyName = model.notifyName;
                this.resourcePrefixName = model.resourcePrefixName;
            } 

            /**
             * EventList.
             */
            public Builder eventList(String eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * HttpProcessAddress.
             */
            public Builder httpProcessAddress(String httpProcessAddress) {
                this.httpProcessAddress = httpProcessAddress;
                return this;
            }

            /**
             * NotifyName.
             */
            public Builder notifyName(String notifyName) {
                this.notifyName = notifyName;
                return this;
            }

            /**
             * ResourcePrefixName.
             */
            public Builder resourcePrefixName(String resourcePrefixName) {
                this.resourcePrefixName = resourcePrefixName;
                return this;
            }

            public OssNotifyConfig build() {
                return new OssNotifyConfig(this);
            } 

        } 

    }
}
