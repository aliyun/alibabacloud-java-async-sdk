// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListCopilotMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListCopilotMessagesRequest</p>
 */
public class ListCopilotMessagesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ascending")
    private Boolean ascending;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListCopilotMessagesRequest(Builder builder) {
        super(builder);
        this.ascending = builder.ascending;
        this.conversationId = builder.conversationId;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCopilotMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ascending
     */
    public Boolean getAscending() {
        return this.ascending;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder extends Request.Builder<ListCopilotMessagesRequest, Builder> {
        private Boolean ascending; 
        private String conversationId; 
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(ListCopilotMessagesRequest request) {
            super(request);
            this.ascending = request.ascending;
            this.conversationId = request.conversationId;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.traceId = request.traceId;
        } 

        /**
         * <p>Used together with the SortingField parameter. A value of <strong>true</strong> specifies ascending order, and a value of <strong>false</strong> specifies descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ascending(Boolean ascending) {
            this.putBodyParameter("Ascending", ascending);
            this.ascending = ascending;
            return this;
        }

        /**
         * <p>The conversation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The language of the returned messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of results to return when you use the NextToken-based pagination method. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position from which you want to start the query. Leave this parameter empty to query from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region where the Cloud Threat Detection and Response (CTDR) data management center resides. Specify the management center based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland or Hong Kong (China).</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The trace ID, which is used to query specific call information.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400e29b41d4a71644665544****</p>
         */
        public Builder traceId(String traceId) {
            this.putBodyParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        @Override
        public ListCopilotMessagesRequest build() {
            return new ListCopilotMessagesRequest(this);
        } 

    } 

}
