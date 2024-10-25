// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyEpnInstanceRequest</p>
 */
public class ModifyEpnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceName")
    private String EPNInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Integer internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkingModel")
    private String networkingModel;

    private ModifyEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.EPNInstanceName = builder.EPNInstanceName;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.networkingModel = builder.networkingModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEpnInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return EPNInstanceName
     */
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
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

    public static final class Builder extends Request.Builder<ModifyEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 
        private String EPNInstanceName; 
        private Integer internetMaxBandwidthOut; 
        private String networkingModel; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEpnInstanceRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
            this.EPNInstanceName = request.EPNInstanceName;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.networkingModel = request.networkingModel;
        } 

        /**
         * <p>The ID of the EPN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-****</p>
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * <p>The name of the EPN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ens_test_epn</p>
         */
        public Builder EPNInstanceName(String EPNInstanceName) {
            this.putQueryParameter("EPNInstanceName", EPNInstanceName);
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }

        /**
         * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 1 Mbit/s to 100 Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>The networking mode. Valid values:</p>
         * <ul>
         * <li><strong>SpeedUp</strong>: Intelligent acceleration network (Internet).</li>
         * <li><strong>Connection</strong>: Internal network.</li>
         * <li><strong>SpeedUpAndConnection</strong>: Intelligent acceleration network and internal network.</li>
         * </ul>
         * <blockquote>
         * <p> The internal network supports only <strong>Connection</strong> and <strong>SpeedUpAndConnection</strong>.</p>
         * </blockquote>
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
        public ModifyEpnInstanceRequest build() {
            return new ModifyEpnInstanceRequest(this);
        } 

    } 

}
