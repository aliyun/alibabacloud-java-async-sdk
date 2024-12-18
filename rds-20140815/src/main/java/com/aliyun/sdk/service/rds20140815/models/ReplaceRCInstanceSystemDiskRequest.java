// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ReplaceRCInstanceSystemDiskRequest} extends {@link RequestModel}
 *
 * <p>ReplaceRCInstanceSystemDiskRequest</p>
 */
public class ReplaceRCInstanceSystemDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsLocalDisk")
    private Boolean isLocalDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ReplaceRCInstanceSystemDiskRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.isLocalDisk = builder.isLocalDisk;
        this.keyPairName = builder.keyPairName;
        this.password = builder.password;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceRCInstanceSystemDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isLocalDisk
     */
    public Boolean getIsLocalDisk() {
        return this.isLocalDisk;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ReplaceRCInstanceSystemDiskRequest, Builder> {
        private String imageId; 
        private String instanceId; 
        private Boolean isLocalDisk; 
        private String keyPairName; 
        private String password; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceRCInstanceSystemDiskRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.isLocalDisk = request.isLocalDisk;
            this.keyPairName = request.keyPairName;
            this.password = request.password;
            this.regionId = request.regionId;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
         * IsLocalDisk.
         */
        public Builder isLocalDisk(Boolean isLocalDisk) {
            this.putQueryParameter("IsLocalDisk", isLocalDisk);
            this.isLocalDisk = isLocalDisk;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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
        public ReplaceRCInstanceSystemDiskRequest build() {
            return new ReplaceRCInstanceSystemDiskRequest(this);
        } 

    } 

}
