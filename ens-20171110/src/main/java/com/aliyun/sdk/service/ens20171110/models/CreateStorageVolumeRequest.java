// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateStorageVolumeRequest} extends {@link RequestModel}
 *
 * <p>CreateStorageVolumeRequest</p>
 */
public class CreateStorageVolumeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthPassword")
    private String authPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthProtocol")
    private String authProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthUser")
    private String authUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuth")
    private String isAuth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEnable")
    private String isEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeName")
    private String volumeName;

    private CreateStorageVolumeRequest(Builder builder) {
        super(builder);
        this.authPassword = builder.authPassword;
        this.authProtocol = builder.authProtocol;
        this.authUser = builder.authUser;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.gatewayId = builder.gatewayId;
        this.isAuth = builder.isAuth;
        this.isEnable = builder.isEnable;
        this.storageId = builder.storageId;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authPassword
     */
    public String getAuthPassword() {
        return this.authPassword;
    }

    /**
     * @return authProtocol
     */
    public String getAuthProtocol() {
        return this.authProtocol;
    }

    /**
     * @return authUser
     */
    public String getAuthUser() {
        return this.authUser;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return isAuth
     */
    public String getIsAuth() {
        return this.isAuth;
    }

    /**
     * @return isEnable
     */
    public String getIsEnable() {
        return this.isEnable;
    }

    /**
     * @return storageId
     */
    public String getStorageId() {
        return this.storageId;
    }

    /**
     * @return volumeName
     */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static final class Builder extends Request.Builder<CreateStorageVolumeRequest, Builder> {
        private String authPassword; 
        private String authProtocol; 
        private String authUser; 
        private String description; 
        private String ensRegionId; 
        private String gatewayId; 
        private String isAuth; 
        private String isEnable; 
        private String storageId; 
        private String volumeName; 

        private Builder() {
            super();
        } 

        private Builder(CreateStorageVolumeRequest request) {
            super(request);
            this.authPassword = request.authPassword;
            this.authProtocol = request.authProtocol;
            this.authUser = request.authUser;
            this.description = request.description;
            this.ensRegionId = request.ensRegionId;
            this.gatewayId = request.gatewayId;
            this.isAuth = request.isAuth;
            this.isEnable = request.isEnable;
            this.storageId = request.storageId;
            this.volumeName = request.volumeName;
        } 

        /**
         * <p>The password of the CHAP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>Password</p>
         */
        public Builder authPassword(String authPassword) {
            this.putQueryParameter("AuthPassword", authPassword);
            this.authPassword = authPassword;
            return this;
        }

        /**
         * <p>The authentication protocol. Set the value to <strong>CHAP</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>CHAP</p>
         */
        public Builder authProtocol(String authProtocol) {
            this.putQueryParameter("AuthProtocol", authProtocol);
            this.authProtocol = authProtocol;
            return this;
        }

        /**
         * <p>The username of the CHAP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder authUser(String authUser) {
            this.putQueryParameter("AuthUser", authUser);
            this.authUser = authUser;
            return this;
        }

        /**
         * <p>The description of the volume. The description must be 2 to 128 characters in length. The description cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-3</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgw-****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Specifies whether to enable authentication. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enable authentication.</li>
         * <li><strong>0</strong> (default): disable authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isAuth(String isAuth) {
            this.putQueryParameter("IsAuth", isAuth);
            this.isAuth = isAuth;
            return this;
        }

        /**
         * <p>Specifies whether to enable the volume. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): enable the volume.</li>
         * <li><strong>0</strong>: disable the volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isEnable(String isEnable) {
            this.putQueryParameter("IsEnable", isEnable);
            this.isEnable = isEnable;
            return this;
        }

        /**
         * <p>The ID of the storage medium.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-****</p>
         */
        public Builder storageId(String storageId) {
            this.putQueryParameter("StorageId", storageId);
            this.storageId = storageId;
            return this;
        }

        /**
         * <p>The name of the volume. The name must be 2 to 128 characters in length. The name cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testVolumeName</p>
         */
        public Builder volumeName(String volumeName) {
            this.putQueryParameter("VolumeName", volumeName);
            this.volumeName = volumeName;
            return this;
        }

        @Override
        public CreateStorageVolumeRequest build() {
            return new CreateStorageVolumeRequest(this);
        } 

    } 

}
