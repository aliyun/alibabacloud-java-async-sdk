// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserCertificateExpireCountRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserCertificateExpireCountRequest</p>
 */
public class DescribeUserCertificateExpireCountRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeUserCertificateExpireCountRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserCertificateExpireCountRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeUserCertificateExpireCountRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserCertificateExpireCountRequest response) {
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
        public DescribeUserCertificateExpireCountRequest build() {
            return new DescribeUserCertificateExpireCountRequest(this);
        } 

    } 

}
