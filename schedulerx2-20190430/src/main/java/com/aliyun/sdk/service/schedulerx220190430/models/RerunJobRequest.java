// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RerunJobRequest} extends {@link RequestModel}
 *
 * <p>RerunJobRequest</p>
 */
public class RerunJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startDate;

    private RerunJobRequest(Builder builder) {
        super(builder);
        this.dataTime = builder.dataTime;
        this.endDate = builder.endDate;
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RerunJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataTime
     */
    public String getDataTime() {
        return this.dataTime;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
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
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<RerunJobRequest, Builder> {
        private String dataTime; 
        private Long endDate; 
        private String groupId; 
        private Long jobId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private Long startDate; 

        private Builder() {
            super();
        } 

        private Builder(RerunJobRequest request) {
            super(request);
            this.dataTime = request.dataTime;
            this.endDate = request.endDate;
            this.groupId = request.groupId;
            this.jobId = request.jobId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.startDate = request.startDate;
        } 

        /**
         * The data timestamp of the job. Specify a string in the HH:mm:ss format.
         */
        public Builder dataTime(String dataTime) {
            this.putBodyParameter("DataTime", dataTime);
            this.dataTime = dataTime;
            return this;
        }

        /**
         * The time when the job stops running. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The application group ID. You can obtain the application group ID on the Application Management page in the SchedulerX console.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The job ID.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of the namespace. This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The time when the job starts to rerun. Specify a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public RerunJobRequest build() {
            return new RerunJobRequest(this);
        } 

    } 

}
