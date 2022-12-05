// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageGroupResponseBody</p>
 */
public class ListMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
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

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListMessageGroupResponseBody build() {
            return new ListMessageGroupResponseBody(this);
        } 

    } 

    public static class GroupList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Status")
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
        public java.util.Map < String, String > getExtension() {
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
            private java.util.Map < String, String > extension; 
            private String groupId; 
            private Integer status; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Status.
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
    public static class Result extends TeaModel {
        @NameInMap("GroupList")
        private java.util.List < GroupList> groupList;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("Total")
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
        public java.util.List < GroupList> getGroupList() {
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
            private java.util.List < GroupList> groupList; 
            private Boolean hasMore; 
            private Integer total; 

            /**
             * GroupList.
             */
            public Builder groupList(java.util.List < GroupList> groupList) {
                this.groupList = groupList;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * Total.
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
