// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshUpgradeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshUpgradeStatusResponseBody</p>
 */
public class DescribeServiceMeshUpgradeStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpgradeDetail")
    private UpgradeDetail upgradeDetail;

    private DescribeServiceMeshUpgradeStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.upgradeDetail = builder.upgradeDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshUpgradeStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return upgradeDetail
     */
    public UpgradeDetail getUpgradeDetail() {
        return this.upgradeDetail;
    }

    public static final class Builder {
        private String requestId; 
        private UpgradeDetail upgradeDetail; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The upgrade results.
         */
        public Builder upgradeDetail(UpgradeDetail upgradeDetail) {
            this.upgradeDetail = upgradeDetail;
            return this;
        }

        public DescribeServiceMeshUpgradeStatusResponseBody build() {
            return new DescribeServiceMeshUpgradeStatusResponseBody(this);
        } 

    } 

    public static class UpgradeDetail extends TeaModel {
        @NameInMap("FinishedGatewaysNum")
        private Long finishedGatewaysNum;

        @NameInMap("GatewayStatusRecord")
        private java.util.Map < String, UpgradeDetailGatewayStatusRecordValue > gatewayStatusRecord;

        @NameInMap("MeshStatus")
        private String meshStatus;

        @NameInMap("TotalGatewaysNum")
        private Long totalGatewaysNum;

        private UpgradeDetail(Builder builder) {
            this.finishedGatewaysNum = builder.finishedGatewaysNum;
            this.gatewayStatusRecord = builder.gatewayStatusRecord;
            this.meshStatus = builder.meshStatus;
            this.totalGatewaysNum = builder.totalGatewaysNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeDetail create() {
            return builder().build();
        }

        /**
         * @return finishedGatewaysNum
         */
        public Long getFinishedGatewaysNum() {
            return this.finishedGatewaysNum;
        }

        /**
         * @return gatewayStatusRecord
         */
        public java.util.Map < String, UpgradeDetailGatewayStatusRecordValue > getGatewayStatusRecord() {
            return this.gatewayStatusRecord;
        }

        /**
         * @return meshStatus
         */
        public String getMeshStatus() {
            return this.meshStatus;
        }

        /**
         * @return totalGatewaysNum
         */
        public Long getTotalGatewaysNum() {
            return this.totalGatewaysNum;
        }

        public static final class Builder {
            private Long finishedGatewaysNum; 
            private java.util.Map < String, UpgradeDetailGatewayStatusRecordValue > gatewayStatusRecord; 
            private String meshStatus; 
            private Long totalGatewaysNum; 

            /**
             * The number of ingress gateways that are upgraded.
             */
            public Builder finishedGatewaysNum(Long finishedGatewaysNum) {
                this.finishedGatewaysNum = finishedGatewaysNum;
                return this;
            }

            /**
             * The information about the status of the ingress gateways.
             */
            public Builder gatewayStatusRecord(java.util.Map < String, UpgradeDetailGatewayStatusRecordValue > gatewayStatusRecord) {
                this.gatewayStatusRecord = gatewayStatusRecord;
                return this;
            }

            /**
             * The status of the ASM instance. Valid values:
             * <p>
             * 
             * *   running: The instance is running.
             * *   `upgrading`: The instance is being upgraded.
             * *   `upgrading_failed`: The upgrade of the instance fails.
             */
            public Builder meshStatus(String meshStatus) {
                this.meshStatus = meshStatus;
                return this;
            }

            /**
             * The total number of ingress gateways in the ASM instance.
             */
            public Builder totalGatewaysNum(Long totalGatewaysNum) {
                this.totalGatewaysNum = totalGatewaysNum;
                return this;
            }

            public UpgradeDetail build() {
                return new UpgradeDetail(this);
            } 

        } 

    }
}
