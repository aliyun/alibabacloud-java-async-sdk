// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobResourceUsageRequest} extends {@link RequestModel}
 *
 * <p>GetJobResourceUsageRequest</p>
 */
public class GetJobResourceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

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

    private GetJobResourceUsageRequest(Builder builder) {
        super(builder);
        this.date = builder.date;
        this.jobOwnerList = builder.jobOwnerList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.quotaNicknameList = builder.quotaNicknameList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobResourceUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
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

    public static final class Builder extends Request.Builder<GetJobResourceUsageRequest, Builder> {
        private String date; 
        private java.util.List < String > jobOwnerList; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List < String > quotaNicknameList; 

        private Builder() {
            super();
        } 

        private Builder(GetJobResourceUsageRequest request) {
            super(request);
            this.date = request.date;
            this.jobOwnerList = request.jobOwnerList;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.quotaNicknameList = request.quotaNicknameList;
        } 

        /**
         * The date that is accurate to the day part for the query. The date must be in the yyyy-MM-dd format.
         */
        public Builder date(String date) {
            this.putQueryParameter("date", date);
            this.date = date;
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
         * The number of entries per page. Default value: 10. Maximum value: 100.
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

        @Override
        public GetJobResourceUsageRequest build() {
            return new GetJobResourceUsageRequest(this);
        } 

    } 

}
