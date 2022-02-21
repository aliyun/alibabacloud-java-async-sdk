// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InspectProxyAccessSecretRequest} extends {@link RequestModel}
 *
 * <p>InspectProxyAccessSecretRequest</p>
 */
public class InspectProxyAccessSecretRequest extends Request {
    @Query
    @NameInMap("ProxyAccessId")
    @Validation(required = true)
    private Long proxyAccessId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private InspectProxyAccessSecretRequest(Builder builder) {
        super(builder);
        this.proxyAccessId = builder.proxyAccessId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InspectProxyAccessSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return proxyAccessId
     */
    public Long getProxyAccessId() {
        return this.proxyAccessId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<InspectProxyAccessSecretRequest, Builder> {
        private Long proxyAccessId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(InspectProxyAccessSecretRequest response) {
            super(response);
            this.proxyAccessId = response.proxyAccessId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * ProxyAccessId.
         */
        public Builder proxyAccessId(Long proxyAccessId) {
            this.putQueryParameter("ProxyAccessId", proxyAccessId);
            this.proxyAccessId = proxyAccessId;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public InspectProxyAccessSecretRequest build() {
            return new InspectProxyAccessSecretRequest(this);
        } 

    } 

}
