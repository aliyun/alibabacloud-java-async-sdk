// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTATaskByJobRequest} extends {@link RequestModel}
 *
 * <p>ListOTATaskByJobRequest</p>
 */
public class ListOTATaskByJobRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DeviceNames")
    private java.util.List < String > deviceNames;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TaskStatus")
    private String taskStatus;

    private ListOTATaskByJobRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deviceNames = builder.deviceNames;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
        this.pageSize = builder.pageSize;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTATaskByJobRequest create() {
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
     * @return deviceNames
     */
    public java.util.List < String > getDeviceNames() {
        return this.deviceNames;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder extends Request.Builder<ListOTATaskByJobRequest, Builder> {
        private Integer currentPage; 
        private java.util.List < String > deviceNames; 
        private String iotInstanceId; 
        private String jobId; 
        private Integer pageSize; 
        private String taskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListOTATaskByJobRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deviceNames = request.deviceNames;
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
            this.pageSize = request.pageSize;
            this.taskStatus = request.taskStatus;
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
         * DeviceNames.
         */
        public Builder deviceNames(java.util.List < String > deviceNames) {
            this.putQueryParameter("DeviceNames", deviceNames);
            this.deviceNames = deviceNames;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        @Override
        public ListOTATaskByJobRequest build() {
            return new ListOTATaskByJobRequest(this);
        } 

    } 

}
