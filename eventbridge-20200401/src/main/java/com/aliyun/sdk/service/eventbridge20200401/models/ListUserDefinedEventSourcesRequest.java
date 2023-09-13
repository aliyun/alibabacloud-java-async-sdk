// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListUserDefinedEventSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListUserDefinedEventSourcesRequest</p>
 */
public class ListUserDefinedEventSourcesRequest extends Request {
    @Query
    @NameInMap("EventBusName")
    private String eventBusName;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("NamePrefix")
    private String namePrefix;

    @Query
    @NameInMap("NextToken")
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
         * EventBusName.
         */
        public Builder eventBusName(String eventBusName) {
            this.putQueryParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NamePrefix.
         */
        public Builder namePrefix(String namePrefix) {
            this.putQueryParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * NextToken.
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
