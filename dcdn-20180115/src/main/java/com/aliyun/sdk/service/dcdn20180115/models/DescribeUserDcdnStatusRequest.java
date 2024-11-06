// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserDcdnStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserDcdnStatusRequest</p>
 */
public class DescribeUserDcdnStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DescribeUserDcdnStatusRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDcdnStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeUserDcdnStatusRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserDcdnStatusRequest request) {
            super(request);
            this.ownerId = request.ownerId;
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
        public DescribeUserDcdnStatusRequest build() {
            return new DescribeUserDcdnStatusRequest(this);
        } 

    } 

}
