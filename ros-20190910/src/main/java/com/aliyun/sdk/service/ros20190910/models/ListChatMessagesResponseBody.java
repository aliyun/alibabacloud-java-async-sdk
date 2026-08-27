// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ListChatMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatMessagesResponseBody</p>
 */
public class ListChatMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<java.util.Map<String, ?>> messages;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PipelineSnapshotDownloadUrl")
    private String pipelineSnapshotDownloadUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionMessagesDownloadUrl")
    private String sessionMessagesDownloadUrl;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private ListChatMessagesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.messages = builder.messages;
        this.nextToken = builder.nextToken;
        this.pipelineSnapshotDownloadUrl = builder.pipelineSnapshotDownloadUrl;
        this.requestId = builder.requestId;
        this.sessionMessagesDownloadUrl = builder.sessionMessagesDownloadUrl;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatMessagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return messages
     */
    public java.util.List<java.util.Map<String, ?>> getMessages() {
        return this.messages;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pipelineSnapshotDownloadUrl
     */
    public String getPipelineSnapshotDownloadUrl() {
        return this.pipelineSnapshotDownloadUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionMessagesDownloadUrl
     */
    public String getSessionMessagesDownloadUrl() {
        return this.sessionMessagesDownloadUrl;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private Integer maxResults; 
        private java.util.List<java.util.Map<String, ?>> messages; 
        private String nextToken; 
        private String pipelineSnapshotDownloadUrl; 
        private String requestId; 
        private String sessionMessagesDownloadUrl; 
        private String title; 

        private Builder() {
        } 

        private Builder(ListChatMessagesResponseBody model) {
            this.maxResults = model.maxResults;
            this.messages = model.messages;
            this.nextToken = model.nextToken;
            this.pipelineSnapshotDownloadUrl = model.pipelineSnapshotDownloadUrl;
            this.requestId = model.requestId;
            this.sessionMessagesDownloadUrl = model.sessionMessagesDownloadUrl;
            this.title = model.title;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(java.util.List<java.util.Map<String, ?>> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PipelineSnapshotDownloadUrl.
         */
        public Builder pipelineSnapshotDownloadUrl(String pipelineSnapshotDownloadUrl) {
            this.pipelineSnapshotDownloadUrl = pipelineSnapshotDownloadUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SessionMessagesDownloadUrl.
         */
        public Builder sessionMessagesDownloadUrl(String sessionMessagesDownloadUrl) {
            this.sessionMessagesDownloadUrl = sessionMessagesDownloadUrl;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public ListChatMessagesResponseBody build() {
            return new ListChatMessagesResponseBody(this);
        } 

    } 

}
