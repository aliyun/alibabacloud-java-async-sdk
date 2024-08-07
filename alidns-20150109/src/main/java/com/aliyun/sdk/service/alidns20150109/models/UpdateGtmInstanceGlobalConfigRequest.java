// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGtmInstanceGlobalConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmInstanceGlobalConfigRequest</p>
 */
public class UpdateGtmInstanceGlobalConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private String alertGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnameCustomDomainName")
    private String cnameCustomDomainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnameMode")
    private String cnameMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LbaStrategy")
    private String lbaStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDomainName")
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
         * The alert group. Only one alert group is supported.
         * <p>
         * 
         * >  This parameter is required only for the first modification.
         */
        public Builder alertGroup(String alertGroup) {
            this.putQueryParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * If you set **CnameMode** to **CUSTOM**, you must specify the CnameCustomDomainName parameter, which must be set to a primary domain name.
         */
        public Builder cnameCustomDomainName(String cnameCustomDomainName) {
            this.putQueryParameter("CnameCustomDomainName", cnameCustomDomainName);
            this.cnameCustomDomainName = cnameCustomDomainName;
            return this;
        }

        /**
         * Specifies whether to use a system-assigned canonical name (CNAME) or a custom CNAME to access GTM. Valid values:
         * <p>
         * 
         * *   **SYSTEM_ASSIGN**: system-assigned CNAME
         * *   **CUSTOM**: custom CNAME
         */
        public Builder cnameMode(String cnameMode) {
            this.putQueryParameter("CnameMode", cnameMode);
            this.cnameMode = cnameMode;
            return this;
        }

        /**
         * The ID of the GTM instance.
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
         * >  This parameter is required only for the first modification.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The balancing policy. Valid values:
         * <p>
         * 
         * *   **ALL_RR**: load balancing
         * *   **RATIO**: weighted round-robin
         * 
         * >  This parameter is required only for the first modification.
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.putQueryParameter("LbaStrategy", lbaStrategy);
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * The global time-to-live (TTL).
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
         * >  This parameter is required only for the first modification.
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
