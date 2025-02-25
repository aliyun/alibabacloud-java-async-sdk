// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChaincodeVO} extends {@link TeaModel}
 *
 * <p>ChaincodeVO</p>
 */
public class ChaincodeVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChaincodeDefinitionId")
    private String chaincodeDefinitionId;

    @com.aliyun.core.annotation.NameInMap("ChaincodeId")
    private String chaincodeId;

    @com.aliyun.core.annotation.NameInMap("ChaincodePackageId")
    private String chaincodePackageId;

    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("ChannelName")
    private String channelName;

    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    private String consortiumId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DeployTime")
    private String deployTime;

    @com.aliyun.core.annotation.NameInMap("EndorsePolicy")
    private String endorsePolicy;

    @com.aliyun.core.annotation.NameInMap("InitRequired")
    private Boolean initRequired;

    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.NameInMap("Install")
    private Boolean install;

    @com.aliyun.core.annotation.NameInMap("Management")
    private Boolean management;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("ProviderId")
    private String providerId;

    @com.aliyun.core.annotation.NameInMap("ProviderName")
    private String providerName;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private ChaincodeVO(Builder builder) {
        this.chaincodeDefinitionId = builder.chaincodeDefinitionId;
        this.chaincodeId = builder.chaincodeId;
        this.chaincodePackageId = builder.chaincodePackageId;
        this.channelId = builder.channelId;
        this.channelName = builder.channelName;
        this.consortiumId = builder.consortiumId;
        this.createTime = builder.createTime;
        this.deployTime = builder.deployTime;
        this.endorsePolicy = builder.endorsePolicy;
        this.initRequired = builder.initRequired;
        this.input = builder.input;
        this.install = builder.install;
        this.management = builder.management;
        this.message = builder.message;
        this.name = builder.name;
        this.path = builder.path;
        this.providerId = builder.providerId;
        this.providerName = builder.providerName;
        this.state = builder.state;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChaincodeVO create() {
        return builder().build();
    }

    /**
     * @return chaincodeDefinitionId
     */
    public String getChaincodeDefinitionId() {
        return this.chaincodeDefinitionId;
    }

    /**
     * @return chaincodeId
     */
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    /**
     * @return chaincodePackageId
     */
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deployTime
     */
    public String getDeployTime() {
        return this.deployTime;
    }

    /**
     * @return endorsePolicy
     */
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    /**
     * @return initRequired
     */
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return install
     */
    public Boolean getInstall() {
        return this.install;
    }

    /**
     * @return management
     */
    public Boolean getManagement() {
        return this.management;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return providerId
     */
    public String getProviderId() {
        return this.providerId;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String chaincodeDefinitionId; 
        private String chaincodeId; 
        private String chaincodePackageId; 
        private String channelId; 
        private String channelName; 
        private String consortiumId; 
        private String createTime; 
        private String deployTime; 
        private String endorsePolicy; 
        private Boolean initRequired; 
        private String input; 
        private Boolean install; 
        private Boolean management; 
        private String message; 
        private String name; 
        private String path; 
        private String providerId; 
        private String providerName; 
        private String state; 
        private Integer type; 
        private String version; 

        /**
         * ChaincodeDefinitionId.
         */
        public Builder chaincodeDefinitionId(String chaincodeDefinitionId) {
            this.chaincodeDefinitionId = chaincodeDefinitionId;
            return this;
        }

        /**
         * ChaincodeId.
         */
        public Builder chaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }

        /**
         * ChaincodePackageId.
         */
        public Builder chaincodePackageId(String chaincodePackageId) {
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * ChannelName.
         */
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            return this;
        }

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DeployTime.
         */
        public Builder deployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }

        /**
         * EndorsePolicy.
         */
        public Builder endorsePolicy(String endorsePolicy) {
            this.endorsePolicy = endorsePolicy;
            return this;
        }

        /**
         * InitRequired.
         */
        public Builder initRequired(Boolean initRequired) {
            this.initRequired = initRequired;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.input = input;
            return this;
        }

        /**
         * Install.
         */
        public Builder install(Boolean install) {
            this.install = install;
            return this;
        }

        /**
         * Management.
         */
        public Builder management(Boolean management) {
            this.management = management;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * ProviderId.
         */
        public Builder providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        /**
         * ProviderName.
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ChaincodeVO build() {
            return new ChaincodeVO(this);
        } 

    } 

}
