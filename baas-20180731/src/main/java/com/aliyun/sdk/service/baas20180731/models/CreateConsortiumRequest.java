// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsortiumRequest} extends {@link RequestModel}
 *
 * <p>CreateConsortiumRequest</p>
 */
public class CreateConsortiumRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    @com.aliyun.core.annotation.Validation(required = true)
    private String location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MajorVersion")
    private String majorVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrdererType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ordererType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderersCount")
    private Integer orderersCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Organization")
    private java.util.List < Organization> organization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PeersCount")
    private Integer peersCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpecName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateConsortiumRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channelPolicy = builder.channelPolicy;
        this.description = builder.description;
        this.domain = builder.domain;
        this.duration = builder.duration;
        this.location = builder.location;
        this.majorVersion = builder.majorVersion;
        this.name = builder.name;
        this.ordererType = builder.ordererType;
        this.orderersCount = builder.orderersCount;
        this.organization = builder.organization;
        this.peersCount = builder.peersCount;
        this.pricingCycle = builder.pricingCycle;
        this.specName = builder.specName;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsortiumRequest create() {
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
     * @return channelPolicy
     */
    public String getChannelPolicy() {
        return this.channelPolicy;
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
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return majorVersion
     */
    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return peersCount
     */
    public Integer getPeersCount() {
        return this.peersCount;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
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

    public static final class Builder extends Request.Builder<CreateConsortiumRequest, Builder> {
        private String regionId; 
        private String channelPolicy; 
        private String description; 
        private String domain; 
        private Integer duration; 
        private String location; 
        private String majorVersion; 
        private String name; 
        private String ordererType; 
        private Integer orderersCount; 
        private java.util.List < Organization> organization; 
        private Integer peersCount; 
        private String pricingCycle; 
        private String specName; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsortiumRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channelPolicy = request.channelPolicy;
            this.description = request.description;
            this.domain = request.domain;
            this.duration = request.duration;
            this.location = request.location;
            this.majorVersion = request.majorVersion;
            this.name = request.name;
            this.ordererType = request.ordererType;
            this.orderersCount = request.orderersCount;
            this.organization = request.organization;
            this.peersCount = request.peersCount;
            this.pricingCycle = request.pricingCycle;
            this.specName = request.specName;
            this.zoneId = request.zoneId;
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
         * ChannelPolicy.
         */
        public Builder channelPolicy(String channelPolicy) {
            this.putBodyParameter("ChannelPolicy", channelPolicy);
            this.channelPolicy = channelPolicy;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
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
         * MajorVersion.
         */
        public Builder majorVersion(String majorVersion) {
            this.putBodyParameter("MajorVersion", majorVersion);
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
         * PeersCount.
         */
        public Builder peersCount(Integer peersCount) {
            this.putBodyParameter("PeersCount", peersCount);
            this.peersCount = peersCount;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putBodyParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
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
        public CreateConsortiumRequest build() {
            return new CreateConsortiumRequest(this);
        } 

    } 

    public static class Organization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Organization(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organization create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Organization build() {
                return new Organization(this);
            } 

        } 

    }
}
