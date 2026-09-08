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
 * {@link ListUserDefinedEventSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListUserDefinedEventSourcesRequest</p>
 */
public class ListUserDefinedEventSourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventBusName")
    private String eventBusName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamePrefix")
    private String namePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListUserDefinedEventSourcesRequest(Builder builder) {
        super(builder);
        this.eventBusName = builder.eventBusName;
        this.limit = builder.limit;
        this.namePrefix = builder.namePrefix;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserDefinedEventSourcesRequest create() {
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
     * @return namePrefix
     */
    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListUserDefinedEventSourcesRequest, Builder> {
        private String eventBusName; 
        private Integer limit; 
        private String namePrefix; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListUserDefinedEventSourcesRequest request) {
            super(request);
            this.eventBusName = request.eventBusName;
            this.limit = request.limit;
            this.namePrefix = request.namePrefix;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>testBus</p>
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per request. You can use this parameter with NextToken for pagination. The maximum value is 100.</p>
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
         * <p>The prefix of the event source name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder namePrefix(String namePrefix) {
            this.putQueryParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * <p>The token used to retrieve the next page of results. Set this parameter to the NextToken value returned from a previous call.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListUserDefinedEventSourcesRequest build() {
            return new ListUserDefinedEventSourcesRequest(this);
        } 

    } 

}
