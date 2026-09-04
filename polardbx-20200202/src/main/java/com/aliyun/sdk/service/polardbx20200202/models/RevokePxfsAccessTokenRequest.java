// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link RevokePxfsAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>RevokePxfsAccessTokenRequest</p>
 */
public class RevokePxfsAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tokenId;

    private RevokePxfsAccessTokenRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.tokenId = builder.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokePxfsAccessTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tokenId
     */
    public String getTokenId() {
        return this.tokenId;
    }

    public static final class Builder extends Request.Builder<RevokePxfsAccessTokenRequest, Builder> {
        private String DBInstanceName; 
        private String regionId; 
        private String tenantId; 
        private String tokenId; 

        private Builder() {
            super();
        } 

        private Builder(RevokePxfsAccessTokenRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
            this.tokenId = request.tokenId;
        } 

        /**
         * <p>Agent文件服务关联的PolarDB-X实例ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Agent文件服务实例所属地域的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Agent文件服务的租户ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>Token ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>token-001</p>
         */
        public Builder tokenId(String tokenId) {
            this.putQueryParameter("TokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        @Override
        public RevokePxfsAccessTokenRequest build() {
            return new RevokePxfsAccessTokenRequest(this);
        } 

    } 

}
