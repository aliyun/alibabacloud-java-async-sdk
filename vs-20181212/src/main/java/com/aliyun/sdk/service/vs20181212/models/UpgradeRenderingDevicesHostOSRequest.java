// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeRenderingDevicesHostOSRequest} extends {@link RequestModel}
 *
 * <p>UpgradeRenderingDevicesHostOSRequest</p>
 */
public class UpgradeRenderingDevicesHostOSRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RomName")
    @Validation(required = true)
    private String romName;

    @Query
    @NameInMap("RomPath")
    @Validation(required = true)
    private String romPath;

    @Query
    @NameInMap("RomVersion")
    @Validation(required = true)
    private String romVersion;

    private UpgradeRenderingDevicesHostOSRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
        this.romName = builder.romName;
        this.romPath = builder.romPath;
        this.romVersion = builder.romVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeRenderingDevicesHostOSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return romName
     */
    public String getRomName() {
        return this.romName;
    }

    /**
     * @return romPath
     */
    public String getRomPath() {
        return this.romPath;
    }

    /**
     * @return romVersion
     */
    public String getRomVersion() {
        return this.romVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeRenderingDevicesHostOSRequest, Builder> {
        private String instanceIds; 
        private Long ownerId; 
        private String romName; 
        private String romPath; 
        private String romVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeRenderingDevicesHostOSRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
            this.ownerId = response.ownerId;
            this.romName = response.romName;
            this.romPath = response.romPath;
            this.romVersion = response.romVersion;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RomName.
         */
        public Builder romName(String romName) {
            this.putQueryParameter("RomName", romName);
            this.romName = romName;
            return this;
        }

        /**
         * RomPath.
         */
        public Builder romPath(String romPath) {
            this.putQueryParameter("RomPath", romPath);
            this.romPath = romPath;
            return this;
        }

        /**
         * RomVersion.
         */
        public Builder romVersion(String romVersion) {
            this.putQueryParameter("RomVersion", romVersion);
            this.romVersion = romVersion;
            return this;
        }

        @Override
        public UpgradeRenderingDevicesHostOSRequest build() {
            return new UpgradeRenderingDevicesHostOSRequest(this);
        } 

    } 

}
