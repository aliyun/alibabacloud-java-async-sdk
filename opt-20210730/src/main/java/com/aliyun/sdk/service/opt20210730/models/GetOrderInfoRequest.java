// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opt20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderInfoRequest} extends {@link RequestModel}
 *
 * <p>GetOrderInfoRequest</p>
 */
public class GetOrderInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RelService")
    @Validation(required = true)
    private String relService;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true, maximum = 1, minimum = 1)
    private Integer resourceType;

    private GetOrderInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.relService = builder.relService;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderInfoRequest create() {
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
     * @return relService
     */
    public String getRelService() {
        return this.relService;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetOrderInfoRequest, Builder> {
        private String regionId; 
        private String relService; 
        private Integer resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetOrderInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.relService = request.relService;
            this.resourceType = request.resourceType;
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
         * RelService.
         */
        public Builder relService(String relService) {
            this.putQueryParameter("RelService", relService);
            this.relService = relService;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetOrderInfoRequest build() {
            return new GetOrderInfoRequest(this);
        } 

    } 

}
