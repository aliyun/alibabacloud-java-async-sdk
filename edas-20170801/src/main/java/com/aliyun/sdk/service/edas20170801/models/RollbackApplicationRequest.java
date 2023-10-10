// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackApplicationRequest} extends {@link RequestModel}
 *
 * <p>RollbackApplicationRequest</p>
 */
public class RollbackApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Batch")
    private Integer batch;

    @Query
    @NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("HistoryVersion")
    @Validation(required = true)
    private String historyVersion;

    private RollbackApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.batch = builder.batch;
        this.batchWaitTime = builder.batchWaitTime;
        this.groupId = builder.groupId;
        this.historyVersion = builder.historyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return batch
     */
    public Integer getBatch() {
        return this.batch;
    }

    /**
     * @return batchWaitTime
     */
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return historyVersion
     */
    public String getHistoryVersion() {
        return this.historyVersion;
    }

    public static final class Builder extends Request.Builder<RollbackApplicationRequest, Builder> {
        private String appId; 
        private Integer batch; 
        private Integer batchWaitTime; 
        private String groupId; 
        private String historyVersion; 

        private Builder() {
            super();
        } 

        private Builder(RollbackApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.batch = request.batch;
            this.batchWaitTime = request.batchWaitTime;
            this.groupId = request.groupId;
            this.historyVersion = request.historyVersion;
        } 

        /**
         * The application ID. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~423162~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The number of batches for the rollback. Default value: 1. Valid values: 1 to 5.
         */
        public Builder batch(Integer batch) {
            this.putQueryParameter("Batch", batch);
            this.batch = batch;
            return this;
        }

        /**
         * The wait time between batches. Default value: 0. The default value indicates no wait time. Valid values: 0 to 5. Unit: minutes.
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * The application group ID. You can call the ListDeployGroup operation to query the application group ID. For more information, see [ListDeployGroup](~~423184~~).
         * <p>
         * 
         * If you need to roll back the application in all application groups, set this parameter to `all`.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The historical version to which you want to roll back the application. Call the ListHistoryDeployVersion operation to query the historical versions of the application. Then, set this parameter based on the returned value of `PackageVersion`. For more information, see [ListHistoryDeployVersion](~~423163~~).
         */
        public Builder historyVersion(String historyVersion) {
            this.putQueryParameter("HistoryVersion", historyVersion);
            this.historyVersion = historyVersion;
            return this;
        }

        @Override
        public RollbackApplicationRequest build() {
            return new RollbackApplicationRequest(this);
        } 

    } 

}
