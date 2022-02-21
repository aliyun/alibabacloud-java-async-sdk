// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProxyRequest} extends {@link RequestModel}
 *
 * <p>DeleteProxyRequest</p>
 */
public class DeleteProxyRequest extends Request {
    @Query
    @NameInMap("ProxyId")
    @Validation(required = true)
    private Long proxyId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private DeleteProxyRequest(Builder builder) {
        super(builder);
        this.proxyId = builder.proxyId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return proxyId
     */
    public Long getProxyId() {
        return this.proxyId;
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

    public static final class Builder extends Request.Builder<DeleteProxyRequest, Builder> {
        private Long proxyId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProxyRequest response) {
            super(response);
            this.proxyId = response.proxyId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * ProxyId.
         */
        public Builder proxyId(Long proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
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
        public DeleteProxyRequest build() {
            return new DeleteProxyRequest(this);
        } 

    } 

}
