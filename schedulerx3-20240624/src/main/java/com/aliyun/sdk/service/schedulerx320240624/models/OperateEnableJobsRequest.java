// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link OperateEnableJobsRequest} extends {@link RequestModel}
 *
 * <p>OperateEnableJobsRequest</p>
 */
public class OperateEnableJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppGroupId")
    private Long appGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private java.util.List<Long> jobIds;

    private OperateEnableJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appGroupId = builder.appGroupId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateEnableJobsRequest create() {
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
     * @return appGroupId
     */
    public Long getAppGroupId() {
        return this.appGroupId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobIds
     */
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<OperateEnableJobsRequest, Builder> {
        private String regionId; 
        private Long appGroupId; 
        private String appName; 
        private String clusterId; 
        private java.util.List<Long> jobIds; 

        private Builder() {
            super();
        } 

        private Builder(OperateEnableJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appGroupId = request.appGroupId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.jobIds = request.jobIds;
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
         * AppGroupId.
         */
        public Builder appGroupId(Long appGroupId) {
            this.putBodyParameter("AppGroupId", appGroupId);
            this.appGroupId = appGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder jobIds(java.util.List<Long> jobIds) {
            String jobIdsShrink = shrink(jobIds, "JobIds", "json");
            this.putBodyParameter("JobIds", jobIdsShrink);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public OperateEnableJobsRequest build() {
            return new OperateEnableJobsRequest(this);
        } 

    } 

}
