// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link DisableRuleRequest} extends {@link RequestModel}
 *
 * <p>DisableRuleRequest</p>
 */
public class DisableRuleRequest extends Request {
    @Query
    @NameInMap("EventBusName")
    @Validation(required = true)
    private String eventBusName;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    private DisableRuleRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DisableRuleRequest, Builder> {
        private String eventBusName; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DisableRuleRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.ruleName = request.ruleName;
        } 

        /**
         * The name of the event bus.
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * The name of the event rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DisableRuleRequest build() {
            return new DisableRuleRequest(this);
        } 

    } 

}
