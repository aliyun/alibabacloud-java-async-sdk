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
 * {@link DeleteConsumeProcessorRequest} extends {@link RequestModel}
 *
 * <p>DeleteConsumeProcessorRequest</p>
 */
public class DeleteConsumeProcessorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("processorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processorName;

    private DeleteConsumeProcessorRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.processorName = builder.processorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConsumeProcessorRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteConsumeProcessorRequest, Builder> {
        private String project; 
        private String processorName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConsumeProcessorRequest request) {
            super(request);
            this.project = request.project;
            this.processorName = request.processorName;
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

        @Override
        public DeleteConsumeProcessorRequest build() {
            return new DeleteConsumeProcessorRequest(this);
        } 

    } 

}
