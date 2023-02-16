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
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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

    private GetJobInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.jobInstanceId = builder.jobInstanceId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetJobInstanceRequest, Builder> {
        private String regionId; 
        private String groupId; 
        private Long jobId; 
        private Long jobInstanceId; 
        private String namespace; 
        private String namespaceSource; 

        private Builder() {
            super();
        } 

        private Builder(GetJobInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.groupId = request.groupId;
            this.jobId = request.jobId;
            this.jobInstanceId = request.jobInstanceId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
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
         * The ID of the application. You can obtain the application ID on the Application Management page in the SchedulerX console.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the job.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the job instance.
         */
        public Builder jobInstanceId(Long jobInstanceId) {
            this.putQueryParameter("JobInstanceId", jobInstanceId);
            this.jobInstanceId = jobInstanceId;
            return this;
        }

        /**
         * The ID of the namespace. You can obtain the namespace ID on the Namespace page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of the namespace. This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        @Override
        public GetJobInstanceRequest build() {
            return new GetJobInstanceRequest(this);
        } 

    } 

}
