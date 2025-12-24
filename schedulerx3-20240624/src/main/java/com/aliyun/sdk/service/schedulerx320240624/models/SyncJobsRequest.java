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
 * {@link SyncJobsRequest} extends {@link RequestModel}
 *
 * <p>SyncJobsRequest</p>
 */
public class SyncJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> jobIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginalAppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originalAppName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginalClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originalClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetAppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetAppName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetClusterId;

    private SyncJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobIds = builder.jobIds;
        this.originalAppName = builder.originalAppName;
        this.originalClusterId = builder.originalClusterId;
        this.targetAppName = builder.targetAppName;
        this.targetClusterId = builder.targetClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncJobsRequest create() {
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
     * @return jobIds
     */
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

    /**
     * @return originalAppName
     */
    public String getOriginalAppName() {
        return this.originalAppName;
    }

    /**
     * @return originalClusterId
     */
    public String getOriginalClusterId() {
        return this.originalClusterId;
    }

    /**
     * @return targetAppName
     */
    public String getTargetAppName() {
        return this.targetAppName;
    }

    /**
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    public static final class Builder extends Request.Builder<SyncJobsRequest, Builder> {
        private String regionId; 
        private java.util.List<Long> jobIds; 
        private String originalAppName; 
        private String originalClusterId; 
        private String targetAppName; 
        private String targetClusterId; 

        private Builder() {
            super();
        } 

        private Builder(SyncJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobIds = request.jobIds;
            this.originalAppName = request.originalAppName;
            this.originalClusterId = request.originalClusterId;
            this.targetAppName = request.targetAppName;
            this.targetClusterId = request.targetClusterId;
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
         * <p>This parameter is required.</p>
         */
        public Builder jobIds(java.util.List<Long> jobIds) {
            String jobIdsShrink = shrink(jobIds, "JobIds", "json");
            this.putBodyParameter("JobIds", jobIdsShrink);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-source</p>
         */
        public Builder originalAppName(String originalAppName) {
            this.putBodyParameter("OriginalAppName", originalAppName);
            this.originalAppName = originalAppName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-00ed7f0d742b1</p>
         */
        public Builder originalClusterId(String originalClusterId) {
            this.putBodyParameter("OriginalClusterId", originalClusterId);
            this.originalClusterId = originalClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-target</p>
         */
        public Builder targetAppName(String targetAppName) {
            this.putBodyParameter("TargetAppName", targetAppName);
            this.targetAppName = targetAppName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-008bfb1541111</p>
         */
        public Builder targetClusterId(String targetClusterId) {
            this.putBodyParameter("TargetClusterId", targetClusterId);
            this.targetClusterId = targetClusterId;
            return this;
        }

        @Override
        public SyncJobsRequest build() {
            return new SyncJobsRequest(this);
        } 

    } 

}
