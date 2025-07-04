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
 * {@link ConnectKmsInstanceRequest} extends {@link RequestModel}
 *
 * <p>ConnectKmsInstanceRequest</p>
 */
public class ConnectKmsInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KMProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String KMProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kmsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneIds;

    private ConnectKmsInstanceRequest(Builder builder) {
        super(builder);
        this.KMProvider = builder.KMProvider;
        this.kmsInstanceId = builder.kmsInstanceId;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectKmsInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KMProvider
     */
    public String getKMProvider() {
        return this.KMProvider;
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    /**
     * @return vSwitchIds
     */
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneIds
     */
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<ConnectKmsInstanceRequest, Builder> {
        private String KMProvider; 
        private String kmsInstanceId; 
        private String vSwitchIds; 
        private String vpcId; 
        private String zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(ConnectKmsInstanceRequest request) {
            super(request);
            this.KMProvider = request.KMProvider;
            this.kmsInstanceId = request.kmsInstanceId;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
            this.zoneIds = request.zoneIds;
        } 

        /**
         * <p>The provider of the KMS instance. Set the value to Aliyun.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder KMProvider(String KMProvider) {
            this.putQueryParameter("KMProvider", KMProvider);
            this.KMProvider = KMProvider;
            return this;
        }

        /**
         * <p>The ID of the KMS instance that you want to enable.</p>
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

        /**
         * <p>The vSwitch in the two zones. The vSwitch must have at least one available IP address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1i512amda6d10a0****</p>
         */
        public Builder vSwitchIds(String vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) that is associated with the KMS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp19z7cwmltad5dff****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The two zones for the KMS instance. Dual-zone deployment improves service availability and disaster recovery capabilities.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k,cn-hangzhou-j</p>
         */
        public Builder zoneIds(String zoneIds) {
            this.putQueryParameter("ZoneIds", zoneIds);
            this.zoneIds = zoneIds;
            return this;
        }

        @Override
        public ConnectKmsInstanceRequest build() {
            return new ConnectKmsInstanceRequest(this);
        } 

    } 

}
