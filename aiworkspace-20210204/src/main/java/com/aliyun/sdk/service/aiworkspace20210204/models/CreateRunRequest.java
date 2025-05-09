// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateRunRequest} extends {@link RequestModel}
 *
 * <p>CreateRunRequest</p>
 */
public class CreateRunRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<RunParam> params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private CreateRunRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.labels = builder.labels;
        this.name = builder.name;
        this.params = builder.params;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return params
     */
    public java.util.List<RunParam> getParams() {
        return this.params;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<CreateRunRequest, Builder> {
        private String experimentId; 
        private java.util.List<Label> labels; 
        private String name; 
        private java.util.List<RunParam> params; 
        private String sourceId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateRunRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.labels = request.labels;
            this.name = request.name;
            this.params = request.params;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The ID of the experiment that corresponds to the run.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-6thbb5xrbmp*****</p>
         */
        public Builder experimentId(String experimentId) {
            this.putBodyParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>The list of tags added to the run.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The name of the run. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must start with a letter.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must be 1 to 63 characters in length.</li>
         * </ul>
         * <p>If the name is left empty when you create a run, a random run ID generated by the server is used as the name.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The parameters of the run.</p>
         */
        public Builder params(java.util.List<RunParam> params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the workload associated with the run.</p>
         * 
         * <strong>example:</strong>
         * <p>job-jdnhf***fnrimv</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The type of the workload source that is associated with the run. Valid values: TrainingService and DLC. You can also leave this parameter empty. This parameter is optional and left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>DLC</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public CreateRunRequest build() {
            return new CreateRunRequest(this);
        } 

    } 

}
