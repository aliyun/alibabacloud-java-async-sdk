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
 * {@link ListMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageGroupResponseBody</p>
 */
public class ListMessageGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private ListMessageGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageGroupResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ListMessageGroupResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-****-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMessageGroupResponseBody build() {
            return new ListMessageGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageGroupResponseBody</p>
     */
    public static class GroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private java.util.Map<String, String> extension;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private GroupList(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.extension = builder.extension;
            this.groupId = builder.groupId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return extension
         */
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private Long createTime; 
            private String creatorId; 
            private java.util.Map<String, String> extension; 
            private String groupId; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(GroupList model) {
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.extension = model.extension;
                this.groupId = model.groupId;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the interactive messaging application.</p>
             * 
             * <strong>example:</strong>
             * <p>VKL3***</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the message group was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1502280113</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>as****hs</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The extended field.</p>
             */
            public Builder extension(java.util.Map<String, String> extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The ID of the message group.</p>
             * 
             * <strong>example:</strong>
             * <p>AE35-****-T95F</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The status of the message group. The default value is <strong>1</strong>, which indicates that the status of the message group is normal.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public GroupList build() {
                return new GroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMessageGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageGroupResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupList")
        private java.util.List<GroupList> groupList;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Result(Builder builder) {
            this.groupList = builder.groupList;
            this.hasMore = builder.hasMore;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return groupList
         */
        public java.util.List<GroupList> getGroupList() {
            return this.groupList;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<GroupList> groupList; 
            private Boolean hasMore; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.groupList = model.groupList;
                this.hasMore = model.hasMore;
                this.total = model.total;
            } 

            /**
             * <p>The list of message groups.</p>
             */
            public Builder groupList(java.util.List<GroupList> groupList) {
                this.groupList = groupList;
                return this;
            }

            /**
             * <p>Indicates whether the current page is followed by another page. Valid values:</p>
             * <ul>
             * <li>true: The current page is followed by another page.</li>
             * <li>false: The current page is not followed by another page.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The total number of message groups.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
