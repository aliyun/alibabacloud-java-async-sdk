// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPolicyCommandConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyCommandConfigRequest</p>
 */
public class SetPolicyCommandConfigRequest extends Request {
    @Query
    @NameInMap("CommandConfig")
    @Validation(required = true)
    private CommandConfig commandConfig;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
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
         * CommandConfig.
         */
        public Builder commandConfig(CommandConfig commandConfig) {
            String commandConfigShrink = shrink(commandConfig, "CommandConfig", "json");
            this.putQueryParameter("CommandConfig", commandConfigShrink);
            this.commandConfig = commandConfig;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RegionId.
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

    public static class Approval extends TeaModel {
        @NameInMap("Commands")
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
             * Commands.
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
    public static class Deny extends TeaModel {
        @NameInMap("AclType")
        @Validation(required = true)
        private String aclType;

        @NameInMap("Commands")
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
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * Commands.
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
    public static class CommandConfig extends TeaModel {
        @NameInMap("Approval")
        private Approval approval;

        @NameInMap("Deny")
        @Validation(required = true)
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
             * Approval.
             */
            public Builder approval(Approval approval) {
                this.approval = approval;
                return this;
            }

            /**
             * Deny.
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
