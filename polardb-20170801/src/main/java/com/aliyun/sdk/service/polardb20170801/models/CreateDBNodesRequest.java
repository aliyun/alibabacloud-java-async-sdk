// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateDBNodesRequest} extends {@link RequestModel}
 *
 * <p>CreateDBNodesRequest</p>
 */
public class CreateDBNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProvider")
    private String cloudProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNode")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DBNode> DBNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeType")
    private String DBNodeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointBindList")
    private String endpointBindList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImciSwitch")
    private String imciSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedEndTime")
    private String plannedEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedStartTime")
    private String plannedStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDBNodesRequest(Builder builder) {
        super(builder);
        this.autoUseCoupon = builder.autoUseCoupon;
        this.clientToken = builder.clientToken;
        this.cloudProvider = builder.cloudProvider;
        this.DBClusterId = builder.DBClusterId;
        this.DBNode = builder.DBNode;
        this.DBNodeType = builder.DBNodeType;
        this.endpointBindList = builder.endpointBindList;
        this.imciSwitch = builder.imciSwitch;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.promotionCode = builder.promotionCode;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloudProvider
     */
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNode
     */
    public java.util.List<DBNode> getDBNode() {
        return this.DBNode;
    }

    /**
     * @return DBNodeType
     */
    public String getDBNodeType() {
        return this.DBNodeType;
    }

    /**
     * @return endpointBindList
     */
    public String getEndpointBindList() {
        return this.endpointBindList;
    }

    /**
     * @return imciSwitch
     */
    public String getImciSwitch() {
        return this.imciSwitch;
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
     * @return plannedEndTime
     */
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    /**
     * @return plannedStartTime
     */
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    /**
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<CreateDBNodesRequest, Builder> {
        private Boolean autoUseCoupon; 
        private String clientToken; 
        private String cloudProvider; 
        private String DBClusterId; 
        private java.util.List<DBNode> DBNode; 
        private String DBNodeType; 
        private String endpointBindList; 
        private String imciSwitch; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String promotionCode; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBNodesRequest request) {
            super(request);
            this.autoUseCoupon = request.autoUseCoupon;
            this.clientToken = request.clientToken;
            this.cloudProvider = request.cloudProvider;
            this.DBClusterId = request.DBClusterId;
            this.DBNode = request.DBNode;
            this.DBNodeType = request.DBNodeType;
            this.endpointBindList = request.endpointBindList;
            this.imciSwitch = request.imciSwitch;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.promotionCode = request.promotionCode;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li>true (default): Use coupons.</li>
         * <li>false: Do not use coupons.</li>
         * </ul>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and can contain only ASCII characters. The token can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The cloud service provider to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ENS</p>
         */
        public Builder cloudProvider(String cloudProvider) {
            this.putQueryParameter("CloudProvider", cloudProvider);
            this.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The information about the new node.</p>
         * <p>This parameter is required.</p>
         */
        public Builder DBNode(java.util.List<DBNode> DBNode) {
            this.putQueryParameter("DBNode", DBNode);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * <p>The node type. Valid values:</p>
         * <ul>
         * <li>RO</li>
         * <li>STANDBY</li>
         * <li>DLNode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RO</p>
         */
        public Builder DBNodeType(String DBNodeType) {
            this.putQueryParameter("DBNodeType", DBNodeType);
            this.DBNodeType = DBNodeType;
            return this;
        }

        /**
         * <p>The ID of the cluster endpoint to which you want to add the new node. If you want to add the node to multiple endpoints, separate the endpoint IDs with commas (,).</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/98205.html">DescribeDBClusterEndpoints</a> operation to query the details of cluster endpoints, including endpoint IDs.</li>
         * <li>You can specify the IDs of the default cluster endpoint and custom cluster endpoints.</li>
         * <li>If you leave this parameter empty, the new node is added to all cluster endpoints that have the <strong>Automatically Associate New Nodes</strong> feature enabled (the value of <code>AutoAddNewNodes</code> is <code>Enable</code>).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pe-<strong><strong><strong><strong><strong><strong><strong><strong>,pe-</strong></strong></strong></strong></strong></strong></strong></strong></p>
         */
        public Builder endpointBindList(String endpointBindList) {
            this.putQueryParameter("EndpointBindList", endpointBindList);
            this.endpointBindList = endpointBindList;
            return this;
        }

        /**
         * <p>Specifies whether to enable In-Memory Column Index (IMCI). Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: enabled.</p>
         * </li>
         * <li><p><strong>OFF</strong>: disabled. This is the default value.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>PolarDB for PostgreSQL (Compatible with Oracle) and PolarDB for PostgreSQL do not support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder imciSwitch(String imciSwitch) {
            this.putQueryParameter("ImciSwitch", imciSwitch);
            this.imciSwitch = imciSwitch;
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
         * <p>The latest time to start running the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>The latest time must be at least 30 minutes later than the start time.</li>
         * <li>If you specify <code>PlannedStartTime</code> but leave this parameter empty, the latest time defaults to <code>start time + 30 minutes</code>. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-14T09:30:00Z</p>
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * <p>The earliest time to start running the scheduled task for adding nodes. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <ul>
         * <li>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a start time within the range of <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
         * <li>If you leave this parameter empty, the task for adding nodes is immediately run.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-14T09:00:00Z</p>
         */
        public Builder plannedStartTime(String plannedStartTime) {
            this.putQueryParameter("PlannedStartTime", plannedStartTime);
            this.plannedStartTime = plannedStartTime;
            return this;
        }

        /**
         * <p>The coupon code. If you do not specify this parameter, the default coupon is used.</p>
         * 
         * <strong>example:</strong>
         * <p>727xxxxxx934</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public CreateDBNodesRequest build() {
            return new CreateDBNodesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBNodesRequest} extends {@link TeaModel}
     *
     * <p>CreateDBNodesRequest</p>
     */
    public static class DBNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetClass")
        private String targetClass;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBNode(Builder builder) {
            this.targetClass = builder.targetClass;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNode create() {
            return builder().build();
        }

        /**
         * @return targetClass
         */
        public String getTargetClass() {
            return this.targetClass;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String targetClass; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBNode model) {
                this.targetClass = model.targetClass;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The specification of the new node. The specification must be the same as that of the existing nodes. For more information, see the following topics:</p>
             * <ul>
             * <li>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>. </li>
             * <li>PolarDB for PostgreSQL (Compatible with Oracle): <a href="https://help.aliyun.com/document_detail/207921.html">Compute node specifications</a>.</li>
             * <li>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Compute node specifications</a>.<blockquote>
             * <ul>
             * <li>You must specify at least one of DBNode.N.ZoneId and DBNode.N.TargetClass. N is an integer that starts from 1. Maximum value of N = 16 - current number of nodes.</li>
             * <li>Only PolarDB for MySQL clusters support adding multiple read-only nodes at a time. You can add up to 15 read-only nodes.</li>
             * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
             * </ul>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.medium</p>
             */
            public Builder targetClass(String targetClass) {
                this.targetClass = targetClass;
                return this;
            }

            /**
             * <p>The zone of the new node. The zone must be the same as that of the existing nodes. You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query zone IDs.</p>
             * <blockquote>
             * <ul>
             * <li>You must specify at least one of DBNode.N.ZoneId and DBNode.N.TargetClass. N is an integer that starts from 1. Maximum value of N = 16 - current number of nodes. </li>
             * <li>Only PolarDB for MySQL clusters support adding multiple read-only nodes at a time. You can add up to 15 read-only nodes.</li>
             * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao-c</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBNode build() {
                return new DBNode(this);
            } 

        } 

    }
}
