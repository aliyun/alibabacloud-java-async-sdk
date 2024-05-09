// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRetcodeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRetcodeAppsResponseBody</p>
 */
public class ListRetcodeAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetcodeApps")
    private java.util.List < RetcodeApps> retcodeApps;

    private ListRetcodeAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.retcodeApps = builder.retcodeApps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRetcodeAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retcodeApps
     */
    public java.util.List < RetcodeApps> getRetcodeApps() {
        return this.retcodeApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RetcodeApps> retcodeApps; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of applications monitored by Browser Monitoring.
         */
        public Builder retcodeApps(java.util.List < RetcodeApps> retcodeApps) {
            this.retcodeApps = retcodeApps;
            return this;
        }

        public ListRetcodeAppsResponseBody build() {
            return new ListRetcodeAppsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class RetcodeApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RetcodeAppType")
        private String retcodeAppType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private RetcodeApps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.nickName = builder.nickName;
            this.pid = builder.pid;
            this.resourceGroupId = builder.resourceGroupId;
            this.retcodeAppType = builder.retcodeAppType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetcodeApps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return retcodeAppType
         */
        public String getRetcodeAppType() {
            return this.retcodeAppType;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String nickName; 
            private String pid; 
            private String resourceGroupId; 
            private String retcodeAppType; 
            private java.util.List < Tags> tags; 

            /**
             * The ID of the application. The parameter is an auto-increment parameter.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The alias of the application monitored by Browser Monitoring.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The PID of the application.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the application. Valid values:
             * <p>
             * 
             * *   `web`: web application
             * *   `weex`: Weex mobile app
             * *   `mini_dd`: DingTalk mini program
             * *   `mini_alipay`: Alipay mini program
             * *   `mini_wx`: WeChat mini program
             * *   `mini_common`: mini program on other platforms
             */
            public Builder retcodeAppType(String retcodeAppType) {
                this.retcodeAppType = retcodeAppType;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public RetcodeApps build() {
                return new RetcodeApps(this);
            } 

        } 

    }
}
