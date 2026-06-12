// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkastreaming20260202.models;

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
 * {@link CreateComputeInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeInstanceRequest</p>
 */
public class CreateComputeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long paidType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateComputeInstanceRequest(Builder builder) {
        super(builder);
        this.paidType = builder.paidType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paidType
     */
    public Long getPaidType() {
        return this.paidType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateComputeInstanceRequest, Builder> {
        private Long paidType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeInstanceRequest request) {
            super(request);
            this.paidType = request.paidType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder paidType(Long paidType) {
            this.putQueryParameter("PaidType", paidType);
            this.paidType = paidType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateComputeInstanceRequest build() {
            return new CreateComputeInstanceRequest(this);
        } 

    } 

}
