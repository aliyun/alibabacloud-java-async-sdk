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
 * {@link ListConditionalAccessPoliciesForNetworkZoneRequest} extends {@link RequestModel}
 *
 * <p>ListConditionalAccessPoliciesForNetworkZoneRequest</p>
 */
public class ListConditionalAccessPoliciesForNetworkZoneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkZoneId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String networkZoneId;

    private ListConditionalAccessPoliciesForNetworkZoneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.networkZoneId = builder.networkZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConditionalAccessPoliciesForNetworkZoneRequest create() {
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
     * @return networkZoneId
     */
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }

    public static final class Builder extends Request.Builder<ListConditionalAccessPoliciesForNetworkZoneRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String networkZoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListConditionalAccessPoliciesForNetworkZoneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.networkZoneId = request.networkZoneId;
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
         * <p>Instance ID.</p>
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
         * <p>Application ID associated with the conditional access policy</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_11111</p>
         */
        public Builder networkZoneId(String networkZoneId) {
            this.putQueryParameter("NetworkZoneId", networkZoneId);
            this.networkZoneId = networkZoneId;
            return this;
        }

        @Override
        public ListConditionalAccessPoliciesForNetworkZoneRequest build() {
            return new ListConditionalAccessPoliciesForNetworkZoneRequest(this);
        } 

    } 

}
