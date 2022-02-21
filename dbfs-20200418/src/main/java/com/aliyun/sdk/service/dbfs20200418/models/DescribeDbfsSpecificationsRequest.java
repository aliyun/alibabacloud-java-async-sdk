// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbfsSpecificationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDbfsSpecificationsRequest</p>
 */
public class DescribeDbfsSpecificationsRequest extends Request {
    @Query
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("EcsInstanceType")
    @Validation(required = true)
    private String ecsInstanceType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDbfsSpecificationsRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.ecsInstanceType = builder.ecsInstanceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbfsSpecificationsRequest create() {
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
     * @return ecsInstanceType
     */
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDbfsSpecificationsRequest, Builder> {
        private String category; 
        private String ecsInstanceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDbfsSpecificationsRequest response) {
            super(response);
            this.category = response.category;
            this.ecsInstanceType = response.ecsInstanceType;
            this.regionId = response.regionId;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * EcsInstanceType.
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.putQueryParameter("EcsInstanceType", ecsInstanceType);
            this.ecsInstanceType = ecsInstanceType;
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

        @Override
        public DescribeDbfsSpecificationsRequest build() {
            return new DescribeDbfsSpecificationsRequest(this);
        } 

    } 

}
