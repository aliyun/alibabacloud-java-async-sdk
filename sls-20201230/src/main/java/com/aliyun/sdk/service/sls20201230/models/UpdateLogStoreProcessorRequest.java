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
 * {@link UpdateLogStoreProcessorRequest} extends {@link RequestModel}
 *
 * <p>UpdateLogStoreProcessorRequest</p>
 */
public class UpdateLogStoreProcessorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("processorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processorName;

    private UpdateLogStoreProcessorRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.processorName = builder.processorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLogStoreProcessorRequest create() {
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return processorName
     */
    public String getProcessorName() {
        return this.processorName;
    }

    public static final class Builder extends Request.Builder<UpdateLogStoreProcessorRequest, Builder> {
        private String project; 
        private String logstore; 
        private String processorName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLogStoreProcessorRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
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
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The identifier of the ingest processor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>parse-nginx-log</p>
         */
        public Builder processorName(String processorName) {
            this.putBodyParameter("processorName", processorName);
            this.processorName = processorName;
            return this;
        }

        @Override
        public UpdateLogStoreProcessorRequest build() {
            return new UpdateLogStoreProcessorRequest(this);
        } 

    } 

}
