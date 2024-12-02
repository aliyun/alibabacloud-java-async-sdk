// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RenewAssetOperationTokenRequest} extends {@link RequestModel}
 *
 * <p>RenewAssetOperationTokenRequest</p>
 */
public class RenewAssetOperationTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenId")
    private String tokenId;

    private RenewAssetOperationTokenRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.tokenId = builder.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewAssetOperationTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tokenId
     */
    public String getTokenId() {
        return this.tokenId;
    }

    public static final class Builder extends Request.Builder<RenewAssetOperationTokenRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String tokenId; 

        private Builder() {
            super();
        } 

        private Builder(RenewAssetOperationTokenRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.tokenId = request.tokenId;
        } 

        /**
         * <p>The bastion host ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
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
         * <p>The ID of the O&amp;M token that you want to renew.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758861.html">GenerateAssetOperationToken</a> operation to query the O&amp;M token ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NmYyMmEzNmMwYzljNGYxMjh******</p>
         */
        public Builder tokenId(String tokenId) {
            this.putQueryParameter("TokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        @Override
        public RenewAssetOperationTokenRequest build() {
            return new RenewAssetOperationTokenRequest(this);
        } 

    } 

}
