// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link UnAssociateVpdCidrBlockRequest} extends {@link RequestModel}
 *
 * <p>UnAssociateVpdCidrBlockRequest</p>
 */
public class UnAssociateVpdCidrBlockRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secondaryCidrBlock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdId;

    private UnAssociateVpdCidrBlockRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.secondaryCidrBlock = builder.secondaryCidrBlock;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnAssociateVpdCidrBlockRequest create() {
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
     * @return secondaryCidrBlock
     */
    public String getSecondaryCidrBlock() {
        return this.secondaryCidrBlock;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<UnAssociateVpdCidrBlockRequest, Builder> {
        private String regionId; 
        private String secondaryCidrBlock; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(UnAssociateVpdCidrBlockRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.secondaryCidrBlock = request.secondaryCidrBlock;
            this.vpdId = request.vpdId;
        } 

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The additional CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        public Builder secondaryCidrBlock(String secondaryCidrBlock) {
            this.putBodyParameter("SecondaryCidrBlock", secondaryCidrBlock);
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }

        /**
         * <p>The ID of the Lingjun CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-aof7dat1</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public UnAssociateVpdCidrBlockRequest build() {
            return new UnAssociateVpdCidrBlockRequest(this);
        } 

    } 

}
