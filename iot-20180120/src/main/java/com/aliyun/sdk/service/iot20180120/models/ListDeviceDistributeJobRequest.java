// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceDistributeJobRequest</p>
 */
public class ListDeviceDistributeJobRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Body
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("TargetUid")
    private String targetUid;

    private ListDeviceDistributeJobRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.jobId = builder.jobId;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceDistributeJobRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<ListDeviceDistributeJobRequest, Builder> {
        private Integer currentPage; 
        private String jobId; 
        private String nextToken; 
        private Integer pageSize; 
        private Integer status; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceDistributeJobRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.jobId = response.jobId;
            this.nextToken = response.nextToken;
            this.pageSize = response.pageSize;
            this.status = response.status;
            this.targetUid = response.targetUid;
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
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TargetUid.
         */
        public Builder targetUid(String targetUid) {
            this.putQueryParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public ListDeviceDistributeJobRequest build() {
            return new ListDeviceDistributeJobRequest(this);
        } 

    } 

}
