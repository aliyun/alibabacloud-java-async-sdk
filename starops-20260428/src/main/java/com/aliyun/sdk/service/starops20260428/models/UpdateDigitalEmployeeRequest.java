// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link UpdateDigitalEmployeeRequest} extends {@link RequestModel}
 *
 * <p>UpdateDigitalEmployeeRequest</p>
 */
public class UpdateDigitalEmployeeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultRule")
    private String defaultRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("knowledges")
    private Knowledges knowledges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("toolPolicy")
    private ToolPolicy toolPolicy;

    private UpdateDigitalEmployeeRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.attributes = builder.attributes;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.knowledges = builder.knowledges;
        this.roleArn = builder.roleArn;
        this.toolPolicy = builder.toolPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDigitalEmployeeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return attributes
     */
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    /**
     * @return defaultRule
     */
    public String getDefaultRule() {
        return this.defaultRule;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return knowledges
     */
    public Knowledges getKnowledges() {
        return this.knowledges;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return toolPolicy
     */
    public ToolPolicy getToolPolicy() {
        return this.toolPolicy;
    }

    public static final class Builder extends Request.Builder<UpdateDigitalEmployeeRequest, Builder> {
        private String name; 
        private String regionId; 
        private java.util.Map<String, String> attributes; 
        private String defaultRule; 
        private String description; 
        private String displayName; 
        private Knowledges knowledges; 
        private String roleArn; 
        private ToolPolicy toolPolicy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDigitalEmployeeRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
            this.attributes = request.attributes;
            this.defaultRule = request.defaultRule;
            this.description = request.description;
            this.displayName = request.displayName;
            this.knowledges = request.knowledges;
            this.roleArn = request.roleArn;
            this.toolPolicy = request.toolPolicy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * attributes.
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            this.putBodyParameter("attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        /**
         * defaultRule.
         */
        public Builder defaultRule(String defaultRule) {
            this.putBodyParameter("defaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * knowledges.
         */
        public Builder knowledges(Knowledges knowledges) {
            this.putBodyParameter("knowledges", knowledges);
            this.knowledges = knowledges;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("roleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>数字员工工具调用安全策略配置。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aliyun&quot;:{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}}</p>
         */
        public Builder toolPolicy(ToolPolicy toolPolicy) {
            this.putBodyParameter("toolPolicy", toolPolicy);
            this.toolPolicy = toolPolicy;
            return this;
        }

        @Override
        public UpdateDigitalEmployeeRequest build() {
            return new UpdateDigitalEmployeeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDigitalEmployeeRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeRequest</p>
     */
    public static class Bailian extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("indexId")
        private String indexId;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Bailian(Builder builder) {
            this.attributes = builder.attributes;
            this.indexId = builder.indexId;
            this.region = builder.region;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bailian create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String attributes; 
            private String indexId; 
            private String region; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Bailian model) {
                this.attributes = model.attributes;
                this.indexId = model.indexId;
                this.region = model.region;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * indexId.
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Bailian build() {
                return new Bailian(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDigitalEmployeeRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeRequest</p>
     */
    public static class Knowledges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bailian")
        private java.util.List<Bailian> bailian;

        @com.aliyun.core.annotation.NameInMap("sop")
        private java.util.List<java.util.Map<String, ?>> sop;

        private Knowledges(Builder builder) {
            this.bailian = builder.bailian;
            this.sop = builder.sop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Knowledges create() {
            return builder().build();
        }

        /**
         * @return bailian
         */
        public java.util.List<Bailian> getBailian() {
            return this.bailian;
        }

        /**
         * @return sop
         */
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

        public static final class Builder {
            private java.util.List<Bailian> bailian; 
            private java.util.List<java.util.Map<String, ?>> sop; 

            private Builder() {
            } 

            private Builder(Knowledges model) {
                this.bailian = model.bailian;
                this.sop = model.sop;
            } 

            /**
             * bailian.
             */
            public Builder bailian(java.util.List<Bailian> bailian) {
                this.bailian = bailian;
                return this;
            }

            /**
             * sop.
             */
            public Builder sop(java.util.List<java.util.Map<String, ?>> sop) {
                this.sop = sop;
                return this;
            }

            public Knowledges build() {
                return new Knowledges(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDigitalEmployeeRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeRequest</p>
     */
    public static class Statements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("apiVersion")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("decision")
        private String decision;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        private Statements(Builder builder) {
            this.actions = builder.actions;
            this.apiVersion = builder.apiVersion;
            this.decision = builder.decision;
            this.product = builder.product;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statements create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return decision
         */
        public String getDecision() {
            return this.decision;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private String apiVersion; 
            private String decision; 
            private String product; 

            private Builder() {
            } 

            private Builder(Statements model) {
                this.actions = model.actions;
                this.apiVersion = model.apiVersion;
                this.decision = model.decision;
                this.product = model.product;
            } 

            /**
             * <p>Aliyun OpenAPI Action 列表，格式为 product:ApiName、product:Prefix* 或 product:*。</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>本条语句对应的 Aliyun OpenAPI API 版本。</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-30</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>命中该 API 后的执行策略。</p>
             * 
             * <strong>example:</strong>
             * <p>user_ack</p>
             */
            public Builder decision(String decision) {
                this.decision = decision;
                return this;
            }

            /**
             * <p>本条语句对应的 Aliyun OpenAPI 产品名。</p>
             * 
             * <strong>example:</strong>
             * <p>Sls</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            public Statements build() {
                return new Statements(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDigitalEmployeeRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeRequest</p>
     */
    public static class Aliyun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("statements")
        private java.util.List<Statements> statements;

        private Aliyun(Builder builder) {
            this.enable = builder.enable;
            this.statements = builder.statements;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aliyun create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return statements
         */
        public java.util.List<Statements> getStatements() {
            return this.statements;
        }

        public static final class Builder {
            private Boolean enable; 
            private java.util.List<Statements> statements; 

            private Builder() {
            } 

            private Builder(Aliyun model) {
                this.enable = model.enable;
                this.statements = model.statements;
            } 

            /**
             * <p>是否启用 Aliyun MCP 工具策略。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>Aliyun OpenAPI 工具策略语句列表。</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]</p>
             */
            public Builder statements(java.util.List<Statements> statements) {
                this.statements = statements;
                return this;
            }

            public Aliyun build() {
                return new Aliyun(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateDigitalEmployeeRequest} extends {@link TeaModel}
     *
     * <p>UpdateDigitalEmployeeRequest</p>
     */
    public static class ToolPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aliyun")
        private Aliyun aliyun;

        private ToolPolicy(Builder builder) {
            this.aliyun = builder.aliyun;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolPolicy create() {
            return builder().build();
        }

        /**
         * @return aliyun
         */
        public Aliyun getAliyun() {
            return this.aliyun;
        }

        public static final class Builder {
            private Aliyun aliyun; 

            private Builder() {
            } 

            private Builder(ToolPolicy model) {
                this.aliyun = model.aliyun;
            } 

            /**
             * <p>Aliyun MCP 工具调用安全策略配置。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}</p>
             */
            public Builder aliyun(Aliyun aliyun) {
                this.aliyun = aliyun;
                return this;
            }

            public ToolPolicy build() {
                return new ToolPolicy(this);
            } 

        } 

    }
}
