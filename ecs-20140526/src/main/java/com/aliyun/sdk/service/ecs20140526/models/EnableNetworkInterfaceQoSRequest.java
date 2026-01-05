// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link EnableNetworkInterfaceQoSRequest} extends {@link RequestModel}
 *
 * <p>EnableNetworkInterfaceQoSRequest</p>
 */
public class EnableNetworkInterfaceQoSRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QoS")
    private QoS qoS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private EnableNetworkInterfaceQoSRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.qoS = builder.qoS;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableNetworkInterfaceQoSRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qoS
     */
    public QoS getQoS() {
        return this.qoS;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<EnableNetworkInterfaceQoSRequest, Builder> {
        private String sourceRegionId; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private QoS qoS; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(EnableNetworkInterfaceQoSRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.qoS = request.qoS;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-2zeh9atclduxvf1z****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>QoS Speed Limit Settings</p>
         */
        public Builder qoS(QoS qoS) {
            this.putQueryParameter("QoS", qoS);
            this.qoS = qoS;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public EnableNetworkInterfaceQoSRequest build() {
            return new EnableNetworkInterfaceQoSRequest(this);
        } 

    } 

    /**
     * 
     * {@link EnableNetworkInterfaceQoSRequest} extends {@link TeaModel}
     *
     * <p>EnableNetworkInterfaceQoSRequest</p>
     */
    public static class QoS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthRx")
        private Long bandwidthRx;

        @com.aliyun.core.annotation.NameInMap("BandwidthTx")
        private Long bandwidthTx;

        @com.aliyun.core.annotation.NameInMap("ConcurrentConnections")
        private Long concurrentConnections;

        @com.aliyun.core.annotation.NameInMap("PpsRx")
        private Long ppsRx;

        @com.aliyun.core.annotation.NameInMap("PpsTx")
        private Long ppsTx;

        private QoS(Builder builder) {
            this.bandwidthRx = builder.bandwidthRx;
            this.bandwidthTx = builder.bandwidthTx;
            this.concurrentConnections = builder.concurrentConnections;
            this.ppsRx = builder.ppsRx;
            this.ppsTx = builder.ppsTx;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QoS create() {
            return builder().build();
        }

        /**
         * @return bandwidthRx
         */
        public Long getBandwidthRx() {
            return this.bandwidthRx;
        }

        /**
         * @return bandwidthTx
         */
        public Long getBandwidthTx() {
            return this.bandwidthTx;
        }

        /**
         * @return concurrentConnections
         */
        public Long getConcurrentConnections() {
            return this.concurrentConnections;
        }

        /**
         * @return ppsRx
         */
        public Long getPpsRx() {
            return this.ppsRx;
        }

        /**
         * @return ppsTx
         */
        public Long getPpsTx() {
            return this.ppsTx;
        }

        public static final class Builder {
            private Long bandwidthRx; 
            private Long bandwidthTx; 
            private Long concurrentConnections; 
            private Long ppsRx; 
            private Long ppsTx; 

            private Builder() {
            } 

            private Builder(QoS model) {
                this.bandwidthRx = model.bandwidthRx;
                this.bandwidthTx = model.bandwidthTx;
                this.concurrentConnections = model.concurrentConnections;
                this.ppsRx = model.ppsRx;
                this.ppsTx = model.ppsTx;
            } 

            /**
             * <p>The maximum inbound internal bandwidth.</p>
             * <p>Unit: kbit/s, step size: 1000 (1Mbps), value range: [50000, +♾️)</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder bandwidthRx(Long bandwidthRx) {
                this.bandwidthRx = bandwidthRx;
                return this;
            }

            /**
             * <p>The maximum outbound internal bandwidth.</p>
             * <p>Unit: kbit/s, step size: 1000 (1Mbps), value range: [50000, +♾️)</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder bandwidthTx(Long bandwidthTx) {
                this.bandwidthTx = bandwidthTx;
                return this;
            }

            /**
             * <p>Maximum Number of Sessions</p>
             * <p>Step size: 10000, value range: [10000, +♾️)</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder concurrentConnections(Long concurrentConnections) {
                this.concurrentConnections = concurrentConnections;
                return this;
            }

            /**
             * <p>The inbound packet forwarding rate over the internal network.</p>
             * <p>Unit: pps, step size: 10000, value range: [10000, +♾️)</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder ppsRx(Long ppsRx) {
                this.ppsRx = ppsRx;
                return this;
            }

            /**
             * <p>The outbound packet forwarding rate over the internal network.</p>
             * <p>Unit: pps, step size: 10000, value range: [10000, +♾️)</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder ppsTx(Long ppsTx) {
                this.ppsTx = ppsTx;
                return this;
            }

            public QoS build() {
                return new QoS(this);
            } 

        } 

    }
}
