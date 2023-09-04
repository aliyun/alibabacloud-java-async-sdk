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
        @NameInMap("isValid")
        private Long isValid;

        @NameInMap("userId")
        private Long userId;

        @NameInMap("username")
        private String username;

        private UsersInContent(Builder builder) {
            this.isValid = builder.isValid;
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
         * @return isValid
         */
        public Long getIsValid() {
            return this.isValid;
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
            private Long isValid; 
            private Long userId; 
            private String username; 

            /**
             * isValid.
             */
            public Builder isValid(Long isValid) {
                this.isValid = isValid;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * username.
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
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * isKey.
             */
            public Builder isKey(Boolean isKey) {
                this.isKey = isKey;
                return this;
            }

            /**
             * keyNode.
             */
            public Builder keyNode(String keyNode) {
                this.keyNode = keyNode;
                return this;
            }

            /**
             * problemTimelineId.
             */
            public Builder problemTimelineId(Long problemTimelineId) {
                this.problemTimelineId = problemTimelineId;
                return this;
            }

            /**
             * time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * usersInContent.
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
