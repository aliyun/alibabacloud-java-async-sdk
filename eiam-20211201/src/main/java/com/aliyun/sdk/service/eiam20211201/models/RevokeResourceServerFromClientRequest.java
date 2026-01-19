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
 * {@link RevokeResourceServerFromClientRequest} extends {@link RequestModel}
 *
 * <p>RevokeResourceServerFromClientRequest</p>
 */
public class RevokeResourceServerFromClientRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String clientApplicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String resourceServerApplicationId;

    private RevokeResourceServerFromClientRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientApplicationId = builder.clientApplicationId;
        this.instanceId = builder.instanceId;
        this.resourceServerApplicationId = builder.resourceServerApplicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeResourceServerFromClientRequest create() {
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
     * @return clientApplicationId
     */
    public String getClientApplicationId() {
        return this.clientApplicationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceServerApplicationId
     */
    public String getResourceServerApplicationId() {
        return this.resourceServerApplicationId;
    }

    public static final class Builder extends Request.Builder<RevokeResourceServerFromClientRequest, Builder> {
        private String regionId; 
        private String clientApplicationId; 
        private String instanceId; 
        private String resourceServerApplicationId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeResourceServerFromClientRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientApplicationId = request.clientApplicationId;
            this.instanceId = request.instanceId;
            this.resourceServerApplicationId = request.resourceServerApplicationId;
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
        public Builder clientApplicationId(String clientApplicationId) {
            this.putQueryParameter("ClientApplicationId", clientApplicationId);
            this.clientApplicationId = clientApplicationId;
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
         * <p>IDaaS的应用资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder resourceServerApplicationId(String resourceServerApplicationId) {
            this.putQueryParameter("ResourceServerApplicationId", resourceServerApplicationId);
            this.resourceServerApplicationId = resourceServerApplicationId;
            return this;
        }

        @Override
        public RevokeResourceServerFromClientRequest build() {
            return new RevokeResourceServerFromClientRequest(this);
        } 

    } 

}
