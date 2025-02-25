// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayBlockVolumesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayBlockVolumesResponseBody</p>
 */
public class DescribeGatewayBlockVolumesResponseBody extends TeaModel {
    @NameInMap("BlockVolumes")
    private BlockVolumes blockVolumes;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayBlockVolumesResponseBody(Builder builder) {
        this.blockVolumes = builder.blockVolumes;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayBlockVolumesResponseBody create() {
        return builder().build();
    }

    /**
     * @return blockVolumes
     */
    public BlockVolumes getBlockVolumes() {
        return this.blockVolumes;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BlockVolumes blockVolumes; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * BlockVolumes.
         */
        public Builder blockVolumes(BlockVolumes blockVolumes) {
            this.blockVolumes = blockVolumes;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGatewayBlockVolumesResponseBody build() {
            return new DescribeGatewayBlockVolumesResponseBody(this);
        } 

    } 

    public static class BlockVolume extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("CacheMode")
        private String cacheMode;

        @NameInMap("ChapEnabled")
        private Boolean chapEnabled;

        @NameInMap("ChapInUser")
        private String chapInUser;

        @NameInMap("ChunkSize")
        private Integer chunkSize;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("IndexId")
        private String indexId;

        @NameInMap("LocalPath")
        private String localPath;

        @NameInMap("LunId")
        private Integer lunId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssBucketName")
        private String ossBucketName;

        @NameInMap("OssBucketSsl")
        private Boolean ossBucketSsl;

        @NameInMap("OssEndpoint")
        private String ossEndpoint;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Size")
        private Long size;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Target")
        private String target;

        @NameInMap("TotalDownload")
        private Long totalDownload;

        @NameInMap("TotalUpload")
        private Long totalUpload;

        @NameInMap("VolumeState")
        private Integer volumeState;

        private BlockVolume(Builder builder) {
            this.address = builder.address;
            this.cacheMode = builder.cacheMode;
            this.chapEnabled = builder.chapEnabled;
            this.chapInUser = builder.chapInUser;
            this.chunkSize = builder.chunkSize;
            this.diskId = builder.diskId;
            this.diskType = builder.diskType;
            this.enabled = builder.enabled;
            this.indexId = builder.indexId;
            this.localPath = builder.localPath;
            this.lunId = builder.lunId;
            this.name = builder.name;
            this.ossBucketName = builder.ossBucketName;
            this.ossBucketSsl = builder.ossBucketSsl;
            this.ossEndpoint = builder.ossEndpoint;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.size = builder.size;
            this.state = builder.state;
            this.status = builder.status;
            this.target = builder.target;
            this.totalDownload = builder.totalDownload;
            this.totalUpload = builder.totalUpload;
            this.volumeState = builder.volumeState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockVolume create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return cacheMode
         */
        public String getCacheMode() {
            return this.cacheMode;
        }

        /**
         * @return chapEnabled
         */
        public Boolean getChapEnabled() {
            return this.chapEnabled;
        }

        /**
         * @return chapInUser
         */
        public String getChapInUser() {
            return this.chapInUser;
        }

        /**
         * @return chunkSize
         */
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return indexId
         */
        public String getIndexId() {
            return this.indexId;
        }

        /**
         * @return localPath
         */
        public String getLocalPath() {
            return this.localPath;
        }

        /**
         * @return lunId
         */
        public Integer getLunId() {
            return this.lunId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossBucketSsl
         */
        public Boolean getOssBucketSsl() {
            return this.ossBucketSsl;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return totalDownload
         */
        public Long getTotalDownload() {
            return this.totalDownload;
        }

        /**
         * @return totalUpload
         */
        public Long getTotalUpload() {
            return this.totalUpload;
        }

        /**
         * @return volumeState
         */
        public Integer getVolumeState() {
            return this.volumeState;
        }

        public static final class Builder {
            private String address; 
            private String cacheMode; 
            private Boolean chapEnabled; 
            private String chapInUser; 
            private Integer chunkSize; 
            private String diskId; 
            private String diskType; 
            private Boolean enabled; 
            private String indexId; 
            private String localPath; 
            private Integer lunId; 
            private String name; 
            private String ossBucketName; 
            private Boolean ossBucketSsl; 
            private String ossEndpoint; 
            private Integer port; 
            private String protocol; 
            private Long size; 
            private String state; 
            private Integer status; 
            private String target; 
            private Long totalDownload; 
            private Long totalUpload; 
            private Integer volumeState; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * CacheMode.
             */
            public Builder cacheMode(String cacheMode) {
                this.cacheMode = cacheMode;
                return this;
            }

            /**
             * ChapEnabled.
             */
            public Builder chapEnabled(Boolean chapEnabled) {
                this.chapEnabled = chapEnabled;
                return this;
            }

            /**
             * ChapInUser.
             */
            public Builder chapInUser(String chapInUser) {
                this.chapInUser = chapInUser;
                return this;
            }

            /**
             * ChunkSize.
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * IndexId.
             */
            public Builder indexId(String indexId) {
                this.indexId = indexId;
                return this;
            }

            /**
             * LocalPath.
             */
            public Builder localPath(String localPath) {
                this.localPath = localPath;
                return this;
            }

            /**
             * LUN ID。
             */
            public Builder lunId(Integer lunId) {
                this.lunId = lunId;
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
             * OssBucketName.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * OssBucketSsl.
             */
            public Builder ossBucketSsl(Boolean ossBucketSsl) {
                this.ossBucketSsl = ossBucketSsl;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TotalDownload.
             */
            public Builder totalDownload(Long totalDownload) {
                this.totalDownload = totalDownload;
                return this;
            }

            /**
             * TotalUpload.
             */
            public Builder totalUpload(Long totalUpload) {
                this.totalUpload = totalUpload;
                return this;
            }

            /**
             * VolumeState.
             */
            public Builder volumeState(Integer volumeState) {
                this.volumeState = volumeState;
                return this;
            }

            public BlockVolume build() {
                return new BlockVolume(this);
            } 

        } 

    }
    public static class BlockVolumes extends TeaModel {
        @NameInMap("BlockVolume")
        private java.util.List < BlockVolume> blockVolume;

        private BlockVolumes(Builder builder) {
            this.blockVolume = builder.blockVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockVolumes create() {
            return builder().build();
        }

        /**
         * @return blockVolume
         */
        public java.util.List < BlockVolume> getBlockVolume() {
            return this.blockVolume;
        }

        public static final class Builder {
            private java.util.List < BlockVolume> blockVolume; 

            /**
             * BlockVolume.
             */
            public Builder blockVolume(java.util.List < BlockVolume> blockVolume) {
                this.blockVolume = blockVolume;
                return this;
            }

            public BlockVolumes build() {
                return new BlockVolumes(this);
            } 

        } 

    }
}
