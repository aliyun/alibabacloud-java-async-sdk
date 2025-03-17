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
 * {@link DeleteProxyAccessRequest} extends {@link RequestModel}
 *
 * <p>DeleteProxyAccessRequest</p>
 */
public class DeleteProxyAccessRequest extends Request {
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

    private DeleteProxyAccessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.proxyAccessId = builder.proxyAccessId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProxyAccessRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProxyAccessRequest, Builder> {
        private String regionId; 
        private Long proxyAccessId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProxyAccessRequest request) {
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
         * <p>The ID of the security protection authorization. After the security protection agent authorizes the target user, the system automatically generates a security protection authorization ID. The ID is globally unique. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listproxyaccesses">ListProxyAccesses</a> operation to obtain this parameter.</p>
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
         * <p>The ID of the tenant. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant">GetUserActiveTenant</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listusertenants">ListUserTenants</a> operation to obtain this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DeleteProxyAccessRequest build() {
            return new DeleteProxyAccessRequest(this);
        } 

    } 

}
