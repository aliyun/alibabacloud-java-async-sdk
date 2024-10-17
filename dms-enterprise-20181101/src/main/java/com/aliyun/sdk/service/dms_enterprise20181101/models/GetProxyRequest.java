// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProxyRequest} extends {@link RequestModel}
 *
 * <p>GetProxyRequest</p>
 */
public class GetProxyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proxyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetProxyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.proxyId = builder.proxyId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return proxyId
     */
    public Long getProxyId() {
        return this.proxyId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetProxyRequest, Builder> {
        private String regionId; 
        private Long proxyId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetProxyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.proxyId = request.proxyId;
            this.tid = request.tid;
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
         * <p>The ID of the secure access proxy. You can call the <a href="https://help.aliyun.com/document_detail/295371.html">ListProxies</a> operation to query the ID of the secure access proxy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4**</p>
         */
        public Builder proxyId(Long proxyId) {
            this.putQueryParameter("ProxyId", proxyId);
            this.proxyId = proxyId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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
