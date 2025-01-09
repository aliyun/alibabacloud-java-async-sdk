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
 * {@link UpdateNetworkAccessEndpointNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetworkAccessEndpointNameRequest</p>
 */
public class UpdateNetworkAccessEndpointNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAccessEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAccessEndpointName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAccessEndpointName;

    private UpdateNetworkAccessEndpointNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.networkAccessEndpointId = builder.networkAccessEndpointId;
        this.networkAccessEndpointName = builder.networkAccessEndpointName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetworkAccessEndpointNameRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkAccessEndpointId
     */
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    /**
     * @return networkAccessEndpointName
     */
    public String getNetworkAccessEndpointName() {
        return this.networkAccessEndpointName;
    }

    public static final class Builder extends Request.Builder<UpdateNetworkAccessEndpointNameRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String networkAccessEndpointId; 
        private String networkAccessEndpointName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetworkAccessEndpointNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.networkAccessEndpointId = request.networkAccessEndpointId;
            this.networkAccessEndpointName = request.networkAccessEndpointName;
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
         * <p>专属网络端点ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nae_examplexxxx</p>
         */
        public Builder networkAccessEndpointId(String networkAccessEndpointId) {
            this.putQueryParameter("NetworkAccessEndpointId", networkAccessEndpointId);
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }

        /**
         * <p>专属网络端点名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xx业务VPC访问端点</p>
         */
        public Builder networkAccessEndpointName(String networkAccessEndpointName) {
            this.putQueryParameter("NetworkAccessEndpointName", networkAccessEndpointName);
            this.networkAccessEndpointName = networkAccessEndpointName;
            return this;
        }

        @Override
        public UpdateNetworkAccessEndpointNameRequest build() {
            return new UpdateNetworkAccessEndpointNameRequest(this);
        } 

    } 

}
