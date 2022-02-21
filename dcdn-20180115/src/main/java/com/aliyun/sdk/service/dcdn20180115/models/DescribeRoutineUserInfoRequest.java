// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineUserInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoutineUserInfoRequest</p>
 */
public class DescribeRoutineUserInfoRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeRoutineUserInfoRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineUserInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRoutineUserInfoRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRoutineUserInfoRequest response) {
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
        public DescribeRoutineUserInfoRequest build() {
            return new DescribeRoutineUserInfoRequest(this);
        } 

    } 

}
