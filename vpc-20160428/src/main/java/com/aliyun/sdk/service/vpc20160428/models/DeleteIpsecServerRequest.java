// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DeleteIpsecServerRequest} extends {@link RequestModel}
 *
 * <p>DeleteIpsecServerRequest</p>
 */
public class DeleteIpsecServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipsecServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteIpsecServerRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipsecServerId = builder.ipsecServerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpsecServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipsecServerId
     */
    public String getIpsecServerId() {
        return this.ipsecServerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteIpsecServerRequest, Builder> {
        private String clientToken; 
        private String dryRun; 
        private String ipsecServerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIpsecServerRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipsecServerId = request.ipsecServerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run without deleting the IPsec server. The system checks the required parameters, request syntax, and business restrictions. If the check fails, the corresponding error message is returned. If the check succeeds, <code>DryRunOperation</code> is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the request. After the check succeeds, the IPsec server is directly deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the IPsec server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iss-bp1jougp8cfsbo8y9****</p>
         */
        public Builder ipsecServerId(String ipsecServerId) {
            this.putQueryParameter("IpsecServerId", ipsecServerId);
            this.ipsecServerId = ipsecServerId;
            return this;
        }

        /**
         * <p>The region ID of the IPsec server.</p>
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

        @Override
        public DeleteIpsecServerRequest build() {
            return new DeleteIpsecServerRequest(this);
        } 

    } 

}
