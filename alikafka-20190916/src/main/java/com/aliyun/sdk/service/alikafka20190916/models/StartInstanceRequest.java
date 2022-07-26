// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstanceRequest} extends {@link RequestModel}
 *
 * <p>StartInstanceRequest</p>
 */
public class StartInstanceRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("DeployModule")
    private String deployModule;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsEipInner")
    private Boolean isEipInner;

    @Query
    @NameInMap("IsForceSelectedZones")
    private Boolean isForceSelectedZones;

    @Query
    @NameInMap("IsSetUserAndPassword")
    private Boolean isSetUserAndPassword;

    @Query
    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Notifier")
    private String notifier;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityGroup")
    private String securityGroup;

    @Query
    @NameInMap("SelectedZones")
    private String selectedZones;

    @Query
    @NameInMap("ServiceVersion")
    private String serviceVersion;

    @Query
    @NameInMap("UserPhoneNum")
    private String userPhoneNum;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private StartInstanceRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.deployModule = builder.deployModule;
        this.instanceId = builder.instanceId;
        this.isEipInner = builder.isEipInner;
        this.isForceSelectedZones = builder.isForceSelectedZones;
        this.isSetUserAndPassword = builder.isSetUserAndPassword;
        this.KMSKeyId = builder.KMSKeyId;
        this.name = builder.name;
        this.notifier = builder.notifier;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.securityGroup = builder.securityGroup;
        this.selectedZones = builder.selectedZones;
        this.serviceVersion = builder.serviceVersion;
        this.userPhoneNum = builder.userPhoneNum;
        this.username = builder.username;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return deployModule
     */
    public String getDeployModule() {
        return this.deployModule;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isEipInner
     */
    public Boolean getIsEipInner() {
        return this.isEipInner;
    }

    /**
     * @return isForceSelectedZones
     */
    public Boolean getIsForceSelectedZones() {
        return this.isForceSelectedZones;
    }

    /**
     * @return isSetUserAndPassword
     */
    public Boolean getIsSetUserAndPassword() {
        return this.isSetUserAndPassword;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifier
     */
    public String getNotifier() {
        return this.notifier;
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

    /**
     * @return securityGroup
     */
    public String getSecurityGroup() {
        return this.securityGroup;
    }

    /**
     * @return selectedZones
     */
    public String getSelectedZones() {
        return this.selectedZones;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return userPhoneNum
     */
    public String getUserPhoneNum() {
        return this.userPhoneNum;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<StartInstanceRequest, Builder> {
        private String config; 
        private String deployModule; 
        private String instanceId; 
        private Boolean isEipInner; 
        private Boolean isForceSelectedZones; 
        private Boolean isSetUserAndPassword; 
        private String KMSKeyId; 
        private String name; 
        private String notifier; 
        private String password; 
        private String regionId; 
        private String securityGroup; 
        private String selectedZones; 
        private String serviceVersion; 
        private String userPhoneNum; 
        private String username; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(StartInstanceRequest request) {
            super(request);
            this.config = request.config;
            this.deployModule = request.deployModule;
            this.instanceId = request.instanceId;
            this.isEipInner = request.isEipInner;
            this.isForceSelectedZones = request.isForceSelectedZones;
            this.isSetUserAndPassword = request.isSetUserAndPassword;
            this.KMSKeyId = request.KMSKeyId;
            this.name = request.name;
            this.notifier = request.notifier;
            this.password = request.password;
            this.regionId = request.regionId;
            this.securityGroup = request.securityGroup;
            this.selectedZones = request.selectedZones;
            this.serviceVersion = request.serviceVersion;
            this.userPhoneNum = request.userPhoneNum;
            this.username = request.username;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * DeployModule.
         */
        public Builder deployModule(String deployModule) {
            this.putQueryParameter("DeployModule", deployModule);
            this.deployModule = deployModule;
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
         * IsEipInner.
         */
        public Builder isEipInner(Boolean isEipInner) {
            this.putQueryParameter("IsEipInner", isEipInner);
            this.isEipInner = isEipInner;
            return this;
        }

        /**
         * IsForceSelectedZones.
         */
        public Builder isForceSelectedZones(Boolean isForceSelectedZones) {
            this.putQueryParameter("IsForceSelectedZones", isForceSelectedZones);
            this.isForceSelectedZones = isForceSelectedZones;
            return this;
        }

        /**
         * IsSetUserAndPassword.
         */
        public Builder isSetUserAndPassword(Boolean isSetUserAndPassword) {
            this.putQueryParameter("IsSetUserAndPassword", isSetUserAndPassword);
            this.isSetUserAndPassword = isSetUserAndPassword;
            return this;
        }

        /**
         * KMSKeyId.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putQueryParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Notifier.
         */
        public Builder notifier(String notifier) {
            this.putQueryParameter("Notifier", notifier);
            this.notifier = notifier;
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

        /**
         * SecurityGroup.
         */
        public Builder securityGroup(String securityGroup) {
            this.putQueryParameter("SecurityGroup", securityGroup);
            this.securityGroup = securityGroup;
            return this;
        }

        /**
         * SelectedZones.
         */
        public Builder selectedZones(String selectedZones) {
            this.putQueryParameter("SelectedZones", selectedZones);
            this.selectedZones = selectedZones;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * UserPhoneNum.
         */
        public Builder userPhoneNum(String userPhoneNum) {
            this.putQueryParameter("UserPhoneNum", userPhoneNum);
            this.userPhoneNum = userPhoneNum;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public StartInstanceRequest build() {
            return new StartInstanceRequest(this);
        } 

    } 

}
