// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link ListWorkersRequest} extends {@link RequestModel}
 *
 * <p>ListWorkersRequest</p>
 */
public class ListWorkersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Credential")
    private String credential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private Group group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mcp")
    private String mcp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelProvider")
    private String modelProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionCode")
    private String versionCode;

    private ListWorkersRequest(Builder builder) {
        super(builder);
        this.agentType = builder.agentType;
        this.credential = builder.credential;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.mcp = builder.mcp;
        this.modelName = builder.modelName;
        this.modelProvider = builder.modelProvider;
        this.nameLike = builder.nameLike;
        this.nextToken = builder.nextToken;
        this.template = builder.template;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return credential
     */
    public String getCredential() {
        return this.credential;
    }

    /**
     * @return group
     */
    public Group getGroup() {
        return this.group;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mcp
     */
    public String getMcp() {
        return this.mcp;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelProvider
     */
    public String getModelProvider() {
        return this.modelProvider;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder extends Request.Builder<ListWorkersRequest, Builder> {
        private String agentType; 
        private String credential; 
        private Group group; 
        private String instanceId; 
        private Integer maxResults; 
        private String mcp; 
        private String modelName; 
        private String modelProvider; 
        private String nameLike; 
        private String nextToken; 
        private Template template; 
        private String versionCode; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkersRequest request) {
            super(request);
            this.agentType = request.agentType;
            this.credential = request.credential;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.mcp = request.mcp;
            this.modelName = request.modelName;
            this.modelProvider = request.modelProvider;
            this.nameLike = request.nameLike;
            this.nextToken = request.nextToken;
            this.template = request.template;
            this.versionCode = request.versionCode;
        } 

        /**
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * Credential.
         */
        public Builder credential(String credential) {
            this.putQueryParameter("Credential", credential);
            this.credential = credential;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(Group group) {
            String groupShrink = shrink(group, "Group", "json");
            this.putQueryParameter("Group", groupShrink);
            this.group = group;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-demo</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Mcp.
         */
        public Builder mcp(String mcp) {
            this.putQueryParameter("Mcp", mcp);
            this.mcp = mcp;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * ModelProvider.
         */
        public Builder modelProvider(String modelProvider) {
            this.putQueryParameter("ModelProvider", modelProvider);
            this.modelProvider = modelProvider;
            return this;
        }

        /**
         * NameLike.
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("NameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(Template template) {
            String templateShrink = shrink(template, "Template", "json");
            this.putQueryParameter("Template", templateShrink);
            this.template = template;
            return this;
        }

        /**
         * VersionCode.
         */
        public Builder versionCode(String versionCode) {
            this.putQueryParameter("VersionCode", versionCode);
            this.versionCode = versionCode;
            return this;
        }

        @Override
        public ListWorkersRequest build() {
            return new ListWorkersRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkersRequest} extends {@link TeaModel}
     *
     * <p>ListWorkersRequest</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Group(Builder builder) {
            this.name = builder.name;
            this.role = builder.role;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String role; 
            private String type; 

            private Builder() {
            } 

            private Builder(Group model) {
                this.name = model.name;
                this.role = model.role;
                this.type = model.type;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkersRequest} extends {@link TeaModel}
     *
     * <p>ListWorkersRequest</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Template(Builder builder) {
            this.label = builder.label;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String label; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.label = model.label;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
