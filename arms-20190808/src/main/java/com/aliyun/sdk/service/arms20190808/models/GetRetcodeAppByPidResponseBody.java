// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetRetcodeAppByPidResponseBody} extends {@link TeaModel}
 *
 * <p>GetRetcodeAppByPidResponseBody</p>
 */
public class GetRetcodeAppByPidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetcodeApp")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2983BEF7-4A0D-47A2-94A2-8E9C5E63****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned application data.</p>
         */
        public Builder retcodeApp(RetcodeApp retcodeApp) {
            this.retcodeApp = retcodeApp;
            return this;
        }

        public GetRetcodeAppByPidResponseBody build() {
            return new GetRetcodeAppByPidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRetcodeAppByPidResponseBody} extends {@link TeaModel}
     *
     * <p>GetRetcodeAppByPidResponseBody</p>
     */
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
    /**
     * 
     * {@link GetRetcodeAppByPidResponseBody} extends {@link TeaModel}
     *
     * <p>GetRetcodeAppByPidResponseBody</p>
     */
    public static class RetcodeApp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RetcodeAppType")
        private String retcodeAppType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String pid; 
            private String resourceGroupId; 
            private String retcodeAppType; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The ID of the application. The parameter is an auto-increment parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2787XXXX</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application that is monitored by Browser Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>testRetcodeAppXXXX</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The process identifier (PID) of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>b590lhguqs@9781be0f44dXXXX</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The ID of the resource group. You can obtain the resource group ID in the <strong>Resource Management</strong> console.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxidtzXXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of the application that is monitored by Browser Monitoring. Valid values:</p>
             * <ul>
             * <li><code>web</code>: web application</li>
             * <li><code>weex</code>: Weex mobile app</li>
             * <li><code>mini_dd</code>: DingTalk mini program</li>
             * <li><code>mini_alipay</code>: Alipay mini program</li>
             * <li><code>mini_wx</code>: WeChat mini program</li>
             * <li><code>mini_common</code>: mini program on other platforms</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder retcodeAppType(String retcodeAppType) {
                this.retcodeAppType = retcodeAppType;
                return this;
            }

            /**
             * <p>The tags that are attached to the instance.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public RetcodeApp build() {
                return new RetcodeApp(this);
            } 

        } 

    }
}
