// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeCheckJobsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCheckJobsRequest</p>
 */
public class DescribeCheckJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckJobId")
    private String checkJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckType")
    private Integer checkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeCheckJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkJobId = builder.checkJobId;
        this.checkType = builder.checkType;
        this.instanceId = builder.instanceId;
        this.jobName = builder.jobName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return checkJobId
     */
    public String getCheckJobId() {
        return this.checkJobId;
    }

    /**
     * @return checkType
     */
    public Integer getCheckType() {
        return this.checkType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeCheckJobsRequest, Builder> {
        private String regionId; 
        private String checkJobId; 
        private Integer checkType; 
        private String instanceId; 
        private String jobName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCheckJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkJobId = request.checkJobId;
            this.checkType = request.checkType;
            this.instanceId = request.instanceId;
            this.jobName = request.jobName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Check the task job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>z9p104ib23***</p>
         */
        public Builder checkJobId(String checkJobId) {
            this.putQueryParameter("CheckJobId", checkJobId);
            this.checkJobId = checkJobId;
            return this;
        }

        /**
         * <p>The type of the check</p>
         * <blockquote>
         * <blockquote>
         * <p>1 full quantity, 2 incremental, 3 all</p>
         * </blockquote>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder checkType(Integer checkType) {
            this.putQueryParameter("CheckType", checkType);
            this.checkType = checkType;
            return this;
        }

        /**
         * <p>Data migration instance ID, which can be queried by calling the <strong>describemigrationjobs</strong> API.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsz9p104ib23e972e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the data migration or synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>zwy_test</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The number of the page to return. The value must be an integer that is greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeCheckJobsRequest build() {
            return new DescribeCheckJobsRequest(this);
        } 

    } 

}
