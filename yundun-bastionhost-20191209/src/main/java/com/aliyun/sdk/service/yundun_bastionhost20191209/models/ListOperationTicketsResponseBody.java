// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListOperationTicketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationTicketsResponseBody</p>
 */
public class ListOperationTicketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationTickets")
    private java.util.List<OperationTickets> operationTickets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationTickets
     */
    public java.util.List<OperationTickets> getOperationTickets() {
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
        private java.util.List<OperationTickets> operationTickets; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOperationTicketsResponseBody model) {
            this.operationTickets = model.operationTickets;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The O&amp;M applications to be reviewed.</p>
         */
        public Builder operationTickets(java.util.List<OperationTickets> operationTickets) {
            this.operationTickets = operationTickets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of O&amp;M applications to be reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOperationTicketsResponseBody build() {
            return new ListOperationTicketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationTicketsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationTicketsResponseBody</p>
     */
    public static class OperationTickets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyUserId")
        private String applyUserId;

        @com.aliyun.core.annotation.NameInMap("ApplyUsername")
        private String applyUsername;

        @com.aliyun.core.annotation.NameInMap("ApproveComment")
        private String approveComment;

        @com.aliyun.core.annotation.NameInMap("AssetAccountId")
        private String assetAccountId;

        @com.aliyun.core.annotation.NameInMap("AssetAccountName")
        private String assetAccountName;

        @com.aliyun.core.annotation.NameInMap("AssetAddress")
        private String assetAddress;

        @com.aliyun.core.annotation.NameInMap("AssetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("AssetNetworkDomainId")
        private String assetNetworkDomainId;

        @com.aliyun.core.annotation.NameInMap("AssetOs")
        private String assetOs;

        @com.aliyun.core.annotation.NameInMap("AssetSource")
        private String assetSource;

        @com.aliyun.core.annotation.NameInMap("AssetSourceInstanceId")
        private String assetSourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("EffectCount")
        private Integer effectCount;

        @com.aliyun.core.annotation.NameInMap("EffectEndTime")
        private Integer effectEndTime;

        @com.aliyun.core.annotation.NameInMap("EffectStartTime")
        private Integer effectStartTime;

        @com.aliyun.core.annotation.NameInMap("OperationTicketId")
        private String operationTicketId;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private OperationTickets(Builder builder) {
            this.applyUserId = builder.applyUserId;
            this.applyUsername = builder.applyUsername;
            this.approveComment = builder.approveComment;
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
            this.effectCount = builder.effectCount;
            this.effectEndTime = builder.effectEndTime;
            this.effectStartTime = builder.effectStartTime;
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
         * @return approveComment
         */
        public String getApproveComment() {
            return this.approveComment;
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
         * @return effectCount
         */
        public Integer getEffectCount() {
            return this.effectCount;
        }

        /**
         * @return effectEndTime
         */
        public Integer getEffectEndTime() {
            return this.effectEndTime;
        }

        /**
         * @return effectStartTime
         */
        public Integer getEffectStartTime() {
            return this.effectStartTime;
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
            private String approveComment; 
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
            private Integer effectCount; 
            private Integer effectEndTime; 
            private Integer effectStartTime; 
            private String operationTicketId; 
            private String protocolName; 
            private String state; 

            private Builder() {
            } 

            private Builder(OperationTickets model) {
                this.applyUserId = model.applyUserId;
                this.applyUsername = model.applyUsername;
                this.approveComment = model.approveComment;
                this.assetAccountId = model.assetAccountId;
                this.assetAccountName = model.assetAccountName;
                this.assetAddress = model.assetAddress;
                this.assetId = model.assetId;
                this.assetName = model.assetName;
                this.assetNetworkDomainId = model.assetNetworkDomainId;
                this.assetOs = model.assetOs;
                this.assetSource = model.assetSource;
                this.assetSourceInstanceId = model.assetSourceInstanceId;
                this.createdTime = model.createdTime;
                this.effectCount = model.effectCount;
                this.effectEndTime = model.effectEndTime;
                this.effectStartTime = model.effectStartTime;
                this.operationTicketId = model.operationTicketId;
                this.protocolName = model.protocolName;
                this.state = model.state;
            } 

            /**
             * <p>The ID of the O&amp;M applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder applyUserId(String applyUserId) {
                this.applyUserId = applyUserId;
                return this;
            }

            /**
             * <p>The username of the O&amp;M applicant.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder applyUsername(String applyUsername) {
                this.applyUsername = applyUsername;
                return this;
            }

            /**
             * <p>The remarks entered when the O&amp;M personnel applies for O&amp;M permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>Apply for O&amp;M</p>
             */
            public Builder approveComment(String approveComment) {
                this.approveComment = approveComment;
                return this;
            }

            /**
             * <p>The ID of the asset account.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assetAccountId(String assetAccountId) {
                this.assetAccountId = assetAccountId;
                return this;
            }

            /**
             * <p>The username of the asset account.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder assetAccountName(String assetAccountName) {
                this.assetAccountName = assetAccountName;
                return this;
            }

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>10.167.XX.XX</p>
             */
            public Builder assetAddress(String assetAddress) {
                this.assetAddress = assetAddress;
                return this;
            }

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>poros-test</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The network domain ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder assetNetworkDomainId(String assetNetworkDomainId) {
                this.assetNetworkDomainId = assetNetworkDomainId;
                return this;
            }

            /**
             * <p>The operating system of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder assetOs(String assetOs) {
                this.assetOs = assetOs;
                return this;
            }

            /**
             * <p>The name of the asset source to which the asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>Local</strong>: an on-premises host.</li>
             * <li><strong>Ecs</strong>: an Elastic Compute Service (ECS) instance.</li>
             * <li><strong>Rds</strong>: an ApsaraDB RDS instance.</li>
             * <li>A third-party asset source.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Local</p>
             */
            public Builder assetSource(String assetSource) {
                this.assetSource = assetSource;
                return this;
            }

            /**
             * <p>The ID of the asset source to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assetSourceInstanceId(String assetSourceInstanceId) {
                this.assetSourceInstanceId = assetSourceInstanceId;
                return this;
            }

            /**
             * <p>The time when the O&amp;M application was submitted. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1669965908</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The maximum number of logons applied by the O&amp;M engineer. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The number of logons is unlimited. The O&amp;M engineer can log on to the specified asset for unlimited times during the validity period.</li>
             * <li><strong>1</strong>: The O&amp;M engineer can log on to the specified asset only once during the validity period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder effectCount(Integer effectCount) {
                this.effectCount = effectCount;
                return this;
            }

            /**
             * <p>The end time of the validity period. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679393152</p>
             */
            public Builder effectEndTime(Integer effectEndTime) {
                this.effectEndTime = effectEndTime;
                return this;
            }

            /**
             * <p>The start time of the validity period. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1685600242</p>
             */
            public Builder effectStartTime(Integer effectStartTime) {
                this.effectStartTime = effectStartTime;
                return this;
            }

            /**
             * <p>The ID of the O&amp;M application to be reviewed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder operationTicketId(String operationTicketId) {
                this.operationTicketId = operationTicketId;
                return this;
            }

            /**
             * <p>The O&amp;M protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>SSH</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            /**
             * <p>The status of the review. Valid value:</p>
             * <ul>
             * <li>Normal: to be reviewed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
