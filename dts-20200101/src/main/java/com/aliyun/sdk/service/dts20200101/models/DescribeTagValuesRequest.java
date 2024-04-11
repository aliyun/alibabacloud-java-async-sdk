// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagValuesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTagValuesRequest</p>
 */
public class DescribeTagValuesRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Key")
    private String key;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private DescribeTagValuesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.key = builder.key;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagValuesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeTagValuesRequest, Builder> {
        private String category; 
        private String key; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTagValuesRequest request) {
            super(request);
            this.category = request.category;
            this.key = request.key;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The type of the tag key. Valid values:
         * <p>
         * 
         * *   **Custom**: The tag key is created by users.
         * *   **System**: The tag key is created by the system.
         * 
         * >  By default, if the parameter is left empty, both custom tag keys and system tag keys are returned.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The tag key.
         * <p>
         * 
         * >  This parameter is required.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The page number of the start page to return for a tag key that has multiple values. The valid value ranges from 1 to the maximum value of the INTEGER data type. This parameter is often used with the PageSize parameter. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of tag values to return each time for a tag key that has multiple values. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the data migration, data synchronization, or change tracking instance. You can call the [DescribeDtsJobs](~~209702~~) operation to query the instance ID.
         * <p>
         * 
         * >  If this parameter is left empty, the values of all tag keys of the current user are returned.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The resource type. Set the value to **ALIYUN::DTS::INSTANCE**.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeTagValuesRequest build() {
            return new DescribeTagValuesRequest(this);
        } 

    } 

}
