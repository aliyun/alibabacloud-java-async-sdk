// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPictureSearchJobRequest} extends {@link RequestModel}
 *
 * <p>QueryPictureSearchJobRequest</p>
 */
public class QueryPictureSearchJobRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("JobStatus")
    @Validation(maximum = 10)
    private Integer jobStatus;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    private QueryPictureSearchJobRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.currentPage = builder.currentPage;
        this.jobStatus = builder.jobStatus;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPictureSearchJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return jobStatus
     */
    public Integer getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryPictureSearchJobRequest, Builder> {
        private String appInstanceId; 
        private Integer currentPage; 
        private Integer jobStatus; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryPictureSearchJobRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.currentPage = request.currentPage;
            this.jobStatus = request.jobStatus;
            this.pageSize = request.pageSize;
        } 

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * JobStatus.
         */
        public Builder jobStatus(Integer jobStatus) {
            this.putQueryParameter("JobStatus", jobStatus);
            this.jobStatus = jobStatus;
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

        @Override
        public QueryPictureSearchJobRequest build() {
            return new QueryPictureSearchJobRequest(this);
        } 

    } 

}
