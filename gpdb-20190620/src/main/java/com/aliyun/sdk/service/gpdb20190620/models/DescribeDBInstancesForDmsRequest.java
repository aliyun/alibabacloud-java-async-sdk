// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesForDmsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstancesForDmsRequest</p>
 */
public class DescribeDBInstancesForDmsRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDBInstancesForDmsRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesForDmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstancesForDmsRequest, Builder> {
        private Long aliUid; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstancesForDmsRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.ownerId = request.ownerId;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
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
        public DescribeDBInstancesForDmsRequest build() {
            return new DescribeDBInstancesForDmsRequest(this);
        } 

    } 

}
