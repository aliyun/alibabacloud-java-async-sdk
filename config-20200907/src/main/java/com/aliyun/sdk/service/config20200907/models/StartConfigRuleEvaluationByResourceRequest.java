// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link StartConfigRuleEvaluationByResourceRequest} extends {@link RequestModel}
 *
 * <p>StartConfigRuleEvaluationByResourceRequest</p>
 */
public class StartConfigRuleEvaluationByResourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    private StartConfigRuleEvaluationByResourceRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartConfigRuleEvaluationByResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<StartConfigRuleEvaluationByResourceRequest, Builder> {
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(StartConfigRuleEvaluationByResourceRequest request) {
            super(request);
            this.resourceId = request.resourceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp151g9tpto890zr****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public StartConfigRuleEvaluationByResourceRequest build() {
            return new StartConfigRuleEvaluationByResourceRequest(this);
        } 

    } 

}
