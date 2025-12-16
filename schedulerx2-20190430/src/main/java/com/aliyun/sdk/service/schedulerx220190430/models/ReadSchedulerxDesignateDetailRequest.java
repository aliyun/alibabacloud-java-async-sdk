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
 * {@link ReadSchedulerxDesignateDetailRequest} extends {@link RequestModel}
 *
 * <p>ReadSchedulerxDesignateDetailRequest</p>
 */
public class ReadSchedulerxDesignateDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesignateType")
    private Integer designateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ReadSchedulerxDesignateDetailRequest(Builder builder) {
        super(builder);
        this.designateType = builder.designateType;
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadSchedulerxDesignateDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return designateType
     */
    public Integer getDesignateType() {
        return this.designateType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ReadSchedulerxDesignateDetailRequest, Builder> {
        private Integer designateType; 
        private String groupId; 
        private Long jobId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReadSchedulerxDesignateDetailRequest request) {
            super(request);
            this.designateType = request.designateType;
            this.groupId = request.groupId;
            this.jobId = request.jobId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The information type of the specified workers that you want to query. Valid values: 1 and 2.</p>
         * <p>1: the IP address of the specified workers.
         * 2: the tags of the specified workers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder designateType(Integer designateType) {
            this.putQueryParameter("DesignateType", designateType);
            this.designateType = designateType;
            return this;
        }

        /**
         * <p>The ID of the application. You can obtain the application ID on the Applications page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.defalutGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The job ID. You can obtain the ID on the Tasks page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>368</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The unique identifier (UID) of the namespace. You can obtain the namespace UID on the Namespaces page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the namespace. This parameter is required only for a special third party.</p>
         * 
         * <strong>example:</strong>
         * <p>schedulerx</p>
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
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
        public ReadSchedulerxDesignateDetailRequest build() {
            return new ReadSchedulerxDesignateDetailRequest(this);
        } 

    } 

}
