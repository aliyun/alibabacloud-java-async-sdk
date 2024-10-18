// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceGroupsRequest</p>
 */
public class ListResourceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupTypes")
    private java.util.List < String > resourceGroupTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List < String > statuses;

    private ListResourceGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.paymentType = builder.paymentType;
        this.projectId = builder.projectId;
        this.resourceGroupTypes = builder.resourceGroupTypes;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceGroupTypes
     */
    public java.util.List < String > getResourceGroupTypes() {
        return this.resourceGroupTypes;
    }

    /**
     * @return statuses
     */
    public java.util.List < String > getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListResourceGroupsRequest, Builder> {
        private String regionId; 
        private String name; 
        private String paymentType; 
        private Long projectId; 
        private java.util.List < String > resourceGroupTypes; 
        private java.util.List < String > statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.paymentType = request.paymentType;
            this.projectId = request.projectId;
            this.resourceGroupTypes = request.resourceGroupTypes;
            this.statuses = request.statuses;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ResourceGroupTypes.
         */
        public Builder resourceGroupTypes(java.util.List < String > resourceGroupTypes) {
            String resourceGroupTypesShrink = shrink(resourceGroupTypes, "ResourceGroupTypes", "json");
            this.putQueryParameter("ResourceGroupTypes", resourceGroupTypesShrink);
            this.resourceGroupTypes = resourceGroupTypes;
            return this;
        }

        /**
         * Statuses.
         */
        public Builder statuses(java.util.List < String > statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putQueryParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListResourceGroupsRequest build() {
            return new ListResourceGroupsRequest(this);
        } 

    } 

}
