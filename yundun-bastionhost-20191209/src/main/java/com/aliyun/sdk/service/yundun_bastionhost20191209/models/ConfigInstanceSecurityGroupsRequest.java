// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigInstanceSecurityGroupsRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceSecurityGroupsRequest</p>
 */
public class ConfigInstanceSecurityGroupsRequest extends Request {
    @Query
    @NameInMap("AuthorizedSecurityGroups")
    @Validation(required = true)
    private java.util.List < String > authorizedSecurityGroups;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ConfigInstanceSecurityGroupsRequest(Builder builder) {
        super(builder);
        this.authorizedSecurityGroups = builder.authorizedSecurityGroups;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceSecurityGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedSecurityGroups
     */
    public java.util.List < String > getAuthorizedSecurityGroups() {
        return this.authorizedSecurityGroups;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ConfigInstanceSecurityGroupsRequest, Builder> {
        private java.util.List < String > authorizedSecurityGroups; 
        private String instanceId; 
        private String lang; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceSecurityGroupsRequest request) {
            super(request);
            this.authorizedSecurityGroups = request.authorizedSecurityGroups;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.regionId = request.regionId;
        } 

        /**
         * An array that consists of the IDs of authorized security groups.
         */
        public Builder authorizedSecurityGroups(java.util.List < String > authorizedSecurityGroups) {
            this.putQueryParameter("AuthorizedSecurityGroups", authorizedSecurityGroups);
            this.authorizedSecurityGroups = authorizedSecurityGroups;
            return this;
        }

        /**
         * The ID of the bastion host.
         * <p>
         * 
         * > You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The region ID of the bastion host.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ConfigInstanceSecurityGroupsRequest build() {
            return new ConfigInstanceSecurityGroupsRequest(this);
        } 

    } 

}
