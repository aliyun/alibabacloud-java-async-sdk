// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsInstancesRequest</p>
 */
public class DescribeDrdsInstancesRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Expired")
    private Boolean expired;

    @Query
    @NameInMap("Mix")
    private Boolean mix;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductVersion")
    private String productVersion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeDrdsInstancesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.expired = builder.expired;
        this.mix = builder.mix;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productVersion = builder.productVersion;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expired
     */
    public Boolean getExpired() {
        return this.expired;
    }

    /**
     * @return mix
     */
    public Boolean getMix() {
        return this.mix;
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
     * @return productVersion
     */
    public String getProductVersion() {
        return this.productVersion;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsInstancesRequest, Builder> {
        private String description; 
        private Boolean expired; 
        private Boolean mix; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productVersion; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsInstancesRequest response) {
            super(response);
            this.description = response.description;
            this.expired = response.expired;
            this.mix = response.mix;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.productVersion = response.productVersion;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.tag = response.tag;
            this.type = response.type;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Expired.
         */
        public Builder expired(Boolean expired) {
            this.putQueryParameter("Expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * Mix.
         */
        public Builder mix(Boolean mix) {
            this.putQueryParameter("Mix", mix);
            this.mix = mix;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ProductVersion.
         */
        public Builder productVersion(String productVersion) {
            this.putQueryParameter("ProductVersion", productVersion);
            this.productVersion = productVersion;
            return this;
        }

        /**
         * RegionId.
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDrdsInstancesRequest build() {
            return new DescribeDrdsInstancesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
