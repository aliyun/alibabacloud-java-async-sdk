// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeVaultReplicationRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVaultReplicationRegionsRequest</p>
 */
public class DescribeVaultReplicationRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    @Deprecated
    private String vaultId;

    private DescribeVaultReplicationRegionsRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVaultReplicationRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DescribeVaultReplicationRegionsRequest, Builder> {
        private String token; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVaultReplicationRegionsRequest request) {
            super(request);
            this.token = request.token;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>01W3ZZOQ</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>v-00030j3c******sn</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public DescribeVaultReplicationRegionsRequest build() {
            return new DescribeVaultReplicationRegionsRequest(this);
        } 

    } 

}
