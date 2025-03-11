// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsInstancesRequest</p>
 */
public class DescribeDrdsInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expired")
    private Boolean expired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mix")
    private Boolean mix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductVersion")
    private String productVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<Tag> tag; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsInstancesRequest request) {
            super(request);
            this.description = request.description;
            this.expired = request.expired;
            this.mix = request.mix;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productVersion = request.productVersion;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.type = request.type;
        } 

        /**
         * <p>The description of the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>drds_test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the instances that you want to query expire.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder expired(Boolean expired) {
            this.putQueryParameter("Expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * <p>Specifies whether hybrid queries are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>FALSE</p>
         */
        public Builder mix(Boolean mix) {
            this.putQueryParameter("Mix", mix);
            this.mix = mix;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
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
         * <p>The number of instances returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        public Builder productVersion(String productVersion) {
            this.putQueryParameter("ProductVersion", productVersion);
            this.productVersion = productVersion;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instances you want to query belong. The value of this parameter can be NULL.</p>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The type of the instances that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: shared instances</li>
         * <li><strong>1</strong>: dedicated instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

    /**
     * 
     * {@link DescribeDrdsInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeDrdsInstancesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the tag configured for the instances you want to query.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:newretail:domain</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag configured for the instances you want to query.</p>
             * 
             * <strong>example:</strong>
             * <p>NEW_RETAIL</p>
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
