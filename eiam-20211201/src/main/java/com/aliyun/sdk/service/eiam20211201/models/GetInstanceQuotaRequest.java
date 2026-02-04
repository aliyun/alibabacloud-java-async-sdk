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
 * {@link GetInstanceQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceQuotaRequest</p>
 */
public class GetInstanceQuotaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaKey;

    private GetInstanceQuotaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.quotaKey = builder.quotaKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceQuotaRequest create() {
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
     * @return quotaKey
     */
    public String getQuotaKey() {
        return this.quotaKey;
    }

    public static final class Builder extends Request.Builder<GetInstanceQuotaRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String quotaKey; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceQuotaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.quotaKey = request.quotaKey;
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
         * <p>配额类型，QuotaEnum</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userMaxNumber</p>
         */
        public Builder quotaKey(String quotaKey) {
            this.putQueryParameter("QuotaKey", quotaKey);
            this.quotaKey = quotaKey;
            return this;
        }

        @Override
        public GetInstanceQuotaRequest build() {
            return new GetInstanceQuotaRequest(this);
        } 

    } 

}
