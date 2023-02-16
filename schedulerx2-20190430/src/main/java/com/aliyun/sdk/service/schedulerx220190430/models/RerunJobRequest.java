// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RerunJobRequest} extends {@link RequestModel}
 *
 * <p>RerunJobRequest</p>
 */
public class RerunJobRequest extends Request {
    @Body
    @NameInMap("DataTime")
    @Validation(required = true)
    private String dataTime;

    @Body
    @NameInMap("EndDate")
    @Validation(required = true)
    private Long endDate;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("StartDate")
    @Validation(required = true)
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
         * DataTime.
         */
        public Builder dataTime(String dataTime) {
            this.putBodyParameter("DataTime", dataTime);
            this.dataTime = dataTime;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespaceSource.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartDate.
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
