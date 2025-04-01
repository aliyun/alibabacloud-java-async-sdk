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
 * {@link SetExperimentLabelsRequest} extends {@link RequestModel}
 *
 * <p>SetExperimentLabelsRequest</p>
 */
public class SetExperimentLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<LabelInfo> labels;

    private SetExperimentLabelsRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetExperimentLabelsRequest create() {
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
    public java.util.List<LabelInfo> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<SetExperimentLabelsRequest, Builder> {
        private String experimentId; 
        private java.util.List<LabelInfo> labels; 

        private Builder() {
            super();
        } 

        private Builder(SetExperimentLabelsRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.labels = request.labels;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-1zpfthdx******</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<LabelInfo> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public SetExperimentLabelsRequest build() {
            return new SetExperimentLabelsRequest(this);
        } 

    } 

}
