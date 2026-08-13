// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserInfoRequest</p>
 */
public class GetUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetUserInfoRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetUserInfoRequest, Builder> {
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserInfoRequest request) {
            super(request);
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetUserInfoRequest build() {
            return new GetUserInfoRequest(this);
        } 

    } 

}
