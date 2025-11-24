// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeServiceMeshUpgradeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshUpgradeStatusResponseBody</p>
 */
public class DescribeServiceMeshUpgradeStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpgradeDetail")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeServiceMeshUpgradeStatusResponseBody model) {
            this.requestId = model.requestId;
            this.upgradeDetail = model.upgradeDetail;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11fd0027-c27e-41bb-a565-75583054****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The upgrade results.</p>
         */
        public Builder upgradeDetail(UpgradeDetail upgradeDetail) {
            this.upgradeDetail = upgradeDetail;
            return this;
        }

        public DescribeServiceMeshUpgradeStatusResponseBody build() {
            return new DescribeServiceMeshUpgradeStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshUpgradeStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshUpgradeStatusResponseBody</p>
     */
    public static class UpgradeDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishedGatewaysNum")
        private Long finishedGatewaysNum;

        @com.aliyun.core.annotation.NameInMap("GatewayStatusRecord")
        private java.util.Map<String, UpgradeDetailGatewayStatusRecordValue> gatewayStatusRecord;

        @com.aliyun.core.annotation.NameInMap("MeshStatus")
        private String meshStatus;

        @com.aliyun.core.annotation.NameInMap("TotalGatewaysNum")
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
        public java.util.Map<String, UpgradeDetailGatewayStatusRecordValue> getGatewayStatusRecord() {
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
            private java.util.Map<String, UpgradeDetailGatewayStatusRecordValue> gatewayStatusRecord; 
            private String meshStatus; 
            private Long totalGatewaysNum; 

            private Builder() {
            } 

            private Builder(UpgradeDetail model) {
                this.finishedGatewaysNum = model.finishedGatewaysNum;
                this.gatewayStatusRecord = model.gatewayStatusRecord;
                this.meshStatus = model.meshStatus;
                this.totalGatewaysNum = model.totalGatewaysNum;
            } 

            /**
             * <p>The number of ingress gateways that are upgraded.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder finishedGatewaysNum(Long finishedGatewaysNum) {
                this.finishedGatewaysNum = finishedGatewaysNum;
                return this;
            }

            /**
             * <p>The information about the status of the ingress gateways.</p>
             */
            public Builder gatewayStatusRecord(java.util.Map<String, UpgradeDetailGatewayStatusRecordValue> gatewayStatusRecord) {
                this.gatewayStatusRecord = gatewayStatusRecord;
                return this;
            }

            /**
             * <p>The status of the ASM instance. Valid values:</p>
             * <ul>
             * <li>running: The instance is running.</li>
             * <li><code>upgrading</code>: The instance is being upgraded.</li>
             * <li><code>upgrading_failed</code>: The upgrade of the instance fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder meshStatus(String meshStatus) {
                this.meshStatus = meshStatus;
                return this;
            }

            /**
             * <p>The total number of ingress gateways in the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
