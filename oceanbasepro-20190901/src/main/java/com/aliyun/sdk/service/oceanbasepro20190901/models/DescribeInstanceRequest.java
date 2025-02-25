// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceRequest</p>
 */
public class DescribeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxConnectionLimit")
    private String maxConnectionLimit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    private DescribeInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.maxConnectionLimit = builder.maxConnectionLimit;
        this.pageNumber = builder.pageNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxConnectionLimit
     */
    public String getMaxConnectionLimit() {
        return this.maxConnectionLimit;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String maxConnectionLimit; 
        private Integer pageNumber; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.maxConnectionLimit = request.maxConnectionLimit;
            this.pageNumber = request.pageNumber;
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
         * The size of the data disk, in GB.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxConnectionLimit.
         */
        public Builder maxConnectionLimit(String maxConnectionLimit) {
            this.putBodyParameter("MaxConnectionLimit", maxConnectionLimit);
            this.maxConnectionLimit = maxConnectionLimit;
            return this;
        }

        /**
         * The information about the storage resources of the cluster.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        @Override
        public DescribeInstanceRequest build() {
            return new DescribeInstanceRequest(this);
        } 

    } 

}
