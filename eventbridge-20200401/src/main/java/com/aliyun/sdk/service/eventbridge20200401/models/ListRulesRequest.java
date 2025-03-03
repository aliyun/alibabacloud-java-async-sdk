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
 * {@link ListRulesRequest} extends {@link RequestModel}
 *
 * <p>ListRulesRequest</p>
 */
public class ListRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleNamePrefix")
    private String ruleNamePrefix;

    private ListRulesRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.ruleNamePrefix = builder.ruleNamePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRulesRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ruleNamePrefix
     */
    public String getRuleNamePrefix() {
        return this.ruleNamePrefix;
    }

    public static final class Builder extends Request.Builder<ListRulesRequest, Builder> {
        private String eventBusName; 
        private Integer limit; 
        private String nextToken; 
        private String ruleNamePrefix; 

        private Builder() {
            super();
        } 

        private Builder(ListRulesRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.ruleNamePrefix = request.ruleNamePrefix;
        } 

        /**
         * <p>The name of the event bus.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The maximum number of entries to be returned in a single call. You can use this parameter and the NextToken parameter to implement paging. A maximum of 100 entries can be returned in a single call.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>If you set the Limit parameter and excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The prefix of the rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ruleNamePrefix(String ruleNamePrefix) {
            this.putQueryParameter("RuleNamePrefix", ruleNamePrefix);
            this.ruleNamePrefix = ruleNamePrefix;
            return this;
        }

        @Override
        public ListRulesRequest build() {
            return new ListRulesRequest(this);
        } 

    } 

}
