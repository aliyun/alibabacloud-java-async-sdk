// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupNotifyPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupNotifyPolicyRequest</p>
 */
public class DeleteMonitorGroupNotifyPolicyRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("PolicyType")
    @Validation(required = true)
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
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the application group.
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
