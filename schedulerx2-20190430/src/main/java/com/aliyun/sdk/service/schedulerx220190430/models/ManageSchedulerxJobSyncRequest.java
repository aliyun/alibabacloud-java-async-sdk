// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ManageSchedulerxJobSyncRequest} extends {@link RequestModel}
 *
 * <p>ManageSchedulerxJobSyncRequest</p>
 */
public class ManageSchedulerxJobSyncRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> jobIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginalGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originalGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginalNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originalNamespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetNamespace;

    private ManageSchedulerxJobSyncRequest(Builder builder) {
        super(builder);
        this.jobIdList = builder.jobIdList;
        this.namespaceSource = builder.namespaceSource;
        this.originalGroupId = builder.originalGroupId;
        this.originalNamespace = builder.originalNamespace;
        this.regionId = builder.regionId;
        this.targetGroupId = builder.targetGroupId;
        this.targetNamespace = builder.targetNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageSchedulerxJobSyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobIdList
     */
    public java.util.List<Long> getJobIdList() {
        return this.jobIdList;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return originalGroupId
     */
    public String getOriginalGroupId() {
        return this.originalGroupId;
    }

    /**
     * @return originalNamespace
     */
    public String getOriginalNamespace() {
        return this.originalNamespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetGroupId
     */
    public String getTargetGroupId() {
        return this.targetGroupId;
    }

    /**
     * @return targetNamespace
     */
    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    public static final class Builder extends Request.Builder<ManageSchedulerxJobSyncRequest, Builder> {
        private java.util.List<Long> jobIdList; 
        private String namespaceSource; 
        private String originalGroupId; 
        private String originalNamespace; 
        private String regionId; 
        private String targetGroupId; 
        private String targetNamespace; 

        private Builder() {
            super();
        } 

        private Builder(ManageSchedulerxJobSyncRequest request) {
            super(request);
            this.jobIdList = request.jobIdList;
            this.namespaceSource = request.namespaceSource;
            this.originalGroupId = request.originalGroupId;
            this.originalNamespace = request.originalNamespace;
            this.regionId = request.regionId;
            this.targetGroupId = request.targetGroupId;
            this.targetNamespace = request.targetNamespace;
        } 

        /**
         * <p>The list of task IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder jobIdList(java.util.List<Long> jobIdList) {
            String jobIdListShrink = shrink(jobIdList, "JobIdList", "json");
            this.putBodyParameter("JobIdList", jobIdListShrink);
            this.jobIdList = jobIdList;
            return this;
        }

        /**
         * <p>The source of the namespace. Required only for specific third-party cases.</p>
         * 
         * <strong>example:</strong>
         * <p>schedulerx</p>
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * <p>The source application group to which the task belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        public Builder originalGroupId(String originalGroupId) {
            this.putBodyParameter("OriginalGroupId", originalGroupId);
            this.originalGroupId = originalGroupId;
            return this;
        }

        /**
         * <p>The source namespace where the task resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder originalNamespace(String originalNamespace) {
            this.putBodyParameter("OriginalNamespace", originalNamespace);
            this.originalNamespace = originalNamespace;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the destination application group to which the task will be synchronized.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSyncJobGroup</p>
         */
        public Builder targetGroupId(String targetGroupId) {
            this.putBodyParameter("TargetGroupId", targetGroupId);
            this.targetGroupId = targetGroupId;
            return this;
        }

        /**
         * <p>The destination namespace to which the task will be synchronized.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5f56ef65-b836-493d-b40b-c4db6425****</p>
         */
        public Builder targetNamespace(String targetNamespace) {
            this.putBodyParameter("TargetNamespace", targetNamespace);
            this.targetNamespace = targetNamespace;
            return this;
        }

        @Override
        public ManageSchedulerxJobSyncRequest build() {
            return new ManageSchedulerxJobSyncRequest(this);
        } 

    } 

}
