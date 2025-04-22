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
 * {@link UpdateExperimentRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentRequest</p>
 */
public class UpdateExperimentRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateExperimentRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.accessibility = builder.accessibility;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentRequest create() {
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentRequest, Builder> {
        private String experimentId; 
        private String accessibility; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.accessibility = request.accessibility;
            this.name = request.name;
        } 

        /**
         * <p>The experiment ID.</p>
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
         * <p>The accessibility of the experiment in the workspace. Valid values:</p>
         * <ul>
         * <li>PRIVATE: The experiment is accessible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: The experiment is accessible to all users in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The experiment name. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must start with a letter.</li>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must be 1 to 63 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateExperimentRequest build() {
            return new UpdateExperimentRequest(this);
        } 

    } 

}
