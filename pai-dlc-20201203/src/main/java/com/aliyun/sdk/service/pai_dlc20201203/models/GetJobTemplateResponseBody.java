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
 * {@link GetJobTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobTemplateResponseBody</p>
 */
public class GetJobTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultVersion")
    private Integer defaultVersion;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("ModifiedBy")
    private String modifiedBy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List<Versions> versions;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetJobTemplateResponseBody(Builder builder) {
        this.defaultVersion = builder.defaultVersion;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.metadata = builder.metadata;
        this.modifiedBy = builder.modifiedBy;
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.tenantId = builder.tenantId;
        this.totalCount = builder.totalCount;
        this.userId = builder.userId;
        this.versions = builder.versions;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return versions
     */
    public java.util.List<Versions> getVersions() {
        return this.versions;
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
        private java.util.Map<String, ?> metadata; 
        private String modifiedBy; 
        private String requestId; 
        private String templateId; 
        private String templateName; 
        private String tenantId; 
        private Integer totalCount; 
        private String userId; 
        private java.util.List<Versions> versions; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetJobTemplateResponseBody model) {
            this.defaultVersion = model.defaultVersion;
            this.description = model.description;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifyTime = model.gmtModifyTime;
            this.metadata = model.metadata;
            this.modifiedBy = model.modifiedBy;
            this.requestId = model.requestId;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.tenantId = model.tenantId;
            this.totalCount = model.totalCount;
            this.userId = model.userId;
            this.versions = model.versions;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The default version of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder defaultVersion(Integer defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        /**
         * <p>A description of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>job template description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time the job template was created.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-08T14:17:55Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time the job template was last modified.</p>
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
         * <p>A collection of user-defined key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The ID of the user who last modified the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>20**************26</p>
         */
        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>tplmceolmf2****</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The name of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>job-template-example-1778047****</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The ID of the tenant that owns the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>142388383837****</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The total number of versions returned. This value is 1 if a specific version is queried, or the total count if all versions are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The ID of the user who created the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>20**************26</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>An array of template versions. This array contains only one version if a specific version is requested, or all versions if <code>all</code> is specified.</p>
         */
        public Builder versions(java.util.List<Versions> versions) {
            this.versions = versions;
            return this;
        }

        /**
         * <p>The ID of the workspace that contains the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>4***9</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetJobTemplateResponseBody build() {
            return new GetJobTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobTemplateResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Constraints")
        private java.util.Map<String, ?> constraints;

        @com.aliyun.core.annotation.NameInMap("Content")
        private Object content;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Versions(Builder builder) {
            this.constraints = builder.constraints;
            this.content = builder.content;
            this.createdBy = builder.createdBy;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return constraints
         */
        public java.util.Map<String, ?> getConstraints() {
            return this.constraints;
        }

        /**
         * @return content
         */
        public Object getContent() {
            return this.content;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.Map<String, ?> constraints; 
            private Object content; 
            private String createdBy; 
            private String gmtCreateTime; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.constraints = model.constraints;
                this.content = model.content;
                this.createdBy = model.createdBy;
                this.gmtCreateTime = model.gmtCreateTime;
                this.version = model.version;
            } 

            /**
             * <p>The field constraint rules. The key is a JSONPath expression and the value is a constraint type.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;JobSpecs[0].Image\&quot;:\&quot;locked\&quot;,\&quot;UserCommand\&quot;:\&quot;locked\&quot;,\&quot;JobType\&quot;:\&quot;locked\&quot;}</p>
             */
            public Builder constraints(java.util.Map<String, ?> constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * <p>The configuration of the version, in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;WorkspaceId\&quot;:\&quot;15****05\&quot;,\&quot;JobType\&quot;:\&quot;PyTorchJob\&quot;,\&quot;UserCommand\&quot;:\&quot;echo hello\&quot;,\&quot;JobSpecs\&quot;:[{\&quot;Type\&quot;:\&quot;Worker\&quot;,\&quot;PodCount\&quot;:1,\&quot;Image\&quot;:\&quot;dsw-registry-vpc.cn-hangzhou.cr.aliyuncs.com/pai/pytorch:2.8.0-gpu-py313-cu129-ubuntu22.04-3995b779-1764361782\&quot;,\&quot;EcsSpec\&quot;:\&quot;ecs.gn7i-c8g1.2xlarge\&quot;}],\&quot;ResourceType\&quot;:\&quot;ECS\&quot;,\&quot;_ResourcePaymentType\&quot;:\&quot;PostPaid\&quot;,\&quot;CredentialConfig\&quot;:{\&quot;EnableCredentialInject\&quot;:false},\&quot;Accessibility\&quot;:\&quot;PRIVATE\&quot;,\&quot;Settings\&quot;:{\&quot;JobReservedMinutes\&quot;:0,\&quot;Tags\&quot;:{}}}</p>
             */
            public Builder content(Object content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The ID of the user who created the version.</p>
             * 
             * <strong>example:</strong>
             * <p>20**************26</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time the version was created.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-08T14:17:55Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
