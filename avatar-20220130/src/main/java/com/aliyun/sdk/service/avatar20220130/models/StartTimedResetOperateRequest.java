// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTimedResetOperateRequest} extends {@link RequestModel}
 *
 * <p>StartTimedResetOperateRequest</p>
 */
public class StartTimedResetOperateRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private StartTimedResetOperateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTimedResetOperateRequest create() {
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

    public static final class Builder extends Request.Builder<StartTimedResetOperateRequest, Builder> {
        private String instanceId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(StartTimedResetOperateRequest request) {
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
        public StartTimedResetOperateRequest build() {
            return new StartTimedResetOperateRequest(this);
        } 

    } 

}
