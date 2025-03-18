// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSDGDeploymentStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSDGDeploymentStatusRequest</p>
 */
public class DescribeSDGDeploymentStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentType")
    private String deploymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeSDGDeploymentStatusRequest(Builder builder) {
        super(builder);
        this.deploymentType = builder.deploymentType;
        this.instanceIds = builder.instanceIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionIds = builder.regionIds;
        this.SDGId = builder.SDGId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGDeploymentStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentType
     */
    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
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
     * @return regionIds
     */
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeSDGDeploymentStatusRequest, Builder> {
        private String deploymentType; 
        private java.util.List<String> instanceIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> regionIds; 
        private String SDGId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSDGDeploymentStatusRequest request) {
            super(request);
            this.deploymentType = request.deploymentType;
            this.instanceIds = request.instanceIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionIds = request.regionIds;
            this.SDGId = request.SDGId;
            this.status = request.status;
        } 

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>shared</p>
         */
        public Builder deploymentType(String deploymentType) {
            this.putQueryParameter("DeploymentType", deploymentType);
            this.deploymentType = deploymentType;
            return this;
        }

        /**
         * <p>IDs of Android in Container (AIC) instances.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries returned on each page.</p>
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
         * <p>The IDs of the nodes.</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The ID of the SDG.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        /**
         * <p>The deployment status of the SDG.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSDGDeploymentStatusRequest build() {
            return new DescribeSDGDeploymentStatusRequest(this);
        } 

    } 

}
