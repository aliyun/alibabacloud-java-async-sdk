// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeWatchTasksRequest</p>
 */
public class DescribeWatchTasksRequest extends Request {
    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("WatchTaskIds")
    private String watchTaskIds;

    private DescribeWatchTasksRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.watchTaskIds = builder.watchTaskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWatchTasksRequest create() {
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
     * @return watchTaskIds
     */
    public String getWatchTaskIds() {
        return this.watchTaskIds;
    }

    public static final class Builder extends Request.Builder<DescribeWatchTasksRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String watchTaskIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWatchTasksRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.watchTaskIds = response.watchTaskIds;
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
         * WatchTaskIds.
         */
        public Builder watchTaskIds(String watchTaskIds) {
            this.putBodyParameter("WatchTaskIds", watchTaskIds);
            this.watchTaskIds = watchTaskIds;
            return this;
        }

        @Override
        public DescribeWatchTasksRequest build() {
            return new DescribeWatchTasksRequest(this);
        } 

    } 

}
