// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mobi20240411.models;

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
 * {@link CreateAppFromTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateAppFromTemplateRequest</p>
 */
public class CreateAppFromTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActualParameters")
    private String actualParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionsContent")
    private String connectionsContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabasesContent")
    private String databasesContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Icon")
    @com.aliyun.core.annotation.Validation(required = true)
    private String icon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VariablesContent")
    private String variablesContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateAppFromTemplateRequest(Builder builder) {
        super(builder);
        this.actualParameters = builder.actualParameters;
        this.connectionsContent = builder.connectionsContent;
        this.databasesContent = builder.databasesContent;
        this.description = builder.description;
        this.from = builder.from;
        this.icon = builder.icon;
        this.name = builder.name;
        this.templateId = builder.templateId;
        this.type = builder.type;
        this.variablesContent = builder.variablesContent;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppFromTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualParameters
     */
    public String getActualParameters() {
        return this.actualParameters;
    }

    /**
     * @return connectionsContent
     */
    public String getConnectionsContent() {
        return this.connectionsContent;
    }

    /**
     * @return databasesContent
     */
    public String getDatabasesContent() {
        return this.databasesContent;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return variablesContent
     */
    public String getVariablesContent() {
        return this.variablesContent;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateAppFromTemplateRequest, Builder> {
        private String actualParameters; 
        private String connectionsContent; 
        private String databasesContent; 
        private String description; 
        private String from; 
        private String icon; 
        private String name; 
        private String templateId; 
        private String type; 
        private String variablesContent; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppFromTemplateRequest request) {
            super(request);
            this.actualParameters = request.actualParameters;
            this.connectionsContent = request.connectionsContent;
            this.databasesContent = request.databasesContent;
            this.description = request.description;
            this.from = request.from;
            this.icon = request.icon;
            this.name = request.name;
            this.templateId = request.templateId;
            this.type = request.type;
            this.variablesContent = request.variablesContent;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ActualParameters.
         */
        public Builder actualParameters(String actualParameters) {
            this.putQueryParameter("ActualParameters", actualParameters);
            this.actualParameters = actualParameters;
            return this;
        }

        /**
         * ConnectionsContent.
         */
        public Builder connectionsContent(String connectionsContent) {
            this.putQueryParameter("ConnectionsContent", connectionsContent);
            this.connectionsContent = connectionsContent;
            return this;
        }

        /**
         * DatabasesContent.
         */
        public Builder databasesContent(String databasesContent) {
            this.putQueryParameter("DatabasesContent", databasesContent);
            this.databasesContent = databasesContent;
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
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder icon(String icon) {
            this.putQueryParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>4c892729-9950-4353-8146-33542b869e01</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VariablesContent.
         */
        public Builder variablesContent(String variablesContent) {
            this.putQueryParameter("VariablesContent", variablesContent);
            this.variablesContent = variablesContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1731664463*****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateAppFromTemplateRequest build() {
            return new CreateAppFromTemplateRequest(this);
        } 

    } 

}
