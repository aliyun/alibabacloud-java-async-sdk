// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateAxgGroupRequest} extends {@link RequestModel}
 *
 * <p>OperateAxgGroupRequest</p>
 */
public class OperateAxgGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Numbers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String numbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private OperateAxgGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.numbers = builder.numbers;
        this.operateType = builder.operateType;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAxgGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return numbers
     */
    public String getNumbers() {
        return this.numbers;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
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

    public static final class Builder extends Request.Builder<OperateAxgGroupRequest, Builder> {
        private Long groupId; 
        private String numbers; 
        private String operateType; 
        private Long ownerId; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(OperateAxgGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.numbers = request.numbers;
            this.operateType = request.operateType;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The group ID in the AXG binding.
         * <p>
         * 
         * You can view the group ID by using either of the following methods:
         * 
         * *   On the **Number Pool Management** page in the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account), filter AXG private numbers and click **Number Group G Management** to view the group IDs of number groups G.****
         * *   If the [CreateAxgGroup](~~110250~~) operation is called to create number group G, the value of **GroupId** in the response of the CreateAxgGroup operation is specified as the value of the request parameter **GroupId** of the OperateAxgGroup operation.
         * 
         * >  Number group G must have one or more phone numbers.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The phone numbers that you add to number group G. Separate the phone numbers with commas (,). You can add up to 200 phone numbers at a time.
         */
        public Builder numbers(String numbers) {
            this.putQueryParameter("Numbers", numbers);
            this.numbers = numbers;
            return this;
        }

        /**
         * The type of the operation on number group G. Valid values:
         * <p>
         * 
         * *   **addNumbers**: adds phone numbers to number group G.
         * *   **deleteNumbers**: deletes phone numbers from number group G.
         * *   **overwriteNumbers**: replaces all phone numbers in number group G. All the original phone numbers are deleted from number group G, and new phone numbers are added to number group G.
         * 
         * > 
         * 
         * *   When you replace all phone numbers in number group G, the quantity of original phone numbers in number group G cannot exceed 200.
         * 
         * *   You can add up to 200 phone numbers to number group G at a time.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
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
         * The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
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
        public OperateAxgGroupRequest build() {
            return new OperateAxgGroupRequest(this);
        } 

    } 

}
