// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsByGroupRequest} extends {@link RequestModel}
 *
 * <p>ListJobsByGroupRequest</p>
 */
public class ListJobsByGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobFailureReason")
    private String jobFailureReason;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    @Query
    @NameInMap("JobStatus")
    private String jobStatus;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListJobsByGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobFailureReason = builder.jobFailureReason;
        this.jobGroupId = builder.jobGroupId;
        this.jobStatus = builder.jobStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsByGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobFailureReason
     */
    public String getJobFailureReason() {
        return this.jobFailureReason;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
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

    public static final class Builder extends Request.Builder<ListJobsByGroupRequest, Builder> {
        private String instanceId; 
        private String jobFailureReason; 
        private String jobGroupId; 
        private String jobStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListJobsByGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.jobFailureReason = request.jobFailureReason;
            this.jobGroupId = request.jobGroupId;
            this.jobStatus = request.jobStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobFailureReason.
         */
        public Builder jobFailureReason(String jobFailureReason) {
            this.putQueryParameter("JobFailureReason", jobFailureReason);
            this.jobFailureReason = jobFailureReason;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.putQueryParameter("JobStatus", jobStatus);
            this.jobStatus = jobStatus;
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

        @Override
        public ListJobsByGroupRequest build() {
            return new ListJobsByGroupRequest(this);
        } 

    } 

}
