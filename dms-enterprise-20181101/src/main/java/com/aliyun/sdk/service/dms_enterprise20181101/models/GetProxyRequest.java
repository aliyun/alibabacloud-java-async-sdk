// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProxyRequest} extends {@link RequestModel}
 *
 * <p>GetProxyRequest</p>
 */
public class GetProxyRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private Long instanceId;

    @Query
    @NameInMap("ProxyId")
    private Long proxyId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetProxyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.proxyId = builder.proxyId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProxyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<GetProxyRequest, Builder> {
        private Long instanceId; 
        private Long proxyId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetProxyRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.proxyId = response.proxyId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
        public GetProxyRequest build() {
            return new GetProxyRequest(this);
        } 

    } 

}
