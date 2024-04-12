// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyResponseBody</p>
 */
public class GetPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    private Policy policy;

    @NameInMap("RequestId")
    private String requestId;

    private GetPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        /**
         * Policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicyResponseBody build() {
            return new GetPolicyResponseBody(this);
        } 

    } 

    public static class EffectiveTime extends TeaModel {
        @NameInMap("Days")
        private java.util.List < String > days;

        @NameInMap("Hours")
        private java.util.List < String > hours;

        private EffectiveTime(Builder builder) {
            this.days = builder.days;
            this.hours = builder.hours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveTime create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < String > getDays() {
            return this.days;
        }

        /**
         * @return hours
         */
        public java.util.List < String > getHours() {
            return this.hours;
        }

        public static final class Builder {
            private java.util.List < String > days; 
            private java.util.List < String > hours; 

            /**
             * Days.
             */
            public Builder days(java.util.List < String > days) {
                this.days = days;
                return this;
            }

            /**
             * Hours.
             */
            public Builder hours(java.util.List < String > hours) {
                this.hours = hours;
                return this;
            }

            public EffectiveTime build() {
                return new EffectiveTime(this);
            } 

        } 

    }
    public static class AccessTimeRangeConfig extends TeaModel {
        @NameInMap("EffectiveTime")
        private java.util.List < EffectiveTime> effectiveTime;

        private AccessTimeRangeConfig(Builder builder) {
            this.effectiveTime = builder.effectiveTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessTimeRangeConfig create() {
            return builder().build();
        }

        /**
         * @return effectiveTime
         */
        public java.util.List < EffectiveTime> getEffectiveTime() {
            return this.effectiveTime;
        }

        public static final class Builder {
            private java.util.List < EffectiveTime> effectiveTime; 

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(java.util.List < EffectiveTime> effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            public AccessTimeRangeConfig build() {
                return new AccessTimeRangeConfig(this);
            } 

        } 

    }
    public static class ApprovalConfig extends TeaModel {
        @NameInMap("SwitchStatus")
        private String switchStatus;

        private ApprovalConfig(Builder builder) {
            this.switchStatus = builder.switchStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovalConfig create() {
            return builder().build();
        }

        /**
         * @return switchStatus
         */
        public String getSwitchStatus() {
            return this.switchStatus;
        }

        public static final class Builder {
            private String switchStatus; 

            /**
             * SwitchStatus.
             */
            public Builder switchStatus(String switchStatus) {
                this.switchStatus = switchStatus;
                return this;
            }

            public ApprovalConfig build() {
                return new ApprovalConfig(this);
            } 

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
    public static class IPAclConfig extends TeaModel {
        @NameInMap("AclType")
        private String aclType;

        @NameInMap("IPs")
        private java.util.List < String > iPs;

        private IPAclConfig(Builder builder) {
            this.aclType = builder.aclType;
            this.iPs = builder.iPs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPAclConfig create() {
            return builder().build();
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return iPs
         */
        public java.util.List < String > getIPs() {
            return this.iPs;
        }

        public static final class Builder {
            private String aclType; 
            private java.util.List < String > iPs; 

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * IPs.
             */
            public Builder iPs(java.util.List < String > iPs) {
                this.iPs = iPs;
                return this;
            }

            public IPAclConfig build() {
                return new IPAclConfig(this);
            } 

        } 

    }
    public static class RDP extends TeaModel {
        @NameInMap("ClipboardDownload")
        private String clipboardDownload;

        @NameInMap("ClipboardUpload")
        private String clipboardUpload;

        @NameInMap("DiskRedirection")
        private String diskRedirection;

        @NameInMap("RecordKeyboard")
        private String recordKeyboard;

        private RDP(Builder builder) {
            this.clipboardDownload = builder.clipboardDownload;
            this.clipboardUpload = builder.clipboardUpload;
            this.diskRedirection = builder.diskRedirection;
            this.recordKeyboard = builder.recordKeyboard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RDP create() {
            return builder().build();
        }

        /**
         * @return clipboardDownload
         */
        public String getClipboardDownload() {
            return this.clipboardDownload;
        }

        /**
         * @return clipboardUpload
         */
        public String getClipboardUpload() {
            return this.clipboardUpload;
        }

        /**
         * @return diskRedirection
         */
        public String getDiskRedirection() {
            return this.diskRedirection;
        }

        /**
         * @return recordKeyboard
         */
        public String getRecordKeyboard() {
            return this.recordKeyboard;
        }

        public static final class Builder {
            private String clipboardDownload; 
            private String clipboardUpload; 
            private String diskRedirection; 
            private String recordKeyboard; 

            /**
             * ClipboardDownload.
             */
            public Builder clipboardDownload(String clipboardDownload) {
                this.clipboardDownload = clipboardDownload;
                return this;
            }

            /**
             * ClipboardUpload.
             */
            public Builder clipboardUpload(String clipboardUpload) {
                this.clipboardUpload = clipboardUpload;
                return this;
            }

            /**
             * DiskRedirection.
             */
            public Builder diskRedirection(String diskRedirection) {
                this.diskRedirection = diskRedirection;
                return this;
            }

            /**
             * RecordKeyboard.
             */
            public Builder recordKeyboard(String recordKeyboard) {
                this.recordKeyboard = recordKeyboard;
                return this;
            }

            public RDP build() {
                return new RDP(this);
            } 

        } 

    }
    public static class SSH extends TeaModel {
        @NameInMap("ExecCommand")
        private String execCommand;

        @NameInMap("SFTPChannel")
        private String SFTPChannel;

        @NameInMap("SFTPDownloadFile")
        private String SFTPDownloadFile;

        @NameInMap("SFTPMkdir")
        private String SFTPMkdir;

        @NameInMap("SFTPRemoveFile")
        private String SFTPRemoveFile;

        @NameInMap("SFTPRenameFile")
        private String SFTPRenameFile;

        @NameInMap("SFTPRmdir")
        private String SFTPRmdir;

        @NameInMap("SFTPUploadFile")
        private String SFTPUploadFile;

        @NameInMap("SSHChannel")
        private String SSHChannel;

        @NameInMap("X11Forwarding")
        private String x11Forwarding;

        private SSH(Builder builder) {
            this.execCommand = builder.execCommand;
            this.SFTPChannel = builder.SFTPChannel;
            this.SFTPDownloadFile = builder.SFTPDownloadFile;
            this.SFTPMkdir = builder.SFTPMkdir;
            this.SFTPRemoveFile = builder.SFTPRemoveFile;
            this.SFTPRenameFile = builder.SFTPRenameFile;
            this.SFTPRmdir = builder.SFTPRmdir;
            this.SFTPUploadFile = builder.SFTPUploadFile;
            this.SSHChannel = builder.SSHChannel;
            this.x11Forwarding = builder.x11Forwarding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SSH create() {
            return builder().build();
        }

        /**
         * @return execCommand
         */
        public String getExecCommand() {
            return this.execCommand;
        }

        /**
         * @return SFTPChannel
         */
        public String getSFTPChannel() {
            return this.SFTPChannel;
        }

        /**
         * @return SFTPDownloadFile
         */
        public String getSFTPDownloadFile() {
            return this.SFTPDownloadFile;
        }

        /**
         * @return SFTPMkdir
         */
        public String getSFTPMkdir() {
            return this.SFTPMkdir;
        }

        /**
         * @return SFTPRemoveFile
         */
        public String getSFTPRemoveFile() {
            return this.SFTPRemoveFile;
        }

        /**
         * @return SFTPRenameFile
         */
        public String getSFTPRenameFile() {
            return this.SFTPRenameFile;
        }

        /**
         * @return SFTPRmdir
         */
        public String getSFTPRmdir() {
            return this.SFTPRmdir;
        }

        /**
         * @return SFTPUploadFile
         */
        public String getSFTPUploadFile() {
            return this.SFTPUploadFile;
        }

        /**
         * @return SSHChannel
         */
        public String getSSHChannel() {
            return this.SSHChannel;
        }

        /**
         * @return x11Forwarding
         */
        public String getX11Forwarding() {
            return this.x11Forwarding;
        }

        public static final class Builder {
            private String execCommand; 
            private String SFTPChannel; 
            private String SFTPDownloadFile; 
            private String SFTPMkdir; 
            private String SFTPRemoveFile; 
            private String SFTPRenameFile; 
            private String SFTPRmdir; 
            private String SFTPUploadFile; 
            private String SSHChannel; 
            private String x11Forwarding; 

            /**
             * ExecCommand.
             */
            public Builder execCommand(String execCommand) {
                this.execCommand = execCommand;
                return this;
            }

            /**
             * SFTPChannel.
             */
            public Builder SFTPChannel(String SFTPChannel) {
                this.SFTPChannel = SFTPChannel;
                return this;
            }

            /**
             * SFTPDownloadFile.
             */
            public Builder SFTPDownloadFile(String SFTPDownloadFile) {
                this.SFTPDownloadFile = SFTPDownloadFile;
                return this;
            }

            /**
             * SFTPMkdir.
             */
            public Builder SFTPMkdir(String SFTPMkdir) {
                this.SFTPMkdir = SFTPMkdir;
                return this;
            }

            /**
             * SFTPRemoveFile.
             */
            public Builder SFTPRemoveFile(String SFTPRemoveFile) {
                this.SFTPRemoveFile = SFTPRemoveFile;
                return this;
            }

            /**
             * SFTPRenameFile.
             */
            public Builder SFTPRenameFile(String SFTPRenameFile) {
                this.SFTPRenameFile = SFTPRenameFile;
                return this;
            }

            /**
             * SFTPRmdir.
             */
            public Builder SFTPRmdir(String SFTPRmdir) {
                this.SFTPRmdir = SFTPRmdir;
                return this;
            }

            /**
             * SFTPUploadFile.
             */
            public Builder SFTPUploadFile(String SFTPUploadFile) {
                this.SFTPUploadFile = SFTPUploadFile;
                return this;
            }

            /**
             * SSHChannel.
             */
            public Builder SSHChannel(String SSHChannel) {
                this.SSHChannel = SSHChannel;
                return this;
            }

            /**
             * X11Forwarding.
             */
            public Builder x11Forwarding(String x11Forwarding) {
                this.x11Forwarding = x11Forwarding;
                return this;
            }

            public SSH build() {
                return new SSH(this);
            } 

        } 

    }
    public static class ProtocolConfig extends TeaModel {
        @NameInMap("RDP")
        private RDP RDP;

        @NameInMap("SSH")
        private SSH SSH;

        private ProtocolConfig(Builder builder) {
            this.RDP = builder.RDP;
            this.SSH = builder.SSH;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolConfig create() {
            return builder().build();
        }

        /**
         * @return RDP
         */
        public RDP getRDP() {
            return this.RDP;
        }

        /**
         * @return SSH
         */
        public SSH getSSH() {
            return this.SSH;
        }

        public static final class Builder {
            private RDP RDP; 
            private SSH SSH; 

            /**
             * RDP.
             */
            public Builder RDP(RDP RDP) {
                this.RDP = RDP;
                return this;
            }

            /**
             * SSH.
             */
            public Builder SSH(SSH SSH) {
                this.SSH = SSH;
                return this;
            }

            public ProtocolConfig build() {
                return new ProtocolConfig(this);
            } 

        } 

    }
    public static class Policy extends TeaModel {
        @NameInMap("AccessTimeRangeConfig")
        private AccessTimeRangeConfig accessTimeRangeConfig;

        @NameInMap("ApprovalConfig")
        private ApprovalConfig approvalConfig;

        @NameInMap("CommandConfig")
        private CommandConfig commandConfig;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("IPAclConfig")
        private IPAclConfig IPAclConfig;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("Priority")
        private Long priority;

        @NameInMap("ProtocolConfig")
        private ProtocolConfig protocolConfig;

        private Policy(Builder builder) {
            this.accessTimeRangeConfig = builder.accessTimeRangeConfig;
            this.approvalConfig = builder.approvalConfig;
            this.commandConfig = builder.commandConfig;
            this.comment = builder.comment;
            this.IPAclConfig = builder.IPAclConfig;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.priority = builder.priority;
            this.protocolConfig = builder.protocolConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return accessTimeRangeConfig
         */
        public AccessTimeRangeConfig getAccessTimeRangeConfig() {
            return this.accessTimeRangeConfig;
        }

        /**
         * @return approvalConfig
         */
        public ApprovalConfig getApprovalConfig() {
            return this.approvalConfig;
        }

        /**
         * @return commandConfig
         */
        public CommandConfig getCommandConfig() {
            return this.commandConfig;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return IPAclConfig
         */
        public IPAclConfig getIPAclConfig() {
            return this.IPAclConfig;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return protocolConfig
         */
        public ProtocolConfig getProtocolConfig() {
            return this.protocolConfig;
        }

        public static final class Builder {
            private AccessTimeRangeConfig accessTimeRangeConfig; 
            private ApprovalConfig approvalConfig; 
            private CommandConfig commandConfig; 
            private String comment; 
            private IPAclConfig IPAclConfig; 
            private String policyId; 
            private String policyName; 
            private Long priority; 
            private ProtocolConfig protocolConfig; 

            /**
             * AccessTimeRangeConfig.
             */
            public Builder accessTimeRangeConfig(AccessTimeRangeConfig accessTimeRangeConfig) {
                this.accessTimeRangeConfig = accessTimeRangeConfig;
                return this;
            }

            /**
             * ApprovalConfig.
             */
            public Builder approvalConfig(ApprovalConfig approvalConfig) {
                this.approvalConfig = approvalConfig;
                return this;
            }

            /**
             * CommandConfig.
             */
            public Builder commandConfig(CommandConfig commandConfig) {
                this.commandConfig = commandConfig;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * IPAclConfig.
             */
            public Builder IPAclConfig(IPAclConfig IPAclConfig) {
                this.IPAclConfig = IPAclConfig;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProtocolConfig.
             */
            public Builder protocolConfig(ProtocolConfig protocolConfig) {
                this.protocolConfig = protocolConfig;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
