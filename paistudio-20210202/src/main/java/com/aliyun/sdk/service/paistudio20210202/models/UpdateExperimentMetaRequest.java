// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link UpdateExperimentMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentMetaRequest</p>
 */
public class UpdateExperimentMetaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    private UpdateExperimentMetaRequest(Builder builder) {
        super(builder);
        this.experimentId = builder.experimentId;
        this.accessibility = builder.accessibility;
        this.description = builder.description;
        this.folderId = builder.folderId;
        this.name = builder.name;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentMetaRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentMetaRequest, Builder> {
        private String experimentId; 
        private String accessibility; 
        private String description; 
        private String folderId; 
        private String name; 
        private String options; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentMetaRequest request) {
            super(request);
            this.experimentId = request.experimentId;
            this.accessibility = request.accessibility;
            this.description = request.description;
            this.folderId = request.folderId;
            this.name = request.name;
            this.options = request.options;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>draft-rbvg5wzljzjhc9ks92</p>
         */
        public Builder experimentId(String experimentId) {
            this.putPathParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.putBodyParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        @Override
        public UpdateExperimentMetaRequest build() {
            return new UpdateExperimentMetaRequest(this);
        } 

    } 

}
