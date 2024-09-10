// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventRuleTargetsRequest</p>
 */
public class DeleteEventRuleTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private DeleteEventRuleTargetsRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventRuleTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List < String > getIds() {
        return this.ids;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<DeleteEventRuleTargetsRequest, Builder> {
        private java.util.List < String > ids; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventRuleTargetsRequest request) {
            super(request);
            this.ids = request.ids;
            this.ruleName = request.ruleName;
        } 

        /**
         * The IDs of event-triggered alert rules.
         */
        public Builder ids(java.util.List < String > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * The name of the event-triggered alert rule.
         * <p>
         * 
         * For information about how to obtain the name of an event-triggered alert rule, see [DescribeEventRuleList](~~114996~~).
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public DeleteEventRuleTargetsRequest build() {
            return new DeleteEventRuleTargetsRequest(this);
        } 

    } 

}
