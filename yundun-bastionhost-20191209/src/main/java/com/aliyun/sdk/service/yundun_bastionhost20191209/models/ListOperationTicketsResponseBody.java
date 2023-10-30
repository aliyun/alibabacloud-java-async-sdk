// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationTicketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationTicketsResponseBody</p>
 */
public class ListOperationTicketsResponseBody extends TeaModel {
    @NameInMap("OperationTickets")
    private java.util.List < OperationTickets> operationTickets;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListOperationTicketsResponseBody(Builder builder) {
        this.operationTickets = builder.operationTickets;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationTicketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return operationTickets
     */
    public java.util.List < OperationTickets> getOperationTickets() {
        return this.operationTickets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OperationTickets> operationTickets; 
        private String requestId; 
        private Long totalCount; 

        /**
         * OperationTickets.
         */
        public Builder operationTickets(java.util.List < OperationTickets> operationTickets) {
            this.operationTickets = operationTickets;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationTicketsResponseBody build() {
            return new ListOperationTicketsResponseBody(this);
        } 

    } 

    public static class OperationTickets extends TeaModel {
        @NameInMap("ApplyUserId")
        private String applyUserId;

        @NameInMap("ApplyUsername")
        private String applyUsername;

        @NameInMap("AssetAccountId")
        private String assetAccountId;

        @NameInMap("AssetAccountName")
        private String assetAccountName;

        @NameInMap("AssetAddress")
        private String assetAddress;

        @NameInMap("AssetId")
        private String assetId;

        @NameInMap("AssetName")
        private String assetName;

        @NameInMap("AssetNetworkDomainId")
        private String assetNetworkDomainId;

        @NameInMap("AssetOs")
        private String assetOs;

        @NameInMap("AssetSource")
        private String assetSource;

        @NameInMap("AssetSourceInstanceId")
        private String assetSourceInstanceId;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("OperationTicketId")
        private String operationTicketId;

        @NameInMap("ProtocolName")
        private String protocolName;

        @NameInMap("State")
        private String state;

        private OperationTickets(Builder builder) {
            this.applyUserId = builder.applyUserId;
            this.applyUsername = builder.applyUsername;
            this.assetAccountId = builder.assetAccountId;
            this.assetAccountName = builder.assetAccountName;
            this.assetAddress = builder.assetAddress;
            this.assetId = builder.assetId;
            this.assetName = builder.assetName;
            this.assetNetworkDomainId = builder.assetNetworkDomainId;
            this.assetOs = builder.assetOs;
            this.assetSource = builder.assetSource;
            this.assetSourceInstanceId = builder.assetSourceInstanceId;
            this.createdTime = builder.createdTime;
            this.operationTicketId = builder.operationTicketId;
            this.protocolName = builder.protocolName;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationTickets create() {
            return builder().build();
        }

        /**
         * @return applyUserId
         */
        public String getApplyUserId() {
            return this.applyUserId;
        }

        /**
         * @return applyUsername
         */
        public String getApplyUsername() {
            return this.applyUsername;
        }

        /**
         * @return assetAccountId
         */
        public String getAssetAccountId() {
            return this.assetAccountId;
        }

        /**
         * @return assetAccountName
         */
        public String getAssetAccountName() {
            return this.assetAccountName;
        }

        /**
         * @return assetAddress
         */
        public String getAssetAddress() {
            return this.assetAddress;
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return assetNetworkDomainId
         */
        public String getAssetNetworkDomainId() {
            return this.assetNetworkDomainId;
        }

        /**
         * @return assetOs
         */
        public String getAssetOs() {
            return this.assetOs;
        }

        /**
         * @return assetSource
         */
        public String getAssetSource() {
            return this.assetSource;
        }

        /**
         * @return assetSourceInstanceId
         */
        public String getAssetSourceInstanceId() {
            return this.assetSourceInstanceId;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return operationTicketId
         */
        public String getOperationTicketId() {
            return this.operationTicketId;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String applyUserId; 
            private String applyUsername; 
            private String assetAccountId; 
            private String assetAccountName; 
            private String assetAddress; 
            private String assetId; 
            private String assetName; 
            private String assetNetworkDomainId; 
            private String assetOs; 
            private String assetSource; 
            private String assetSourceInstanceId; 
            private Long createdTime; 
            private String operationTicketId; 
            private String protocolName; 
            private String state; 

            /**
             * ApplyUserId.
             */
            public Builder applyUserId(String applyUserId) {
                this.applyUserId = applyUserId;
                return this;
            }

            /**
             * ApplyUsername.
             */
            public Builder applyUsername(String applyUsername) {
                this.applyUsername = applyUsername;
                return this;
            }

            /**
             * AssetAccountId.
             */
            public Builder assetAccountId(String assetAccountId) {
                this.assetAccountId = assetAccountId;
                return this;
            }

            /**
             * AssetAccountName.
             */
            public Builder assetAccountName(String assetAccountName) {
                this.assetAccountName = assetAccountName;
                return this;
            }

            /**
             * AssetAddress.
             */
            public Builder assetAddress(String assetAddress) {
                this.assetAddress = assetAddress;
                return this;
            }

            /**
             * AssetId.
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * AssetName.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * AssetNetworkDomainId.
             */
            public Builder assetNetworkDomainId(String assetNetworkDomainId) {
                this.assetNetworkDomainId = assetNetworkDomainId;
                return this;
            }

            /**
             * AssetOs.
             */
            public Builder assetOs(String assetOs) {
                this.assetOs = assetOs;
                return this;
            }

            /**
             * AssetSource.
             */
            public Builder assetSource(String assetSource) {
                this.assetSource = assetSource;
                return this;
            }

            /**
             * AssetSourceInstanceId.
             */
            public Builder assetSourceInstanceId(String assetSourceInstanceId) {
                this.assetSourceInstanceId = assetSourceInstanceId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * OperationTicketId.
             */
            public Builder operationTicketId(String operationTicketId) {
                this.operationTicketId = operationTicketId;
                return this;
            }

            /**
             * ProtocolName.
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public OperationTickets build() {
                return new OperationTickets(this);
            } 

        } 

    }
}
