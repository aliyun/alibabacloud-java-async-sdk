// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunMarketingInformationExtractRequest} extends {@link RequestModel}
 *
 * <p>RunMarketingInformationExtractRequest</p>
 */
public class RunMarketingInformationExtractRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPrompt")
    private String customPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extractType")
    private String extractType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceMaterials")
    private java.util.List < String > sourceMaterials;

    private RunMarketingInformationExtractRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.customPrompt = builder.customPrompt;
        this.extractType = builder.extractType;
        this.modelId = builder.modelId;
        this.sourceMaterials = builder.sourceMaterials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunMarketingInformationExtractRequest create() {
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
     * @return customPrompt
     */
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return extractType
     */
    public String getExtractType() {
        return this.extractType;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return sourceMaterials
     */
    public java.util.List < String > getSourceMaterials() {
        return this.sourceMaterials;
    }

    public static final class Builder extends Request.Builder<RunMarketingInformationExtractRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String customPrompt; 
        private String extractType; 
        private String modelId; 
        private java.util.List < String > sourceMaterials; 

        private Builder() {
            super();
        } 

        private Builder(RunMarketingInformationExtractRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.customPrompt = request.customPrompt;
            this.extractType = request.extractType;
            this.modelId = request.modelId;
            this.sourceMaterials = request.sourceMaterials;
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
         * customPrompt.
         */
        public Builder customPrompt(String customPrompt) {
            this.putBodyParameter("customPrompt", customPrompt);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * extractType.
         */
        public Builder extractType(String extractType) {
            this.putBodyParameter("extractType", extractType);
            this.extractType = extractType;
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
         * sourceMaterials.
         */
        public Builder sourceMaterials(java.util.List < String > sourceMaterials) {
            String sourceMaterialsShrink = shrink(sourceMaterials, "sourceMaterials", "json");
            this.putBodyParameter("sourceMaterials", sourceMaterialsShrink);
            this.sourceMaterials = sourceMaterials;
            return this;
        }

        @Override
        public RunMarketingInformationExtractRequest build() {
            return new RunMarketingInformationExtractRequest(this);
        } 

    } 

}
