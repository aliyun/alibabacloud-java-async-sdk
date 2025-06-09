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
 * {@link GetIngestProcessorRequest} extends {@link RequestModel}
 *
 * <p>GetIngestProcessorRequest</p>
 */
public class GetIngestProcessorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("processorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processorName;

    private GetIngestProcessorRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.processorName = builder.processorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIngestProcessorRequest create() {
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
     * @return processorName
     */
    public String getProcessorName() {
        return this.processorName;
    }

    public static final class Builder extends Request.Builder<GetIngestProcessorRequest, Builder> {
        private String project; 
        private String processorName; 

        private Builder() {
            super();
        } 

        private Builder(GetIngestProcessorRequest request) {
            super(request);
            this.project = request.project;
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
         * <p>The identifier of the ingest processor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>parse-nginx-log</p>
         */
        public Builder processorName(String processorName) {
            this.putPathParameter("processorName", processorName);
            this.processorName = processorName;
            return this;
        }

        @Override
        public GetIngestProcessorRequest build() {
            return new GetIngestProcessorRequest(this);
        } 

    } 

}
