// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateDataAgentSkillMetaRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAgentSkillMetaRequest</p>
 */
public class CreateDataAgentSkillMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadLocation")
    private String uploadLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateDataAgentSkillMetaRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.skillName = builder.skillName;
        this.uploadLocation = builder.uploadLocation;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAgentSkillMetaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return uploadLocation
     */
    public String getUploadLocation() {
        return this.uploadLocation;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDataAgentSkillMetaRequest, Builder> {
        private String description; 
        private String skillName; 
        private String uploadLocation; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAgentSkillMetaRequest request) {
            super(request);
            this.description = request.description;
            this.skillName = request.skillName;
            this.uploadLocation = request.uploadLocation;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The skill description.</p>
         * <ul>
         * <li>By default, this parameter is optional. The backend parses the ZIP package specified by UploadLocation to obtain the skill description.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>This is a demo skill description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The skill name.</p>
         * <ul>
         * <li>By default, this parameter is optional. The backend parses the ZIP package specified by UploadLocation to obtain the skill name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>data-query-skill</p>
         */
        public Builder skillName(String skillName) {
            this.putQueryParameter("SkillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>The full path for uploading the skill ZIP file.</p>
         * <ul>
         * <li>Format: The UploadDir field returned by the DescribeSkillFileUploadSignature operation concatenated with the file name.</li>
         * <li>Example: ${UploadDir}/${Filename}</li>
         * </ul>
         */
        public Builder uploadLocation(String uploadLocation) {
            this.putQueryParameter("UploadLocation", uploadLocation);
            this.uploadLocation = uploadLocation;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tmbbtfv8***********zuqko6</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDataAgentSkillMetaRequest build() {
            return new CreateDataAgentSkillMetaRequest(this);
        } 

    } 

}
