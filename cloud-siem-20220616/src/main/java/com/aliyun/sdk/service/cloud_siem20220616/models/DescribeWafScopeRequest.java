// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWafScopeRequest} extends {@link RequestModel}
 *
 * <p>DescribeWafScopeRequest</p>
 */
public class DescribeWafScopeRequest extends Request {
    @Body
    @NameInMap("EntityId")
    private Long entityId;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DescribeWafScopeRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWafScopeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeWafScopeRequest, Builder> {
        private Long entityId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWafScopeRequest request) {
            super(request);
            this.entityId = request.entityId;
            this.regionId = request.regionId;
        } 

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeWafScopeRequest build() {
            return new DescribeWafScopeRequest(this);
        } 

    } 

}
