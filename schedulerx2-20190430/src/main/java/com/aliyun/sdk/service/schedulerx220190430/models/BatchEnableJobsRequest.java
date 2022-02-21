// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchEnableJobsRequest} extends {@link RequestModel}
 *
 * <p>BatchEnableJobsRequest</p>
 */
public class BatchEnableJobsRequest extends Request {
    @Query
    @NameInMap("GroupId")
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
    private String regionId;

    private BatchEnableJobsRequest(Builder builder) {
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

    public static BatchEnableJobsRequest create() {
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

    public static final class Builder extends Request.Builder<BatchEnableJobsRequest, Builder> {
        private String groupId; 
        private java.util.List < Long > jobIdList; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchEnableJobsRequest response) {
            super(response);
            this.groupId = response.groupId;
            this.jobIdList = response.jobIdList;
            this.namespace = response.namespace;
            this.namespaceSource = response.namespaceSource;
            this.regionId = response.regionId;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * JobIdList.
         */
        public Builder jobIdList(java.util.List < Long > jobIdList) {
            this.putBodyParameter("JobIdList", jobIdList);
            this.jobIdList = jobIdList;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespaceSource.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public BatchEnableJobsRequest build() {
            return new BatchEnableJobsRequest(this);
        } 

    } 

}
