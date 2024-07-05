// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayTopVideosRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayTopVideosRequest</p>
 */
public class DescribePlayTopVideosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 10)
    private Long pageSize;

    private DescribePlayTopVideosRequest(Builder builder) {
        super(builder);
        this.bizDate = builder.bizDate;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayTopVideosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizDate
     */
    public String getBizDate() {
        return this.bizDate;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribePlayTopVideosRequest, Builder> {
        private String bizDate; 
        private Long ownerId; 
        private Long pageNo; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayTopVideosRequest request) {
            super(request);
            this.bizDate = request.bizDate;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * The time to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder bizDate(String bizDate) {
            this.putQueryParameter("BizDate", bizDate);
            this.bizDate = bizDate;
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

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **100**. Maximum value: **1000**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribePlayTopVideosRequest build() {
            return new DescribePlayTopVideosRequest(this);
        } 

    } 

}
