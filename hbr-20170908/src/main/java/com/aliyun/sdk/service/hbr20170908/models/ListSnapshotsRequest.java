// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link ListSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>ListSnapshotsRequest</p>
 */
public class ListSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompleteTimeEnd")
    private Long completeTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompleteTimeStart")
    private Long completeTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectedResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protectedResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    private ListSnapshotsRequest(Builder builder) {
        super(builder);
        this.completeTimeEnd = builder.completeTimeEnd;
        this.completeTimeStart = builder.completeTimeStart;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.planId = builder.planId;
        this.protectedResourceId = builder.protectedResourceId;
        this.skip = builder.skip;
        this.sourceType = builder.sourceType;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completeTimeEnd
     */
    public Long getCompleteTimeEnd() {
        return this.completeTimeEnd;
    }

    /**
     * @return completeTimeStart
     */
    public Long getCompleteTimeStart() {
        return this.completeTimeStart;
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
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return protectedResourceId
     */
    public String getProtectedResourceId() {
        return this.protectedResourceId;
    }

    /**
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<ListSnapshotsRequest, Builder> {
        private Long completeTimeEnd; 
        private Long completeTimeStart; 
        private Integer maxResults; 
        private String nextToken; 
        private String planId; 
        private String protectedResourceId; 
        private Integer skip; 
        private String sourceType; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(ListSnapshotsRequest request) {
            super(request);
            this.completeTimeEnd = request.completeTimeEnd;
            this.completeTimeStart = request.completeTimeStart;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.planId = request.planId;
            this.protectedResourceId = request.protectedResourceId;
            this.skip = request.skip;
            this.sourceType = request.sourceType;
            this.vaultId = request.vaultId;
        } 

        /**
         * CompleteTimeEnd.
         */
        public Builder completeTimeEnd(Long completeTimeEnd) {
            this.putQueryParameter("CompleteTimeEnd", completeTimeEnd);
            this.completeTimeEnd = completeTimeEnd;
            return this;
        }

        /**
         * CompleteTimeStart.
         */
        public Builder completeTimeStart(Long completeTimeStart) {
            this.putQueryParameter("CompleteTimeStart", completeTimeStart);
            this.completeTimeStart = completeTimeStart;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pr-123***7890</p>
         */
        public Builder protectedResourceId(String protectedResourceId) {
            this.putQueryParameter("ProtectedResourceId", protectedResourceId);
            this.protectedResourceId = protectedResourceId;
            return this;
        }

        /**
         * Skip.
         */
        public Builder skip(Integer skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * VaultId.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public ListSnapshotsRequest build() {
            return new ListSnapshotsRequest(this);
        } 

    } 

}
