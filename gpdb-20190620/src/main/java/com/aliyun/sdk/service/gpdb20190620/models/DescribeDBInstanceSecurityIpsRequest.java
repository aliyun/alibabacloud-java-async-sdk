// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceSecurityIpsRequest</p>
 */
public class DescribeDBInstanceSecurityIpsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDBInstanceSecurityIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSecurityIpsRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceSecurityIpsRequest, Builder> {
        private String instanceId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceSecurityIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeDBInstanceSecurityIpsRequest build() {
            return new DescribeDBInstanceSecurityIpsRequest(this);
        } 

    } 

}
