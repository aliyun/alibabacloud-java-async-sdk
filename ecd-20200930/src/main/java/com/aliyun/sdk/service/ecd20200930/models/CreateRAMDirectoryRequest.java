// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRAMDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateRAMDirectoryRequest</p>
 */
public class CreateRAMDirectoryRequest extends Request {
    @Query
    @NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @Query
    @NameInMap("DirectoryName")
    @Validation(required = true)
    private String directoryName;

    @Query
    @NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @Query
    @NameInMap("EnableInternetAccess")
    private Boolean enableInternetAccess;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private java.util.List < String > vSwitchId;

    private CreateRAMDirectoryRequest(Builder builder) {
        super(builder);
        this.desktopAccessType = builder.desktopAccessType;
        this.directoryName = builder.directoryName;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.enableInternetAccess = builder.enableInternetAccess;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRAMDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopAccessType
     */
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    /**
     * @return directoryName
     */
    public String getDirectoryName() {
        return this.directoryName;
    }

    /**
     * @return enableAdminAccess
     */
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    /**
     * @return enableInternetAccess
     */
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public java.util.List < String > getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateRAMDirectoryRequest, Builder> {
        private String desktopAccessType; 
        private String directoryName; 
        private Boolean enableAdminAccess; 
        private Boolean enableInternetAccess; 
        private String regionId; 
        private java.util.List < String > vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRAMDirectoryRequest request) {
            super(request);
            this.desktopAccessType = request.desktopAccessType;
            this.directoryName = request.directoryName;
            this.enableAdminAccess = request.enableAdminAccess;
            this.enableInternetAccess = request.enableInternetAccess;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * The method to connect clients to cloud desktops.
         * <p>
         * 
         * Valid values:
         * 
         * *   VPC: connects to cloud desktops over VPCs.
         * *   Internet (default): connects to the cloud desktops over the Internet.
         * *   Any: connects to the cloud desktops over the Internet or VPCs.
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * The directory name. The name must be 2 to 255 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder directoryName(String directoryName) {
            this.putQueryParameter("DirectoryName", directoryName);
            this.directoryName = directoryName;
            return this;
        }

        /**
         * Specifies whether to grant the permissions of the local administrator to end users of the cloud desktops that belong to the workspace.
         * <p>
         * 
         * Valid values:
         * 
         * * true (default)
         * * false
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * Specifies whether to enable Internet access.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.putQueryParameter("EnableInternetAccess", enableInternetAccess);
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The vSwitch IDs. You can configure only one vSwitch.
         */
        public Builder vSwitchId(java.util.List < String > vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateRAMDirectoryRequest build() {
            return new CreateRAMDirectoryRequest(this);
        } 

    } 

}
