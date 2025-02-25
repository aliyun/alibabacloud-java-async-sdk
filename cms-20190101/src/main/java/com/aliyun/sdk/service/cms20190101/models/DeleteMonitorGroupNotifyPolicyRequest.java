// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMonitorGroupNotifyPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupNotifyPolicyRequest</p>
 */
public class DeleteMonitorGroupNotifyPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    private DeleteMonitorGroupNotifyPolicyRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupNotifyPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorGroupNotifyPolicyRequest, Builder> {
        private String groupId; 
        private String policyType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupNotifyPolicyRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.policyType = request.policyType;
        } 

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>6780****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The policy type.</p>
         * <p>Valid value: PauseNotify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PauseNotify</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public DeleteMonitorGroupNotifyPolicyRequest build() {
            return new DeleteMonitorGroupNotifyPolicyRequest(this);
        } 

    } 

}
