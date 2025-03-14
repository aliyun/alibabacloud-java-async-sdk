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
 * {@link DescribeDingTalkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDingTalkResponseBody</p>
 */
public class DescribeDingTalkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionList")
    private java.util.List<ActionList> actionList;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDingTalkResponseBody(Builder builder) {
        this.actionList = builder.actionList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDingTalkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionList
     */
    public java.util.List<ActionList> getActionList() {
        return this.actionList;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ActionList> actionList; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDingTalkResponseBody model) {
            this.actionList = model.actionList;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of details of notifications.</p>
         */
        public Builder actionList(java.util.List<ActionList> actionList) {
            this.actionList = actionList;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B256A525-7E42-4BB9-A27C-9017FDDFF1A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDingTalkResponseBody build() {
            return new DescribeDingTalkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDingTalkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDingTalkResponseBody</p>
     */
    public static class ActionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("ConfigList")
        private String configList;

        @com.aliyun.core.annotation.NameInMap("DingTalkLang")
        private String dingTalkLang;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupIdList")
        private String groupIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("IntervalTime")
        private Integer intervalTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ActionList(Builder builder) {
            this.actionName = builder.actionName;
            this.aliUid = builder.aliUid;
            this.configList = builder.configList;
            this.dingTalkLang = builder.dingTalkLang;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupIdList = builder.groupIdList;
            this.id = builder.id;
            this.intervalTime = builder.intervalTime;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionList create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return configList
         */
        public String getConfigList() {
            return this.configList;
        }

        /**
         * @return dingTalkLang
         */
        public String getDingTalkLang() {
            return this.dingTalkLang;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupIdList
         */
        public String getGroupIdList() {
            return this.groupIdList;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return intervalTime
         */
        public Integer getIntervalTime() {
            return this.intervalTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String actionName; 
            private Long aliUid; 
            private String configList; 
            private String dingTalkLang; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String groupIdList; 
            private Integer id; 
            private Integer intervalTime; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(ActionList model) {
                this.actionName = model.actionName;
                this.aliUid = model.aliUid;
                this.configList = model.configList;
                this.dingTalkLang = model.dingTalkLang;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupIdList = model.groupIdList;
                this.id = model.id;
                this.intervalTime = model.intervalTime;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * <p>The name of the notification.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert notification</p>
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * <p>The UID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>12312412341</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The list of notification settings.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;vul&quot;,&quot;configItemList&quot;:[{&quot;key&quot;:&quot;key&quot;, &quot;valueList&quot;:&quot;123&quot;}]}]</p>
             */
            public Builder configList(String configList) {
                this.configList = configList;
                return this;
            }

            /**
             * <p>The language of the content within notifications. Valid values:</p>
             * <ul>
             * <li><strong>zh</strong>: Chinese</li>
             * <li><strong>en</strong>: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder dingTalkLang(String dingTalkLang) {
                this.dingTalkLang = dingTalkLang;
                return this;
            }

            /**
             * <p>The creation time. unit:millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1550828400000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1550828400000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The group IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;123,456&quot;</p>
             */
            public Builder groupIdList(String groupIdList) {
                this.groupIdList = groupIdList;
                return this;
            }

            /**
             * <p>The ID of the notification.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The interval at which the notifications are sent.unit:minute.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder intervalTime(Integer intervalTime) {
                this.intervalTime = intervalTime;
                return this;
            }

            /**
             * <p>The status of the notification. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The parameters of the notification.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send">https://oapi.dingtalk.com/robot/send</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDingTalkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDingTalkResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of messages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
