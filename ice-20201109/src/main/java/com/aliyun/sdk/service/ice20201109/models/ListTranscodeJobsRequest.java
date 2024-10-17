// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTranscodeJobsRequest} extends {@link RequestModel}
 *
 * <p>ListTranscodeJobsRequest</p>
 */
public class ListTranscodeJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndOfCreateTime")
    private String endOfCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentJobId")
    private String parentJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartOfCreateTime")
    private String startOfCreateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListTranscodeJobsRequest(Builder builder) {
        super(builder);
        this.endOfCreateTime = builder.endOfCreateTime;
        this.nextPageToken = builder.nextPageToken;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.parentJobId = builder.parentJobId;
        this.startOfCreateTime = builder.startOfCreateTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTranscodeJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endOfCreateTime
     */
    public String getEndOfCreateTime() {
        return this.endOfCreateTime;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentJobId
     */
    public String getParentJobId() {
        return this.parentJobId;
    }

    /**
     * @return startOfCreateTime
     */
    public String getStartOfCreateTime() {
        return this.startOfCreateTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListTranscodeJobsRequest, Builder> {
        private String endOfCreateTime; 
        private String nextPageToken; 
        private String orderBy; 
        private Integer pageSize; 
        private String parentJobId; 
        private String startOfCreateTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListTranscodeJobsRequest request) {
            super(request);
            this.endOfCreateTime = request.endOfCreateTime;
            this.nextPageToken = request.nextPageToken;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.parentJobId = request.parentJobId;
            this.startOfCreateTime = request.startOfCreateTime;
            this.status = request.status;
        } 

        /**
         * EndOfCreateTime.
         */
        public Builder endOfCreateTime(String endOfCreateTime) {
            this.putQueryParameter("EndOfCreateTime", endOfCreateTime);
            this.endOfCreateTime = endOfCreateTime;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
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
         * ParentJobId.
         */
        public Builder parentJobId(String parentJobId) {
            this.putQueryParameter("ParentJobId", parentJobId);
            this.parentJobId = parentJobId;
            return this;
        }

        /**
         * StartOfCreateTime.
         */
        public Builder startOfCreateTime(String startOfCreateTime) {
            this.putQueryParameter("StartOfCreateTime", startOfCreateTime);
            this.startOfCreateTime = startOfCreateTime;
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
        public ListTranscodeJobsRequest build() {
            return new ListTranscodeJobsRequest(this);
        } 

    } 

}
