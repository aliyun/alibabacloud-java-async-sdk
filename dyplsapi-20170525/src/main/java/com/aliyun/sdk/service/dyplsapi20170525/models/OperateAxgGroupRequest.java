// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
         * <p>The group ID in the AXG binding.</p>
         * <p>You can view the group ID by using either of the following methods:</p>
         * <ul>
         * <li>On the <strong>Number Pool Management</strong> page in the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>, filter AXG private numbers and click <strong>Number Group G Management</strong> to view the group IDs of number groups G.****</li>
         * <li>If the <a href="https://help.aliyun.com/document_detail/110250.html">CreateAxgGroup</a> operation is called to create number group G, the value of <strong>GroupId</strong> in the response of the CreateAxgGroup operation is specified as the value of the request parameter <strong>GroupId</strong> of the OperateAxgGroup operation.</li>
         * </ul>
         * <blockquote>
         * <p> Number group G must have one or more phone numbers.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The phone numbers that you add to number group G. Separate the phone numbers with commas (,). You can add up to 200 phone numbers at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****,1380000****</p>
         */
        public Builder numbers(String numbers) {
            this.putQueryParameter("Numbers", numbers);
            this.numbers = numbers;
            return this;
        }

        /**
         * <p>The type of the operation on number group G. Valid values:</p>
         * <ul>
         * <li><strong>addNumbers</strong>: adds phone numbers to number group G.</li>
         * <li><strong>deleteNumbers</strong>: deletes phone numbers from number group G.</li>
         * <li><strong>overwriteNumbers</strong>: replaces all phone numbers in number group G. All the original phone numbers are deleted from number group G, and new phone numbers are added to number group G.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>When you replace all phone numbers in number group G, the quantity of original phone numbers in number group G cannot exceed 200.</p>
         * </li>
         * <li><p>You can add up to 200 phone numbers to number group G at a time.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>addNumbers</p>
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
         * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC123456</p>
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
