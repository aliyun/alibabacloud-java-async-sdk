// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link SetApplicationResourceServerIdentifierRequest} extends {@link RequestModel}
 *
 * <p>SetApplicationResourceServerIdentifierRequest</p>
 */
public class SetApplicationResourceServerIdentifierRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerIdentifier")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String resourceServerIdentifier;

    private SetApplicationResourceServerIdentifierRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.resourceServerIdentifier = builder.resourceServerIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetApplicationResourceServerIdentifierRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceServerIdentifier
     */
    public String getResourceServerIdentifier() {
        return this.resourceServerIdentifier;
    }

    public static final class Builder extends Request.Builder<SetApplicationResourceServerIdentifierRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String clientToken; 
        private String instanceId; 
        private String resourceServerIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(SetApplicationResourceServerIdentifierRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.resourceServerIdentifier = request.resourceServerIdentifier;
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
         * <p>IDaaS的应用资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>ResourceServer唯一标识，对应ResourceServer受众</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://gateway.com">http://gateway.com</a></p>
         */
        public Builder resourceServerIdentifier(String resourceServerIdentifier) {
            this.putQueryParameter("ResourceServerIdentifier", resourceServerIdentifier);
            this.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }

        @Override
        public SetApplicationResourceServerIdentifierRequest build() {
            return new SetApplicationResourceServerIdentifierRequest(this);
        } 

    } 

}
