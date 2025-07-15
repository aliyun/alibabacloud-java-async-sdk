// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListLiveMessageAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveMessageAppsResponseBody</p>
 */
public class ListLiveMessageAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppList")
    private java.util.List<AppList> appList;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private Long nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLiveMessageAppsResponseBody(Builder builder) {
        this.appList = builder.appList;
        this.hasMore = builder.hasMore;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveMessageAppsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appList
     */
    public java.util.List<AppList> getAppList() {
        return this.appList;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextPageToken
     */
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AppList> appList; 
        private Boolean hasMore; 
        private Long nextPageToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLiveMessageAppsResponseBody model) {
            this.appList = model.appList;
            this.hasMore = model.hasMore;
            this.nextPageToken = model.nextPageToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The interactive messaging applications.</p>
         */
        public Builder appList(java.util.List<AppList> appList) {
            this.appList = appList;
            return this;
        }

        /**
         * <p>Indicates whether the current page is followed by a page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The starting page number for the next query. This parameter is returned only if the value of HasMore is true.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextPageToken(Long nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B8EB4994-1368-1458-B9F3-5B88D76D734C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLiveMessageAppsResponseBody build() {
            return new ListLiveMessageAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveMessageAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveMessageAppsResponseBody</p>
     */
    public static class AppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppSign")
        private String appSign;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataCenter")
        private String dataCenter;

        @com.aliyun.core.annotation.NameInMap("Disable")
        private String disable;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("MsgLifeCycle")
        private Integer msgLifeCycle;

        private AppList(Builder builder) {
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.appSign = builder.appSign;
            this.createTime = builder.createTime;
            this.dataCenter = builder.dataCenter;
            this.disable = builder.disable;
            this.modifyTime = builder.modifyTime;
            this.msgLifeCycle = builder.msgLifeCycle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appSign
         */
        public String getAppSign() {
            return this.appSign;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataCenter
         */
        public String getDataCenter() {
            return this.dataCenter;
        }

        /**
         * @return disable
         */
        public String getDisable() {
            return this.disable;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return msgLifeCycle
         */
        public Integer getMsgLifeCycle() {
            return this.msgLifeCycle;
        }

        public static final class Builder {
            private String appId; 
            private String appKey; 
            private String appName; 
            private String appSign; 
            private Long createTime; 
            private String dataCenter; 
            private String disable; 
            private Long modifyTime; 
            private Integer msgLifeCycle; 

            private Builder() {
            } 

            private Builder(AppList model) {
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.appName = model.appName;
                this.appSign = model.appSign;
                this.createTime = model.createTime;
                this.dataCenter = model.dataCenter;
                this.disable = model.disable;
                this.modifyTime = model.modifyTime;
                this.msgLifeCycle = model.msgLifeCycle;
            } 

            /**
             * <p>The ID of the interactive messaging application queried.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The AppKey of the interactive messaging application. It is used to authorize operations related to the application ID.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>testApp</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder appSign(String appSign) {
                this.appSign = appSign;
                return this;
            }

            /**
             * <p>The time when the application was created. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1698305471</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The live center.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder dataCenter(String dataCenter) {
                this.dataCenter = dataCenter;
                return this;
            }

            /**
             * <p>Indicates whether the interactive messaging application is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disable(String disable) {
                this.disable = disable;
                return this;
            }

            /**
             * <p>The time when the application was last modified. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1698305471</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The retention period of group messages in the application. Valid values:</p>
             * <ul>
             * <li>0 (default): 30 days</li>
             * <li>1: 90 days</li>
             * <li>2: 180 days</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder msgLifeCycle(Integer msgLifeCycle) {
                this.msgLifeCycle = msgLifeCycle;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
}
