// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link UpdateSkillRequest} extends {@link RequestModel}
 *
 * <p>UpdateSkillRequest</p>
 */
public class UpdateSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.Map<String, ?> content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dbtypes")
    private java.util.List<String> dbtypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateNote")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String updateNote;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadId")
    private String uploadId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadToken")
    private String uploadToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private UpdateSkillRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.name = builder.name;
        this.skillId = builder.skillId;
        this.updateNote = builder.updateNote;
        this.uploadId = builder.uploadId;
        this.uploadToken = builder.uploadToken;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    /**
     * @return dbtypes
     */
    public java.util.List<String> getDbtypes() {
        return this.dbtypes;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return updateNote
     */
    public String getUpdateNote() {
        return this.updateNote;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * @return uploadToken
     */
    public String getUploadToken() {
        return this.uploadToken;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateSkillRequest, Builder> {
        private java.util.Map<String, ?> content; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String name; 
        private String skillId; 
        private String updateNote; 
        private String uploadId; 
        private String uploadToken; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSkillRequest request) {
            super(request);
            this.content = request.content;
            this.dbtypes = request.dbtypes;
            this.description = request.description;
            this.name = request.name;
            this.skillId = request.skillId;
            this.updateNote = request.updateNote;
            this.uploadId = request.uploadId;
            this.uploadToken = request.uploadToken;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MySQL&quot;: &quot;MySQL optimization guide...&quot;,&quot;PostgreSQL&quot;: &quot;PostgreSQL optimization guide...&quot;}</p>
         */
        public Builder content(java.util.Map<String, ?> content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>The list of database types.</p>
         */
        public Builder dbtypes(java.util.List<String> dbtypes) {
            String dbtypesShrink = shrink(dbtypes, "Dbtypes", "json");
            this.putQueryParameter("Dbtypes", dbtypesShrink);
            this.dbtypes = dbtypes;
            return this;
        }

        /**
         * <p>The description of the Skill. The description can be up to 1000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL Review Expert: Comprehensively reviews SQL for security, performance, and compliance, identifies risks, and provides optimization suggestions. Activated immediately when a user submits SQL or asks &quot;SQL review&quot;, &quot;SQL Review&quot;, &quot;any risks?&quot;, or &quot;how to optimize&quot;</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the Skill. The name can contain only lowercase letters, digits, and hyphens.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-optimization</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The unique identifier of the Skill.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8f6a2111-3828-4a9f-a3ce-51ce73c6****</p>
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * <p>The version update note for the ContextDB Skill. Specify this parameter when confirming storage after the check passes. The note can be up to 1000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Update Skill documentation</p>
         */
        public Builder updateNote(String updateNote) {
            this.putQueryParameter("UpdateNote", updateNote);
            this.updateNote = updateNote;
            return this;
        }

        /**
         * <p>The upload session ID returned by GetUploadPolicy for ContextDB full package updates. This parameter is not required for original RDS field updates.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-example</p>
         */
        public Builder uploadId(String uploadId) {
            this.putQueryParameter("UploadId", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>The upload session token paired with UploadId, used to verify ownership. This parameter is not required for original RDS field updates.</p>
         * 
         * <strong>example:</strong>
         * <p>token-example</p>
         */
        public Builder uploadToken(String uploadToken) {
            this.putQueryParameter("UploadToken", uploadToken);
            this.uploadToken = uploadToken;
            return this;
        }

        /**
         * <p>The ContextDB workspace ID. This parameter is not required for regular Skill calls.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateSkillRequest build() {
            return new UpdateSkillRequest(this);
        } 

    } 

}
