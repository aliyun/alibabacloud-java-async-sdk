// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeAppByPidResponseBody} extends {@link TeaModel}
 *
 * <p>GetRetcodeAppByPidResponseBody</p>
 */
public class GetRetcodeAppByPidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetcodeApp")
    private RetcodeApp retcodeApp;

    private GetRetcodeAppByPidResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.retcodeApp = builder.retcodeApp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRetcodeAppByPidResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retcodeApp
     */
    public RetcodeApp getRetcodeApp() {
        return this.retcodeApp;
    }

    public static final class Builder {
        private String requestId; 
        private RetcodeApp retcodeApp; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned application data.
         */
        public Builder retcodeApp(RetcodeApp retcodeApp) {
            this.retcodeApp = retcodeApp;
            return this;
        }

        public GetRetcodeAppByPidResponseBody build() {
            return new GetRetcodeAppByPidResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class RetcodeApp extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Pid")
        private String pid;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RetcodeAppType")
        private String retcodeAppType;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private RetcodeApp(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.pid = builder.pid;
            this.resourceGroupId = builder.resourceGroupId;
            this.retcodeAppType = builder.retcodeAppType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetcodeApp create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
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
            private String appId; 
            private String appName; 
            private String pid; 
            private String resourceGroupId; 
            private String retcodeAppType; 
            private java.util.List < Tags> tags; 

            /**
             * The ID of the application. The parameter is an auto-increment parameter.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application that is monitored by Browser Monitoring.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The process identifier (PID) of the application.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * The ID of the resource group. You can obtain the resource group ID in the **Resource Management** console.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the application that is monitored by Browser Monitoring. Valid values:
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
             * The tags that are attached to the instance.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public RetcodeApp build() {
                return new RetcodeApp(this);
            } 

        } 

    }
}
