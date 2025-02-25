// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseThresholdRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseThresholdRequest</p>
 */
public class ModifyDefenseThresholdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bps")
    private Integer bps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdosRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddosRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAuto")
    private Boolean isAuto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pps")
    private Integer pps;

    private ModifyDefenseThresholdRequest(Builder builder) {
        super(builder);
        this.bps = builder.bps;
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
        this.isAuto = builder.isAuto;
        this.pps = builder.pps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseThresholdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bps
     */
    public Integer getBps() {
        return this.bps;
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetIp
     */
    public String getInternetIp() {
        return this.internetIp;
    }

    /**
     * @return isAuto
     */
    public Boolean getIsAuto() {
        return this.isAuto;
    }

    /**
     * @return pps
     */
    public Integer getPps() {
        return this.pps;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseThresholdRequest, Builder> {
        private Integer bps; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 
        private Boolean isAuto; 
        private Integer pps; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseThresholdRequest request) {
            super(request);
            this.bps = request.bps;
            this.ddosRegionId = request.ddosRegionId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
            this.isAuto = request.isAuto;
            this.pps = request.pps;
        } 

        /**
         * Specifies the traffic scrubbing threshold. Unit: Mbit/s. The traffic scrubbing threshold cannot exceed the peak inbound or outbound Internet traffic, whichever is larger, of the asset.
         * <p>
         * 
         * You can use the monitoring tool that is provided by the asset to query the Internet traffic of the asset:
         * 
         * *   For more information about how to query the Internet traffic of an ECS instance, see [Query monitoring information of an instance](~~25482~~).
         * *   For more information about how to query the number of packets of an SLB instance, see [View monitoring data in the console](~~85982~~).
         */
        public Builder bps(Integer bps) {
            this.putQueryParameter("Bps", bps);
            this.bps = bps;
            return this;
        }

        /**
         * The region ID of the asset for which you want to change the scrubbing thresholds.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~353250~~) operation to query the most recent region list.
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * The ID of the asset.
         * <p>
         * 
         * > You can call the [DescribeInstance](~~354191~~) operation to query the IDs of ECS instances, SLB instances, and EIPs within the current Alibaba Cloud account.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The type of the asset. Valid values:
         * <p>
         * 
         * *   **ecs**: ECS instance
         * *   **slb**: SLB instance
         * *   **eip**: EIP
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The IP address of the asset.
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        /**
         * Specifies whether to automatically adjust the scrubbing threshold based on the traffic load on the asset. Valid values:
         * <p>
         * 
         * *   **true**: automatically adjusts the scrubbing thresholds. You do not need to configure the **Bps** and **Pps** parameters.
         * *   **false**: The scrubbing threshold is not automatically adjusted. You must configure the **Bps** and **Pps** parameters.
         * 
         * Default value: false.
         */
        public Builder isAuto(Boolean isAuto) {
            this.putQueryParameter("IsAuto", isAuto);
            this.isAuto = isAuto;
            return this;
        }

        /**
         * Specifies the packet scrubbing threshold. Unit: packets per second (pps).
         * <p>
         * 
         * The packet scrubbing threshold cannot exceed the peak number of inbound or outbound packets, whichever is larger, of the asset. You can use the monitoring tool that is provided by the asset to query the number of packets of the asset:
         * 
         * *   For more information about how to query the number of packets of an ECS instance, see [Query monitoring information of an instance](~~25482~~).
         * *   For more information about how to query the number of packets of an SLB instance, see [View monitoring data in the console](~~85982~~).
         */
        public Builder pps(Integer pps) {
            this.putQueryParameter("Pps", pps);
            this.pps = pps;
            return this;
        }

        @Override
        public ModifyDefenseThresholdRequest build() {
            return new ModifyDefenseThresholdRequest(this);
        } 

    } 

}
