// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProxyAccessRequest} extends {@link RequestModel}
 *
 * <p>GetProxyAccessRequest</p>
 */
public class GetProxyAccessRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyAccessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proxyAccessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetProxyAccessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.proxyAccessId = builder.proxyAccessId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProxyAccessRequest create() {
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
     * @return proxyAccessId
     */
    public Long getProxyAccessId() {
        return this.proxyAccessId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetProxyAccessRequest, Builder> {
        private String regionId; 
        private Long proxyAccessId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetProxyAccessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.proxyAccessId = request.proxyAccessId;
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
         * <p>The ID that Data Management (DMS) generates after the user is authorized to enable the secure access proxy feature for an instance. The ID is unique in DMS. You can call the <a href="https://help.aliyun.com/document_detail/295386.html">ListProxyAccesses</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder proxyAccessId(Long proxyAccessId) {
            this.putQueryParameter("ProxyAccessId", proxyAccessId);
            this.proxyAccessId = proxyAccessId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
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
        public GetProxyAccessRequest build() {
            return new GetProxyAccessRequest(this);
        } 

    } 

}
