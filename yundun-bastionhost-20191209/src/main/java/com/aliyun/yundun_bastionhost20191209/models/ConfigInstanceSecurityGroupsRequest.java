// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ConfigInstanceSecurityGroupsRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceSecurityGroupsRequest</p>
 */
public class ConfigInstanceSecurityGroupsRequest extends Request {
    @Query
    @NameInMap("AuthorizedSecurityGroups")
    private java.util.List < String > authorizedSecurityGroups;

    @Query
    @NameInMap("InstanceId")
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

    public static final class Builder extends Request.Builder<Builder> {
        private java.util.List < String > authorizedSecurityGroups; 
        private String instanceId; 
        private String lang; 
        private String regionId; 

        /**
         * <p>AuthorizedSecurityGroups.</p>
         */
        public Builder authorizedSecurityGroups(java.util.List < String > authorizedSecurityGroups) {
            this.putQueryParameter("AuthorizedSecurityGroups", authorizedSecurityGroups);
            this.authorizedSecurityGroups = authorizedSecurityGroups;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Lang.</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public ConfigInstanceSecurityGroupsRequest build() {
            return new ConfigInstanceSecurityGroupsRequest(this);
        } 

    } 

}
