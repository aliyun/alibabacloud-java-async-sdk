// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeWatchItemsRequest</p>
 */
public class DescribeWatchItemsRequest extends Request {
    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("WatchItemIds")
    private String watchItemIds;

    @Body
    @NameInMap("WatchPolicyId")
    @Validation(required = true)
    private String watchPolicyId;

    private DescribeWatchItemsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.watchItemIds = builder.watchItemIds;
        this.watchPolicyId = builder.watchPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWatchItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return watchItemIds
     */
    public String getWatchItemIds() {
        return this.watchItemIds;
    }

    /**
     * @return watchPolicyId
     */
    public String getWatchPolicyId() {
        return this.watchPolicyId;
    }

    public static final class Builder extends Request.Builder<DescribeWatchItemsRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String watchItemIds; 
        private String watchPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWatchItemsRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.watchItemIds = response.watchItemIds;
            this.watchPolicyId = response.watchPolicyId;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * WatchItemIds.
         */
        public Builder watchItemIds(String watchItemIds) {
            this.putBodyParameter("WatchItemIds", watchItemIds);
            this.watchItemIds = watchItemIds;
            return this;
        }

        /**
         * WatchPolicyId.
         */
        public Builder watchPolicyId(String watchPolicyId) {
            this.putBodyParameter("WatchPolicyId", watchPolicyId);
            this.watchPolicyId = watchPolicyId;
            return this;
        }

        @Override
        public DescribeWatchItemsRequest build() {
            return new DescribeWatchItemsRequest(this);
        } 

    } 

}
