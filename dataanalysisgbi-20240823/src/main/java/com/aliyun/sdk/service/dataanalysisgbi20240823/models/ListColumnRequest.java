// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link ListColumnRequest} extends {@link RequestModel}
 *
 * <p>ListColumnRequest</p>
 */
public class ListColumnRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private Integer nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListColumnRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.tableIdKey = builder.tableIdKey;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListColumnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return tableIdKey
     */
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListColumnRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private Integer nextToken; 
        private String tableIdKey; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListColumnRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.tableIdKey = request.tableIdKey;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.putBodyParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableIdKey(String tableIdKey) {
            this.putBodyParameter("tableIdKey", tableIdKey);
            this.tableIdKey = tableIdKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListColumnRequest build() {
            return new ListColumnRequest(this);
        } 

    } 

}
