// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthorizationRuleRequest</p>
 */
public class UpdateAuthorizationRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerAuthorizationRuleId")
    private String consumerAuthorizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resources")
    private java.util.List<String> resources;

    private UpdateAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.consumerAuthorizationRuleId = builder.consumerAuthorizationRuleId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerAuthorizationRuleId
     */
    public String getConsumerAuthorizationRuleId() {
        return this.consumerAuthorizationRuleId;
    }

    /**
     * @return resources
     */
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<UpdateAuthorizationRuleRequest, Builder> {
        private String consumerAuthorizationRuleId; 
        private java.util.List<String> resources; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthorizationRuleRequest request) {
            super(request);
            this.consumerAuthorizationRuleId = request.consumerAuthorizationRuleId;
            this.resources = request.resources;
        } 

        /**
         * consumerAuthorizationRuleId.
         */
        public Builder consumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.putPathParameter("consumerAuthorizationRuleId", consumerAuthorizationRuleId);
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }

        /**
         * resources.
         */
        public Builder resources(java.util.List<String> resources) {
            this.putBodyParameter("resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public UpdateAuthorizationRuleRequest build() {
            return new UpdateAuthorizationRuleRequest(this);
        } 

    } 

}
