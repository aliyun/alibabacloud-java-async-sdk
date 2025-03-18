// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link SetPolicyProtocolConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyProtocolConfigRequest</p>
 */
public class SetPolicyProtocolConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private ProtocolConfig protocolConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SetPolicyProtocolConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.protocolConfig = builder.protocolConfig;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyProtocolConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return protocolConfig
     */
    public ProtocolConfig getProtocolConfig() {
        return this.protocolConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetPolicyProtocolConfigRequest, Builder> {
        private String instanceId; 
        private String policyId; 
        private ProtocolConfig protocolConfig; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyProtocolConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.protocolConfig = request.protocolConfig;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
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
         * <p>61</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The protocol control settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder protocolConfig(ProtocolConfig protocolConfig) {
            String protocolConfigShrink = shrink(protocolConfig, "ProtocolConfig", "json");
            this.putQueryParameter("ProtocolConfig", protocolConfigShrink);
            this.protocolConfig = protocolConfig;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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
        public SetPolicyProtocolConfigRequest build() {
            return new SetPolicyProtocolConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetPolicyProtocolConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyProtocolConfigRequest</p>
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

            private Builder() {
            } 

            private Builder(RDP model) {
                this.clipboardDownload = model.clipboardDownload;
                this.clipboardUpload = model.clipboardUpload;
                this.diskRedirection = model.diskRedirection;
                this.recordKeyboard = model.recordKeyboard;
            } 

            /**
             * <p>Specifies whether to enable downloading from the clipboard. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder clipboardDownload(String clipboardDownload) {
                this.clipboardDownload = clipboardDownload;
                return this;
            }

            /**
             * <p>Specifies whether to enable uploading from the clipboard. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder clipboardUpload(String clipboardUpload) {
                this.clipboardUpload = clipboardUpload;
                return this;
            }

            /**
             * <p>Specifies whether to enable driver mapping. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder diskRedirection(String diskRedirection) {
                this.diskRedirection = diskRedirection;
                return this;
            }

            /**
             * <p>Specifies whether to enable keyboard operation recording. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
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
     * {@link SetPolicyProtocolConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyProtocolConfigRequest</p>
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

            private Builder() {
            } 

            private Builder(SSH model) {
                this.execCommand = model.execCommand;
                this.SFTPChannel = model.SFTPChannel;
                this.SFTPDownloadFile = model.SFTPDownloadFile;
                this.SFTPMkdir = model.SFTPMkdir;
                this.SFTPRemoveFile = model.SFTPRemoveFile;
                this.SFTPRenameFile = model.SFTPRenameFile;
                this.SFTPRmdir = model.SFTPRmdir;
                this.SFTPUploadFile = model.SFTPUploadFile;
                this.SSHChannel = model.SSHChannel;
                this.x11Forwarding = model.x11Forwarding;
            } 

            /**
             * <p>Specifies whether to enable remote command execution. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder execCommand(String execCommand) {
                this.execCommand = execCommand;
                return this;
            }

            /**
             * <p>Specifies whether to enable SFTP channels. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If you do not specify this parameter, the default value Disable is used.</p>
             * </li>
             * <li><p>You must set at least one of the following parameters to Enable: SSHChannel and SFTPChannel.</p>
             * </li>
             * <li><p>If you select Enable Only SFTP Permission for a host account, do not set SSHChannel and SFTPChannel to Disable for the account. Otherwise, users of the bastion host cannot use the account to access the host.</p>
             * </li>
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
             * <p>Specifies whether to enable file downloading during SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPDownloadFile(String SFTPDownloadFile) {
                this.SFTPDownloadFile = SFTPDownloadFile;
                return this;
            }

            /**
             * <p>Specifies whether to enable folder creation during SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPMkdir(String SFTPMkdir) {
                this.SFTPMkdir = SFTPMkdir;
                return this;
            }

            /**
             * <p>Specifies whether to enable file deletion during SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPRemoveFile(String SFTPRemoveFile) {
                this.SFTPRemoveFile = SFTPRemoveFile;
                return this;
            }

            /**
             * <p>Specifies whether to enable file renaming during SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPRenameFile(String SFTPRenameFile) {
                this.SFTPRenameFile = SFTPRenameFile;
                return this;
            }

            /**
             * <p>Specifies whether to enable folder deletion during SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPRmdir(String SFTPRmdir) {
                this.SFTPRmdir = SFTPRmdir;
                return this;
            }

            /**
             * <p>Specifies whether to enable file uploading during SFTP-based O&amp;M. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder SFTPUploadFile(String SFTPUploadFile) {
                this.SFTPUploadFile = SFTPUploadFile;
                return this;
            }

            /**
             * <p>Specifies whether to enable SSH channels. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If you do not specify this parameter, the default value Disable is used.</p>
             * </li>
             * <li><p>You must set at least one of the following parameters to Enable: SSHChannel and SFTPChannel. If you set SSHChannel to Disable, SSH-based logon is disabled for the asset account. Proceed with caution.</p>
             * </li>
             * <li><p>If you select Enable Only SFTP Permission for a host account, do not set SSHChannel and SFTPChannel to Disable for the account. Otherwise, users of the bastion host cannot use the account to access the host.</p>
             * </li>
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
             * <p>Specifies whether to enable X11 forwarding. Valid values:</p>
             * <ul>
             * <li>Enable</li>
             * <li>Disable</li>
             * </ul>
             * <blockquote>
             * <p>If you do not specify this parameter, the default value Disable is used.</p>
             * </blockquote>
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
     * {@link SetPolicyProtocolConfigRequest} extends {@link TeaModel}
     *
     * <p>SetPolicyProtocolConfigRequest</p>
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

            private Builder() {
            } 

            private Builder(ProtocolConfig model) {
                this.RDP = model.RDP;
                this.SSH = model.SSH;
            } 

            /**
             * <p>The settings of the Remote Desktop Protocol (RDP) options.</p>
             */
            public Builder RDP(RDP RDP) {
                this.RDP = RDP;
                return this;
            }

            /**
             * <p>The settings of the SSH and SSH Fine Transfer Protocol (SFTP) options.</p>
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
}
