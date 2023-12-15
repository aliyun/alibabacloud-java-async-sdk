// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrganizationRequest} extends {@link RequestModel}
 *
 * <p>CreateOrganizationRequest</p>
 */
public class CreateOrganizationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("Location")
    @Validation(required = true)
    private String location;

    @Body
    @NameInMap("MajorVersion")
    private String majorVersion;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PeersCount")
    @Validation(maximum = 9, minimum = 2)
    private Integer peersCount;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("SpecName")
    @Validation(required = true)
    private String specName;

    private CreateOrganizationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.domain = builder.domain;
        this.duration = builder.duration;
        this.location = builder.location;
        this.majorVersion = builder.majorVersion;
        this.name = builder.name;
        this.peersCount = builder.peersCount;
        this.pricingCycle = builder.pricingCycle;
        this.specName = builder.specName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrganizationRequest create() {
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

    public static final class Builder extends Request.Builder<CreateOrganizationRequest, Builder> {
        private String regionId; 
        private String description; 
        private String domain; 
        private Integer duration; 
        private String location; 
        private String majorVersion; 
        private String name; 
        private Integer peersCount; 
        private String pricingCycle; 
        private String specName; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrganizationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.domain = request.domain;
            this.duration = request.duration;
            this.location = request.location;
            this.majorVersion = request.majorVersion;
            this.name = request.name;
            this.peersCount = request.peersCount;
            this.pricingCycle = request.pricingCycle;
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
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
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
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PeersCount.
         */
        public Builder peersCount(Integer peersCount) {
            this.putQueryParameter("PeersCount", peersCount);
            this.peersCount = peersCount;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
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
        public CreateOrganizationRequest build() {
            return new CreateOrganizationRequest(this);
        } 

    } 

}
