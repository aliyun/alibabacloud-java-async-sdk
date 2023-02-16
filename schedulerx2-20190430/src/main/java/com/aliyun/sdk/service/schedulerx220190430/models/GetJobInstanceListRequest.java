// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInstanceListRequest} extends {@link RequestModel}
 *
 * <p>GetJobInstanceListRequest</p>
 */
public class GetJobInstanceListRequest extends Request {
    @Query
    @NameInMap("EndTimestamp")
    private Long endTimestamp;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

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

    @Query
    @NameInMap("StartTimestamp")
    private Long startTimestamp;

    @Query
    @NameInMap("Status")
    private Integer status;

    private GetJobInstanceListRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.startTimestamp = builder.startTimestamp;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobInstanceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
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

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetJobInstanceListRequest, Builder> {
        private Long endTimestamp; 
        private String groupId; 
        private Long jobId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private Long startTimestamp; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetJobInstanceListRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.groupId = request.groupId;
            this.jobId = request.jobId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.startTimestamp = request.startTimestamp;
            this.status = request.status;
        } 

        /**
         * EndTimestamp.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
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
         * The ID of the job. You can obtain the job ID on the Task Management page in the SchedulerX console.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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

        /**
         * The ID of the region in which the application resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartTimestamp.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * 查询指定状态的任务实例列表
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetJobInstanceListRequest build() {
            return new GetJobInstanceListRequest(this);
        } 

    } 

}
