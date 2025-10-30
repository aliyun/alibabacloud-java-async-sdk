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
 * {@link GetCustomPrivacyPolicyRequest} extends {@link RequestModel}
 *
 * <p>GetCustomPrivacyPolicyRequest</p>
 */
public class GetCustomPrivacyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String customPrivacyPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private GetCustomPrivacyPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customPrivacyPolicyId = builder.customPrivacyPolicyId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomPrivacyPolicyRequest create() {
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
     * @return customPrivacyPolicyId
     */
    public String getCustomPrivacyPolicyId() {
        return this.customPrivacyPolicyId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCustomPrivacyPolicyRequest, Builder> {
        private String regionId; 
        private String customPrivacyPolicyId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomPrivacyPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customPrivacyPolicyId = request.customPrivacyPolicyId;
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
         * <p>自定义条款ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pp_xxxxx</p>
         */
        public Builder customPrivacyPolicyId(String customPrivacyPolicyId) {
            this.putQueryParameter("CustomPrivacyPolicyId", customPrivacyPolicyId);
            this.customPrivacyPolicyId = customPrivacyPolicyId;
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

        @Override
        public GetCustomPrivacyPolicyRequest build() {
            return new GetCustomPrivacyPolicyRequest(this);
        } 

    } 

}
