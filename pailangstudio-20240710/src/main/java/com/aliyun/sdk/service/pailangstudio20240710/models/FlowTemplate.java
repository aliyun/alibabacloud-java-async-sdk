// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link FlowTemplate} extends {@link TeaModel}
 *
 * <p>FlowTemplate</p>
 */
public class FlowTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("AliyunDocumentId")
    private String aliyunDocumentId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DescriptionI18N")
    private java.util.Map<String, String> descriptionI18N;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("DisplayNameI18N")
    private java.util.Map<String, String> displayNameI18N;

    @com.aliyun.core.annotation.NameInMap("FlowFiles")
    private String flowFiles;

    @com.aliyun.core.annotation.NameInMap("FlowStoragePath")
    private String flowStoragePath;

    @com.aliyun.core.annotation.NameInMap("FlowTemplateId")
    private String flowTemplateId;

    @com.aliyun.core.annotation.NameInMap("FlowType")
    private String flowType;

    @com.aliyun.core.annotation.NameInMap("Locale")
    private String locale;

    @com.aliyun.core.annotation.NameInMap("ReferenceCount")
    private Integer referenceCount;

    @com.aliyun.core.annotation.NameInMap("TemplateGroup")
    private String templateGroup;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private FlowTemplate(Builder builder) {
        this.accessibility = builder.accessibility;
        this.aliyunDocumentId = builder.aliyunDocumentId;
        this.description = builder.description;
        this.descriptionI18N = builder.descriptionI18N;
        this.displayName = builder.displayName;
        this.displayNameI18N = builder.displayNameI18N;
        this.flowFiles = builder.flowFiles;
        this.flowStoragePath = builder.flowStoragePath;
        this.flowTemplateId = builder.flowTemplateId;
        this.flowType = builder.flowType;
        this.locale = builder.locale;
        this.referenceCount = builder.referenceCount;
        this.templateGroup = builder.templateGroup;
        this.templateName = builder.templateName;
        this.url = builder.url;
        this.version = builder.version;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlowTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return aliyunDocumentId
     */
    public String getAliyunDocumentId() {
        return this.aliyunDocumentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return descriptionI18N
     */
    public java.util.Map<String, String> getDescriptionI18N() {
        return this.descriptionI18N;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return displayNameI18N
     */
    public java.util.Map<String, String> getDisplayNameI18N() {
        return this.displayNameI18N;
    }

    /**
     * @return flowFiles
     */
    public String getFlowFiles() {
        return this.flowFiles;
    }

    /**
     * @return flowStoragePath
     */
    public String getFlowStoragePath() {
        return this.flowStoragePath;
    }

    /**
     * @return flowTemplateId
     */
    public String getFlowTemplateId() {
        return this.flowTemplateId;
    }

    /**
     * @return flowType
     */
    public String getFlowType() {
        return this.flowType;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return referenceCount
     */
    public Integer getReferenceCount() {
        return this.referenceCount;
    }

    /**
     * @return templateGroup
     */
    public String getTemplateGroup() {
        return this.templateGroup;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String aliyunDocumentId; 
        private String description; 
        private java.util.Map<String, String> descriptionI18N; 
        private String displayName; 
        private java.util.Map<String, String> displayNameI18N; 
        private String flowFiles; 
        private String flowStoragePath; 
        private String flowTemplateId; 
        private String flowType; 
        private String locale; 
        private Integer referenceCount; 
        private String templateGroup; 
        private String templateName; 
        private String url; 
        private String version; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(FlowTemplate model) {
            this.accessibility = model.accessibility;
            this.aliyunDocumentId = model.aliyunDocumentId;
            this.description = model.description;
            this.descriptionI18N = model.descriptionI18N;
            this.displayName = model.displayName;
            this.displayNameI18N = model.displayNameI18N;
            this.flowFiles = model.flowFiles;
            this.flowStoragePath = model.flowStoragePath;
            this.flowTemplateId = model.flowTemplateId;
            this.flowType = model.flowType;
            this.locale = model.locale;
            this.referenceCount = model.referenceCount;
            this.templateGroup = model.templateGroup;
            this.templateName = model.templateName;
            this.url = model.url;
            this.version = model.version;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * AliyunDocumentId.
         */
        public Builder aliyunDocumentId(String aliyunDocumentId) {
            this.aliyunDocumentId = aliyunDocumentId;
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
         * DescriptionI18N.
         */
        public Builder descriptionI18N(java.util.Map<String, String> descriptionI18N) {
            this.descriptionI18N = descriptionI18N;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * DisplayNameI18N.
         */
        public Builder displayNameI18N(java.util.Map<String, String> displayNameI18N) {
            this.displayNameI18N = displayNameI18N;
            return this;
        }

        /**
         * FlowFiles.
         */
        public Builder flowFiles(String flowFiles) {
            this.flowFiles = flowFiles;
            return this;
        }

        /**
         * FlowStoragePath.
         */
        public Builder flowStoragePath(String flowStoragePath) {
            this.flowStoragePath = flowStoragePath;
            return this;
        }

        /**
         * FlowTemplateId.
         */
        public Builder flowTemplateId(String flowTemplateId) {
            this.flowTemplateId = flowTemplateId;
            return this;
        }

        /**
         * FlowType.
         */
        public Builder flowType(String flowType) {
            this.flowType = flowType;
            return this;
        }

        /**
         * Locale.
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * ReferenceCount.
         */
        public Builder referenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }

        /**
         * TemplateGroup.
         */
        public Builder templateGroup(String templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public FlowTemplate build() {
            return new FlowTemplate(this);
        } 

    } 

}
