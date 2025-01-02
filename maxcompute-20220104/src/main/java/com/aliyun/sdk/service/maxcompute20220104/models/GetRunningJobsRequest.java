// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
    private java.util.List<String> jobOwnerList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("quotaNicknameList")
    private java.util.List<String> quotaNicknameList;

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
    public java.util.List<String> getJobOwnerList() {
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
    public java.util.List<String> getQuotaNicknameList() {
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
        private java.util.List<String> jobOwnerList; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<String> quotaNicknameList; 
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
         * <p>The time when the query starts. This parameter specifies the time when a job is submitted.</p>
         * <ul>
         * <li>The time range that is specified by the <strong>from</strong> and <strong>to</strong> request parameters is a closed interval. The start time and end time are included in the range. If the value of <strong>from</strong> is the same as the value of <strong>to</strong>, the time range is invalid, and a null value is returned.</li>
         * <li>The value is a UNIX timestamp that represents the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1683785928</p>
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The list of job executors.</p>
         */
        public Builder jobOwnerList(java.util.List<String> jobOwnerList) {
            String jobOwnerListShrink = shrink(jobOwnerList, "jobOwnerList", "simple");
            this.putQueryParameter("jobOwnerList", jobOwnerListShrink);
            this.jobOwnerList = jobOwnerList;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of nicknames of quotas that are used by jobs.</p>
         */
        public Builder quotaNicknameList(java.util.List<String> quotaNicknameList) {
            String quotaNicknameListShrink = shrink(quotaNicknameList, "quotaNicknameList", "simple");
            this.putQueryParameter("quotaNicknameList", quotaNicknameListShrink);
            this.quotaNicknameList = quotaNicknameList;
            return this;
        }

        /**
         * <p>The time when the query ends. This parameter specifies the time when a job is submitted.</p>
         * <ul>
         * <li>The time interval that is specified by the <strong>from</strong> and <strong>to</strong> request parameters is a closed interval. The start time and end time are included in the interval. If the value of <strong>from</strong> is the same as the value of <strong>to</strong>, the interval is invalid, and a null value is returned.</li>
         * <li>The value is a UNIX timestamp that represents the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1683612946</p>
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
