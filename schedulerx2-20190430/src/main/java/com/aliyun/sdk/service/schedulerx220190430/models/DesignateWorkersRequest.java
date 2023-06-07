// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DesignateWorkersRequest} extends {@link RequestModel}
 *
 * <p>DesignateWorkersRequest</p>
 */
public class DesignateWorkersRequest extends Request {
    @Query
    @NameInMap("DesignateType")
    @Validation(required = true)
    private Integer designateType;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Query
    @NameInMap("Labels")
    private String labels;

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
    @NameInMap("Transferable")
    @Validation(required = true)
    private Boolean transferable;

    @Query
    @NameInMap("Workers")
    private String workers;

    private DesignateWorkersRequest(Builder builder) {
        super(builder);
        this.designateType = builder.designateType;
        this.groupId = builder.groupId;
        this.jobId = builder.jobId;
        this.labels = builder.labels;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.transferable = builder.transferable;
        this.workers = builder.workers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DesignateWorkersRequest create() {
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
     * @return labels
     */
    public String getLabels() {
        return this.labels;
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
     * @return transferable
     */
    public Boolean getTransferable() {
        return this.transferable;
    }

    /**
     * @return workers
     */
    public String getWorkers() {
        return this.workers;
    }

    public static final class Builder extends Request.Builder<DesignateWorkersRequest, Builder> {
        private Integer designateType; 
        private String groupId; 
        private Long jobId; 
        private String labels; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private Boolean transferable; 
        private String workers; 

        private Builder() {
            super();
        } 

        private Builder(DesignateWorkersRequest request) {
            super(request);
            this.designateType = request.designateType;
            this.groupId = request.groupId;
            this.jobId = request.jobId;
            this.labels = request.labels;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.transferable = request.transferable;
            this.workers = request.workers;
        } 

        /**
         * The type of the machines to be designated. Valid values: 1 and 2. The value 1 specifies the worker type. The value 2 specifies the label type.
         */
        public Builder designateType(Integer designateType) {
            this.putQueryParameter("DesignateType", designateType);
            this.designateType = designateType;
            return this;
        }

        /**
         * The application group ID.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The job ID.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The designated `labels`. Specify the value of the parameter in a `JSON` string.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * The unique identifier (UID) of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of the namespace.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to allow a failover.
         */
        public Builder transferable(Boolean transferable) {
            this.putQueryParameter("Transferable", transferable);
            this.transferable = transferable;
            return this;
        }

        /**
         * The designated machines. Specify the value of the parameter in a JSON string.
         */
        public Builder workers(String workers) {
            this.putQueryParameter("Workers", workers);
            this.workers = workers;
            return this;
        }

        @Override
        public DesignateWorkersRequest build() {
            return new DesignateWorkersRequest(this);
        } 

    } 

}
