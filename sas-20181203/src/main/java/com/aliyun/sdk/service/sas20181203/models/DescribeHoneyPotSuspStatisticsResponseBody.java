// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHoneyPotSuspStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHoneyPotSuspStatisticsResponseBody</p>
 */
public class DescribeHoneyPotSuspStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuspHoneyPotStatisticsResponse")
    private java.util.List < SuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse;

    private DescribeHoneyPotSuspStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suspHoneyPotStatisticsResponse = builder.suspHoneyPotStatisticsResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotSuspStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suspHoneyPotStatisticsResponse
     */
    public java.util.List < SuspHoneyPotStatisticsResponse> getSuspHoneyPotStatisticsResponse() {
        return this.suspHoneyPotStatisticsResponse;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array consisting of the top 5 VPCs or assets for which alerts are most frequently generated.
         */
        public Builder suspHoneyPotStatisticsResponse(java.util.List < SuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse) {
            this.suspHoneyPotStatisticsResponse = suspHoneyPotStatisticsResponse;
            return this;
        }

        public DescribeHoneyPotSuspStatisticsResponseBody build() {
            return new DescribeHoneyPotSuspStatisticsResponseBody(this);
        } 

    } 

    public static class SuspHoneyPotStatisticsResponse extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private SuspHoneyPotStatisticsResponse(Builder builder) {
            this.count = builder.count;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspHoneyPotStatisticsResponse create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceId; 
            private String instanceName; 
            private String type; 
            private String vpcId; 
            private String vpcName; 

            /**
             * The total number of alerts that are generated for the asset.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The ID of the server.
             * <p>
             * 
             * >  This parameter is returned only if **StatisticsKeyType** is set to **uuid**.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
             * <p>
             * 
             * >  This parameter is returned only if **StatisticsKeyType** is set to **uuid**.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **vpcInstanceId**: VPC
             * *   **uuid**: server
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the VPC.
             * <p>
             * 
             * >  This parameter is returned only if **StatisticsKeyType** is set to **vpcInstanceId**.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
             * <p>
             * 
             * >  This parameter is returned only if **StatisticsKeyType** is set to **vpcInstanceId**.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public SuspHoneyPotStatisticsResponse build() {
                return new SuspHoneyPotStatisticsResponse(this);
            } 

        } 

    }
}
