// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProjectsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPageId")
        private java.util.List < Long > accessPageId;

        @com.aliyun.core.annotation.NameInMap("AvailableHours")
        private Integer availableHours;

        @com.aliyun.core.annotation.NameInMap("ContentId")
        private String contentId;

        @com.aliyun.core.annotation.NameInMap("ContentName")
        private String contentName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InUseSessions")
        private Long inUseSessions;

        @com.aliyun.core.annotation.NameInMap("MaxHours")
        private Long maxHours;

        @com.aliyun.core.annotation.NameInMap("MaxSessions")
        private Long maxSessions;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ProjectState")
        private String projectState;

        @com.aliyun.core.annotation.NameInMap("SessionSpec")
        private String sessionSpec;

        private Data(Builder builder) {
            this.accessPageId = builder.accessPageId;
            this.availableHours = builder.availableHours;
            this.contentId = builder.contentId;
            this.contentName = builder.contentName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.inUseSessions = builder.inUseSessions;
            this.maxHours = builder.maxHours;
            this.maxSessions = builder.maxSessions;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectState = builder.projectState;
            this.sessionSpec = builder.sessionSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessPageId
         */
        public java.util.List < Long > getAccessPageId() {
            return this.accessPageId;
        }

        /**
         * @return availableHours
         */
        public Integer getAvailableHours() {
            return this.availableHours;
        }

        /**
         * @return contentId
         */
        public String getContentId() {
            return this.contentId;
        }

        /**
         * @return contentName
         */
        public String getContentName() {
            return this.contentName;
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
         * @return inUseSessions
         */
        public Long getInUseSessions() {
            return this.inUseSessions;
        }

        /**
         * @return maxHours
         */
        public Long getMaxHours() {
            return this.maxHours;
        }

        /**
         * @return maxSessions
         */
        public Long getMaxSessions() {
            return this.maxSessions;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectState
         */
        public String getProjectState() {
            return this.projectState;
        }

        /**
         * @return sessionSpec
         */
        public String getSessionSpec() {
            return this.sessionSpec;
        }

        public static final class Builder {
            private java.util.List < Long > accessPageId; 
            private Integer availableHours; 
            private String contentId; 
            private String contentName; 
            private String createTime; 
            private String description; 
            private Long inUseSessions; 
            private Long maxHours; 
            private Long maxSessions; 
            private String projectId; 
            private String projectName; 
            private String projectState; 
            private String sessionSpec; 

            /**
             * AccessPageId.
             */
            public Builder accessPageId(java.util.List < Long > accessPageId) {
                this.accessPageId = accessPageId;
                return this;
            }

            /**
             * AvailableHours.
             */
            public Builder availableHours(Integer availableHours) {
                this.availableHours = availableHours;
                return this;
            }

            /**
             * ContentId.
             */
            public Builder contentId(String contentId) {
                this.contentId = contentId;
                return this;
            }

            /**
             * ContentName.
             */
            public Builder contentName(String contentName) {
                this.contentName = contentName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InUseSessions.
             */
            public Builder inUseSessions(Long inUseSessions) {
                this.inUseSessions = inUseSessions;
                return this;
            }

            /**
             * MaxHours.
             */
            public Builder maxHours(Long maxHours) {
                this.maxHours = maxHours;
                return this;
            }

            /**
             * MaxSessions.
             */
            public Builder maxSessions(Long maxSessions) {
                this.maxSessions = maxSessions;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ProjectState.
             */
            public Builder projectState(String projectState) {
                this.projectState = projectState;
                return this;
            }

            /**
             * SessionSpec.
             */
            public Builder sessionSpec(String sessionSpec) {
                this.sessionSpec = sessionSpec;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
