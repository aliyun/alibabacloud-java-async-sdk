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
 * {@link DeleteExperimentLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteExperimentLabelRequest</p>
 */
public class DeleteExperimentLabelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    private DeleteExperimentLabelRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExperimentLabelRequest create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<DeleteExperimentLabelRequest, Builder> {
        private String experimentId; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExperimentLabelRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.key = request.key;
        } 

        /**
         * <p>The ID of the experiment.</p>
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
         * <p>The key of the experiment tag to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>is_evaluate</p>
         */
        public Builder key(String key) {
            this.putPathParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public DeleteExperimentLabelRequest build() {
            return new DeleteExperimentLabelRequest(this);
        } 

    } 

}
