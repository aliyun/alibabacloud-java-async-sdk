// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetDownloadTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupSetDownloadTaskListRequest</p>
 */
public class DescribeBackupSetDownloadTaskListRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    private String backupPlanId;

    @Query
    @NameInMap("BackupSetDownloadTaskId")
    private String backupSetDownloadTaskId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeBackupSetDownloadTaskListRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.backupSetDownloadTaskId = builder.backupSetDownloadTaskId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeBackupSetDownloadTaskListRequest, Builder> {
        private String backupPlanId; 
        private String backupSetDownloadTaskId; 
        private String clientToken; 
        private String ownerId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupSetDownloadTaskListRequest response) {
            super(response);
            this.backupPlanId = response.backupPlanId;
            this.backupSetDownloadTaskId = response.backupSetDownloadTaskId;
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * BackupSetDownloadTaskId.
         */
        public Builder backupSetDownloadTaskId(String backupSetDownloadTaskId) {
            this.putQueryParameter("BackupSetDownloadTaskId", backupSetDownloadTaskId);
            this.backupSetDownloadTaskId = backupSetDownloadTaskId;
            return this;
        }

        /**
         * ClientToken.
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeBackupSetDownloadTaskListRequest build() {
            return new DescribeBackupSetDownloadTaskListRequest(this);
        } 

    } 

}
