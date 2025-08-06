// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link CheckVodDefaultRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckVodDefaultRoleRequest</p>
 */
public class CheckVodDefaultRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    private Long resourceRealOwnerId;

    private CheckVodDefaultRoleRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVodDefaultRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceRealOwnerId
     */
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public static final class Builder extends Request.Builder<CheckVodDefaultRoleRequest, Builder> {
        private String ownerId; 
        private Long resourceRealOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CheckVodDefaultRoleRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceRealOwnerId.
         */
        public Builder resourceRealOwnerId(Long resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
            return this;
        }

        @Override
        public CheckVodDefaultRoleRequest build() {
            return new CheckVodDefaultRoleRequest(this);
        } 

    } 

}
