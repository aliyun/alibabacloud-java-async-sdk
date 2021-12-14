// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDomainBasicConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainBasicConfigsRequest</p>
 */
public class DescribeDomainBasicConfigsRequest extends Request {
    @Query
    @NameInMap("AccessType")
    private String accessType;

    @Query
    @NameInMap("CloudNativeProductId")
    private Integer cloudNativeProductId;

    @Query
    @NameInMap("DomainKey")
    private String domainKey;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;


    private DescribeDomainBasicConfigsRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.cloudNativeProductId = builder.cloudNativeProductId;
        this.domainKey = builder.domainKey;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBasicConfigsRequest create() {
        return builder().build();
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return cloudNativeProductId
     */
    public Integer getCloudNativeProductId() {
        return this.cloudNativeProductId;
    }

    /**
     * @return domainKey
     */
    public String getDomainKey() {
        return this.domainKey;
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

    public static final class Builder extends Request.Builder {
        private String accessType; 
        private Integer cloudNativeProductId; 
        private String domainKey; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        /**
         * <p>AccessType.</p>
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>CloudNativeProductId.</p>
         */
        public Builder cloudNativeProductId(Integer cloudNativeProductId) {
            this.putQueryParameter("CloudNativeProductId", cloudNativeProductId);
            this.cloudNativeProductId = cloudNativeProductId;
            return this;
        }

        /**
         * <p>DomainKey.</p>
         */
        public Builder domainKey(String domainKey) {
            this.putQueryParameter("DomainKey", domainKey);
            this.domainKey = domainKey;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ResourceGroupId.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public DescribeDomainBasicConfigsRequest build() {
            return new DescribeDomainBasicConfigsRequest(this);
        } 

    } 

}
