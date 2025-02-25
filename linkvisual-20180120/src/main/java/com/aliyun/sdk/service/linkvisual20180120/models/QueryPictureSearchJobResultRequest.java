// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPictureSearchJobResultRequest} extends {@link RequestModel}
 *
 * <p>QueryPictureSearchJobResultRequest</p>
 */
public class QueryPictureSearchJobResultRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true, maximum = 10000, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    private QueryPictureSearchJobResultRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.currentPage = builder.currentPage;
        this.jobId = builder.jobId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPictureSearchJobResultRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryPictureSearchJobResultRequest, Builder> {
        private String appInstanceId; 
        private Integer currentPage; 
        private String jobId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryPictureSearchJobResultRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.currentPage = request.currentPage;
            this.jobId = request.jobId;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
        public QueryPictureSearchJobResultRequest build() {
            return new QueryPictureSearchJobResultRequest(this);
        } 

    } 

}
