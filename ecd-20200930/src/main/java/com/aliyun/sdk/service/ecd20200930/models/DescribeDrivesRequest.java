// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrivesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrivesRequest</p>
 */
public class DescribeDrivesRequest extends Request {
    @Query
    @NameInMap("DomainIds")
    private java.util.List < String > domainIds;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("UserId")
    private String userId;

    private DescribeDrivesRequest(Builder builder) {
        super(builder);
        this.domainIds = builder.domainIds;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrivesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainIds
     */
    public java.util.List < String > getDomainIds() {
        return this.domainIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeDrivesRequest, Builder> {
        private java.util.List < String > domainIds; 
        private String regionId; 
        private String resourceType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrivesRequest request) {
            super(request);
            this.domainIds = request.domainIds;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.userId = request.userId;
        } 

        /**
         * DomainIds.
         */
        public Builder domainIds(java.util.List < String > domainIds) {
            this.putQueryParameter("DomainIds", domainIds);
            this.domainIds = domainIds;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeDrivesRequest build() {
            return new DescribeDrivesRequest(this);
        } 

    } 

}
