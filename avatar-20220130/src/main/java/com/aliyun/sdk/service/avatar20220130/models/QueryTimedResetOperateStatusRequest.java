// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTimedResetOperateStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryTimedResetOperateStatusRequest</p>
 */
public class QueryTimedResetOperateStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private QueryTimedResetOperateStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTimedResetOperateStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QueryTimedResetOperateStatusRequest, Builder> {
        private String instanceId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTimedResetOperateStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QueryTimedResetOperateStatusRequest build() {
            return new QueryTimedResetOperateStatusRequest(this);
        } 

    } 

}
