// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishLiveStagingConfigToProductionRequest} extends {@link RequestModel}
 *
 * <p>PublishLiveStagingConfigToProductionRequest</p>
 */
public class PublishLiveStagingConfigToProductionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FunctionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private PublishLiveStagingConfigToProductionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.functionName = builder.functionName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishLiveStagingConfigToProductionRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<PublishLiveStagingConfigToProductionRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private String functionName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(PublishLiveStagingConfigToProductionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.functionName = request.functionName;
            this.ownerId = request.ownerId;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public PublishLiveStagingConfigToProductionRequest build() {
            return new PublishLiveStagingConfigToProductionRequest(this);
        } 

    } 

}
