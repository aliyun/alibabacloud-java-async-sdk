// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link GetWorkflowGlobalEnvRequest} extends {@link RequestModel}
 *
 * <p>GetWorkflowGlobalEnvRequest</p>
 */
public class GetWorkflowGlobalEnvRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetWorkflowGlobalEnvRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowGlobalEnvRequest create() {
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

    public static final class Builder extends Request.Builder<GetWorkflowGlobalEnvRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkflowGlobalEnvRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * <p>用于可信POP host路由和RAM ARN，不进入业务body/query，不作为客户账号归属来源。</p>
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetWorkflowGlobalEnvRequest build() {
            return new GetWorkflowGlobalEnvRequest(this);
        } 

    } 

}
