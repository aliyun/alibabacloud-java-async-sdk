// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricConsortiumRequest} extends {@link RequestModel}
 *
 * <p>CreateFabricConsortiumRequest</p>
 */
public class CreateFabricConsortiumRequest extends Request {
    @Body
    @NameInMap("ChannelPolicy")
    @Validation(required = true)
    private String channelPolicy;

    @Body
    @NameInMap("ConsortiumDescription")
    private String consortiumDescription;

    @Body
    @NameInMap("ConsortiumName")
    @Validation(required = true)
    private String consortiumName;

    @Body
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Body
    @NameInMap("Location")
    @Validation(required = true)
    private String location;

    @Body
    @NameInMap("OrdererType")
    @Validation(required = true)
    private String ordererType;

    @Body
    @NameInMap("OrderersCount")
    private Integer orderersCount;

    @Body
    @NameInMap("Organization")
    private java.util.List < Organization> organization;

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

    @Body
    @NameInMap("SpecName")
    @Validation(required = true)
    private String specName;

    @Body
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateFabricConsortiumRequest(Builder builder) {
        super(builder);
        this.channelPolicy = builder.channelPolicy;
        this.consortiumDescription = builder.consortiumDescription;
        this.consortiumName = builder.consortiumName;
        this.domain = builder.domain;
        this.location = builder.location;
        this.ordererType = builder.ordererType;
        this.orderersCount = builder.orderersCount;
        this.organization = builder.organization;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.peersCount = builder.peersCount;
        this.regionId = builder.regionId;
        this.specName = builder.specName;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricConsortiumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelPolicy
     */
    public String getChannelPolicy() {
        return this.channelPolicy;
    }

    /**
     * @return consortiumDescription
     */
    public String getConsortiumDescription() {
        return this.consortiumDescription;
    }

    /**
     * @return consortiumName
     */
    public String getConsortiumName() {
        return this.consortiumName;
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
     * @return ordererType
     */
    public String getOrdererType() {
        return this.ordererType;
    }

    /**
     * @return orderersCount
     */
    public Integer getOrderersCount() {
        return this.orderersCount;
    }

    /**
     * @return organization
     */
    public java.util.List < Organization> getOrganization() {
        return this.organization;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateFabricConsortiumRequest, Builder> {
        private String channelPolicy; 
        private String consortiumDescription; 
        private String consortiumName; 
        private String domain; 
        private String location; 
        private String ordererType; 
        private Integer orderersCount; 
        private java.util.List < Organization> organization; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private Integer peersCount; 
        private String regionId; 
        private String specName; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFabricConsortiumRequest response) {
            super(response);
            this.channelPolicy = response.channelPolicy;
            this.consortiumDescription = response.consortiumDescription;
            this.consortiumName = response.consortiumName;
            this.domain = response.domain;
            this.location = response.location;
            this.ordererType = response.ordererType;
            this.orderersCount = response.orderersCount;
            this.organization = response.organization;
            this.paymentDuration = response.paymentDuration;
            this.paymentDurationUnit = response.paymentDurationUnit;
            this.peersCount = response.peersCount;
            this.regionId = response.regionId;
            this.specName = response.specName;
            this.zoneId = response.zoneId;
        } 

        /**
         * ChannelPolicy.
         */
        public Builder channelPolicy(String channelPolicy) {
            this.putBodyParameter("ChannelPolicy", channelPolicy);
            this.channelPolicy = channelPolicy;
            return this;
        }

        /**
         * ConsortiumDescription.
         */
        public Builder consortiumDescription(String consortiumDescription) {
            this.putBodyParameter("ConsortiumDescription", consortiumDescription);
            this.consortiumDescription = consortiumDescription;
            return this;
        }

        /**
         * ConsortiumName.
         */
        public Builder consortiumName(String consortiumName) {
            this.putBodyParameter("ConsortiumName", consortiumName);
            this.consortiumName = consortiumName;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * OrdererType.
         */
        public Builder ordererType(String ordererType) {
            this.putBodyParameter("OrdererType", ordererType);
            this.ordererType = ordererType;
            return this;
        }

        /**
         * OrderersCount.
         */
        public Builder orderersCount(Integer orderersCount) {
            this.putBodyParameter("OrderersCount", orderersCount);
            this.orderersCount = orderersCount;
            return this;
        }

        /**
         * Organization.
         */
        public Builder organization(java.util.List < Organization> organization) {
            this.putBodyParameter("Organization", organization);
            this.organization = organization;
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
            this.putBodyParameter("SpecName", specName);
            this.specName = specName;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateFabricConsortiumRequest build() {
            return new CreateFabricConsortiumRequest(this);
        } 

    } 

    public static class Organization extends TeaModel {
        @NameInMap("OrganizationId")
        private String organizationId;

        private Organization(Builder builder) {
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organization create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String organizationId; 

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public Organization build() {
                return new Organization(this);
            } 

        } 

    }
}
