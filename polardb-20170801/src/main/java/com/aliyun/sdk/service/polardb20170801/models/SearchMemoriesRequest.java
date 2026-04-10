// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link SearchMemoriesRequest} extends {@link RequestModel}
 *
 * <p>SearchMemoriesRequest</p>
 */
public class SearchMemoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeBegin")
    private String createTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryAgentId")
    private String memoryAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private String topK;

    private SearchMemoriesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.createTimeBegin = builder.createTimeBegin;
        this.createTimeEnd = builder.createTimeEnd;
        this.memoryAgentId = builder.memoryAgentId;
        this.memoryUserId = builder.memoryUserId;
        this.query = builder.query;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMemoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return createTimeBegin
     */
    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return memoryAgentId
     */
    public String getMemoryAgentId() {
        return this.memoryAgentId;
    }

    /**
     * @return memoryUserId
     */
    public String getMemoryUserId() {
        return this.memoryUserId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return topK
     */
    public String getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<SearchMemoriesRequest, Builder> {
        private String applicationId; 
        private String createTimeBegin; 
        private String createTimeEnd; 
        private String memoryAgentId; 
        private String memoryUserId; 
        private String query; 
        private String topK; 

        private Builder() {
            super();
        } 

        private Builder(SearchMemoriesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.createTimeBegin = request.createTimeBegin;
            this.createTimeEnd = request.createTimeEnd;
            this.memoryAgentId = request.memoryAgentId;
            this.memoryUserId = request.memoryUserId;
            this.query = request.query;
            this.topK = request.topK;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * CreateTimeBegin.
         */
        public Builder createTimeBegin(String createTimeBegin) {
            this.putQueryParameter("CreateTimeBegin", createTimeBegin);
            this.createTimeBegin = createTimeBegin;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putQueryParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * MemoryAgentId.
         */
        public Builder memoryAgentId(String memoryAgentId) {
            this.putQueryParameter("MemoryAgentId", memoryAgentId);
            this.memoryAgentId = memoryAgentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        public Builder memoryUserId(String memoryUserId) {
            this.putQueryParameter("MemoryUserId", memoryUserId);
            this.memoryUserId = memoryUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>who are you</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(String topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public SearchMemoriesRequest build() {
            return new SearchMemoriesRequest(this);
        } 

    } 

}
