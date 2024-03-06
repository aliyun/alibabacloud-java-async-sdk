// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKmsInstanceBindVpcRequest} extends {@link RequestModel}
 *
 * <p>UpdateKmsInstanceBindVpcRequest</p>
 */
public class UpdateKmsInstanceBindVpcRequest extends Request {
    @Query
    @NameInMap("BindVpcs")
    @Validation(required = true)
    private String bindVpcs;

    @Query
    @NameInMap("KmsInstanceId")
    @Validation(required = true)
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
         * The VPC configuration. The configuration of each VPC contains the following content:
         * <p>
         * 
         * *   VpcId: the ID of the VPC.
         * *   VSwitchId: the vSwitch in the VPC.
         * *   RegionID: the ID of the region to which the VPC belongs.
         * *   VpcOwnerId: the Alibaba Cloud account to which the VPC belongs.
         * 
         * Format: `[{"VpcId":"${VpcId}","VSwitchId":"${VSwitchId}","RegionId":"${RegionId}","VpcOwnerId":${VpcOwnerId}},..]`.
         */
        public Builder bindVpcs(String bindVpcs) {
            this.putQueryParameter("BindVpcs", bindVpcs);
            this.bindVpcs = bindVpcs;
            return this;
        }

        /**
         * The ID of the KMS instance.
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
