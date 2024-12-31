// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bss20140714.models;

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
 * {@link DescribeCouponListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCouponListRequest</p>
 */
public class DescribeCouponListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDeliveryTime")
    private String endDeliveryTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDeliveryTime")
    private String startDeliveryTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeCouponListRequest(Builder builder) {
        super(builder);
        this.endDeliveryTime = builder.endDeliveryTime;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.startDeliveryTime = builder.startDeliveryTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCouponListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDeliveryTime
     */
    public String getEndDeliveryTime() {
        return this.endDeliveryTime;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDeliveryTime
     */
    public String getStartDeliveryTime() {
        return this.startDeliveryTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCouponListRequest, Builder> {
        private String endDeliveryTime; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String startDeliveryTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCouponListRequest request) {
            super(request);
            this.endDeliveryTime = request.endDeliveryTime;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.startDeliveryTime = request.startDeliveryTime;
            this.status = request.status;
        } 

        /**
         * EndDeliveryTime.
         */
        public Builder endDeliveryTime(String endDeliveryTime) {
            this.putQueryParameter("EndDeliveryTime", endDeliveryTime);
            this.endDeliveryTime = endDeliveryTime;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartDeliveryTime.
         */
        public Builder startDeliveryTime(String startDeliveryTime) {
            this.putQueryParameter("StartDeliveryTime", startDeliveryTime);
            this.startDeliveryTime = startDeliveryTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCouponListRequest build() {
            return new DescribeCouponListRequest(this);
        } 

    } 

}
