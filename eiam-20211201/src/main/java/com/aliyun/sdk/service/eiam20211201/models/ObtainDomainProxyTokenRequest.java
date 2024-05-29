// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ObtainDomainProxyTokenRequest} extends {@link RequestModel}
 *
 * <p>ObtainDomainProxyTokenRequest</p>
 */
public class ObtainDomainProxyTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainProxyTokenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainProxyTokenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private ObtainDomainProxyTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainId = builder.domainId;
        this.domainProxyTokenId = builder.domainProxyTokenId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainDomainProxyTokenRequest create() {
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

    public static final class Builder extends Request.Builder<ObtainDomainProxyTokenRequest, Builder> {
        private String regionId; 
        private String domainId; 
        private String domainProxyTokenId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ObtainDomainProxyTokenRequest request) {
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
        public ObtainDomainProxyTokenRequest build() {
            return new ObtainDomainProxyTokenRequest(this);
        } 

    } 

}
