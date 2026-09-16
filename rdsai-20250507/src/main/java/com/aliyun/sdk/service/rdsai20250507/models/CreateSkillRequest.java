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
 * {@link CreateSkillRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillRequest</p>
 */
public class CreateSkillRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("UploadId")
    private String uploadId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadToken")
    private String uploadToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateSkillRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.dbtypes = builder.dbtypes;
        this.description = builder.description;
        this.name = builder.name;
        this.uploadId = builder.uploadId;
        this.uploadToken = builder.uploadToken;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillRequest create() {
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

    public static final class Builder extends Request.Builder<CreateSkillRequest, Builder> {
        private java.util.Map<String, ?> content; 
        private java.util.List<String> dbtypes; 
        private String description; 
        private String name; 
        private String uploadId; 
        private String uploadToken; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillRequest request) {
            super(request);
            this.content = request.content;
            this.dbtypes = request.dbtypes;
            this.description = request.description;
            this.name = request.name;
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
         * <p>The Skill description. The description can be up to 1000 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>SQL query optimization skill</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The Skill name. The name can contain only lowercase letters, digits, and hyphens.</p>
         * 
         * <strong>example:</strong>
         * <p>query-optimization</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The Skill upload session ID.</p>
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
         * <p>The Skill upload session token.</p>
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
         * <p>The ContextDB workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-4000-8000-000000000001</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateSkillRequest build() {
            return new CreateSkillRequest(this);
        } 

    } 

}
