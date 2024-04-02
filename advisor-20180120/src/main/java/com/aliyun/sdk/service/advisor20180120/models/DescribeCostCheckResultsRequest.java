// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCostCheckResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostCheckResultsRequest</p>
 */
public class DescribeCostCheckResultsRequest extends Request {
    @Query
    @NameInMap("CheckIds")
    private java.util.List < String > checkIds;

    @Query
    @NameInMap("GroupBy")
    private String groupBy;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RegionIds")
    private java.util.List < String > regionIds;

    @Query
    @NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @Query
    @NameInMap("ResourceName")
    private String resourceName;

    @Query
    @NameInMap("Severity")
    private Integer severity;

    private DescribeCostCheckResultsRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.groupBy = builder.groupBy;
        this.product = builder.product;
        this.regionIds = builder.regionIds;
        this.resourceIds = builder.resourceIds;
        this.resourceName = builder.resourceName;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostCheckResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public java.util.List < String > getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionIds
     */
    public java.util.List < String > getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return severity
     */
    public Integer getSeverity() {
        return this.severity;
    }

    public static final class Builder extends Request.Builder<DescribeCostCheckResultsRequest, Builder> {
        private java.util.List < String > checkIds; 
        private String groupBy; 
        private String product; 
        private java.util.List < String > regionIds; 
        private java.util.List < String > resourceIds; 
        private String resourceName; 
        private Integer severity; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCostCheckResultsRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.groupBy = request.groupBy;
            this.product = request.product;
            this.regionIds = request.regionIds;
            this.resourceIds = request.resourceIds;
            this.resourceName = request.resourceName;
            this.severity = request.severity;
        } 

        /**
         * CheckIds.
         */
        public Builder checkIds(java.util.List < String > checkIds) {
            String checkIdsShrink = shrink(checkIds, "CheckIds", "json");
            this.putQueryParameter("CheckIds", checkIdsShrink);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RegionIds.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            String resourceIdsShrink = shrink(resourceIds, "ResourceIds", "json");
            this.putQueryParameter("ResourceIds", resourceIdsShrink);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(Integer severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        @Override
        public DescribeCostCheckResultsRequest build() {
            return new DescribeCostCheckResultsRequest(this);
        } 

    } 

}
