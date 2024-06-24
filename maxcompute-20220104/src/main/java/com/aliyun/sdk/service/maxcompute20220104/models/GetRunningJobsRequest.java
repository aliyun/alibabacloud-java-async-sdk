// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRunningJobsRequest} extends {@link RequestModel}
 *
 * <p>GetRunningJobsRequest</p>
 */
public class GetRunningJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jobOwnerList")
    private java.util.List < String > jobOwnerList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("quotaNicknameList")
    private java.util.List < String > quotaNicknameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The time when the query starts. This parameter specifies the time when a job is submitted.
         * <p>
         * 
         * *   The time range that is specified by the **from** and **to** request parameters is a closed interval. The start time and end time are included in the range. If the value of **from** is the same as the value of **to**, the time range is invalid, and a null value is returned.
         * *   The value is a UNIX timestamp that represents the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * The list of job executors.
         */
        public Builder jobOwnerList(java.util.List < String > jobOwnerList) {
            String jobOwnerListShrink = shrink(jobOwnerList, "jobOwnerList", "simple");
            this.putQueryParameter("jobOwnerList", jobOwnerListShrink);
            this.jobOwnerList = jobOwnerList;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Maximum value: 20.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The list of nicknames of quotas that are used by jobs.
         */
        public Builder quotaNicknameList(java.util.List < String > quotaNicknameList) {
            String quotaNicknameListShrink = shrink(quotaNicknameList, "quotaNicknameList", "simple");
            this.putQueryParameter("quotaNicknameList", quotaNicknameListShrink);
            this.quotaNicknameList = quotaNicknameList;
            return this;
        }

        /**
         * The time when the query ends. This parameter specifies the time when a job is submitted.
         * <p>
         * 
         * *   The time interval that is specified by the **from** and **to** request parameters is a closed interval. The start time and end time are included in the interval. If the value of **from** is the same as the value of **to**, the interval is invalid, and a null value is returned.
         * *   The value is a UNIX timestamp that represents the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
