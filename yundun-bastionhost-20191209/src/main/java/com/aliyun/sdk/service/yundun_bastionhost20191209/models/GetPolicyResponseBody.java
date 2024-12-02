// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyResponseBody</p>
 */
public class GetPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of the control policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0D29F2C0-8B4B-5861-9474-F3F23D25594B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicyResponseBody build() {
            return new GetPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class EffectiveTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Days")
        private java.util.List < String > days;

        @com.aliyun.core.annotation.NameInMap("Hours")
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
             * <p>The days of a week on which logons are allowed.</p>
             */
            public Builder days(java.util.List < String > days) {
                this.days = days;
                return this;
            }

            /**
             * <p>The time periods during which logons are allowed.</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class AccessTimeRangeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
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
             * <p>The details of the periods during which logons are allowed.</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class ApprovalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SwitchStatus")
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
             * <p>Indicates whether O&amp;M approval is enabled in the control policy. Valid values:</p>
             * <ul>
             * <li><strong>On</strong>: O&amp;M approval is enabled.</li>
             * <li><strong>Off</strong>: O&amp;M approval is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Off</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
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
             * <p>An array of commands that can be run only after approval.</p>
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
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class Deny extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclType")
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
             * <li>white: whitelist mode.</li>
             * <li>black: blacklist mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>black</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>An array of controlled commands.</p>
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
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class CommandConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Approval")
        private Approval approval;

        @com.aliyun.core.annotation.NameInMap("Deny")
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
             * <p>The details of the command approval settings.</p>
             */
            public Builder approval(Approval approval) {
                this.approval = approval;
                return this;
            }

            /**
             * <p>The details of the command control setting.</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class IPAclConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("IPs")
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
             * <p>The mode of access control on source IP addresses. Valid values:</p>
             * <ul>
             * <li>white: whitelist mode.</li>
             * <li>black: blacklist mode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>black</p>
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * <p>The IP addresses from which logons are not allowed.</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class RDP extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClipboardDownload")
        private String clipboardDownload;

        @com.aliyun.core.annotation.NameInMap("ClipboardUpload")
        private String clipboardUpload;

        @com.aliyun.core.annotation.NameInMap("DiskRedirection")
        private String diskRedirection;

        @com.aliyun.core.annotation.NameInMap("RecordKeyboard")
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
             * <p>Indicates whether downloading from the clipboard is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder clipboardDownload(String clipboardDownload) {
                this.clipboardDownload = clipboardDownload;
                return this;
            }

            /**
             * <p>Indicates whether file uploading from the clipboard is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder clipboardUpload(String clipboardUpload) {
                this.clipboardUpload = clipboardUpload;
                return this;
            }

            /**
             * <p>Indicates whether driver mapping is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder diskRedirection(String diskRedirection) {
                this.diskRedirection = diskRedirection;
                return this;
            }

            /**
             * <p>Indicates whether keyboard recording is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class SSH extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecCommand")
        private String execCommand;

        @com.aliyun.core.annotation.NameInMap("SFTPChannel")
        private String SFTPChannel;

        @com.aliyun.core.annotation.NameInMap("SFTPDownloadFile")
        private String SFTPDownloadFile;

        @com.aliyun.core.annotation.NameInMap("SFTPMkdir")
        private String SFTPMkdir;

        @com.aliyun.core.annotation.NameInMap("SFTPRemoveFile")
        private String SFTPRemoveFile;

        @com.aliyun.core.annotation.NameInMap("SFTPRenameFile")
        private String SFTPRenameFile;

        @com.aliyun.core.annotation.NameInMap("SFTPRmdir")
        private String SFTPRmdir;

        @com.aliyun.core.annotation.NameInMap("SFTPUploadFile")
        private String SFTPUploadFile;

        @com.aliyun.core.annotation.NameInMap("SSHChannel")
        private String SSHChannel;

        @com.aliyun.core.annotation.NameInMap("X11Forwarding")
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
             * <p>Indicates whether remote command execution is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder execCommand(String execCommand) {
                this.execCommand = execCommand;
                return this;
            }

            /**
             * <p>Indicates whether the SFTP channel option is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPChannel(String SFTPChannel) {
                this.SFTPChannel = SFTPChannel;
                return this;
            }

            /**
             * <p>Indicates whether file downloading is enabled in SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPDownloadFile(String SFTPDownloadFile) {
                this.SFTPDownloadFile = SFTPDownloadFile;
                return this;
            }

            /**
             * <p>Indicates whether folder creation is enabled in SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPMkdir(String SFTPMkdir) {
                this.SFTPMkdir = SFTPMkdir;
                return this;
            }

            /**
             * <p>Indicates whether file deletion is enabled in SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPRemoveFile(String SFTPRemoveFile) {
                this.SFTPRemoveFile = SFTPRemoveFile;
                return this;
            }

            /**
             * <p>Indicates whether file renaming is enabled in SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPRenameFile(String SFTPRenameFile) {
                this.SFTPRenameFile = SFTPRenameFile;
                return this;
            }

            /**
             * <p>Indicates whether folder deletion is enabled in SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPRmdir(String SFTPRmdir) {
                this.SFTPRmdir = SFTPRmdir;
                return this;
            }

            /**
             * <p>Indicates whether file uploading is enabled in SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPUploadFile(String SFTPUploadFile) {
                this.SFTPUploadFile = SFTPUploadFile;
                return this;
            }

            /**
             * <p>Indicates whether the SSH channel option is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SSHChannel(String SSHChannel) {
                this.SSHChannel = SSHChannel;
                return this;
            }

            /**
             * <p>Indicates whether X11 forwarding is enabled. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class ProtocolConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RDP")
        private RDP RDP;

        @com.aliyun.core.annotation.NameInMap("SSH")
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
             * <p>The configuration details of Remote Desktop Protocol (RDP) options.</p>
             */
            public Builder RDP(RDP RDP) {
                this.RDP = RDP;
                return this;
            }

            /**
             * <p>The configuration details of SSH and SSH File Transfer Protocol (SFTP) options.</p>
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
    /**
     * 
     * {@link GetPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTimeRangeConfig")
        private AccessTimeRangeConfig accessTimeRangeConfig;

        @com.aliyun.core.annotation.NameInMap("ApprovalConfig")
        private ApprovalConfig approvalConfig;

        @com.aliyun.core.annotation.NameInMap("CommandConfig")
        private CommandConfig commandConfig;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("IPAclConfig")
        private IPAclConfig IPAclConfig;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("ProtocolConfig")
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
             * <p>The details of the logon period restrictions.</p>
             */
            public Builder accessTimeRangeConfig(AccessTimeRangeConfig accessTimeRangeConfig) {
                this.accessTimeRangeConfig = accessTimeRangeConfig;
                return this;
            }

            /**
             * <p>The O&amp;M approval setting.</p>
             */
            public Builder approvalConfig(ApprovalConfig approvalConfig) {
                this.approvalConfig = approvalConfig;
                return this;
            }

            /**
             * <p>The details of the command policy.</p>
             */
            public Builder commandConfig(CommandConfig commandConfig) {
                this.commandConfig = commandConfig;
                return this;
            }

            /**
             * <p>The description of the control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The access control settings on source IP addresses.</p>
             */
            public Builder IPAclConfig(IPAclConfig IPAclConfig) {
                this.IPAclConfig = IPAclConfig;
                return this;
            }

            /**
             * <p>The ID of the control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The priority of the control policy. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The details of protocol control.</p>
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
