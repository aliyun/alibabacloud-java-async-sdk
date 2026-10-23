// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link GetGovernanceServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetGovernanceServiceStatusRequest</p>
 */
public class GetGovernanceServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetGovernanceServiceStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceServiceStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetGovernanceServiceStatusRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetGovernanceServiceStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>必填。待操作或查询的地域 ID，必须为服务支持的合法地域，且与本次调用 endpoint 对应的地域一致；不提供隐式默认地域。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetGovernanceServiceStatusRequest build() {
            return new GetGovernanceServiceStatusRequest(this);
        } 

    } 

}
