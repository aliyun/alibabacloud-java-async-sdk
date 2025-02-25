// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeRestoreJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreJobsRequest</p>
 */
public class DescribeRestoreJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineRemark")
    private String machineRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeRestoreJobsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.machineRemark = builder.machineRemark;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreJobsRequest create() {
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
     * @return machineRemark
     */
    public String getMachineRemark() {
        return this.machineRemark;
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
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreJobsRequest, Builder> {
        private Integer currentPage; 
        private String machineRemark; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreJobsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.machineRemark = request.machineRemark;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The unique identifier of the server on which the restoration task is run. For example, you can use the IP address or the name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        public Builder machineRemark(String machineRemark) {
            this.putQueryParameter("MachineRemark", machineRemark);
            this.machineRemark = machineRemark;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
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

        /**
         * <p>The status of the restoration task. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The task is running.</li>
         * <li><strong>COMPLETE</strong>: The task is complete.</li>
         * <li><strong>FAILED</strong>: The task fails.</li>
         * <li><strong>CANCELING</strong>: The task is being canceled.</li>
         * <li><strong>CANCELED</strong>: The task is canceled.</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: The task is partially successful.</li>
         * <li><strong>CREATED</strong>: The task is created but is not run.</li>
         * <li><strong>EXPIRED</strong>: The task is not updated.</li>
         * <li><strong>QUEUED</strong>: The task is waiting to be run.</li>
         * <li><strong>CLIENT_DELETED</strong>: The task fails because the anti-ransomware agent is uninstalled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeRestoreJobsRequest build() {
            return new DescribeRestoreJobsRequest(this);
        } 

    } 

}
