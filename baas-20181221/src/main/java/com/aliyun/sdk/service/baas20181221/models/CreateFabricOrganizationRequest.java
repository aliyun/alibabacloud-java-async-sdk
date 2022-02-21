// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricOrganizationRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricOrganizationRequest</p>
 */
public class CreateFabricOrganizationRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Location")
    @Validation(required = true)
    private String location;

    @Query
    @NameInMap("OrganizationName")
    @Validation(required = true)
    private String organizationName;

    @Body
    @NameInMap("PaymentDuration")
    @Validation(required = true)
    private Integer paymentDuration;

    @Body
    @NameInMap("PaymentDurationUnit")
    @Validation(required = true)
    private String paymentDurationUnit;

    @Body
    @NameInMap("PeersCount")
    private Integer peersCount;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SpecName")
    @Validation(required = true)
    private String specName;

    private CreateFabricOrganizationRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.domain = builder.domain;
        this.location = builder.location;
        this.organizationName = builder.organizationName;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.peersCount = builder.peersCount;
        this.regionId = builder.regionId;
        this.specName = builder.specName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricOrganizationRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationName
     */
    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return peersCount
     */
    public Integer getPeersCount() {
        return this.peersCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return specName
     */
    public String getSpecName() {
        return this.specName;
    }

    public static final class Builder extends Request.Builder<CreateFabricOrganizationRequest, Builder> {
        private String description; 
        private String domain; 
        private String location; 
        private String organizationName; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private Integer peersCount; 
        private String regionId; 
        private String specName; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricOrganizationRequest response) {
            super(response);
            this.description = response.description;
            this.domain = response.domain;
            this.location = response.location;
            this.organizationName = response.organizationName;
            this.paymentDuration = response.paymentDuration;
            this.paymentDurationUnit = response.paymentDurationUnit;
            this.peersCount = response.peersCount;
            this.regionId = response.regionId;
            this.specName = response.specName;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * OrganizationName.
         */
        public Builder organizationName(String organizationName) {
            this.putQueryParameter("OrganizationName", organizationName);
            this.organizationName = organizationName;
            return this;
        }

        /**
         * PaymentDuration.
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.putBodyParameter("PaymentDuration", paymentDuration);
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * PaymentDurationUnit.
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putBodyParameter("PaymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * PeersCount.
         */
        public Builder peersCount(Integer peersCount) {
            this.putBodyParameter("PeersCount", peersCount);
            this.peersCount = peersCount;
            return this;
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
         * SpecName.
         */
        public Builder specName(String specName) {
            this.putQueryParameter("SpecName", specName);
            this.specName = specName;
            return this;
        }

        @Override
        public CreateFabricOrganizationRequest build() {
            return new CreateFabricOrganizationRequest(this);
        } 

    } 

}
