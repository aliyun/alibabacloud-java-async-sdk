// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListOTATaskByJobRequest} extends {@link RequestModel}
 *
 * <p>ListOTATaskByJobRequest</p>
 */
public class ListOTATaskByJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceNames")
    private java.util.List<String> deviceNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
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
    public java.util.List<String> getDeviceNames() {
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
        private java.util.List<String> deviceNames; 
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
         * <p>The number of the page to return. Pages start from page 1.</p>
         * <blockquote>
         * <p>The product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter must be less than or equal to 100,000.</p>
         * </blockquote>
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
         * DeviceNames.
         */
        public Builder deviceNames(java.util.List<String> deviceNames) {
            this.putQueryParameter("DeviceNames", deviceNames);
            this.deviceNames = deviceNames;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the update batch. This ID uniquely identifies the update batch. You can obtain the ID from the value of the <strong>JobId</strong> parameter that is returned after you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation. You can also view the batch ID on the <strong>Firmware Details</strong> page of the IoT Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7glPHmaDYLAYMD1HHutT02****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 100.</p>
         * <blockquote>
         * <p>The product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter must be less than or equal to 100,000.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>If you specify a value for this parameter, only the update tasks that are in the specified state are queried. Valid values:</p>
         * <ul>
         * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
         * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
         * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
         * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
         * <li><strong>SUCCEEDED</strong>: The update is successful.</li>
         * <li><strong>FAILED</strong>: The update failed.</li>
         * <li><strong>CANCELED</strong>: The update batch is canceled.</li>
         * </ul>
         * <p>If you do not specify a value for this parameter, all update tasks of the specified batch are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
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
