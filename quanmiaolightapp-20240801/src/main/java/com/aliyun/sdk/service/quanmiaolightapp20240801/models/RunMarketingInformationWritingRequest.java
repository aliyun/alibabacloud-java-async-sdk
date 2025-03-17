// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link RunMarketingInformationWritingRequest} extends {@link RequestModel}
 *
 * <p>RunMarketingInformationWritingRequest</p>
 */
public class RunMarketingInformationWritingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customLimitation")
    private String customLimitation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPrompt")
    private String customPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inputExample")
    private String inputExample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputExample")
    private String outputExample;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceMaterial")
    private String sourceMaterial;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("writingType")
    private String writingType;

    private RunMarketingInformationWritingRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.customLimitation = builder.customLimitation;
        this.customPrompt = builder.customPrompt;
        this.inputExample = builder.inputExample;
        this.modelId = builder.modelId;
        this.outputExample = builder.outputExample;
        this.sourceMaterial = builder.sourceMaterial;
        this.writingType = builder.writingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunMarketingInformationWritingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return customLimitation
     */
    public String getCustomLimitation() {
        return this.customLimitation;
    }

    /**
     * @return customPrompt
     */
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return inputExample
     */
    public String getInputExample() {
        return this.inputExample;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return outputExample
     */
    public String getOutputExample() {
        return this.outputExample;
    }

    /**
     * @return sourceMaterial
     */
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    /**
     * @return writingType
     */
    public String getWritingType() {
        return this.writingType;
    }

    public static final class Builder extends Request.Builder<RunMarketingInformationWritingRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String customLimitation; 
        private String customPrompt; 
        private String inputExample; 
        private String modelId; 
        private String outputExample; 
        private String sourceMaterial; 
        private String writingType; 

        private Builder() {
            super();
        } 

        private Builder(RunMarketingInformationWritingRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.customLimitation = request.customLimitation;
            this.customPrompt = request.customPrompt;
            this.inputExample = request.inputExample;
            this.modelId = request.modelId;
            this.outputExample = request.outputExample;
            this.sourceMaterial = request.sourceMaterial;
            this.writingType = request.writingType;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * customLimitation.
         */
        public Builder customLimitation(String customLimitation) {
            this.putBodyParameter("customLimitation", customLimitation);
            this.customLimitation = customLimitation;
            return this;
        }

        /**
         * customPrompt.
         */
        public Builder customPrompt(String customPrompt) {
            this.putBodyParameter("customPrompt", customPrompt);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * inputExample.
         */
        public Builder inputExample(String inputExample) {
            this.putBodyParameter("inputExample", inputExample);
            this.inputExample = inputExample;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * outputExample.
         */
        public Builder outputExample(String outputExample) {
            this.putBodyParameter("outputExample", outputExample);
            this.outputExample = outputExample;
            return this;
        }

        /**
         * sourceMaterial.
         */
        public Builder sourceMaterial(String sourceMaterial) {
            this.putBodyParameter("sourceMaterial", sourceMaterial);
            this.sourceMaterial = sourceMaterial;
            return this;
        }

        /**
         * writingType.
         */
        public Builder writingType(String writingType) {
            this.putBodyParameter("writingType", writingType);
            this.writingType = writingType;
            return this;
        }

        @Override
        public RunMarketingInformationWritingRequest build() {
            return new RunMarketingInformationWritingRequest(this);
        } 

    } 

}
