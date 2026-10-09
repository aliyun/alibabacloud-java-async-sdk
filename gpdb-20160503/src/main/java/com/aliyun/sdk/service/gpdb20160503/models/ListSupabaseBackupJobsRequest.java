// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSupabaseBackupJobsRequest} extends {@link RequestModel}
 *
 * <p>ListSupabaseBackupJobsRequest</p>
 */
public class ListSupabaseBackupJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListSupabaseBackupJobsRequest(Builder builder) {
        super(builder);
        this.backupMode = builder.backupMode;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupabaseBackupJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListSupabaseBackupJobsRequest, Builder> {
        private String backupMode; 
        private Integer maxResults; 
        private String nextToken; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSupabaseBackupJobsRequest request) {
            super(request);
            this.backupMode = request.backupMode;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li>Automated: automatic backup</li>
         * <li>Manual: manual backup</li>
         * </ul>
         * <p>If this parameter is not specified, all backup tasks are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for this request.</p>
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
         * <p>The paging token. Do not specify this parameter for the first query. For subsequent queries, specify the NextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Instance ID of the Supabase instance. You can obtain instance ID from the Supabase page in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-263****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query available region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListSupabaseBackupJobsRequest build() {
            return new ListSupabaseBackupJobsRequest(this);
        } 

    } 

}
