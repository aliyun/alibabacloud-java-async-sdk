// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeHybridCloudResourcesRequest</p>
 */
public class DescribeHybridCloudResourcesRequest extends Request {
    @Query
    @NameInMap("Backend")
    private String backend;

    @Query
    @NameInMap("CnameEnabled")
    private Boolean cnameEnabled;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Long pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeHybridCloudResourcesRequest(Builder builder) {
        super(builder);
        this.backend = builder.backend;
        this.cnameEnabled = builder.cnameEnabled;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backend
     */
    public String getBackend() {
        return this.backend;
    }

    /**
     * @return cnameEnabled
     */
    public Boolean getCnameEnabled() {
        return this.cnameEnabled;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeHybridCloudResourcesRequest, Builder> {
        private String backend; 
        private Boolean cnameEnabled; 
        private String domain; 
        private String instanceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHybridCloudResourcesRequest request) {
            super(request);
            this.backend = request.backend;
            this.cnameEnabled = request.cnameEnabled;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The back-to-origin IP address or domain name.
         */
        public Builder backend(String backend) {
            this.putQueryParameter("Backend", backend);
            this.backend = backend;
            return this;
        }

        /**
         * Specifies whether the public cloud disaster recovery feature is enabled for the domain name. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder cnameEnabled(Boolean cnameEnabled) {
            this.putQueryParameter("CnameEnabled", cnameEnabled);
            this.cnameEnabled = cnameEnabled;
            return this;
        }

        /**
         * The domain name that you want to query.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * > You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: **10**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the WAF instance. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The source IP address of the request. The system specifies this parameter.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeHybridCloudResourcesRequest build() {
            return new DescribeHybridCloudResourcesRequest(this);
        } 

    } 

}
