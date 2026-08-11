// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link OpenLogSyncToSLSRequest} extends {@link RequestModel}
 *
 * <p>OpenLogSyncToSLSRequest</p>
 */
public class OpenLogSyncToSLSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLogStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLogStore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetProject;

    private OpenLogSyncToSLSRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.logType = builder.logType;
        this.regionId = builder.regionId;
        this.targetLogStore = builder.targetLogStore;
        this.targetProject = builder.targetProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenLogSyncToSLSRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetLogStore
     */
    public String getTargetLogStore() {
        return this.targetLogStore;
    }

    /**
     * @return targetProject
     */
    public String getTargetProject() {
        return this.targetProject;
    }

    public static final class Builder extends Request.Builder<OpenLogSyncToSLSRequest, Builder> {
        private String DBClusterId; 
        private String logType; 
        private String regionId; 
        private String targetLogStore; 
        private String targetProject; 

        private Builder() {
            super();
        } 

        private Builder(OpenLogSyncToSLSRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.logType = request.logType;
            this.regionId = request.regionId;
            this.targetLogStore = request.targetLogStore;
            this.targetProject = request.targetProject;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1ub9grke1****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adbmysql-audit-log</p>
         */
        public Builder targetLogStore(String targetLogStore) {
            this.putQueryParameter("TargetLogStore", targetLogStore);
            this.targetLogStore = targetLogStore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>log-service-****-cn-shenzhen</p>
         */
        public Builder targetProject(String targetProject) {
            this.putQueryParameter("TargetProject", targetProject);
            this.targetProject = targetProject;
            return this;
        }

        @Override
        public OpenLogSyncToSLSRequest build() {
            return new OpenLogSyncToSLSRequest(this);
        } 

    } 

}
