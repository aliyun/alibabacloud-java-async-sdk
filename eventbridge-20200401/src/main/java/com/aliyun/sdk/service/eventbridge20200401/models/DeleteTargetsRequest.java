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
 * {@link DeleteTargetsRequest} extends {@link RequestModel}
 *
 * <p>DeleteTargetsRequest</p>
 */
public class DeleteTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIds")
    private java.util.List<String> targetIds;

    private DeleteTargetsRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.ruleName = builder.ruleName;
        this.targetIds = builder.targetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTargetsRequest create() {
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

    /**
     * @return targetIds
     */
    public java.util.List<String> getTargetIds() {
        return this.targetIds;
    }

    public static final class Builder extends Request.Builder<DeleteTargetsRequest, Builder> {
        private String eventBusName; 
        private String ruleName; 
        private java.util.List<String> targetIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTargetsRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.ruleName = request.ruleName;
            this.targetIds = request.targetIds;
        } 

        /**
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyEventBus</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The name of the event rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ramrolechange-mns</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The IDs of the event targets that you want to delete.</p>
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            String targetIdsShrink = shrink(targetIds, "TargetIds", "json");
            this.putQueryParameter("TargetIds", targetIdsShrink);
            this.targetIds = targetIds;
            return this;
        }

        @Override
        public DeleteTargetsRequest build() {
            return new DeleteTargetsRequest(this);
        } 

    } 

}
