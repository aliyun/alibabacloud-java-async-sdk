// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link ListKnowledgeBaseJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBaseJobsResponseBody</p>
 */
public class ListKnowledgeBaseJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseJobs")
    private java.util.List<KnowledgeBaseJob> knowledgeBaseJobs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListKnowledgeBaseJobsResponseBody(Builder builder) {
        this.knowledgeBaseJobs = builder.knowledgeBaseJobs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseJobs
     */
    public java.util.List<KnowledgeBaseJob> getKnowledgeBaseJobs() {
        return this.knowledgeBaseJobs;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<KnowledgeBaseJob> knowledgeBaseJobs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListKnowledgeBaseJobsResponseBody model) {
            this.knowledgeBaseJobs = model.knowledgeBaseJobs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>知识库任务列表。</p>
         */
        public Builder knowledgeBaseJobs(java.util.List<KnowledgeBaseJob> knowledgeBaseJobs) {
            this.knowledgeBaseJobs = knowledgeBaseJobs;
            return this;
        }

        /**
         * <p>本次请求允许返回的最大记录条数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>返回下一次查询开始的位置。为空表示已经获取了全部数据。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>总记录条数。</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKnowledgeBaseJobsResponseBody build() {
            return new ListKnowledgeBaseJobsResponseBody(this);
        } 

    } 

}
