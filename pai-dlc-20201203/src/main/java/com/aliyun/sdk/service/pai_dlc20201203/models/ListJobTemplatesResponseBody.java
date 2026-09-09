// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
         * <p>The list of templates.</p>
         */
        public Builder jobTemplates(java.util.List<JobTemplates> jobTemplates) {
            this.jobTemplates = jobTemplates;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0D*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
    public static class JobTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private Integer defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
        private String gmtModifyTime;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private String lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("ModifiedBy")
        private String modifiedBy;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private JobTemplates(Builder builder) {
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifyTime = builder.gmtModifyTime;
            this.lastUsedTime = builder.lastUsedTime;
            this.metadata = builder.metadata;
            this.modifiedBy = builder.modifiedBy;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobTemplates create() {
            return builder().build();
        }

        /**
         * @return defaultVersion
         */
        public Integer getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifyTime
         */
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        /**
         * @return lastUsedTime
         */
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return modifiedBy
         */
        public String getModifiedBy() {
            return this.modifiedBy;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Integer defaultVersion; 
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifyTime; 
            private String lastUsedTime; 
            private java.util.Map<String, ?> metadata; 
            private String modifiedBy; 
            private String templateId; 
            private String templateName; 
            private String tenantId; 
            private String userId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(JobTemplates model) {
                this.defaultVersion = model.defaultVersion;
                this.description = model.description;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifyTime = model.gmtModifyTime;
                this.lastUsedTime = model.lastUsedTime;
                this.metadata = model.metadata;
                this.modifiedBy = model.modifiedBy;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The default version number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder defaultVersion(Integer defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The template description.</p>
             * 
             * <strong>example:</strong>
             * <p>job description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the template was created.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-23T07:29:06Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time when the template was last modified.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-03T05:48:02Z</p>
             */
            public Builder gmtModifyTime(String gmtModifyTime) {
                this.gmtModifyTime = gmtModifyTime;
                return this;
            }

            /**
             * <p>The most recent time when a task was successfully created by using this template.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-03T11:30:00Z</p>
             */
            public Builder lastUsedTime(String lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>The custom metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the template.</p>
             * 
             * <strong>example:</strong>
             * <p>20**************26</p>
             */
            public Builder modifiedBy(String modifiedBy) {
                this.modifiedBy = modifiedBy;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tpl1r5g9ait7****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>job-template-1772516653885</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>142388383837****</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the user who created the template.</p>
             * 
             * <strong>example:</strong>
             * <p>20**************26</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>88****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public JobTemplates build() {
                return new JobTemplates(this);
            } 

        } 

    }
}
