// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateMetricStoreProcessorRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetricStoreProcessorRequest</p>
 */
public class UpdateMetricStoreProcessorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("metricstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricstore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("processorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processorName;

    private UpdateMetricStoreProcessorRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.metricstore = builder.metricstore;
        this.processorName = builder.processorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetricStoreProcessorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return metricstore
     */
    public String getMetricstore() {
        return this.metricstore;
    }

    /**
     * @return processorName
     */
    public String getProcessorName() {
        return this.processorName;
    }

    public static final class Builder extends Request.Builder<UpdateMetricStoreProcessorRequest, Builder> {
        private String project; 
        private String metricstore; 
        private String processorName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetricStoreProcessorRequest request) {
            super(request);
            this.project = request.project;
            this.metricstore = request.metricstore;
            this.processorName = request.processorName;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Metricstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-metricstore</p>
         */
        public Builder metricstore(String metricstore) {
            this.putPathParameter("metricstore", metricstore);
            this.metricstore = metricstore;
            return this;
        }

        /**
         * <p>The identifier of the ingest processor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>filter-metrics</p>
         */
        public Builder processorName(String processorName) {
            this.putBodyParameter("processorName", processorName);
            this.processorName = processorName;
            return this;
        }

        @Override
        public UpdateMetricStoreProcessorRequest build() {
            return new UpdateMetricStoreProcessorRequest(this);
        } 

    } 

}
