// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapRequest} extends {@link RequestModel}
 *
 * <p>DescribeCapRequest</p>
 */
public class DescribeCapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BegTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long begTime;

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

    private DescribeCapRequest(Builder builder) {
        super(builder);
        this.begTime = builder.begTime;
        this.ddosRegionId = builder.ddosRegionId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.internetIp = builder.internetIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return begTime
     */
    public Long getBegTime() {
        return this.begTime;
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

    public static final class Builder extends Request.Builder<DescribeCapRequest, Builder> {
        private Long begTime; 
        private String ddosRegionId; 
        private String instanceId; 
        private String instanceType; 
        private String internetIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCapRequest request) {
            super(request);
            this.begTime = request.begTime;
            this.ddosRegionId = request.ddosRegionId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.internetIp = request.internetIp;
        } 

        /**
         * The start time of the DDoS attack event. The value is a UNIX timestamp. Unit: milliseconds.
         * <p>
         * 
         * > You can call the [DescribeDdosEventList](~~354236~~) operation to query the start time of each DDoS attack event that occurred on an asset.
         */
        public Builder begTime(Long begTime) {
            this.putQueryParameter("BegTime", begTime);
            this.begTime = begTime;
            return this;
        }

        /**
         * The region ID of the asset that is under DDoS attacks. The asset is assigned a public IP address.
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
         * The ID of the asset that is under DDoS attacks.
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
         * The type of the asset that is under DDoS attacks. Valid values:
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
         * The public IP address of the asset that is under DDoS attacks.
         */
        public Builder internetIp(String internetIp) {
            this.putQueryParameter("InternetIp", internetIp);
            this.internetIp = internetIp;
            return this;
        }

        @Override
        public DescribeCapRequest build() {
            return new DescribeCapRequest(this);
        } 

    } 

}
