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
         * <p>The image ID that is used when you reinstall the OS.</p>
         * 
         * <strong>example:</strong>
         * <p>m-2zec4lvlhcdkyd13****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-m5ei7b1w38w2l91x****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder isLocalDisk(Boolean isLocalDisk) {
            this.putQueryParameter("IsLocalDisk", isLocalDisk);
            this.isLocalDisk = isLocalDisk;
            return this;
        }

        /**
         * <p>The name of the new key pair. If you do not specify this parameter, you must reset the key pair after the OS is reinstalled.</p>
         * 
         * <strong>example:</strong>
         * <p>testKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The new logon password of the RDS Custom instance. If you do not specify this parameter, you must reset the logon password after the OS is reinstalled.</p>
         * <ul>
         * <li>The value must be 8 to 30 characters in length.</li>
         * <li>The value must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Supported special characters include: ( ) ` ~ ! @ # $ % ^ &amp; * - _ + =</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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
