// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricOrganizationRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricOrganizationRequest</p>
 */
public class CreateFabricOrganizationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer paymentDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeersCount")
    private Integer peersCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specName;

    private CreateFabricOrganizationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.domain = builder.domain;
        this.location = builder.location;
        this.organizationName = builder.organizationName;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.peersCount = builder.peersCount;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return specName
     */
    public String getSpecName() {
        return this.specName;
    }

    public static final class Builder extends Request.Builder<CreateFabricOrganizationRequest, Builder> {
        private String regionId; 
        private String description; 
        private String domain; 
        private String location; 
        private String organizationName; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private Integer peersCount; 
        private String specName; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricOrganizationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.domain = request.domain;
            this.location = request.location;
            this.organizationName = request.organizationName;
            this.paymentDuration = request.paymentDuration;
            this.paymentDurationUnit = request.paymentDurationUnit;
            this.peersCount = request.peersCount;
            this.specName = request.specName;
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
