// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribeBackupSetDownloadTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupSetDownloadTaskListRequest</p>
 */
public class DescribeBackupSetDownloadTaskListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetDownloadTaskId")
    private String backupSetDownloadTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribeBackupSetDownloadTaskListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupPlanId = builder.backupPlanId;
        this.backupSetDownloadTaskId = builder.backupSetDownloadTaskId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSetDownloadTaskListRequest create() {
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
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return backupSetDownloadTaskId
     */
    public String getBackupSetDownloadTaskId() {
        return this.backupSetDownloadTaskId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeBackupSetDownloadTaskListRequest, Builder> {
        private String regionId; 
        private String backupPlanId; 
        private String backupSetDownloadTaskId; 
        private String clientToken; 
        private String ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupSetDownloadTaskListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupPlanId = request.backupPlanId;
            this.backupSetDownloadTaskId = request.backupSetDownloadTaskId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The backup schedule ID. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
         * <blockquote>
         * <p> You must configure the <strong>BackupPlanId</strong> or <strong>BackupSetDownloadTaskId</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dbsqhnuhyw3****</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The ID of the backup set download task.</p>
         * <ul>
         * <li>Full backup set download task: You can call the <a href="https://help.aliyun.com/document_detail/2869842.html">CreateFullBackupSetDownload</a> operation to create a full backup set download task and obtain the task ID.</li>
         * <li>Incremental backup set download task: You can call the <a href="https://help.aliyun.com/document_detail/2869843.html">CreateIncrementBackupSetDownload</a> operation to create an incremental backup set download task and obtain the task ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urxgrxt7****</p>
         */
        public Builder backupSetDownloadTaskId(String backupSetDownloadTaskId) {
            this.putQueryParameter("BackupSetDownloadTaskId", backupSetDownloadTaskId);
            this.backupSetDownloadTaskId = backupSetDownloadTaskId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzXXXXXX</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The number of the page to return. The value must be a positive integer. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 30, 50, and 100.</p>
         * <blockquote>
         * <p>Default value: 30.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeBackupSetDownloadTaskListRequest build() {
            return new DescribeBackupSetDownloadTaskListRequest(this);
        } 

    } 

}
