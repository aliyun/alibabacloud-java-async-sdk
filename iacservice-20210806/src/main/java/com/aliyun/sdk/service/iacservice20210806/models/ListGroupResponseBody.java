// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupResponseBody</p>
 */
public class ListGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("groups")
    private java.util.List<Groups> groups;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Groups> getGroups() {
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
        private java.util.List<Groups> groups; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGroupResponseBody model) {
            this.count = model.count;
            this.groups = model.groups;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of service group IDs.</p>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size, which indicates the maximum number of results returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6ED9F71-7FA8-598E-B64D-4606FB3FCCC9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupResponseBody build() {
            return new ListGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>iac</p>
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
     * {@link ListGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private Long taskCnt; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.groupId = model.groupId;
                this.isDefault = model.isDefault;
                this.moduleCnt = model.moduleCnt;
                this.name = model.name;
                this.projectId = model.projectId;
                this.sceneTestingTaskCnt = model.sceneTestingTaskCnt;
                this.tags = model.tags;
                this.taskCnt = model.taskCnt;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-14T07:19:13Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The group description.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>g-148e7853433574fffe9fec72ed9b73</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether the group is the default group.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The number of templates.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder moduleCnt(Long moduleCnt) {
                this.moduleCnt = moduleCnt;
                return this;
            }

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>p-4267dcfbf1b6d126edcadf0e949</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The number of scenario-based testing tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sceneTestingTaskCnt(Long sceneTestingTaskCnt) {
                this.sceneTestingTaskCnt = sceneTestingTaskCnt;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
