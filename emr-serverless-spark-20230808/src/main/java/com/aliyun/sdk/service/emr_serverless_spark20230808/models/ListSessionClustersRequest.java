// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListSessionClustersRequest} extends {@link RequestModel}
 *
 * <p>ListSessionClustersRequest</p>
 */
public class ListSessionClustersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionClusterId")
    private String sessionClusterId;

    private ListSessionClustersRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.kind = builder.kind;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.queueName = builder.queueName;
        this.regionId = builder.regionId;
        this.sessionClusterId = builder.sessionClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSessionClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
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
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionClusterId
     */
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    public static final class Builder extends Request.Builder<ListSessionClustersRequest, Builder> {
        private String workspaceId; 
        private String kind; 
        private Integer maxResults; 
        private String nextToken; 
        private String queueName; 
        private String regionId; 
        private String sessionClusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListSessionClustersRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.kind = request.kind;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.queueName = request.queueName;
            this.regionId = request.regionId;
            this.sessionClusterId = request.sessionClusterId;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The session type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NOTEBOOK</li>
         * <li>THRIFT</li>
         * <li>SQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL</p>
         */
        public Builder kind(String kind) {
            this.putQueryParameter("kind", kind);
            this.kind = kind;
            return this;
        }

        /**
         * <p>The maximum number of entries to return.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("queueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-demo-job</p>
         */
        public Builder sessionClusterId(String sessionClusterId) {
            this.putQueryParameter("sessionClusterId", sessionClusterId);
            this.sessionClusterId = sessionClusterId;
            return this;
        }

        @Override
        public ListSessionClustersRequest build() {
            return new ListSessionClustersRequest(this);
        } 

    } 

}
