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
 * {@link CreateDataAgentKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAgentKnowledgeBaseRequest</p>
 */
public class CreateDataAgentKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromKbUuid")
    private String fromKbUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDataAgentKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.description = builder.description;
        this.fromKbUuid = builder.fromKbUuid;
        this.name = builder.name;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAgentKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fromKbUuid
     */
    public String getFromKbUuid() {
        return this.fromKbUuid;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDataAgentKnowledgeBaseRequest, Builder> {
        private String DMSUnit; 
        private String description; 
        private String fromKbUuid; 
        private String name; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAgentKnowledgeBaseRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.description = request.description;
            this.fromKbUuid = request.fromKbUuid;
            this.name = request.name;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FromKbUuid.
         */
        public Builder fromKbUuid(String fromKbUuid) {
            this.putQueryParameter("FromKbUuid", fromKbUuid);
            this.fromKbUuid = fromKbUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeBaseTest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8i5tw7omgaax*********n909jid</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDataAgentKnowledgeBaseRequest build() {
            return new CreateDataAgentKnowledgeBaseRequest(this);
        } 

    } 

}
