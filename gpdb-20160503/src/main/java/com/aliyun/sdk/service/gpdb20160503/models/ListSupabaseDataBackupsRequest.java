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
 * {@link ListSupabaseDataBackupsRequest} extends {@link RequestModel}
 *
 * <p>ListSupabaseDataBackupsRequest</p>
 */
public class ListSupabaseDataBackupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupStatus")
    private String backupStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ListSupabaseDataBackupsRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.backupMode = builder.backupMode;
        this.backupStatus = builder.backupStatus;
        this.dataType = builder.dataType;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupabaseDataBackupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return backupStatus
     */
    public String getBackupStatus() {
        return this.backupStatus;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListSupabaseDataBackupsRequest, Builder> {
        private String backupId; 
        private String backupMode; 
        private String backupStatus; 
        private String dataType; 
        private String endTime; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String regionId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListSupabaseDataBackupsRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.backupMode = request.backupMode;
            this.backupStatus = request.backupStatus;
            this.dataType = request.dataType;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the backup set. You can obtain the ID from the BackupSetId parameter returned by the ListSupabaseDataBackups operation.</p>
         * 
         * <strong>example:</strong>
         * <p>327329803</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The backup pattern. Valid values: Automated: automatic backup. Manual: manual backup.</p>
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
         * <p>The status of the backup set. Valid values: Success: the backup is successful; Failed: the backup fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder backupStatus(String backupStatus) {
            this.putQueryParameter("BackupStatus", backupStatus);
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * <p>The backup type. Valid values: DATA: full backup; RESTOREPOI: restorable point.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The end time of the query. The end time must be later than the start time. Format: yyyy-MM-ddTHH:mmZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2011-06-01T16:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for the current request.</p>
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
         * <p>The paging token for paged query. Do not specify this parameter for the first request. For subsequent requests, specify the NextToken value returned by the previous response.</p>
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
         * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of an integer. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li>30</li>
         * <li>50</li>
         * <li>100</li>
         * </ul>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * <p>The start time of the query. Format: yyyy-MM-ddTHH:mmZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2011-06-01T15:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListSupabaseDataBackupsRequest build() {
            return new ListSupabaseDataBackupsRequest(this);
        } 

    } 

}
