// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemTimeLinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProblemTimeLinesResponseBody</p>
 */
public class ListProblemTimeLinesResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private ListProblemTimeLinesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProblemTimeLinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProblemTimeLinesResponseBody build() {
            return new ListProblemTimeLinesResponseBody(this);
        } 

    } 

    public static class UsersInContent extends TeaModel {
        @NameInMap("userId")
        private Long userId;

        @NameInMap("username")
        private String username;

        private UsersInContent(Builder builder) {
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsersInContent create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private Long userId; 
            private String username; 

            /**
             * 用户id
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 用户名
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public UsersInContent build() {
                return new UsersInContent(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("isKey")
        private Boolean isKey;

        @NameInMap("keyNode")
        private String keyNode;

        @NameInMap("problemTimelineId")
        private Long problemTimelineId;

        @NameInMap("time")
        private String time;

        @NameInMap("updateTime")
        private String updateTime;

        @NameInMap("usersInContent")
        private java.util.List < UsersInContent> usersInContent;

        private Data(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.isKey = builder.isKey;
            this.keyNode = builder.keyNode;
            this.problemTimelineId = builder.problemTimelineId;
            this.time = builder.time;
            this.updateTime = builder.updateTime;
            this.usersInContent = builder.usersInContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isKey
         */
        public Boolean getIsKey() {
            return this.isKey;
        }

        /**
         * @return keyNode
         */
        public String getKeyNode() {
            return this.keyNode;
        }

        /**
         * @return problemTimelineId
         */
        public Long getProblemTimelineId() {
            return this.problemTimelineId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return usersInContent
         */
        public java.util.List < UsersInContent> getUsersInContent() {
            return this.usersInContent;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private Boolean isKey; 
            private String keyNode; 
            private Long problemTimelineId; 
            private String time; 
            private String updateTime; 
            private java.util.List < UsersInContent> usersInContent; 

            /**
             * 内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 是否是关键字 true是 false不是 默认 false
             */
            public Builder isKey(Boolean isKey) {
                this.isKey = isKey;
                return this;
            }

            /**
             * 关键节点 码表:PROBLEM_KEY_NODE (逗号分隔)
             */
            public Builder keyNode(String keyNode) {
                this.keyNode = keyNode;
                return this;
            }

            /**
             * 时间线id
             */
            public Builder problemTimelineId(Long problemTimelineId) {
                this.problemTimelineId = problemTimelineId;
                return this;
            }

            /**
             * 展示时间
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * 内容中的用户信息
             */
            public Builder usersInContent(java.util.List < UsersInContent> usersInContent) {
                this.usersInContent = usersInContent;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
