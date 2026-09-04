// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobTemplatesResponseBody</p>
 */
public class ListJobTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobTemplates")
    private java.util.List<JobTemplates> jobTemplates;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobTemplatesResponseBody(Builder builder) {
        this.jobTemplates = builder.jobTemplates;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobTemplates
     */
    public java.util.List<JobTemplates> getJobTemplates() {
        return this.jobTemplates;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<JobTemplates> jobTemplates; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListJobTemplatesResponseBody model) {
            this.jobTemplates = model.jobTemplates;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * JobTemplates.
         */
        public Builder jobTemplates(java.util.List<JobTemplates> jobTemplates) {
            this.jobTemplates = jobTemplates;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobTemplatesResponseBody build() {
            return new ListJobTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobTemplatesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link ListJobTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobTemplatesResponseBody</p>
     */
    public static class JobTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobTemplateDescription")
        private String jobTemplateDescription;

        @com.aliyun.core.annotation.NameInMap("JobTemplateId")
        private String jobTemplateId;

        @com.aliyun.core.annotation.NameInMap("JobTemplateName")
        private String jobTemplateName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private JobTemplates(Builder builder) {
            this.createTime = builder.createTime;
            this.jobTemplateDescription = builder.jobTemplateDescription;
            this.jobTemplateId = builder.jobTemplateId;
            this.jobTemplateName = builder.jobTemplateName;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobTemplates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobTemplateDescription
         */
        public String getJobTemplateDescription() {
            return this.jobTemplateDescription;
        }

        /**
         * @return jobTemplateId
         */
        public String getJobTemplateId() {
            return this.jobTemplateId;
        }

        /**
         * @return jobTemplateName
         */
        public String getJobTemplateName() {
            return this.jobTemplateName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String jobTemplateDescription; 
            private String jobTemplateId; 
            private String jobTemplateName; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(JobTemplates model) {
                this.createTime = model.createTime;
                this.jobTemplateDescription = model.jobTemplateDescription;
                this.jobTemplateId = model.jobTemplateId;
                this.jobTemplateName = model.jobTemplateName;
                this.status = model.status;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * JobTemplateDescription.
             */
            public Builder jobTemplateDescription(String jobTemplateDescription) {
                this.jobTemplateDescription = jobTemplateDescription;
                return this;
            }

            /**
             * JobTemplateId.
             */
            public Builder jobTemplateId(String jobTemplateId) {
                this.jobTemplateId = jobTemplateId;
                return this;
            }

            /**
             * JobTemplateName.
             */
            public Builder jobTemplateName(String jobTemplateName) {
                this.jobTemplateName = jobTemplateName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public JobTemplates build() {
                return new JobTemplates(this);
            } 

        } 

    }
}
