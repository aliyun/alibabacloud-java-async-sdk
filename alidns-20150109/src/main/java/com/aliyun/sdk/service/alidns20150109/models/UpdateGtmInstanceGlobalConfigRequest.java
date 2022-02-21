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

        private Builder(UpdateGtmInstanceGlobalConfigRequest response) {
            super(response);
            this.alertGroup = response.alertGroup;
            this.cnameCustomDomainName = response.cnameCustomDomainName;
            this.cnameMode = response.cnameMode;
            this.instanceId = response.instanceId;
            this.instanceName = response.instanceName;
            this.lang = response.lang;
            this.lbaStrategy = response.lbaStrategy;
            this.ttl = response.ttl;
            this.userDomainName = response.userDomainName;
        } 

        /**
         * AlertGroup.
         */
        public Builder alertGroup(String alertGroup) {
            this.putQueryParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * CnameCustomDomainName.
         */
        public Builder cnameCustomDomainName(String cnameCustomDomainName) {
            this.putQueryParameter("CnameCustomDomainName", cnameCustomDomainName);
            this.cnameCustomDomainName = cnameCustomDomainName;
            return this;
        }

        /**
         * CnameMode.
         */
        public Builder cnameMode(String cnameMode) {
            this.putQueryParameter("CnameMode", cnameMode);
            this.cnameMode = cnameMode;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LbaStrategy.
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.putQueryParameter("LbaStrategy", lbaStrategy);
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * UserDomainName.
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
