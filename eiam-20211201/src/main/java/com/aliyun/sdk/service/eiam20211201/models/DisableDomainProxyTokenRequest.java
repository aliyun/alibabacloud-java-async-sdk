// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDomainProxyTokenRequest} extends {@link RequestModel}
 *
 * <p>DisableDomainProxyTokenRequest</p>
 */
public class DisableDomainProxyTokenRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainId")
    @Validation(required = true)
    private String domainId;

    @Query
    @NameInMap("DomainProxyTokenId")
    @Validation(required = true)
    private String domainProxyTokenId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true, maxLength = 64)
    private String instanceId;

    private DisableDomainProxyTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainId = builder.domainId;
        this.domainProxyTokenId = builder.domainProxyTokenId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableDomainProxyTokenRequest create() {
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
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainProxyTokenId
     */
    public String getDomainProxyTokenId() {
        return this.domainProxyTokenId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DisableDomainProxyTokenRequest, Builder> {
        private String regionId; 
        private String domainId; 
        private String domainProxyTokenId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisableDomainProxyTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainId = request.domainId;
            this.domainProxyTokenId = request.domainProxyTokenId;
            this.instanceId = request.instanceId;
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
         * 域名ID。
         */
        public Builder domainId(String domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * 域名代理Token ID。
         */
        public Builder domainProxyTokenId(String domainProxyTokenId) {
            this.putQueryParameter("DomainProxyTokenId", domainProxyTokenId);
            this.domainProxyTokenId = domainProxyTokenId;
            return this;
        }

        /**
         * IDaaS EIAM实例的ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DisableDomainProxyTokenRequest build() {
            return new DisableDomainProxyTokenRequest(this);
        } 

    } 

}
