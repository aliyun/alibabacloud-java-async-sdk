// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupResponseBody</p>
 */
public class ListGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("groups")
    private java.util.List < Groups> groups;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListGroupResponseBody(Builder builder) {
        this.count = builder.count;
        this.groups = builder.groups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return groups
     */
    public java.util.List < Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List < Groups> groups; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * groups.
         */
        public Builder groups(java.util.List < Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupResponseBody build() {
            return new ListGroupResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("moduleCnt")
        private Long moduleCnt;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("sceneTestingTaskCnt")
        private Long sceneTestingTaskCnt;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("taskCnt")
        private Long taskCnt;

        private Groups(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.isDefault = builder.isDefault;
            this.moduleCnt = builder.moduleCnt;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.sceneTestingTaskCnt = builder.sceneTestingTaskCnt;
            this.tags = builder.tags;
            this.taskCnt = builder.taskCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return moduleCnt
         */
        public Long getModuleCnt() {
            return this.moduleCnt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return sceneTestingTaskCnt
         */
        public Long getSceneTestingTaskCnt() {
            return this.sceneTestingTaskCnt;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskCnt
         */
        public Long getTaskCnt() {
            return this.taskCnt;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String groupId; 
            private Boolean isDefault; 
            private Long moduleCnt; 
            private String name; 
            private String projectId; 
            private Long sceneTestingTaskCnt; 
            private java.util.List < Tags> tags; 
            private Long taskCnt; 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * groupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * isDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * moduleCnt.
             */
            public Builder moduleCnt(Long moduleCnt) {
                this.moduleCnt = moduleCnt;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * sceneTestingTaskCnt.
             */
            public Builder sceneTestingTaskCnt(Long sceneTestingTaskCnt) {
                this.sceneTestingTaskCnt = sceneTestingTaskCnt;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * taskCnt.
             */
            public Builder taskCnt(Long taskCnt) {
                this.taskCnt = taskCnt;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
