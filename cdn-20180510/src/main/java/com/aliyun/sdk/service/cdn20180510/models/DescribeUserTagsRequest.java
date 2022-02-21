// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserTagsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserTagsRequest</p>
 */
public class DescribeUserTagsRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeUserTagsRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeUserTagsRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserTagsRequest response) {
            super(response);
            this.ownerId = response.ownerId;
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
        public DescribeUserTagsRequest build() {
            return new DescribeUserTagsRequest(this);
        } 

    } 

}
