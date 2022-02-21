// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBNodesRequest} extends {@link RequestModel}
 *
 * <p>CreateDBNodesRequest</p>
 */
public class CreateDBNodesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBNode")
    @Validation(required = true)
    private java.util.List < DBNode> DBNode;

    @Query
    @NameInMap("EndpointBindList")
    private String endpointBindList;

    @Query
    @NameInMap("ImciSwitch")
    private String imciSwitch;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlannedEndTime")
    private String plannedEndTime;

    @Query
    @NameInMap("PlannedStartTime")
    private String plannedStartTime;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDBNodesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.DBNode = builder.DBNode;
        this.endpointBindList = builder.endpointBindList;
        this.imciSwitch = builder.imciSwitch;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public java.util.List < DBNode> getDBNode() {
        return this.DBNode;
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
        private String clientToken; 
        private String DBClusterId; 
        private java.util.List < DBNode> DBNode; 
        private String endpointBindList; 
        private String imciSwitch; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBNodesRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBClusterId = response.DBClusterId;
            this.DBNode = response.DBNode;
            this.endpointBindList = response.endpointBindList;
            this.imciSwitch = response.imciSwitch;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.plannedEndTime = response.plannedEndTime;
            this.plannedStartTime = response.plannedStartTime;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBNode.
         */
        public Builder DBNode(java.util.List < DBNode> DBNode) {
            this.putQueryParameter("DBNode", DBNode);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * EndpointBindList.
         */
        public Builder endpointBindList(String endpointBindList) {
            this.putQueryParameter("EndpointBindList", endpointBindList);
            this.endpointBindList = endpointBindList;
            return this;
        }

        /**
         * ImciSwitch.
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
         * PlannedEndTime.
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * PlannedStartTime.
         */
        public Builder plannedStartTime(String plannedStartTime) {
            this.putQueryParameter("PlannedStartTime", plannedStartTime);
            this.plannedStartTime = plannedStartTime;
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

    public static class DBNode extends TeaModel {
        @NameInMap("TargetClass")
        private String targetClass;

        @NameInMap("ZoneId")
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

            /**
             * TargetClass.
             */
            public Builder targetClass(String targetClass) {
                this.targetClass = targetClass;
                return this;
            }

            /**
             * ZoneId.
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
