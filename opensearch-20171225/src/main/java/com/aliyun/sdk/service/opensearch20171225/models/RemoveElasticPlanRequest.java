// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link RemoveElasticPlanRequest} extends {@link RequestModel}
 *
 * <p>RemoveElasticPlanRequest</p>
 */
public class RemoveElasticPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    private Long planId;

    private RemoveElasticPlanRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveElasticPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<RemoveElasticPlanRequest, Builder> {
        private String appGroupIdentity; 
        private Long planId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveElasticPlanRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.planId = request.planId;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(Long planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public RemoveElasticPlanRequest build() {
            return new RemoveElasticPlanRequest(this);
        } 

    } 

}
