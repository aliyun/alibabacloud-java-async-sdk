// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateEpnInstanceRequest</p>
 */
public class CreateEpnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceName")
    private String EPNInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkingModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkingModel;

    private CreateEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceName = builder.EPNInstanceName;
        this.EPNInstanceType = builder.EPNInstanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.networkingModel = builder.networkingModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEpnInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceName
     */
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    /**
     * @return EPNInstanceType
     */
    public String getEPNInstanceType() {
        return this.EPNInstanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return networkingModel
     */
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    public static final class Builder extends Request.Builder<CreateEpnInstanceRequest, Builder> {
        private String EPNInstanceName; 
        private String EPNInstanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthOut; 
        private String networkingModel; 

        private Builder() {
            super();
        } 

        private Builder(CreateEpnInstanceRequest request) {
            super(request);
            this.EPNInstanceName = request.EPNInstanceName;
            this.EPNInstanceType = request.EPNInstanceType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.networkingModel = request.networkingModel;
        } 

        /**
         * <p>The name of the Edge-to-Edge network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test EPNInstanceName</p>
         */
        public Builder EPNInstanceName(String EPNInstanceName) {
            this.putQueryParameter("EPNInstanceName", EPNInstanceName);
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }

        /**
         * <p>The type of the Edge-to-Edge communication instance. Valid value: <strong>EdgeToEdge</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EdgeToEdge</p>
         */
        public Builder EPNInstanceType(String EPNInstanceType) {
            this.putQueryParameter("EPNInstanceType", EPNInstanceType);
            this.EPNInstanceType = EPNInstanceType;
            return this;
        }

        /**
         * <p>The network billing type. Valid values:</p>
         * <ul>
         * <li><strong>BandwidthByDay</strong>: Daily peak bandwidth.</li>
         * <li><strong>95BandwidthByMonth</strong>: Monthly 95th percentile peak bandwidth.</li>
         * <li><strong>PayByBandwidth4thMonth</strong>: Monthly fourth peak bandwidth.</li>
         * <li><strong>PayByBandwidth</strong>: Bandwidth with defined specifications.</li>
         * </ul>
         * <p>Only one of the Billable methods is supported. If a billing method already exists, the new value is invalid by default, and the existing one prevails.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BandwidthByDay</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The maximum outbound bandwidth to the Internet. Unit: Mbit/s. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>The networking mode. Valid values:</p>
         * <ul>
         * <li><strong>SpeedUp</strong>: Intelligent acceleration (Internet).</li>
         * <li><strong>Connection</strong>: Internal network connectivity (internal network mode).</li>
         * <li><strong>SpeedUpAndConnection</strong>: Intelligent acceleration and internal network connectivity (internal network mode).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SpeedUp</p>
         */
        public Builder networkingModel(String networkingModel) {
            this.putQueryParameter("NetworkingModel", networkingModel);
            this.networkingModel = networkingModel;
            return this;
        }

        @Override
        public CreateEpnInstanceRequest build() {
            return new CreateEpnInstanceRequest(this);
        } 

    } 

}
