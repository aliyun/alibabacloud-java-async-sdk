// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListRulesRequest} extends {@link RequestModel}
 *
 * <p>ListRulesRequest</p>
 */
public class ListRulesRequest extends Request {
    @Query
    @NameInMap("EventBusName")
    @Validation(required = true)
    private String eventBusName;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RuleNamePrefix")
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
         * The name of the event bus.
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * The maximum number of entries to be returned in a single call. You can use this parameter and the NextToken parameter to implement paging. A maximum of 100 entries can be returned in a single call.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * If you set the Limit parameter and excess return values exist, this parameter is returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The prefix of the rule name.
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
