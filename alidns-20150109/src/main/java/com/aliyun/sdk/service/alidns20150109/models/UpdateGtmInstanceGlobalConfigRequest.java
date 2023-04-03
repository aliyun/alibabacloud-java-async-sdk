// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGtmInstanceGlobalConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmInstanceGlobalConfigRequest</p>
 */
public class UpdateGtmInstanceGlobalConfigRequest extends Request {
    @Query
    @NameInMap("AlertGroup")
    private String alertGroup;

    @Query
    @NameInMap("CnameCustomDomainName")
    private String cnameCustomDomainName;

    @Query
    @NameInMap("CnameMode")
    private String cnameMode;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LbaStrategy")
    private String lbaStrategy;

    @Query
    @NameInMap("Ttl")
    private Integer ttl;

    @Query
    @NameInMap("UserDomainName")
    private String userDomainName;

    private UpdateGtmInstanceGlobalConfigRequest(Builder builder) {
        super(builder);
        this.alertGroup = builder.alertGroup;
        this.cnameCustomDomainName = builder.cnameCustomDomainName;
        this.cnameMode = builder.cnameMode;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lang = builder.lang;
        this.lbaStrategy = builder.lbaStrategy;
        this.ttl = builder.ttl;
        this.userDomainName = builder.userDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGtmInstanceGlobalConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertGroup
     */
    public String getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return cnameCustomDomainName
     */
    public String getCnameCustomDomainName() {
        return this.cnameCustomDomainName;
    }

    /**
     * @return cnameMode
     */
    public String getCnameMode() {
        return this.cnameMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lbaStrategy
     */
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * @return userDomainName
     */
    public String getUserDomainName() {
        return this.userDomainName;
    }

    public static final class Builder extends Request.Builder<UpdateGtmInstanceGlobalConfigRequest, Builder> {
        private String alertGroup; 
        private String cnameCustomDomainName; 
        private String cnameMode; 
        private String instanceId; 
        private String instanceName; 
        private String lang; 
        private String lbaStrategy; 
        private Integer ttl; 
        private String userDomainName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGtmInstanceGlobalConfigRequest request) {
            super(request);
            this.alertGroup = request.alertGroup;
            this.cnameCustomDomainName = request.cnameCustomDomainName;
            this.cnameMode = request.cnameMode;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.lang = request.lang;
            this.lbaStrategy = request.lbaStrategy;
            this.ttl = request.ttl;
            this.userDomainName = request.userDomainName;
        } 

        /**
         * The alert group of the GTM instance. Currently, only one alert group is supported.
         * <p>
         * 
         * >  This parameter is required for the first update, but is optional for later updates.
         */
        public Builder alertGroup(String alertGroup) {
            this.putQueryParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * The CNAME record of a domain name, which must be the primary domain name. When **CnameMode** is **CUSTOM**, this parameter is required for access.
         */
        public Builder cnameCustomDomainName(String cnameCustomDomainName) {
            this.putQueryParameter("CnameCustomDomainName", cnameCustomDomainName);
            this.cnameCustomDomainName = cnameCustomDomainName;
            return this;
        }

        /**
         * Specifies whether the CNAME record is user-defined or automatically assigned by the system. Valid values:
         * <p>
         * 
         * *   **SYSTEM_ASSIGN**: Assigned by the system
         * *   **CUSTOM**: User-defined
         */
        public Builder cnameMode(String cnameMode) {
            this.putQueryParameter("CnameMode", cnameMode);
            this.cnameMode = cnameMode;
            return this;
        }

        /**
         * The ID of the GTM instance whose configuration you want to modify.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the GTM instance.
         * <p>
         * 
         * >  This parameter is required for the first update, but is not required for later updates.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The language used by the user.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The load balancing policy. Valid values:
         * <p>
         * 
         * *   **ALL_RR**: Load balancing
         * 
         * *   **RATIO**: Weighted round robin
         * 
         * > This parameter is required for the first update, but is optional for later updates.
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.putQueryParameter("LbaStrategy", lbaStrategy);
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * The time when the modification takes effect.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * The primary domain name.
         * <p>
         * 
         * >  This parameter is required for the first update, but is optional for later updates.
         */
        public Builder userDomainName(String userDomainName) {
            this.putQueryParameter("UserDomainName", userDomainName);
            this.userDomainName = userDomainName;
            return this;
        }

        @Override
        public UpdateGtmInstanceGlobalConfigRequest build() {
            return new UpdateGtmInstanceGlobalConfigRequest(this);
        } 

    } 

}
