// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshGatewayPodStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshGatewayPodStatusResponseBody</p>
 */
public class DescribeServiceMeshGatewayPodStatusResponseBody extends TeaModel {
    @NameInMap("ASMGatewayDetails")
    private java.util.List < ASMGatewayDetails> ASMGatewayDetails;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshGatewayPodStatusResponseBody(Builder builder) {
        this.ASMGatewayDetails = builder.ASMGatewayDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshGatewayPodStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return ASMGatewayDetails
     */
    public java.util.List < ASMGatewayDetails> getASMGatewayDetails() {
        return this.ASMGatewayDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ASMGatewayDetails> ASMGatewayDetails; 
        private String requestId; 

        /**
         * ASMGatewayDetails.
         */
        public Builder ASMGatewayDetails(java.util.List < ASMGatewayDetails> ASMGatewayDetails) {
            this.ASMGatewayDetails = ASMGatewayDetails;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshGatewayPodStatusResponseBody build() {
            return new DescribeServiceMeshGatewayPodStatusResponseBody(this);
        } 

    } 

    public static class ASMGatewayDetails extends TeaModel {
        @NameInMap("ClusterID")
        private String clusterID;

        @NameInMap("GatewayName")
        private String gatewayName;

        @NameInMap("ReadyPodNum")
        private Long readyPodNum;

        @NameInMap("SpecPodNum")
        private Long specPodNum;

        private ASMGatewayDetails(Builder builder) {
            this.clusterID = builder.clusterID;
            this.gatewayName = builder.gatewayName;
            this.readyPodNum = builder.readyPodNum;
            this.specPodNum = builder.specPodNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ASMGatewayDetails create() {
            return builder().build();
        }

        /**
         * @return clusterID
         */
        public String getClusterID() {
            return this.clusterID;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return readyPodNum
         */
        public Long getReadyPodNum() {
            return this.readyPodNum;
        }

        /**
         * @return specPodNum
         */
        public Long getSpecPodNum() {
            return this.specPodNum;
        }

        public static final class Builder {
            private String clusterID; 
            private String gatewayName; 
            private Long readyPodNum; 
            private Long specPodNum; 

            /**
             * ClusterID.
             */
            public Builder clusterID(String clusterID) {
                this.clusterID = clusterID;
                return this;
            }

            /**
             * GatewayName.
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * ReadyPodNum.
             */
            public Builder readyPodNum(Long readyPodNum) {
                this.readyPodNum = readyPodNum;
                return this;
            }

            /**
             * SpecPodNum.
             */
            public Builder specPodNum(Long specPodNum) {
                this.specPodNum = specPodNum;
                return this;
            }

            public ASMGatewayDetails build() {
                return new ASMGatewayDetails(this);
            } 

        } 

    }
}
