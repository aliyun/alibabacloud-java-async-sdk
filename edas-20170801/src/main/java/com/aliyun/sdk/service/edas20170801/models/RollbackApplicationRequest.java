// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link RollbackApplicationRequest} extends {@link RequestModel}
 *
 * <p>RollbackApplicationRequest</p>
 */
public class RollbackApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Batch")
    private Integer batch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchWaitTime")
    private Integer batchWaitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HistoryVersion")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The application ID. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/423162.html">ListApplication</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3616cdca-4f92-4413-************</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The number of batches for the rollback. Default value: 1. Valid values: 1 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder batch(Integer batch) {
            this.putQueryParameter("Batch", batch);
            this.batch = batch;
            return this;
        }

        /**
         * <p>The wait time between batches. Default value: 0. The default value indicates no wait time. Valid values: 0 to 5. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder batchWaitTime(Integer batchWaitTime) {
            this.putQueryParameter("BatchWaitTime", batchWaitTime);
            this.batchWaitTime = batchWaitTime;
            return this;
        }

        /**
         * <p>The application group ID. You can call the ListDeployGroup operation to query the application group ID. For more information, see <a href="https://help.aliyun.com/document_detail/423184.html">ListDeployGroup</a>.</p>
         * <p>If you need to roll back the application in all application groups, set this parameter to <code>all</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8123db90-880f-48***************</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The historical version to which you want to roll back the application. Call the ListHistoryDeployVersion operation to query the historical versions of the application. Then, set this parameter based on the returned value of <code>PackageVersion</code>. For more information, see <a href="https://help.aliyun.com/document_detail/423163.html">ListHistoryDeployVersion</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-13 14:22:22</p>
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
