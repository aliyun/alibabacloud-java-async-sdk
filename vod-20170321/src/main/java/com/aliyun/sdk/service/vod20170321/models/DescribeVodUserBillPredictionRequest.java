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
 * {@link DescribeVodUserBillPredictionRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodUserBillPredictionRequest</p>
 */
public class DescribeVodUserBillPredictionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Area")
    private String area;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimension")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DescribeVodUserBillPredictionRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.dimension = builder.dimension;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodUserBillPredictionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeVodUserBillPredictionRequest, Builder> {
        private String area; 
        private String dimension; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodUserBillPredictionRequest request) {
            super(request);
            this.area = request.area;
            this.dimension = request.dimension;
            this.ownerId = request.ownerId;
        } 

        /**
         * Area.
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dimension(String dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
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
        public DescribeVodUserBillPredictionRequest build() {
            return new DescribeVodUserBillPredictionRequest(this);
        } 

    } 

}
