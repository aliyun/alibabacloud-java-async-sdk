// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryPictureSearchJobRequest} extends {@link RequestModel}
 *
 * <p>QueryPictureSearchJobRequest</p>
 */
public class QueryPictureSearchJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobStatus")
    @com.aliyun.core.annotation.Validation(maximum = 10)
    private Integer jobStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 20, minimum = 1)
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
         * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fdc576d03c094faea9fa10fbf48c****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>0: Initialized.</li>
         * <li>1: No data.</li>
         * <li>2: Running.</li>
         * <li>3: Succeeded.</li>
         * <li>4: Failed.</li>
         * </ul>
         * <p>If you do not specify this parameter, jobs in all statuses are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder jobStatus(Integer jobStatus) {
            this.putQueryParameter("JobStatus", jobStatus);
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Minimum value: 1. Maximum value: 50. Default value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
