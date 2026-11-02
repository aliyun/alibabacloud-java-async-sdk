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
 * {@link ModifyVpcCidrBlockRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpcCidrBlockRequest</p>
 */
public class ModifyVpcCidrBlockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originalCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private ModifyVpcCidrBlockRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.originalCidrBlock = builder.originalCidrBlock;
        this.regionId = builder.regionId;
        this.targetCidrBlock = builder.targetCidrBlock;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcCidrBlockRequest create() {
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
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return originalCidrBlock
     */
    public String getOriginalCidrBlock() {
        return this.originalCidrBlock;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetCidrBlock
     */
    public String getTargetCidrBlock() {
        return this.targetCidrBlock;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ModifyVpcCidrBlockRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String originalCidrBlock; 
        private String regionId; 
        private String targetCidrBlock; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcCidrBlockRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.originalCidrBlock = request.originalCidrBlock;
            this.regionId = request.regionId;
            this.targetCidrBlock = request.targetCidrBlock;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>Generate a parameter value from your client and ensure that the value is unique among different requests. The ClientToken parameter supports only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong> identifier. The <strong>RequestId</strong> of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for this request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The system sends a check request and does not modify the CIDR block of the virtual private cloud (VPC). If the check fails, the system returns the corresponding error. If the check succeeds, the system returns the error code <code>DryRunOperation</code>.</li>
         * <li><strong>false</strong> (default): The system sends a normal request. After the request passes the check, the system returns an HTTP 2xx status code and directly performs the modification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The CIDR block of the VPC that you want to modify. Both primary and secondary CIDR blocks are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        public Builder originalCidrBlock(String originalCidrBlock) {
            this.putQueryParameter("OriginalCidrBlock", originalCidrBlock);
            this.originalCidrBlock = originalCidrBlock;
            return this;
        }

        /**
         * <p>The ID of the region where the VPC is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The target CIDR block of the VPC after the modification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/16</p>
         */
        public Builder targetCidrBlock(String targetCidrBlock) {
            this.putQueryParameter("TargetCidrBlock", targetCidrBlock);
            this.targetCidrBlock = targetCidrBlock;
            return this;
        }

        /**
         * <p>The ID of the VPC that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1di7uewzmtvfuq8****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ModifyVpcCidrBlockRequest build() {
            return new ModifyVpcCidrBlockRequest(this);
        } 

    } 

}
