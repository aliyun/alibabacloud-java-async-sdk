// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRunningJobsRequest} extends {@link RequestModel}
 *
 * <p>GetRunningJobsRequest</p>
 */
public class GetRunningJobsRequest extends Request {
    @Query
    @NameInMap("from")
    @Validation(required = true)
    private Long from;

    @Query
    @NameInMap("jobOwnerList")
    private java.util.List < String > jobOwnerList;

    @Query
    @NameInMap("pageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("pageSize")
    private Long pageSize;

    @Query
    @NameInMap("quotaNicknameList")
    private java.util.List < String > quotaNicknameList;

    @Query
    @NameInMap("to")
    @Validation(required = true)
    private Long to;

    private GetRunningJobsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.jobOwnerList = builder.jobOwnerList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.quotaNicknameList = builder.quotaNicknameList;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRunningJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return jobOwnerList
     */
    public java.util.List < String > getJobOwnerList() {
        return this.jobOwnerList;
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
     * @return quotaNicknameList
     */
    public java.util.List < String > getQuotaNicknameList() {
        return this.quotaNicknameList;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetRunningJobsRequest, Builder> {
        private Long from; 
        private java.util.List < String > jobOwnerList; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List < String > quotaNicknameList; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(GetRunningJobsRequest request) {
            super(request);
            this.from = request.from;
            this.jobOwnerList = request.jobOwnerList;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.quotaNicknameList = request.quotaNicknameList;
            this.to = request.to;
        } 

        /**
         * from.
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * jobOwnerList.
         */
        public Builder jobOwnerList(java.util.List < String > jobOwnerList) {
            String jobOwnerListShrink = shrink(jobOwnerList, "jobOwnerList", "simple");
            this.putQueryParameter("jobOwnerList", jobOwnerListShrink);
            this.jobOwnerList = jobOwnerList;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * quotaNicknameList.
         */
        public Builder quotaNicknameList(java.util.List < String > quotaNicknameList) {
            String quotaNicknameListShrink = shrink(quotaNicknameList, "quotaNicknameList", "simple");
            this.putQueryParameter("quotaNicknameList", quotaNicknameListShrink);
            this.quotaNicknameList = quotaNicknameList;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        @Override
        public GetRunningJobsRequest build() {
            return new GetRunningJobsRequest(this);
        } 

    } 

}
