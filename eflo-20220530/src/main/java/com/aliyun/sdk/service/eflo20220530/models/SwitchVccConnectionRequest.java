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
 * {@link SwitchVccConnectionRequest} extends {@link RequestModel}
 *
 * <p>SwitchVccConnectionRequest</p>
 */
public class SwitchVccConnectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    private String connectionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vccId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private SwitchVccConnectionRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.connectionType = builder.connectionType;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
        this.vccId = builder.vccId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchVccConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<SwitchVccConnectionRequest, Builder> {
        private String cenId; 
        private String connectionType; 
        private String regionId; 
        private String vSwitchId; 
        private String vccId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchVccConnectionRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.connectionType = request.connectionType;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
            this.vccId = request.vccId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>CEN</p>
         * 
         * <strong>example:</strong>
         * <p>cen-bkiw0x1347roek****</p>
         */
        public Builder cenId(String cenId) {
            this.putBodyParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>Connection type, CENTR/VPC</p>
         * 
         * <strong>example:</strong>
         * <p>CENTR</p>
         */
        public Builder connectionType(String connectionType) {
            this.putBodyParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * <p>Region ID</p>
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
         * <p>vSwitch ID</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4nahb0pxckgktxfv****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>Cloud Connect Network (CCN) ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w22****</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6aa4ddo97frj22t****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public SwitchVccConnectionRequest build() {
            return new SwitchVccConnectionRequest(this);
        } 

    } 

}
