// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserDocumentRequest} extends {@link RequestModel}
 *
 * <p>QueryUserDocumentRequest</p>
 */
public class QueryUserDocumentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private QueryUserDocumentRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.dataId = builder.dataId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserDocumentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryUserDocumentRequest, Builder> {
        private String agentKey; 
        private String dataId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryUserDocumentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.dataId = request.dataId;
            this.userId = request.userId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryUserDocumentRequest build() {
            return new QueryUserDocumentRequest(this);
        } 

    } 

}
