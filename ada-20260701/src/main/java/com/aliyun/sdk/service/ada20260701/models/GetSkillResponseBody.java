// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link GetSkillResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillResponseBody</p>
 */
public class GetSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanDelete")
    private Boolean canDelete;

    @com.aliyun.core.annotation.NameInMap("CanModify")
    private Boolean canModify;

    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("DownloadUrlNetwork")
    private String downloadUrlNetwork;

    @com.aliyun.core.annotation.NameInMap("IconUrl")
    private String iconUrl;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Official")
    private Boolean official;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private GetSkillResponseBody(Builder builder) {
        this.canDelete = builder.canDelete;
        this.canModify = builder.canModify;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.downloadUrl = builder.downloadUrl;
        this.downloadUrlNetwork = builder.downloadUrlNetwork;
        this.iconUrl = builder.iconUrl;
        this.metadata = builder.metadata;
        this.name = builder.name;
        this.official = builder.official;
        this.requestId = builder.requestId;
        this.skillId = builder.skillId;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    /**
     * @return canModify
     */
    public Boolean getCanModify() {
        return this.canModify;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return downloadUrlNetwork
     */
    public String getDownloadUrlNetwork() {
        return this.downloadUrlNetwork;
    }

    /**
     * @return iconUrl
     */
    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return official
     */
    public Boolean getOfficial() {
        return this.official;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private Boolean canDelete; 
        private Boolean canModify; 
        private Long createdAt; 
        private String description; 
        private String downloadUrl; 
        private String downloadUrlNetwork; 
        private String iconUrl; 
        private Object metadata; 
        private String name; 
        private Boolean official; 
        private String requestId; 
        private String skillId; 
        private String status; 
        private Long updatedAt; 
        private String visibility; 

        private Builder() {
        } 

        private Builder(GetSkillResponseBody model) {
            this.canDelete = model.canDelete;
            this.canModify = model.canModify;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.downloadUrl = model.downloadUrl;
            this.downloadUrlNetwork = model.downloadUrlNetwork;
            this.iconUrl = model.iconUrl;
            this.metadata = model.metadata;
            this.name = model.name;
            this.official = model.official;
            this.requestId = model.requestId;
            this.skillId = model.skillId;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
            this.visibility = model.visibility;
        } 

        /**
         * <p>Indicates whether the current caller can delete the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }

        /**
         * <p>Indicates whether the current caller can modify the Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canModify(Boolean canModify) {
            this.canModify = canModify;
            return this;
        }

        /**
         * <p>The creation time of the Skill, in Unix millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1760000000000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The description in the current Skill main record.</p>
         * 
         * <strong>example:</strong>
         * <p>A Skill for performing code review and risk alerts</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The bundle download URL. Returned when a network type is specified, an accessible Artifact exists, and pre-signing succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/artifacts/code-review-v2.zip?signature=example">https://example.com/artifacts/code-review-v2.zip?signature=example</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The network type used to generate the download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder downloadUrlNetwork(String downloadUrlNetwork) {
            this.downloadUrlNetwork = downloadUrlNetwork;
            return this;
        }

        /**
         * <p>The Skill icon URL, sourced from the iconUrl in the metadata. This field may be empty if no icon is configured.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/icons/code-review.png">https://example.com/icons/code-review.png</a></p>
         */
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        /**
         * <p>The Skill metadata, mapped to the metadata field in the backend response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;skillMd&quot;:&quot;# Code Review\nCheck code quality.&quot;,&quot;artifactId&quot;:&quot;artifact_example003&quot;}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The Skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether the Skill is an official Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder official(Boolean official) {
            this.official = official;
            return this;
        }

        /**
         * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-EF0123456789</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Skill ID。</p>
         * 
         * <strong>example:</strong>
         * <p>skill_example123</p>
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        /**
         * <p>The current Skill status. Common values are DRAFT and PUBLISHED.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The update time of the Skill, in Unix millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1760000300000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The visibility of the current Skill. Common values are user and tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public GetSkillResponseBody build() {
            return new GetSkillResponseBody(this);
        } 

    } 

}
