// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link DeleteWorkflowTemplateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWorkflowTemplateVersionResponseBody</p>
 */
public class DeleteWorkflowTemplateVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("effectiveVersion")
    private String effectiveVersion;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("templateId")
    private String templateId;

    private DeleteWorkflowTemplateVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.effectiveVersion = builder.effectiveVersion;
        this.items = builder.items;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkflowTemplateVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return effectiveVersion
     */
    public String getEffectiveVersion() {
        return this.effectiveVersion;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String code; 
        private String effectiveVersion; 
        private java.util.List<Items> items; 
        private String message; 
        private String requestId; 
        private String templateId; 

        private Builder() {
        } 

        private Builder(DeleteWorkflowTemplateVersionResponseBody model) {
            this.code = model.code;
            this.effectiveVersion = model.effectiveVersion;
            this.items = model.items;
            this.message = model.message;
            this.requestId = model.requestId;
            this.templateId = model.templateId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The current active version number. An empty value indicates that only a draft exists.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder effectiveVersion(String effectiveVersion) {
            this.effectiveVersion = effectiveVersion;
            return this;
        }

        /**
         * <p>All remaining versions after deletion, sorted in descending order by version number.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl_example</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public DeleteWorkflowTemplateVersionResponseBody build() {
            return new DeleteWorkflowTemplateVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteWorkflowTemplateVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteWorkflowTemplateVersionResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdByUserId")
        private Long createdByUserId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("gmtSubmitted")
        private String gmtSubmitted;

        @com.aliyun.core.annotation.NameInMap("isEffective")
        private Boolean isEffective;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceVersion")
        private String sourceVersion;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("stepCount")
        private Long stepCount;

        @com.aliyun.core.annotation.NameInMap("submittedByUserId")
        private Long submittedByUserId;

        @com.aliyun.core.annotation.NameInMap("updatedByUserId")
        private Long updatedByUserId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("versionDescription")
        private String versionDescription;

        private Items(Builder builder) {
            this.createdByUserId = builder.createdByUserId;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.gmtSubmitted = builder.gmtSubmitted;
            this.isEffective = builder.isEffective;
            this.name = builder.name;
            this.sourceVersion = builder.sourceVersion;
            this.status = builder.status;
            this.stepCount = builder.stepCount;
            this.submittedByUserId = builder.submittedByUserId;
            this.updatedByUserId = builder.updatedByUserId;
            this.version = builder.version;
            this.versionDescription = builder.versionDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createdByUserId
         */
        public Long getCreatedByUserId() {
            return this.createdByUserId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtSubmitted
         */
        public String getGmtSubmitted() {
            return this.gmtSubmitted;
        }

        /**
         * @return isEffective
         */
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceVersion
         */
        public String getSourceVersion() {
            return this.sourceVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stepCount
         */
        public Long getStepCount() {
            return this.stepCount;
        }

        /**
         * @return submittedByUserId
         */
        public Long getSubmittedByUserId() {
            return this.submittedByUserId;
        }

        /**
         * @return updatedByUserId
         */
        public Long getUpdatedByUserId() {
            return this.updatedByUserId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionDescription
         */
        public String getVersionDescription() {
            return this.versionDescription;
        }

        public static final class Builder {
            private Long createdByUserId; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String gmtSubmitted; 
            private Boolean isEffective; 
            private String name; 
            private String sourceVersion; 
            private String status; 
            private Long stepCount; 
            private Long submittedByUserId; 
            private Long updatedByUserId; 
            private String version; 
            private String versionDescription; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createdByUserId = model.createdByUserId;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.gmtSubmitted = model.gmtSubmitted;
                this.isEffective = model.isEffective;
                this.name = model.name;
                this.sourceVersion = model.sourceVersion;
                this.status = model.status;
                this.stepCount = model.stepCount;
                this.submittedByUserId = model.submittedByUserId;
                this.updatedByUserId = model.updatedByUserId;
                this.version = model.version;
                this.versionDescription = model.versionDescription;
            } 

            /**
             * <p>The ID of the user who created the version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createdByUserId(Long createdByUserId) {
                this.createdByUserId = createdByUserId;
                return this;
            }

            /**
             * <p>The description of the template for this version. This can be used for display when version v1 has no version description.</p>
             * 
             * <strong>example:</strong>
             * <p>Automatically generate weekly reports</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the version was created. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-19T10:00:00+08:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the version was modified. The time is in the ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-19T10:00:00+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The time when the version was submitted. The time is in the ISO 8601 format. This is empty for a draft.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-19T10:00:00+08:00</p>
             */
            public Builder gmtSubmitted(String gmtSubmitted) {
                this.gmtSubmitted = gmtSubmitted;
                return this;
            }

            /**
             * <p>Indicates whether the version is the only current active version.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isEffective(Boolean isEffective) {
                this.isEffective = isEffective;
                return this;
            }

            /**
             * <p>The name of the template for this version.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The submitted version number on which this version is based. This is empty for a newly created v1 version. Saving or submitting a draft retains the original source version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder sourceVersion(String sourceVersion) {
                this.sourceVersion = sourceVersion;
                return this;
            }

            /**
             * <p>The version status. Valid values: DRAFT (draft) and SUBMITTED (submitted).</p>
             * 
             * <strong>example:</strong>
             * <p>DRAFT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of steps in this version.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder stepCount(Long stepCount) {
                this.stepCount = stepCount;
                return this;
            }

            /**
             * <p>The ID of the user who submitted the version. This is empty for a draft.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder submittedByUserId(Long submittedByUserId) {
                this.submittedByUserId = submittedByUserId;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder updatedByUserId(Long updatedByUserId) {
                this.updatedByUserId = updatedByUserId;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The persisted version change description. An empty value indicates that no description is provided.</p>
             * 
             * <strong>example:</strong>
             * <p>Added an approval step</p>
             */
            public Builder versionDescription(String versionDescription) {
                this.versionDescription = versionDescription;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
