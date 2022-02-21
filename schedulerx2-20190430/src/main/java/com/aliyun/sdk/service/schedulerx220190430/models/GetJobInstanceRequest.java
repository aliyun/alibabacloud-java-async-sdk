// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetJobInstanceRequest</p>
 */
public class GetJobInstanceRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Query
    @NameInMap("JobInstanceId")
    @Validation(required = true)
    private Long jobInstanceId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetJobInstanceRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.jobInstanceId = builder.jobInstanceId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobInstanceRequest create() {
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
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return jobInstanceId
     */
    public Long getJobInstanceId() {
        return this.jobInstanceId;
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

    public static final class Builder extends Request.Builder<GetJobInstanceRequest, Builder> {
        private String groupId; 
        private Long jobId; 
        private Long jobInstanceId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetJobInstanceRequest response) {
            super(response);
            this.groupId = response.groupId;
            this.jobId = response.jobId;
            this.jobInstanceId = response.jobInstanceId;
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
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * JobInstanceId.
         */
        public Builder jobInstanceId(Long jobInstanceId) {
            this.putQueryParameter("JobInstanceId", jobInstanceId);
            this.jobInstanceId = jobInstanceId;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetJobInstanceRequest build() {
            return new GetJobInstanceRequest(this);
        } 

    } 

}
