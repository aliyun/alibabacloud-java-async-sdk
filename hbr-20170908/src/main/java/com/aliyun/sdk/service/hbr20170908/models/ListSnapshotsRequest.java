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
         * <p>The end completion time. The value is a UNIX timestamp in seconds. Only backup points whose completion time is less than this value are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1776059382</p>
         */
        public Builder completeTimeEnd(Long completeTimeEnd) {
            this.putQueryParameter("CompleteTimeEnd", completeTimeEnd);
            this.completeTimeEnd = completeTimeEnd;
            return this;
        }

        /**
         * <p>The start completion time. The value is a UNIX timestamp in seconds. Only backup points whose completion time is greater than or equal to this value are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1776059082</p>
         */
        public Builder completeTimeStart(Long completeTimeStart) {
            this.putQueryParameter("CompleteTimeStart", completeTimeStart);
            this.completeTimeStart = completeTimeStart;
            return this;
        }

        /**
         * <p>The maximum number of results to return for a paged query. Default value: 10. The value must be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the <strong>NextToken</strong> value returned from the previous page. If <strong>NextToken</strong> is empty, no more pages exist. This parameter cannot be used together with <strong>Skip</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJJbmRleCI6NjUwMX0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the backup plan. This is an optional filter. If you specify this parameter, only the backup points under the specified backup plan are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>po-0000****123</p>
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the protected resource. The protected resource must exist, and its data source type must be the same as the value of the <strong>SourceType</strong> parameter.</p>
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
         * <p>The number of entries to skip. The value must be a non-negative integer and a multiple of <strong>MaxResults</strong>. This parameter cannot be used together with <strong>NextToken</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder skip(Integer skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * <p>The data source type. It must be the same as the data source type of the protected resource specified by ProtectedResourceId. Valid values:</p>
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
         * <p>The ID of the vault. This is an optional filter. If you specify this parameter, only the backup points in the specified vault are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>v-00030j3c******sn</p>
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
