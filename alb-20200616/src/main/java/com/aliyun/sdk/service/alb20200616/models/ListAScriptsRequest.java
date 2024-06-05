// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAScriptsRequest} extends {@link RequestModel}
 *
 * <p>ListAScriptsRequest</p>
 */
public class ListAScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScriptIds")
    private java.util.List < String > aScriptIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScriptNames")
    private java.util.List < String > aScriptNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerIds")
    private java.util.List < String > listenerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListAScriptsRequest(Builder builder) {
        super(builder);
        this.aScriptIds = builder.aScriptIds;
        this.aScriptNames = builder.aScriptNames;
        this.listenerIds = builder.listenerIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAScriptsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aScriptIds
     */
    public java.util.List < String > getAScriptIds() {
        return this.aScriptIds;
    }

    /**
     * @return aScriptNames
     */
    public java.util.List < String > getAScriptNames() {
        return this.aScriptNames;
    }

    /**
     * @return listenerIds
     */
    public java.util.List < String > getListenerIds() {
        return this.listenerIds;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListAScriptsRequest, Builder> {
        private java.util.List < String > aScriptIds; 
        private java.util.List < String > aScriptNames; 
        private java.util.List < String > listenerIds; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListAScriptsRequest request) {
            super(request);
            this.aScriptIds = request.aScriptIds;
            this.aScriptNames = request.aScriptNames;
            this.listenerIds = request.listenerIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * The AScript rule IDs.
         */
        public Builder aScriptIds(java.util.List < String > aScriptIds) {
            this.putQueryParameter("AScriptIds", aScriptIds);
            this.aScriptIds = aScriptIds;
            return this;
        }

        /**
         * The names of the AScript rules.
         */
        public Builder aScriptNames(java.util.List < String > aScriptNames) {
            this.putQueryParameter("AScriptNames", aScriptNames);
            this.aScriptNames = aScriptNames;
            return this;
        }

        /**
         * The listener IDs.
         */
        public Builder listenerIds(java.util.List < String > listenerIds) {
            this.putQueryParameter("ListenerIds", listenerIds);
            this.listenerIds = listenerIds;
            return this;
        }

        /**
         * The maximum number of entries to return.
         * <p>
         * 
         * Valid values: **1** to **100**.
         * 
         * Default value: **20**. If you do not specify this parameter, the default value is used.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.****
         * *   You must specify the token that is obtained from the previous query as the value of **NextToken**.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListAScriptsRequest build() {
            return new ListAScriptsRequest(this);
        } 

    } 

}
