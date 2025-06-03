// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link UpdateKmsInstanceBindVpcRequest} extends {@link RequestModel}
 *
 * <p>UpdateKmsInstanceBindVpcRequest</p>
 */
public class UpdateKmsInstanceBindVpcRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindVpcs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bindVpcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kmsInstanceId;

    private UpdateKmsInstanceBindVpcRequest(Builder builder) {
        super(builder);
        this.bindVpcs = builder.bindVpcs;
        this.kmsInstanceId = builder.kmsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKmsInstanceBindVpcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindVpcs
     */
    public String getBindVpcs() {
        return this.bindVpcs;
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateKmsInstanceBindVpcRequest, Builder> {
        private String bindVpcs; 
        private String kmsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKmsInstanceBindVpcRequest request) {
            super(request);
            this.bindVpcs = request.bindVpcs;
            this.kmsInstanceId = request.kmsInstanceId;
        } 

        /**
         * <p>The VPC configuration. The configuration of each VPC contains the following content:</p>
         * <ul>
         * <li>VpcId: the ID of the VPC.</li>
         * <li>VSwitchId: the vSwitch in the VPC.</li>
         * <li>RegionID: the ID of the region to which the VPC belongs.</li>
         * <li>VpcOwnerId: the Alibaba Cloud account to which the VPC belongs.</li>
         * </ul>
         * <p>Format: <code>[{&quot;VpcId&quot;:&quot;${VpcId}&quot;,&quot;VSwitchId&quot;:&quot;${VSwitchId}&quot;,&quot;RegionId&quot;:&quot;${RegionId}&quot;,&quot;VpcOwnerId&quot;:${VpcOwnerId}},..]</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;VpcId&quot;:&quot;vpc-bp1go9qvmj78j4f4c****&quot;,&quot;VSwitchId&quot;:&quot;vsw-bp16c5pvvcf0fp5b9****&quot;,&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;VpcOwnerId&quot;:120708975881****},{&quot;VpcId&quot;:&quot;vpc-bp14c07ucxg6h1xjm****&quot;,&quot;VSwitchId&quot;:&quot;vsw-bp1wujtnspi1l3gvu****&quot;,&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;VpcOwnerId&quot;:119285303511****}]</p>
         */
        public Builder bindVpcs(String bindVpcs) {
            this.putQueryParameter("BindVpcs", bindVpcs);
            this.bindVpcs = bindVpcs;
            return this;
        }

        /**
         * <p>The ID of the KMS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-phzz64f722a1buamw0****</p>
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.putQueryParameter("KmsInstanceId", kmsInstanceId);
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        @Override
        public UpdateKmsInstanceBindVpcRequest build() {
            return new UpdateKmsInstanceBindVpcRequest(this);
        } 

    } 

}
