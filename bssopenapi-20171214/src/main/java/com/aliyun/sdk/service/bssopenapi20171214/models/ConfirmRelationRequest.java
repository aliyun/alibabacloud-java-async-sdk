// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConfirmRelationRequest} extends {@link RequestModel}
 *
 * <p>ConfirmRelationRequest</p>
 */
public class ConfirmRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildUserId")
    @com.aliyun.core.annotation.Validation()
    private Long childUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfirmCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String confirmCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentUserId")
    @com.aliyun.core.annotation.Validation()
    private Long parentUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionCodes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > permissionCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationId")
    private Long relationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationType")
    private String relationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    private ConfirmRelationRequest(Builder builder) {
        super(builder);
        this.childUserId = builder.childUserId;
        this.confirmCode = builder.confirmCode;
        this.parentUserId = builder.parentUserId;
        this.permissionCodes = builder.permissionCodes;
        this.relationId = builder.relationId;
        this.relationType = builder.relationType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childUserId
     */
    public Long getChildUserId() {
        return this.childUserId;
    }

    /**
     * @return confirmCode
     */
    public String getConfirmCode() {
        return this.confirmCode;
    }

    /**
     * @return parentUserId
     */
    public Long getParentUserId() {
        return this.parentUserId;
    }

    /**
     * @return permissionCodes
     */
    public java.util.List < String > getPermissionCodes() {
        return this.permissionCodes;
    }

    /**
     * @return relationId
     */
    public Long getRelationId() {
        return this.relationId;
    }

    /**
     * @return relationType
     */
    public String getRelationType() {
        return this.relationType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<ConfirmRelationRequest, Builder> {
        private Long childUserId; 
        private String confirmCode; 
        private Long parentUserId; 
        private java.util.List < String > permissionCodes; 
        private Long relationId; 
        private String relationType; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmRelationRequest request) {
            super(request);
            this.childUserId = request.childUserId;
            this.confirmCode = request.confirmCode;
            this.parentUserId = request.parentUserId;
            this.permissionCodes = request.permissionCodes;
            this.relationId = request.relationId;
            this.relationType = request.relationType;
            this.requestId = request.requestId;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account that is used as the member.</p>
         * 
         * <strong>example:</strong>
         * <p>1512996702208737</p>
         */
        public Builder childUserId(Long childUserId) {
            this.putQueryParameter("ChildUserId", childUserId);
            this.childUserId = childUserId;
            return this;
        }

        /**
         * <p>The operation to be performed to confirm the invitation. Valid values:</p>
         * <ul>
         * <li>child_agree: The member accepts the invitation.</li>
         * <li>child_disagree: The member rejects the invitation.</li>
         * <li>Canceled by the master account: The management account cancels the confirmation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>child_agree</p>
         */
        public Builder confirmCode(String confirmCode) {
            this.putQueryParameter("ConfirmCode", confirmCode);
            this.confirmCode = confirmCode;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is used as the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>1738376485192612</p>
         */
        public Builder parentUserId(Long parentUserId) {
            this.putQueryParameter("ParentUserId", parentUserId);
            this.parentUserId = parentUserId;
            return this;
        }

        /**
         * <p>The permissions that can be granted to the member. Valid values:</p>
         * <ul>
         * <li>SYNCHRONIZE_FINANCE_IDENTITY: allows the credit control identity to be shared with the member.</li>
         * <li>SYNCHRONIZE_FINANCE_DISCOUNT_POLICY_TO_TARGET: allows the discount policy to be shared with the member.</li>
         * <li>FORBID_WITHDRAW_CASH: does not allow the member to withdraw the balance.</li>
         * <li>FORBID_MANAGE_INVOICE: does not allow the member to manage invoices.</li>
         * <li>CHECK_FINANCE_INFO: requests to view information about the financial relationship.</li>
         * <li>MANAGE_TARGET_INVOICE: allows the member to manage invoices.</li>
         * <li>CHECK_TARGET_CONSUMPTION: allows the member to view the bills.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNCHRONIZE_FINANCE_IDENTITY</p>
         */
        public Builder permissionCodes(java.util.List < String > permissionCodes) {
            this.putQueryParameter("PermissionCodes", permissionCodes);
            this.permissionCodes = permissionCodes;
            return this;
        }

        /**
         * <p>The ID of the financial relationship. Set this parameter to the value of the RelationId response parameter returned by calling the QueryRelationList operation.</p>
         * 
         * <strong>example:</strong>
         * <p>51463</p>
         */
        public Builder relationId(Long relationId) {
            this.putQueryParameter("RelationId", relationId);
            this.relationId = relationId;
            return this;
        }

        /**
         * <p>The type of the financial relationship. Set the value to enterprise_group.</p>
         * 
         * <strong>example:</strong>
         * <p>Type of the financial relationship</p>
         */
        public Builder relationType(String relationType) {
            this.putQueryParameter("RelationType", relationType);
            this.relationType = relationType;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>request_id</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public ConfirmRelationRequest build() {
            return new ConfirmRelationRequest(this);
        } 

    } 

}
