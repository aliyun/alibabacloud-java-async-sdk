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
 * {@link UpdateSubnetRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubnetRequest</p>
 */
public class UpdateSubnetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubnetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subnetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubnetName")
    private String subnetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private UpdateSubnetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.subnetId = builder.subnetId;
        this.subnetName = builder.subnetName;
        this.vpdId = builder.vpdId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubnetRequest create() {
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
     * @return subnetName
     */
    public String getSubnetName() {
        return this.subnetName;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpdateSubnetRequest, Builder> {
        private String regionId; 
        private String subnetId; 
        private String subnetName; 
        private String vpdId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubnetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.subnetId = request.subnetId;
            this.subnetName = request.subnetName;
            this.vpdId = request.vpdId;
            this.zoneId = request.zoneId;
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
         * <p>The subnet instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-f3zfzmnc</p>
         */
        public Builder subnetId(String subnetId) {
            this.putBodyParameter("SubnetId", subnetId);
            this.subnetId = subnetId;
            return this;
        }

        /**
         * <p>The new name for the subnet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>subnet-1</p>
         */
        public Builder subnetName(String subnetName) {
            this.putBodyParameter("SubnetName", subnetName);
            this.subnetName = subnetName;
            return this;
        }

        /**
         * <p>The ID of the VPD to which the subnet belongs.</p>
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

        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public UpdateSubnetRequest build() {
            return new UpdateSubnetRequest(this);
        } 

    } 

}
