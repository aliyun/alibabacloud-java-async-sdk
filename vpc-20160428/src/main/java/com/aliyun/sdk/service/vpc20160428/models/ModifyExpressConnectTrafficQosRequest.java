// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ModifyExpressConnectTrafficQosRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectTrafficQosRequest</p>
 */
public class ModifyExpressConnectTrafficQosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddInstanceList")
    private java.util.List<AddInstanceList> addInstanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosDescription")
    private String qosDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosName")
    private String qosName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveInstanceList")
    private java.util.List<RemoveInstanceList> removeInstanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
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
    public java.util.List<AddInstanceList> getAddInstanceList() {
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
    public java.util.List<RemoveInstanceList> getRemoveInstanceList() {
        return this.removeInstanceList;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<ModifyExpressConnectTrafficQosRequest, Builder> {
        private java.util.List<AddInstanceList> addInstanceList; 
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String qosDescription; 
        private String qosId; 
        private String qosName; 
        private String regionId; 
        private java.util.List<RemoveInstanceList> removeInstanceList; 
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
         * <p>The instances to be added. Ignore this parameter if no instances are to be added.</p>
         */
        public Builder addInstanceList(java.util.List<AddInstanceList> addInstanceList) {
            this.putQueryParameter("AddInstanceList", addInstanceList);
            this.addInstanceList = addInstanceList;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
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
         * <p>The description of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-test</p>
         */
        public Builder qosDescription(String qosDescription) {
            this.putQueryParameter("QosDescription", qosDescription);
            this.qosDescription = qosDescription;
            return this;
        }

        /**
         * <p>The ID of the QoS policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-2giu0a6vd5x0mv4700</p>
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The name of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-test</p>
         */
        public Builder qosName(String qosName) {
            this.putQueryParameter("QosName", qosName);
            this.qosName = qosName;
            return this;
        }

        /**
         * <p>The region ID of the resource.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instances to be removed. Ignore this parameter if no instances are to be removed.</p>
         */
        public Builder removeInstanceList(java.util.List<RemoveInstanceList> removeInstanceList) {
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

    /**
     * 
     * {@link ModifyExpressConnectTrafficQosRequest} extends {@link TeaModel}
     *
     * <p>ModifyExpressConnectTrafficQosRequest</p>
     */
    public static class AddInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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
             * <p>The ID of the instance to be associated.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp159zj8zujwy3p07****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of instance to be associated. Set the value to <strong>PHYSICALCONNECTION</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICALCONNECTION</p>
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
    /**
     * 
     * {@link ModifyExpressConnectTrafficQosRequest} extends {@link TeaModel}
     *
     * <p>ModifyExpressConnectTrafficQosRequest</p>
     */
    public static class RemoveInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
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
             * <p>The ID of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp1j37am632492qzw****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the associated instance. Set the value to <strong>PHYSICALCONNECTION</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICALCONNECTION</p>
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
