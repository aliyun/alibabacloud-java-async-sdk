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
 * {@link GetSubnetRequest} extends {@link RequestModel}
 *
 * <p>GetSubnetRequest</p>
 */
public class GetSubnetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubnetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subnetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    private String vpdId;

    private GetSubnetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.subnetId = builder.subnetId;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubnetRequest create() {
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
     * @return subnetId
     */
    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<GetSubnetRequest, Builder> {
        private String regionId; 
        private String subnetId; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubnetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.subnetId = request.subnetId;
            this.vpdId = request.vpdId;
        } 

        /**
         * <p>The region ID of the data center.</p>
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
         * <p>The ID of the Lingjun subnet instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-2avf0itf</p>
         */
        public Builder subnetId(String subnetId) {
            this.putBodyParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        /**
         * <p>The ID of the CIDR block to which Lingjun belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-cxcmdk1m</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public GetSubnetRequest build() {
            return new GetSubnetRequest(this);
        } 

    } 

}
