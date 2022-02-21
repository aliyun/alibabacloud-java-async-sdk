// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLogConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomLogConfigRequest</p>
 */
public class DescribeCustomLogConfigRequest extends Request {
    @Query
    @NameInMap("ConfigId")
    @Validation(required = true)
    private String configId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeCustomLogConfigRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomLogConfigRequest, Builder> {
        private String configId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomLogConfigRequest response) {
            super(response);
            this.configId = response.configId;
            this.ownerId = response.ownerId;
        } 

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
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
        public DescribeCustomLogConfigRequest build() {
            return new DescribeCustomLogConfigRequest(this);
        } 

    } 

}
