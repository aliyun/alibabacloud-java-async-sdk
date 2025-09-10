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
 * {@link PutConsumeProcessorRequest} extends {@link RequestModel}
 *
 * <p>PutConsumeProcessorRequest</p>
 */
public class PutConsumeProcessorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("processorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConsumeProcessorConfiguration configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    private PutConsumeProcessorRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.processorName = builder.processorName;
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.displayName = builder.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutConsumeProcessorRequest create() {
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

    /**
     * @return configuration
     */
    public ConsumeProcessorConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    public static final class Builder extends Request.Builder<PutConsumeProcessorRequest, Builder> {
        private String project; 
        private String processorName; 
        private ConsumeProcessorConfiguration configuration; 
        private String description; 
        private String displayName; 

        private Builder() {
            super();
        } 

        private Builder(PutConsumeProcessorRequest request) {
            super(request);
            this.project = request.project;
            this.processorName = request.processorName;
            this.configuration = request.configuration;
            this.description = request.description;
            this.displayName = request.displayName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The identifier of the consumption processor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>consume-processor-1</p>
         */
        public Builder processorName(String processorName) {
            this.putPathParameter("processorName", processorName);
            this.processorName = processorName;
            return this;
        }

        /**
         * <p>Consumption processor configuration.</p>
         * <p>This parameter is required.</p>
         */
        public Builder configuration(ConsumeProcessorConfiguration configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The description.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The display name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>filter-get-request</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        @Override
        public PutConsumeProcessorRequest build() {
            return new PutConsumeProcessorRequest(this);
        } 

    } 

}
