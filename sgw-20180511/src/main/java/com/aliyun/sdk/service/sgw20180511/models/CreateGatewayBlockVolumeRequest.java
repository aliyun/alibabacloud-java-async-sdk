// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayBlockVolumeRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayBlockVolumeRequest</p>
 */
public class CreateGatewayBlockVolumeRequest extends Request {
    @Query
    @NameInMap("CacheMode")
    private String cacheMode;

    @Query
    @NameInMap("ChapEnabled")
    private Boolean chapEnabled;

    @Query
    @NameInMap("ChapInPassword")
    private String chapInPassword;

    @Query
    @NameInMap("ChapInUser")
    private String chapInUser;

    @Query
    @NameInMap("ChunkSize")
    private Integer chunkSize;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("LocalFilePath")
    private String localFilePath;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OssBucketName")
    @Validation(required = true)
    private String ossBucketName;

    @Query
    @NameInMap("OssBucketSsl")
    private Boolean ossBucketSsl;

    @Query
    @NameInMap("OssEndpoint")
    @Validation(required = true)
    private String ossEndpoint;

    @Query
    @NameInMap("Recovery")
    private Boolean recovery;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Size")
    private Long size;

    @Query
    @NameInMap("VolumeProtocol")
    @Validation(required = true)
    private String volumeProtocol;

    private CreateGatewayBlockVolumeRequest(Builder builder) {
        super(builder);
        this.cacheMode = builder.cacheMode;
        this.chapEnabled = builder.chapEnabled;
        this.chapInPassword = builder.chapInPassword;
        this.chapInUser = builder.chapInUser;
        this.chunkSize = builder.chunkSize;
        this.gatewayId = builder.gatewayId;
        this.localFilePath = builder.localFilePath;
        this.name = builder.name;
        this.ossBucketName = builder.ossBucketName;
        this.ossBucketSsl = builder.ossBucketSsl;
        this.ossEndpoint = builder.ossEndpoint;
        this.recovery = builder.recovery;
        this.securityToken = builder.securityToken;
        this.size = builder.size;
        this.volumeProtocol = builder.volumeProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayBlockVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return chapInPassword
     */
    public String getChapInPassword() {
        return this.chapInPassword;
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return localFilePath
     */
    public String getLocalFilePath() {
        return this.localFilePath;
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
     * @return recovery
     */
    public Boolean getRecovery() {
        return this.recovery;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return volumeProtocol
     */
    public String getVolumeProtocol() {
        return this.volumeProtocol;
    }

    public static final class Builder extends Request.Builder<CreateGatewayBlockVolumeRequest, Builder> {
        private String cacheMode; 
        private Boolean chapEnabled; 
        private String chapInPassword; 
        private String chapInUser; 
        private Integer chunkSize; 
        private String gatewayId; 
        private String localFilePath; 
        private String name; 
        private String ossBucketName; 
        private Boolean ossBucketSsl; 
        private String ossEndpoint; 
        private Boolean recovery; 
        private String securityToken; 
        private Long size; 
        private String volumeProtocol; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayBlockVolumeRequest request) {
            super(request);
            this.cacheMode = request.cacheMode;
            this.chapEnabled = request.chapEnabled;
            this.chapInPassword = request.chapInPassword;
            this.chapInUser = request.chapInUser;
            this.chunkSize = request.chunkSize;
            this.gatewayId = request.gatewayId;
            this.localFilePath = request.localFilePath;
            this.name = request.name;
            this.ossBucketName = request.ossBucketName;
            this.ossBucketSsl = request.ossBucketSsl;
            this.ossEndpoint = request.ossEndpoint;
            this.recovery = request.recovery;
            this.securityToken = request.securityToken;
            this.size = request.size;
            this.volumeProtocol = request.volumeProtocol;
        } 

        /**
         * CacheMode.
         */
        public Builder cacheMode(String cacheMode) {
            this.putQueryParameter("CacheMode", cacheMode);
            this.cacheMode = cacheMode;
            return this;
        }

        /**
         * ChapEnabled.
         */
        public Builder chapEnabled(Boolean chapEnabled) {
            this.putQueryParameter("ChapEnabled", chapEnabled);
            this.chapEnabled = chapEnabled;
            return this;
        }

        /**
         * ChapInPassword.
         */
        public Builder chapInPassword(String chapInPassword) {
            this.putQueryParameter("ChapInPassword", chapInPassword);
            this.chapInPassword = chapInPassword;
            return this;
        }

        /**
         * ChapInUser.
         */
        public Builder chapInUser(String chapInUser) {
            this.putQueryParameter("ChapInUser", chapInUser);
            this.chapInUser = chapInUser;
            return this;
        }

        /**
         * ChunkSize.
         */
        public Builder chunkSize(Integer chunkSize) {
            this.putQueryParameter("ChunkSize", chunkSize);
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * LocalFilePath.
         */
        public Builder localFilePath(String localFilePath) {
            this.putQueryParameter("LocalFilePath", localFilePath);
            this.localFilePath = localFilePath;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssBucketSsl.
         */
        public Builder ossBucketSsl(Boolean ossBucketSsl) {
            this.putQueryParameter("OssBucketSsl", ossBucketSsl);
            this.ossBucketSsl = ossBucketSsl;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * Recovery.
         */
        public Builder recovery(Boolean recovery) {
            this.putQueryParameter("Recovery", recovery);
            this.recovery = recovery;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * VolumeProtocol.
         */
        public Builder volumeProtocol(String volumeProtocol) {
            this.putQueryParameter("VolumeProtocol", volumeProtocol);
            this.volumeProtocol = volumeProtocol;
            return this;
        }

        @Override
        public CreateGatewayBlockVolumeRequest build() {
            return new CreateGatewayBlockVolumeRequest(this);
        } 

    } 

}
