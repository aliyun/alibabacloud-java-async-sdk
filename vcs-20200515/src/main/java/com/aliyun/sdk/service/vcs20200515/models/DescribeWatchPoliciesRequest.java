// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeWatchPoliciesRequest</p>
 */
public class DescribeWatchPoliciesRequest extends Request {
    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("WatchPolicyIds")
    private String watchPolicyIds;

    private DescribeWatchPoliciesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.watchPolicyIds = builder.watchPolicyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWatchPoliciesRequest create() {
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
     * @return watchPolicyIds
     */
    public String getWatchPolicyIds() {
        return this.watchPolicyIds;
    }

    public static final class Builder extends Request.Builder<DescribeWatchPoliciesRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String watchPolicyIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWatchPoliciesRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.watchPolicyIds = response.watchPolicyIds;
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
         * WatchPolicyIds.
         */
        public Builder watchPolicyIds(String watchPolicyIds) {
            this.putBodyParameter("WatchPolicyIds", watchPolicyIds);
            this.watchPolicyIds = watchPolicyIds;
            return this;
        }

        @Override
        public DescribeWatchPoliciesRequest build() {
            return new DescribeWatchPoliciesRequest(this);
        } 

    } 

}
