// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The IDs of event-triggered alert rules.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ids(java.util.List < String > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The name of the event-triggered alert rule.</p>
         * <p>For information about how to obtain the name of an event-triggered alert rule, see <a href="https://help.aliyun.com/document_detail/114996.html">DescribeEventRuleList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testRule</p>
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
