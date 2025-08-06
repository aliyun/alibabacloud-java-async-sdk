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
 * {@link DescribeVodMultiUsageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodMultiUsageDataRequest</p>
 */
public class DescribeVodMultiUsageDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timePoint;

    private DescribeVodMultiUsageDataRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodMultiUsageDataRequest create() {
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

    /**
     * @return timePoint
     */
    public String getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder<DescribeVodMultiUsageDataRequest, Builder> {
        private Long ownerId; 
        private String timePoint; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodMultiUsageDataRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.timePoint = request.timePoint;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder timePoint(String timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        @Override
        public DescribeVodMultiUsageDataRequest build() {
            return new DescribeVodMultiUsageDataRequest(this);
        } 

    } 

}
