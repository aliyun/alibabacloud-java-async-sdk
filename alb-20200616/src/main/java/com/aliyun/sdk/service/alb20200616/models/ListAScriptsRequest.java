// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAScriptsRequest} extends {@link RequestModel}
 *
 * <p>ListAScriptsRequest</p>
 */
public class ListAScriptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScriptIds")
    private java.util.List<String> aScriptIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AScriptNames")
    private java.util.List<String> aScriptNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerIds")
    private java.util.List<String> listenerIds;

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
    public java.util.List<String> getAScriptIds() {
        return this.aScriptIds;
    }

    /**
     * @return aScriptNames
     */
    public java.util.List<String> getAScriptNames() {
        return this.aScriptNames;
    }

    /**
     * @return listenerIds
     */
    public java.util.List<String> getListenerIds() {
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
        private java.util.List<String> aScriptIds; 
        private java.util.List<String> aScriptNames; 
        private java.util.List<String> listenerIds; 
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
         * <p>The AScript rule IDs. You can specify at most 20 IDs in each call.</p>
         */
        public Builder aScriptIds(java.util.List<String> aScriptIds) {
            this.putQueryParameter("AScriptIds", aScriptIds);
            this.aScriptIds = aScriptIds;
            return this;
        }

        /**
         * <p>The AScript rule names. You can specify at most 10 names in each call.</p>
         */
        public Builder aScriptNames(java.util.List<String> aScriptNames) {
            this.putQueryParameter("AScriptNames", aScriptNames);
            this.aScriptNames = aScriptNames;
            return this;
        }

        /**
         * <p>The listener IDs. You can specify at most 20 listener IDs in each call.</p>
         */
        public Builder listenerIds(java.util.List<String> listenerIds) {
            this.putQueryParameter("ListenerIds", listenerIds);
            this.listenerIds = listenerIds;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <p>Default value: <strong>20</strong>. If you do not specify this parameter, the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.****</li>
         * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
