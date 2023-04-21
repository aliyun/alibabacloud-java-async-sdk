// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigADConnectorUserRequest} extends {@link RequestModel}
 *
 * <p>ConfigADConnectorUserRequest</p>
 */
public class ConfigADConnectorUserRequest extends Request {
    @Query
    @NameInMap("DomainPassword")
    @Validation(required = true)
    private String domainPassword;

    @Query
    @NameInMap("DomainUserName")
    @Validation(required = true)
    private String domainUserName;

    @Query
    @NameInMap("OUName")
    private String OUName;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ConfigADConnectorUserRequest(Builder builder) {
        super(builder);
        this.domainPassword = builder.domainPassword;
        this.domainUserName = builder.domainUserName;
        this.OUName = builder.OUName;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigADConnectorUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainPassword
     */
    public String getDomainPassword() {
        return this.domainPassword;
    }

    /**
     * @return domainUserName
     */
    public String getDomainUserName() {
        return this.domainUserName;
    }

    /**
     * @return OUName
     */
    public String getOUName() {
        return this.OUName;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigADConnectorUserRequest, Builder> {
        private String domainPassword; 
        private String domainUserName; 
        private String OUName; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigADConnectorUserRequest request) {
            super(request);
            this.domainPassword = request.domainPassword;
            this.domainUserName = request.domainUserName;
            this.OUName = request.OUName;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * The password of the AD user that has the permissions to join computers to domains.
         */
        public Builder domainPassword(String domainPassword) {
            this.putQueryParameter("DomainPassword", domainPassword);
            this.domainPassword = domainPassword;
            return this;
        }

        /**
         * The username of the AD user that has the permissions to join computers to domains.
         * <p>
         * 
         * After the username is configured, the cloud desktops in the same AD workspace are joined to the specified OU.
         */
        public Builder domainUserName(String domainUserName) {
            this.putQueryParameter("DomainUserName", domainUserName);
            this.domainUserName = domainUserName;
            return this;
        }

        /**
         * The name of the OU in the AD domain. You can call the [ListUserAdOrganizationUnits](~~311259~~) to obtain the OU name.
         */
        public Builder OUName(String OUName) {
            this.putQueryParameter("OUName", OUName);
            this.OUName = OUName;
            return this;
        }

        /**
         * The ID of the AD workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigADConnectorUserRequest build() {
            return new ConfigADConnectorUserRequest(this);
        } 

    } 

}
