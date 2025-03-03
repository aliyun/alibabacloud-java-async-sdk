// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link UpdateRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleRequest</p>
 */
public class UpdateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterPattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateRuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eventBusName = builder.eventBusName;
        this.filterPattern = builder.filterPattern;
        this.ruleName = builder.ruleName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * @return filterPattern
     */
    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateRuleRequest, Builder> {
        private String description; 
        private String eventBusName; 
        private String filterPattern; 
        private String ruleName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleRequest request) {
            super(request);
            this.description = request.description;
            this.eventBusName = request.eventBusName;
            this.filterPattern = request.filterPattern;
            this.ruleName = request.ruleName;
            this.status = request.status;
        } 

        /**
         * <p>The description of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hw-test</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The event pattern, in JSON format. Valid values: stringEqual stringExpression Each field can have a maximum of five expressions in the map data structure.</p>
         * <p>Each field can have a maximum of five expressions in the map data structure.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;source&quot;:[&quot;acs.oss&quot;],&quot;type&quot;:[&quot;oss:BucketQueried:GetBucketStat&quot;]}</p>
         */
        public Builder filterPattern(String filterPattern) {
            this.putQueryParameter("FilterPattern", filterPattern);
            this.filterPattern = filterPattern;
            return this;
        }

        /**
         * <p>The name of the event rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-testacc-rule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The status of the event rule. Valid values: ENABLE: The event rule is enabled. It is the default state of the event rule. DISABLE: The event rule is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateRuleRequest build() {
            return new UpdateRuleRequest(this);
        } 

    } 

}
