// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetPolicyCommandConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyCommandConfigRequest</p>
 */
public class SetPolicyCommandConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private CommandConfig commandConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SetPolicyCommandConfigRequest(Builder builder) {
        super(builder);
        this.commandConfig = builder.commandConfig;
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyCommandConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandConfig
     */
    public CommandConfig getCommandConfig() {
        return this.commandConfig;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetPolicyCommandConfigRequest, Builder> {
        private CommandConfig commandConfig; 
        private String instanceId; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyCommandConfigRequest request) {
            super(request);
            this.commandConfig = request.commandConfig;
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The command control settings.</p>
         * <blockquote>
         * <p>This parameter applies only to Linux hosts.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder commandConfig(CommandConfig commandConfig) {
            String commandConfigShrink = shrink(commandConfig, "CommandConfig", "json");
            this.putQueryParameter("CommandConfig", commandConfigShrink);
            this.commandConfig = commandConfig;
            return this;
        }

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1ghxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the control policy that you want to modify.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetPolicyCommandConfigRequest build() {
            return new SetPolicyCommandConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetPolicyCommandConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyCommandConfigRequest</p>
     */
    public static class Approval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List < String > commands;

        private Approval(Builder builder) {
            this.commands = builder.commands;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Approval create() {
            return builder().build();
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        public static final class Builder {
            private java.util.List < String > commands; 

            /**
             * <p>The commands that can be run only after approval.</p>
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            public Approval build() {
                return new Approval(this);
            } 

        } 

    }
    /**
     * 
     * {@link SetPolicyCommandConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyCommandConfigRequest</p>
     */
    public static class Deny extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("Commands")
        private java.util.List < String > commands;

        private Deny(Builder builder) {
            this.aclType = builder.aclType;
            this.commands = builder.commands;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deny create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return commands
         */
        public java.util.List < String > getCommands() {
            return this.commands;
        }

        public static final class Builder {
            private String aclType; 
            private java.util.List < String > commands; 

            /**
             * <p>The type of command control. Valid values:</p>
             * <ul>
             * <li><strong>black</strong>: blacklist mode.</li>
             * <li><strong>white</strong>: whitelist mode.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>The commands to be controlled.</p>
             * <blockquote>
             * <p>This parameter is required if AclType is set to white.</p>
             * </blockquote>
             */
            public Builder commands(java.util.List < String > commands) {
                this.commands = commands;
                return this;
            }

            public Deny build() {
                return new Deny(this);
            } 

        } 

    }
    /**
     * 
     * {@link SetPolicyCommandConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyCommandConfigRequest</p>
     */
    public static class CommandConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Approval")
        private Approval approval;

        @com.aliyun.core.annotation.NameInMap("Deny")
        @com.aliyun.core.annotation.Validation(required = true)
        private Deny deny;

        private CommandConfig(Builder builder) {
            this.approval = builder.approval;
            this.deny = builder.deny;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandConfig create() {
            return builder().build();
        }

        /**
         * @return approval
         */
        public Approval getApproval() {
            return this.approval;
        }

        /**
         * @return deny
         */
        public Deny getDeny() {
            return this.deny;
        }

        public static final class Builder {
            private Approval approval; 
            private Deny deny; 

            /**
             * <p>The command approval settings.</p>
             * <blockquote>
             * <p>A command approval policy is used to approve the commands that are excluded from a whitelist or blacklist specified in a command control policy. The command control policy takes precedence over the command approval policy in validation.</p>
             * </blockquote>
             */
            public Builder approval(Approval approval) {
                this.approval = approval;
                return this;
            }

            /**
             * <p>The command control settings.</p>
             * <p>This parameter is required.</p>
             */
            public Builder deny(Deny deny) {
                this.deny = deny;
                return this;
            }

            public CommandConfig build() {
                return new CommandConfig(this);
            } 

        } 

    }
}
