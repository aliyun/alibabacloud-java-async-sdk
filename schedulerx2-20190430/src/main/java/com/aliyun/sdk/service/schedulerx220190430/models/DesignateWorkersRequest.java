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
 * {@link DesignateWorkersRequest} extends {@link RequestModel}
 *
 * <p>DesignateWorkersRequest</p>
 */
public class DesignateWorkersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesignateType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transferable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean transferable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workers")
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
         * <p>The type of the machines to be designated. Valid values: 1 and 2. The value 1 specifies the worker type. The value 2 specifies the label type.</p>
         * <p>This parameter is required.</p>
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
         * <p>The application group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hxm.test</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>144153</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The designated <code>labels</code>. Specify the value of the parameter in a <code>JSON</code> string.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;gray&quot;]</p>
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The unique identifier (UID) of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a06d5ea-f576-4326-842c-fb14ea043d8d</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the namespace.</p>
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
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to allow a failover.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder transferable(Boolean transferable) {
            this.putQueryParameter("Transferable", transferable);
            this.transferable = transferable;
            return this;
        }

        /**
         * <p>The designated machines. Specify the value of the parameter in a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;127.0.0.1&quot;,&quot;127.0.0.2&quot;]</p>
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
