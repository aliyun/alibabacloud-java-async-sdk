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
 * {@link GetCloudAccountResourceRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAccountResourceRequest</p>
 */
public class GetCloudAccountResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountResourceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private GetCloudAccountResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cloudAccountId = builder.cloudAccountId;
        this.cloudAccountResourceId = builder.cloudAccountResourceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAccountResourceRequest create() {
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
     * @return cloudAccountId
     */
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    /**
     * @return cloudAccountResourceId
     */
    public String getCloudAccountResourceId() {
        return this.cloudAccountResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCloudAccountResourceRequest, Builder> {
        private String regionId; 
        private String cloudAccountId; 
        private String cloudAccountResourceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAccountResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cloudAccountId = request.cloudAccountId;
            this.cloudAccountResourceId = request.cloudAccountResourceId;
            this.instanceId = request.instanceId;
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
         * <p>The cloud account ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012xxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.putQueryParameter("CloudAccountId", cloudAccountId);
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>The cloud account resource ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>car_xxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder cloudAccountResourceId(String cloudAccountResourceId) {
            this.putQueryParameter("CloudAccountResourceId", cloudAccountResourceId);
            this.cloudAccountResourceId = cloudAccountResourceId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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

        @Override
        public GetCloudAccountResourceRequest build() {
            return new GetCloudAccountResourceRequest(this);
        } 

    } 

}
