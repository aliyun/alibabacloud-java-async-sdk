// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEniQosGroupInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEniQosGroupInfoResponseBody</p>
 */
public class DescribeEniQosGroupInfoResponseBody extends TeaModel {
    @NameInMap("QosGroupInfo")
    private QosGroupInfo qosGroupInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEniQosGroupInfoResponseBody(Builder builder) {
        this.qosGroupInfo = builder.qosGroupInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEniQosGroupInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return qosGroupInfo
     */
    public QosGroupInfo getQosGroupInfo() {
        return this.qosGroupInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QosGroupInfo qosGroupInfo; 
        private String requestId; 

        /**
         * QosGroupInfo.
         */
        public Builder qosGroupInfo(QosGroupInfo qosGroupInfo) {
            this.qosGroupInfo = qosGroupInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEniQosGroupInfoResponseBody build() {
            return new DescribeEniQosGroupInfoResponseBody(this);
        } 

    } 

    public static class NetworkInterfaceIds extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        private java.util.List < String > networkInterfaceId;

        private NetworkInterfaceIds(Builder builder) {
            this.networkInterfaceId = builder.networkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceIds create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceId
         */
        public java.util.List < String > getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public static final class Builder {
            private java.util.List < String > networkInterfaceId; 

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(java.util.List < String > networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            public NetworkInterfaceIds build() {
                return new NetworkInterfaceIds(this);
            } 

        } 

    }
    public static class QosGroup extends TeaModel {
        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("QosGroupName")
        private String qosGroupName;

        @NameInMap("Rx")
        private String rx;

        @NameInMap("RxPps")
        private String rxPps;

        @NameInMap("Tx")
        private String tx;

        @NameInMap("TxPps")
        private String txPps;

        @NameInMap("Type")
        private String type;

        private QosGroup(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.qosGroupName = builder.qosGroupName;
            this.rx = builder.rx;
            this.rxPps = builder.rxPps;
            this.tx = builder.tx;
            this.txPps = builder.txPps;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosGroup create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return qosGroupName
         */
        public String getQosGroupName() {
            return this.qosGroupName;
        }

        /**
         * @return rx
         */
        public String getRx() {
            return this.rx;
        }

        /**
         * @return rxPps
         */
        public String getRxPps() {
            return this.rxPps;
        }

        /**
         * @return tx
         */
        public String getTx() {
            return this.tx;
        }

        /**
         * @return txPps
         */
        public String getTxPps() {
            return this.txPps;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModify; 
            private String qosGroupName; 
            private String rx; 
            private String rxPps; 
            private String tx; 
            private String txPps; 
            private String type; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * QosGroupName.
             */
            public Builder qosGroupName(String qosGroupName) {
                this.qosGroupName = qosGroupName;
                return this;
            }

            /**
             * Rx.
             */
            public Builder rx(String rx) {
                this.rx = rx;
                return this;
            }

            /**
             * RxPps.
             */
            public Builder rxPps(String rxPps) {
                this.rxPps = rxPps;
                return this;
            }

            /**
             * Tx.
             */
            public Builder tx(String tx) {
                this.tx = tx;
                return this;
            }

            /**
             * TxPps.
             */
            public Builder txPps(String txPps) {
                this.txPps = txPps;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QosGroup build() {
                return new QosGroup(this);
            } 

        } 

    }
    public static class QosGroupInfo extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NetworkInterfaceIds")
        private NetworkInterfaceIds networkInterfaceIds;

        @NameInMap("QosGroup")
        private QosGroup qosGroup;

        private QosGroupInfo(Builder builder) {
            this.instanceId = builder.instanceId;
            this.networkInterfaceIds = builder.networkInterfaceIds;
            this.qosGroup = builder.qosGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosGroupInfo create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return networkInterfaceIds
         */
        public NetworkInterfaceIds getNetworkInterfaceIds() {
            return this.networkInterfaceIds;
        }

        /**
         * @return qosGroup
         */
        public QosGroup getQosGroup() {
            return this.qosGroup;
        }

        public static final class Builder {
            private String instanceId; 
            private NetworkInterfaceIds networkInterfaceIds; 
            private QosGroup qosGroup; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * NetworkInterfaceIds.
             */
            public Builder networkInterfaceIds(NetworkInterfaceIds networkInterfaceIds) {
                this.networkInterfaceIds = networkInterfaceIds;
                return this;
            }

            /**
             * QosGroup.
             */
            public Builder qosGroup(QosGroup qosGroup) {
                this.qosGroup = qosGroup;
                return this;
            }

            public QosGroupInfo build() {
                return new QosGroupInfo(this);
            } 

        } 

    }
}
