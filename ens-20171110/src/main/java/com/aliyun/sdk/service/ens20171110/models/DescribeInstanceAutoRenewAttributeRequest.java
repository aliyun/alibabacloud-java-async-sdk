// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceAutoRenewAttributeRequest</p>
 */
public class DescribeInstanceAutoRenewAttributeRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeInstanceAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceAutoRenewAttributeRequest, Builder> {
        private String instanceIds; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceAutoRenewAttributeRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.ownerId = request.ownerId;
        } 

        /**
         * The ID of an instance. Separate multiple IDs with semicolons (;).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeInstanceAutoRenewAttributeRequest build() {
            return new DescribeInstanceAutoRenewAttributeRequest(this);
        } 

    } 

}
