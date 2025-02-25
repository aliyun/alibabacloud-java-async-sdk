// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListTargetsRequest} extends {@link RequestModel}
 *
 * <p>ListTargetsRequest</p>
 */
public class ListTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    private ListTargetsRequest(Builder builder) {
        super(builder);
        this.arn = builder.arn;
        this.eventBusName = builder.eventBusName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTargetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
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
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<ListTargetsRequest, Builder> {
        private String arn; 
        private String eventBusName; 
        private Integer limit; 
        private String nextToken; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(ListTargetsRequest request) {
            super(request);
            this.arn = request.arn;
            this.eventBusName = request.eventBusName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.ruleName = request.ruleName;
        } 

        /**
         * The Alibaba Cloud Resource Name (ARN) of the event rule.
         */
        public Builder arn(String arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
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
         * The maximum number of returned entries in a call.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * If you configure Limit and excess return values exist, this parameter is returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
        public ListTargetsRequest build() {
            return new ListTargetsRequest(this);
        } 

    } 

}
