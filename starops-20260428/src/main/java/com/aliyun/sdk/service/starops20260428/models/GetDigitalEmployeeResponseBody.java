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
 * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
 *
 * <p>GetDigitalEmployeeResponseBody</p>
 */
public class GetDigitalEmployeeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attributes")
    private java.util.Map<String, String> attributes;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("defaultRule")
    private String defaultRule;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("employeeType")
    private String employeeType;

    @com.aliyun.core.annotation.NameInMap("knowledges")
    private Knowledges knowledges;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("sandboxNetworkPolicy")
    private SandboxNetworkPolicy sandboxNetworkPolicy;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

    @com.aliyun.core.annotation.NameInMap("toolPolicy")
    private ToolPolicy toolPolicy;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetDigitalEmployeeResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.createTime = builder.createTime;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.employeeType = builder.employeeType;
        this.knowledges = builder.knowledges;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.roleArn = builder.roleArn;
        this.sandboxNetworkPolicy = builder.sandboxNetworkPolicy;
        this.tags = builder.tags;
        this.toolPolicy = builder.toolPolicy;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalEmployeeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return employeeType
     */
    public String getEmployeeType() {
        return this.employeeType;
    }

    /**
     * @return knowledges
     */
    public Knowledges getKnowledges() {
        return this.knowledges;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return sandboxNetworkPolicy
     */
    public SandboxNetworkPolicy getSandboxNetworkPolicy() {
        return this.sandboxNetworkPolicy;
    }

    /**
     * @return tags
     */
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    /**
     * @return toolPolicy
     */
    public ToolPolicy getToolPolicy() {
        return this.toolPolicy;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.Map<String, String> attributes; 
        private String createTime; 
        private String defaultRule; 
        private String description; 
        private String displayName; 
        private String employeeType; 
        private Knowledges knowledges; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String roleArn; 
        private SandboxNetworkPolicy sandboxNetworkPolicy; 
        private java.util.List<Tag> tags; 
        private ToolPolicy toolPolicy; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetDigitalEmployeeResponseBody model) {
            this.attributes = model.attributes;
            this.createTime = model.createTime;
            this.defaultRule = model.defaultRule;
            this.description = model.description;
            this.displayName = model.displayName;
            this.employeeType = model.employeeType;
            this.knowledges = model.knowledges;
            this.name = model.name;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.roleArn = model.roleArn;
            this.sandboxNetworkPolicy = model.sandboxNetworkPolicy;
            this.tags = model.tags;
            this.toolPolicy = model.toolPolicy;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The attributes.</p>
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The default rule of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder defaultRule(String defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * <p>The description of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The display name of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The type of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder employeeType(String employeeType) {
            this.employeeType = employeeType;
            return this;
        }

        /**
         * <p>The knowledge base list.</p>
         */
        public Builder knowledges(Knowledges knowledges) {
            this.knowledges = knowledges;
            return this;
        }

        /**
         * <p>The name of the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae******ey</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::12345678912:role/testrole</p>
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The sandbox network ACL policy configuration for the digital employee.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;allowFqdns&quot;:[&quot;api.example.com&quot;],&quot;allowCidrs&quot;:[&quot;1.2.3.0/24&quot;,&quot;8.8.8.8&quot;],&quot;enableAcl&quot;:false}</p>
         */
        public Builder sandboxNetworkPolicy(SandboxNetworkPolicy sandboxNetworkPolicy) {
            this.sandboxNetworkPolicy = sandboxNetworkPolicy;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The tool policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;aliyun&quot;:{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}}</p>
         */
        public Builder toolPolicy(ToolPolicy toolPolicy) {
            this.toolPolicy = toolPolicy;
            return this;
        }

        /**
         * <p>The update time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-18T02:25:06Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetDigitalEmployeeResponseBody build() {
            return new GetDigitalEmployeeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
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
             * <p>The knowledge base attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The Bailian index ID.</p>
             * 
             * <strong>example:</strong>
             * <p>index-xxxx</p>
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * <p>The region of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The Bailian workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>llm-xxxxx</p>
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
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
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
             * <p>The Bailian knowledge base list.</p>
             */
            public Builder bailian(java.util.List<Bailian> bailian) {
                this.bailian = bailian;
                return this;
            }

            /**
             * <p>The SOP knowledge base list.</p>
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
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
     */
    public static class SandboxNetworkPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowCidrs")
        private java.util.List<String> allowCidrs;

        @com.aliyun.core.annotation.NameInMap("allowFqdns")
        private java.util.List<String> allowFqdns;

        @com.aliyun.core.annotation.NameInMap("enableAcl")
        private Boolean enableAcl;

        private SandboxNetworkPolicy(Builder builder) {
            this.allowCidrs = builder.allowCidrs;
            this.allowFqdns = builder.allowFqdns;
            this.enableAcl = builder.enableAcl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SandboxNetworkPolicy create() {
            return builder().build();
        }

        /**
         * @return allowCidrs
         */
        public java.util.List<String> getAllowCidrs() {
            return this.allowCidrs;
        }

        /**
         * @return allowFqdns
         */
        public java.util.List<String> getAllowFqdns() {
            return this.allowFqdns;
        }

        /**
         * @return enableAcl
         */
        public Boolean getEnableAcl() {
            return this.enableAcl;
        }

        public static final class Builder {
            private java.util.List<String> allowCidrs; 
            private java.util.List<String> allowFqdns; 
            private Boolean enableAcl; 

            private Builder() {
            } 

            private Builder(SandboxNetworkPolicy model) {
                this.allowCidrs = model.allowCidrs;
                this.allowFqdns = model.allowFqdns;
                this.enableAcl = model.enableAcl;
            } 

            /**
             * <p>The list of allowed CIDRs or IP addresses.</p>
             */
            public Builder allowCidrs(java.util.List<String> allowCidrs) {
                this.allowCidrs = allowCidrs;
                return this;
            }

            /**
             * <p>The list of allowed FQDNs.</p>
             */
            public Builder allowFqdns(java.util.List<String> allowFqdns) {
                this.allowFqdns = allowFqdns;
                return this;
            }

            /**
             * <p>Indicates whether the sandbox network ACL is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAcl(Boolean enableAcl) {
                this.enableAcl = enableAcl;
                return this;
            }

            public SandboxNetworkPolicy build() {
                return new SandboxNetworkPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
     */
    public static class Statements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("apiVersion")
        @Deprecated
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("decision")
        private String decision;

        @com.aliyun.core.annotation.NameInMap("product")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The list of RAM actions.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]</p>
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The API version.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-30</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>The execution policy.</p>
             * 
             * <strong>example:</strong>
             * <p>user_ack</p>
             */
            public Builder decision(String decision) {
                this.decision = decision;
                return this;
            }

            /**
             * <p>The cloud product code.</p>
             * <p>This parameter is required.</p>
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
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
     */
    public static class Aliyun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoPassPolicy")
        private java.util.List<String> autoPassPolicy;

        @com.aliyun.core.annotation.NameInMap("denyPolicy")
        private java.util.List<String> denyPolicy;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("statements")
        @Deprecated
        private java.util.List<Statements> statements;

        private Aliyun(Builder builder) {
            this.autoPassPolicy = builder.autoPassPolicy;
            this.denyPolicy = builder.denyPolicy;
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
         * @return autoPassPolicy
         */
        public java.util.List<String> getAutoPassPolicy() {
            return this.autoPassPolicy;
        }

        /**
         * @return denyPolicy
         */
        public java.util.List<String> getDenyPolicy() {
            return this.denyPolicy;
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
            private java.util.List<String> autoPassPolicy; 
            private java.util.List<String> denyPolicy; 
            private Boolean enable; 
            private java.util.List<Statements> statements; 

            private Builder() {
            } 

            private Builder(Aliyun model) {
                this.autoPassPolicy = model.autoPassPolicy;
                this.denyPolicy = model.denyPolicy;
                this.enable = model.enable;
                this.statements = model.statements;
            } 

            /**
             * <p>The auto-pass policy. Each entry is a RAM Action string in the format of product:ApiName, product:Prefix*, or product:<em>. Matched requests are automatically approved without human confirmation. If empty or not configured, built-in read-only operations (Get</em>, List*, Describe*) are automatically approved. Unmatched requests require human-in-the-loop (HIL) confirmation.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;log:Get*&quot;,&quot;log:List*&quot;]</p>
             */
            public Builder autoPassPolicy(java.util.List<String> autoPassPolicy) {
                this.autoPassPolicy = autoPassPolicy;
                return this;
            }

            /**
             * <p>The explicit deny policy with the highest priority. Each entry is a RAM Action string in the format of product:ApiName, product:Prefix*, or product:*. If empty or not configured, no operations are actively denied. STAROps directly rejects matched requests. The Pop side performs a secondary fallback check.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;ecs:RunCommand&quot;,&quot;ecs:Delete*&quot;]</p>
             */
            public Builder denyPolicy(java.util.List<String> denyPolicy) {
                this.denyPolicy = denyPolicy;
                return this;
            }

            /**
             * <p>Indicates whether the policy is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The list of Aliyun CLI tool policy statements.</p>
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
     * {@link GetDigitalEmployeeResponseBody} extends {@link TeaModel}
     *
     * <p>GetDigitalEmployeeResponseBody</p>
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
             * <p>The security policy configuration for Aliyun CLI tool calling.</p>
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
