// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link AddAccountRelationRequest} extends {@link RequestModel}
 *
 * <p>AddAccountRelationRequest</p>
 */
public class AddAccountRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildNick")
    private String childNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long childUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long parentUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermissionCodes")
    private java.util.List<String> permissionCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleCodes")
    private java.util.List<String> roleCodes;

    private AddAccountRelationRequest(Builder builder) {
        super(builder);
        this.childNick = builder.childNick;
        this.childUserId = builder.childUserId;
        this.parentUserId = builder.parentUserId;
        this.permissionCodes = builder.permissionCodes;
        this.relationType = builder.relationType;
        this.requestId = builder.requestId;
        this.roleCodes = builder.roleCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAccountRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childNick
     */
    public String getChildNick() {
        return this.childNick;
    }

    /**
     * @return childUserId
     */
    public Long getChildUserId() {
        return this.childUserId;
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
    public java.util.List<String> getPermissionCodes() {
        return this.permissionCodes;
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

    /**
     * @return roleCodes
     */
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    public static final class Builder extends Request.Builder<AddAccountRelationRequest, Builder> {
        private String childNick; 
        private Long childUserId; 
        private Long parentUserId; 
        private java.util.List<String> permissionCodes; 
        private String relationType; 
        private String requestId; 
        private java.util.List<String> roleCodes; 

        private Builder() {
            super();
        } 

        private Builder(AddAccountRelationRequest request) {
            super(request);
            this.childNick = request.childNick;
            this.childUserId = request.childUserId;
            this.parentUserId = request.parentUserId;
            this.permissionCodes = request.permissionCodes;
            this.relationType = request.relationType;
            this.requestId = request.requestId;
            this.roleCodes = request.roleCodes;
        } 

        /**
         * <p>The display name of the member. This helps clarify the scenario in which the account is used.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx project</p>
         */
        public Builder childNick(String childNick) {
            this.putQueryParameter("ChildNick", childNick);
            this.childNick = childNick;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is used as the member.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the Alibaba Cloud account that is used as the management account.</p>
         * <p>This parameter is required.</p>
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
         * <p>The params[PermissionCodes, RoleCodes] can not be null at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_TARGET_CONSUMPTION</p>
         */
        public Builder permissionCodes(java.util.List<String> permissionCodes) {
            this.putQueryParameter("PermissionCodes", permissionCodes);
            this.permissionCodes = permissionCodes;
            return this;
        }

        /**
         * <p>The type of the financial relationship. Set the value to enterprise_group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise_group</p>
         */
        public Builder relationType(String relationType) {
            this.putQueryParameter("RelationType", relationType);
            this.relationType = relationType;
            return this;
        }

        /**
         * <p>The unique ID of the request. The ID is used to mark a request and troubleshoot a problem.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32324242444</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The roles that can be assigned to the member. Set the value to trusteeship.</p>
         * 
         * <strong>example:</strong>
         * <p>trusteeship</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            this.putQueryParameter("RoleCodes", roleCodes);
            this.roleCodes = roleCodes;
            return this;
        }

        @Override
        public AddAccountRelationRequest build() {
            return new AddAccountRelationRequest(this);
        } 

    } 

}
