// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyExpressConnectTrafficQosRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectTrafficQosRequest</p>
 */
public class ModifyExpressConnectTrafficQosRequest extends Request {
    @Query
    @NameInMap("AddInstanceList")
    private java.util.List < AddInstanceList> addInstanceList;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QosDescription")
    private String qosDescription;

    @Query
    @NameInMap("QosId")
    @Validation(required = true)
    private String qosId;

    @Query
    @NameInMap("QosName")
    private String qosName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoveInstanceList")
    private java.util.List < RemoveInstanceList> removeInstanceList;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private ModifyExpressConnectTrafficQosRequest(Builder builder) {
        super(builder);
        this.addInstanceList = builder.addInstanceList;
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.qosDescription = builder.qosDescription;
        this.qosId = builder.qosId;
        this.qosName = builder.qosName;
        this.regionId = builder.regionId;
        this.removeInstanceList = builder.removeInstanceList;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressConnectTrafficQosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addInstanceList
     */
    public java.util.List < AddInstanceList> getAddInstanceList() {
        return this.addInstanceList;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return qosDescription
     */
    public String getQosDescription() {
        return this.qosDescription;
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return qosName
     */
    public String getQosName() {
        return this.qosName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return removeInstanceList
     */
    public java.util.List < RemoveInstanceList> getRemoveInstanceList() {
        return this.removeInstanceList;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<ModifyExpressConnectTrafficQosRequest, Builder> {
        private java.util.List < AddInstanceList> addInstanceList; 
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String qosDescription; 
        private String qosId; 
        private String qosName; 
        private String regionId; 
        private java.util.List < RemoveInstanceList> removeInstanceList; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExpressConnectTrafficQosRequest request) {
            super(request);
            this.addInstanceList = request.addInstanceList;
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.qosDescription = request.qosDescription;
            this.qosId = request.qosId;
            this.qosName = request.qosName;
            this.regionId = request.regionId;
            this.removeInstanceList = request.removeInstanceList;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * AddInstanceList.
         */
        public Builder addInstanceList(java.util.List < AddInstanceList> addInstanceList) {
            this.putQueryParameter("AddInstanceList", addInstanceList);
            this.addInstanceList = addInstanceList;
            return this;
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
         * QosDescription.
         */
        public Builder qosDescription(String qosDescription) {
            this.putQueryParameter("QosDescription", qosDescription);
            this.qosDescription = qosDescription;
            return this;
        }

        /**
         * QosId.
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * QosName.
         */
        public Builder qosName(String qosName) {
            this.putQueryParameter("QosName", qosName);
            this.qosName = qosName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemoveInstanceList.
         */
        public Builder removeInstanceList(java.util.List < RemoveInstanceList> removeInstanceList) {
            this.putQueryParameter("RemoveInstanceList", removeInstanceList);
            this.removeInstanceList = removeInstanceList;
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

        @Override
        public ModifyExpressConnectTrafficQosRequest build() {
            return new ModifyExpressConnectTrafficQosRequest(this);
        } 

    } 

    public static class AddInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        private AddInstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddInstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceType; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public AddInstanceList build() {
                return new AddInstanceList(this);
            } 

        } 

    }
    public static class RemoveInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        private RemoveInstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveInstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceType; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public RemoveInstanceList build() {
                return new RemoveInstanceList(this);
            } 

        } 

    }
}
