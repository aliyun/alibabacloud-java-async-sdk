// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetLiveDomainStagingConfigRequest</p>
 */
public class SetLiveDomainStagingConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Functions")
    @Validation(required = true)
    private String functions;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetLiveDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.functions = builder.functions;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLiveDomainStagingConfigRequest create() {
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
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetLiveDomainStagingConfigRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private String functions; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetLiveDomainStagingConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.functions = request.functions;
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
         * Functions.
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
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
        public SetLiveDomainStagingConfigRequest build() {
            return new SetLiveDomainStagingConfigRequest(this);
        } 

    } 

}
