// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateRenderingInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateRenderingInstanceRequest</p>
 */
public class CreateRenderingInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private ClientInfo clientInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceBillingCycle")
    private String instanceBillingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidth")
    private Long internetMaxBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private String storageSize;

    private CreateRenderingInstanceRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.clientInfo = builder.clientInfo;
        this.instanceBillingCycle = builder.instanceBillingCycle;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidth = builder.internetMaxBandwidth;
        this.period = builder.period;
        this.renderingSpec = builder.renderingSpec;
        this.storageSize = builder.storageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRenderingInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientInfo
     */
    public ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    /**
     * @return instanceBillingCycle
     */
    public String getInstanceBillingCycle() {
        return this.instanceBillingCycle;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidth
     */
    public Long getInternetMaxBandwidth() {
        return this.internetMaxBandwidth;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return renderingSpec
     */
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    /**
     * @return storageSize
     */
    public String getStorageSize() {
        return this.storageSize;
    }

    public static final class Builder extends Request.Builder<CreateRenderingInstanceRequest, Builder> {
        private Boolean autoRenew; 
        private ClientInfo clientInfo; 
        private String instanceBillingCycle; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private Long internetMaxBandwidth; 
        private String period; 
        private String renderingSpec; 
        private String storageSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateRenderingInstanceRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.clientInfo = request.clientInfo;
            this.instanceBillingCycle = request.instanceBillingCycle;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidth = request.internetMaxBandwidth;
            this.period = request.period;
            this.renderingSpec = request.renderingSpec;
            this.storageSize = request.storageSize;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ClientInfo.
         */
        public Builder clientInfo(ClientInfo clientInfo) {
            String clientInfoShrink = shrink(clientInfo, "ClientInfo", "json");
            this.putQueryParameter("ClientInfo", clientInfoShrink);
            this.clientInfo = clientInfo;
            return this;
        }

        /**
         * InstanceBillingCycle.
         */
        public Builder instanceBillingCycle(String instanceBillingCycle) {
            this.putQueryParameter("InstanceBillingCycle", instanceBillingCycle);
            this.instanceBillingCycle = instanceBillingCycle;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * InternetMaxBandwidth.
         */
        public Builder internetMaxBandwidth(Long internetMaxBandwidth) {
            this.putQueryParameter("InternetMaxBandwidth", internetMaxBandwidth);
            this.internetMaxBandwidth = internetMaxBandwidth;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crs.cp.l1</p>
         */
        public Builder renderingSpec(String renderingSpec) {
            this.putQueryParameter("RenderingSpec", renderingSpec);
            this.renderingSpec = renderingSpec;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(String storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        @Override
        public CreateRenderingInstanceRequest build() {
            return new CreateRenderingInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRenderingInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateRenderingInstanceRequest</p>
     */
    public static class ClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        private ClientInfo(Builder builder) {
            this.clientIp = builder.clientIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInfo create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        public static final class Builder {
            private String clientIp; 

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            public ClientInfo build() {
                return new ClientInfo(this);
            } 

        } 

    }
}
