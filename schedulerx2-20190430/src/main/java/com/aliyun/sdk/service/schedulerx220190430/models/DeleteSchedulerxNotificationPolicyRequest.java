// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link DeleteSchedulerxNotificationPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSchedulerxNotificationPolicyRequest</p>
 */
public class DeleteSchedulerxNotificationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteSchedulerxNotificationPolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSchedulerxNotificationPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteSchedulerxNotificationPolicyRequest, Builder> {
        private String policyName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSchedulerxNotificationPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the notification policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-weekdays</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteSchedulerxNotificationPolicyRequest build() {
            return new DeleteSchedulerxNotificationPolicyRequest(this);
        } 

    } 

}
