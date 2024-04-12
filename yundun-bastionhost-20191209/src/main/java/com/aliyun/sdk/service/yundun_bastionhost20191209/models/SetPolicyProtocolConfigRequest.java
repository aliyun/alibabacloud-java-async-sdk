// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPolicyProtocolConfigRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyProtocolConfigRequest</p>
 */
public class SetPolicyProtocolConfigRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("ProtocolConfig")
    @Validation(required = true)
    private ProtocolConfig protocolConfig;

    @Query
    @NameInMap("RegionId")
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
         * ProtocolConfig.
         */
        public Builder protocolConfig(ProtocolConfig protocolConfig) {
            String protocolConfigShrink = shrink(protocolConfig, "ProtocolConfig", "json");
            this.putQueryParameter("ProtocolConfig", protocolConfigShrink);
            this.protocolConfig = protocolConfig;
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
        public SetPolicyProtocolConfigRequest build() {
            return new SetPolicyProtocolConfigRequest(this);
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
}
