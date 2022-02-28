// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreJobsRequest</p>
 */
public class DescribeRestoreJobsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("MachineRemark")
    private String machineRemark;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Status")
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

        private Builder(DescribeRestoreJobsRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.machineRemark = response.machineRemark;
            this.pageSize = response.pageSize;
            this.status = response.status;
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
         * MachineRemark.
         */
        public Builder machineRemark(String machineRemark) {
            this.putQueryParameter("MachineRemark", machineRemark);
            this.machineRemark = machineRemark;
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
