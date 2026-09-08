// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnvironmentInfo} extends {@link TeaModel}
 *
 * <p>EnvironmentInfo</p>
 */
public class EnvironmentInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("default")
    private Boolean _default;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("gatewayInfo")
    private GatewayInfo gatewayInfo;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("subDomainInfos")
    private java.util.List<SubDomainInfo> subDomainInfos;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private EnvironmentInfo(Builder builder) {
        this.alias = builder.alias;
        this.createTimestamp = builder.createTimestamp;
        this._default = builder._default;
        this.description = builder.description;
        this.environmentId = builder.environmentId;
        this.gatewayInfo = builder.gatewayInfo;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.subDomainInfos = builder.subDomainInfos;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return _default
     */
    public Boolean get_default() {
        return this._default;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayInfo
     */
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subDomainInfos
     */
    public java.util.List<SubDomainInfo> getSubDomainInfos() {
        return this.subDomainInfos;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private String alias; 
        private Long createTimestamp; 
        private Boolean _default; 
        private String description; 
        private String environmentId; 
        private GatewayInfo gatewayInfo; 
        private String name; 
        private String resourceGroupId; 
        private java.util.List<SubDomainInfo> subDomainInfos; 
        private Long updateTimestamp; 

        private Builder() {
        } 

        private Builder(EnvironmentInfo model) {
            this.alias = model.alias;
            this.createTimestamp = model.createTimestamp;
            this._default = model._default;
            this.description = model.description;
            this.environmentId = model.environmentId;
            this.gatewayInfo = model.gatewayInfo;
            this.name = model.name;
            this.resourceGroupId = model.resourceGroupId;
            this.subDomainInfos = model.subDomainInfos;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The environment alias.</p>
         * 
         * <strong>example:</strong>
         * <p>test-env</p>
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1721116090326</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>Specifies whether the environment is the default environment.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder _default(Boolean _default) {
            this._default = _default;
            return this;
        }

        /**
         * <p>The environment descriptiont.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test environment.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The instance information.</p>
         */
        public Builder gatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }

        /**
         * <p>The environment name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The subdomains.</p>
         */
        public Builder subDomainInfos(java.util.List<SubDomainInfo> subDomainInfos) {
            this.subDomainInfos = subDomainInfos;
            return this;
        }

        /**
         * <p>The update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1721116090326</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public EnvironmentInfo build() {
            return new EnvironmentInfo(this);
        } 

    } 

}
