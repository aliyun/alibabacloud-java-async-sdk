// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSnapshotUrlsRequest} extends {@link RequestModel}
 *
 * <p>GetSnapshotUrlsRequest</p>
 */
public class GetSnapshotUrlsRequest extends Request {
    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    private GetSnapshotUrlsRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotUrlsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<GetSnapshotUrlsRequest, Builder> {
        private String jobId; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(GetSnapshotUrlsRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.timeout = request.timeout;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public GetSnapshotUrlsRequest build() {
            return new GetSnapshotUrlsRequest(this);
        } 

    } 

}
