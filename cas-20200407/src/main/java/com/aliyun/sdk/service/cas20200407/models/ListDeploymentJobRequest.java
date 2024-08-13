// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentJobRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentJobRequest</p>
 */
public class ListDeploymentJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDeploymentJobRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.jobType = builder.jobType;
        this.showSize = builder.showSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListDeploymentJobRequest, Builder> {
        private Integer currentPage; 
        private String jobType; 
        private Integer showSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentJobRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.jobType = request.jobType;
            this.showSize = request.showSize;
            this.status = request.status;
        } 

        /**
         * The page number. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The type of the deployment task.
         * <p>
         * 
         * Valid values:
         * 
         * *   cloud: multi-cloud deployment task.
         * *   user: cloud service deployment task. This type of task does not support Elastic Compute Service (ECS) instances.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * The number of certificates per page. Default value: **50**.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * The status of the deployment task.
         * <p>
         * 
         * Valid values:
         * 
         * *   success
         * *   pending
         * *   scheduling
         * *   processing
         * *   error
         * *   editing
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDeploymentJobRequest build() {
            return new ListDeploymentJobRequest(this);
        } 

    } 

}
