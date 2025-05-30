// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link UpdateNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeGroupRequest</p>
 */
public class UpdateNodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileSystemMountEnabled")
    private Boolean fileSystemMountEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoginPassword")
    private String loginPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewNodeGroupName")
    private String newNodeGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private UpdateNodeGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fileSystemMountEnabled = builder.fileSystemMountEnabled;
        this.imageId = builder.imageId;
        this.keyPairName = builder.keyPairName;
        this.loginPassword = builder.loginPassword;
        this.newNodeGroupName = builder.newNodeGroupName;
        this.nodeGroupId = builder.nodeGroupId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return fileSystemMountEnabled
     */
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return loginPassword
     */
    public String getLoginPassword() {
        return this.loginPassword;
    }

    /**
     * @return newNodeGroupName
     */
    public String getNewNodeGroupName() {
        return this.newNodeGroupName;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UpdateNodeGroupRequest, Builder> {
        private String regionId; 
        private Boolean fileSystemMountEnabled; 
        private String imageId; 
        private String keyPairName; 
        private String loginPassword; 
        private String newNodeGroupName; 
        private String nodeGroupId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fileSystemMountEnabled = request.fileSystemMountEnabled;
            this.imageId = request.imageId;
            this.keyPairName = request.keyPairName;
            this.loginPassword = request.loginPassword;
            this.newNodeGroupName = request.newNodeGroupName;
            this.nodeGroupId = request.nodeGroupId;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Whether file storage mounting is supported</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder fileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.putBodyParameter("FileSystemMountEnabled", fileSystemMountEnabled);
            this.fileSystemMountEnabled = fileSystemMountEnabled;
            return this;
        }

        /**
         * <p>The default image ID of a node group remains unchanged if not explicitly set.</p>
         * 
         * <strong>example:</strong>
         * <p>i123847249284734</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>sc-key</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putBodyParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>节点组内机器的登录密码</p>
         */
        public Builder loginPassword(String loginPassword) {
            this.putBodyParameter("LoginPassword", loginPassword);
            this.loginPassword = loginPassword;
            return this;
        }

        /**
         * <p>Node group name</p>
         * 
         * <strong>example:</strong>
         * <p>test-update</p>
         */
        public Builder newNodeGroupName(String newNodeGroupName) {
            this.putBodyParameter("NewNodeGroupName", newNodeGroupName);
            this.newNodeGroupName = newNodeGroupName;
            return this;
        }

        /**
         * <p>Node group ID</p>
         * 
         * <strong>example:</strong>
         * <p>i120021051733814190732</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putBodyParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>user data</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * uptime
         * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttt20250110141010.sh</p>
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public UpdateNodeGroupRequest build() {
            return new UpdateNodeGroupRequest(this);
        } 

    } 

}
