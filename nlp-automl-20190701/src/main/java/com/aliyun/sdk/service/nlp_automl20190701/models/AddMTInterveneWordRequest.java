// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMTInterveneWordRequest} extends {@link RequestModel}
 *
 * <p>AddMTInterveneWordRequest</p>
 */
public class AddMTInterveneWordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageId")
    private String packageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetText")
    private String targetText;

    private AddMTInterveneWordRequest(Builder builder) {
        super(builder);
        this.packageId = builder.packageId;
        this.projectId = builder.projectId;
        this.sourceText = builder.sourceText;
        this.targetText = builder.targetText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMTInterveneWordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packageId
     */
    public String getPackageId() {
        return this.packageId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return sourceText
     */
    public String getSourceText() {
        return this.sourceText;
    }

    /**
     * @return targetText
     */
    public String getTargetText() {
        return this.targetText;
    }

    public static final class Builder extends Request.Builder<AddMTInterveneWordRequest, Builder> {
        private String packageId; 
        private String projectId; 
        private String sourceText; 
        private String targetText; 

        private Builder() {
            super();
        } 

        private Builder(AddMTInterveneWordRequest request) {
            super(request);
            this.packageId = request.packageId;
            this.projectId = request.projectId;
            this.sourceText = request.sourceText;
            this.targetText = request.targetText;
        } 

        /**
         * PackageId.
         */
        public Builder packageId(String packageId) {
            this.putQueryParameter("PackageId", packageId);
            this.packageId = packageId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SourceText.
         */
        public Builder sourceText(String sourceText) {
            this.putQueryParameter("SourceText", sourceText);
            this.sourceText = sourceText;
            return this;
        }

        /**
         * TargetText.
         */
        public Builder targetText(String targetText) {
            this.putQueryParameter("TargetText", targetText);
            this.targetText = targetText;
            return this;
        }

        @Override
        public AddMTInterveneWordRequest build() {
            return new AddMTInterveneWordRequest(this);
        } 

    } 

}
