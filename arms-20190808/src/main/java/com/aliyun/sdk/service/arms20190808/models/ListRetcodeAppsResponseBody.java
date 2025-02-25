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
 * {@link ListRetcodeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRetcodeAppsResponseBody</p>
 */
public class ListRetcodeAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetcodeApps")
    private java.util.List<RetcodeApps> retcodeApps;

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
    public java.util.List<RetcodeApps> getRetcodeApps() {
        return this.retcodeApps;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RetcodeApps> retcodeApps; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99A663CB-8D7B-4B0D-A006-03C8EE38E7BB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of applications monitored by Browser Monitoring.</p>
         */
        public Builder retcodeApps(java.util.List<RetcodeApps> retcodeApps) {
            this.retcodeApps = retcodeApps;
            return this;
        }

        public ListRetcodeAppsResponseBody build() {
            return new ListRetcodeAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRetcodeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRetcodeAppsResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
     * {@link ListRetcodeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRetcodeAppsResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String nickName; 
            private String pid; 
            private String resourceGroupId; 
            private String retcodeAppType; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The ID of the application. The parameter is an auto-increment parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>16064</p>
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>A1</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The alias of the application monitored by Browser Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>B1</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The process identifier (PID) of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>atc889zkcf@d8deedfa9bf****</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxyexli2****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of the application. Valid values:</p>
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
             * <p>The tags of the task.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public RetcodeApps build() {
                return new RetcodeApps(this);
            } 

        } 

    }
}
