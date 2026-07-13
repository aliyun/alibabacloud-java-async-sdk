// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link CreateServiceEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceEndpointRequest</p>
 */
public class CreateServiceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Component")
    @com.aliyun.core.annotation.Validation(required = true)
    private String component;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    private CreateServiceEndpointRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.certIdentifier = builder.certIdentifier;
        this.clientToken = builder.clientToken;
        this.component = builder.component;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.resourceName = builder.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return component
     */
    public String getComponent() {
        return this.component;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    public static final class Builder extends Request.Builder<CreateServiceEndpointRequest, Builder> {
        private String regionId; 
        private String certIdentifier; 
        private String clientToken; 
        private String component; 
        private String domain; 
        private String instanceId; 
        private String resourceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceEndpointRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.certIdentifier = request.certIdentifier;
            this.clientToken = request.clientToken;
            this.component = request.component;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.resourceName = request.resourceName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
         */
        public Builder component(String component) {
            this.putQueryParameter("Component", component);
            this.component = component;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ins-001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        @Override
        public CreateServiceEndpointRequest build() {
            return new CreateServiceEndpointRequest(this);
        } 

    } 

}
