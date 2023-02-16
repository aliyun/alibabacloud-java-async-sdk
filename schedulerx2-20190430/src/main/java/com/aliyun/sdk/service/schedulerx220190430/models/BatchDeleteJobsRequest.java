// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteJobsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteJobsRequest</p>
 */
public class BatchDeleteJobsRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("JobIdList")
    @Validation(required = true)
    private java.util.List < Long > jobIdList;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private BatchDeleteJobsRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.jobIdList = builder.jobIdList;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jobIdList
     */
    public java.util.List < Long > getJobIdList() {
        return this.jobIdList;
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

    public static final class Builder extends Request.Builder<BatchDeleteJobsRequest, Builder> {
        private String groupId; 
        private java.util.List < Long > jobIdList; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteJobsRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.jobIdList = request.jobIdList;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the application. You can obtain the application ID on the **Application Management** page in Distributed Task Scheduling Platform.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The job IDs. Multiple job IDs are separated by commas (,).
         */
        public Builder jobIdList(java.util.List < Long > jobIdList) {
            this.putBodyParameter("JobIdList", jobIdList);
            this.jobIdList = jobIdList;
            return this;
        }

        /**
         * The ID of the namespace to which the job belongs. You can obtain the ID of the namespace on the **Namespace** page in Distributed Task Scheduling Platform.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The ID of the region to which the job belongs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public BatchDeleteJobsRequest build() {
            return new BatchDeleteJobsRequest(this);
        } 

    } 

}
