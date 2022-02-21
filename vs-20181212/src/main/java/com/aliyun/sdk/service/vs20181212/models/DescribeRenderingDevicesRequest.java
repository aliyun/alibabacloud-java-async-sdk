// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRenderingDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRenderingDevicesRequest</p>
 */
public class DescribeRenderingDevicesRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeRenderingDevicesRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingDevicesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRenderingDevicesRequest, Builder> {
        private String instanceIds; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRenderingDevicesRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
            this.ownerId = response.ownerId;
        } 

        /**
         * InstanceIds.
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
        public DescribeRenderingDevicesRequest build() {
            return new DescribeRenderingDevicesRequest(this);
        } 

    } 

}
