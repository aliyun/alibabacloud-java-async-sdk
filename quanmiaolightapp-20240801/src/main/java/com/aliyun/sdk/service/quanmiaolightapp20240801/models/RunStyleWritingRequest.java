// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunStyleWritingRequest} extends {@link RequestModel}
 *
 * <p>RunStyleWritingRequest</p>
 */
public class RunStyleWritingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("learningSamples")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > learningSamples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("referenceMaterials")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > referenceMaterials;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("styleFeature")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String styleFeature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("writingTheme")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1000)
    private String writingTheme;

    private RunStyleWritingRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.learningSamples = builder.learningSamples;
        this.referenceMaterials = builder.referenceMaterials;
        this.styleFeature = builder.styleFeature;
        this.writingTheme = builder.writingTheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunStyleWritingRequest create() {
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
     * @return learningSamples
     */
    public java.util.List < String > getLearningSamples() {
        return this.learningSamples;
    }

    /**
     * @return referenceMaterials
     */
    public java.util.List < String > getReferenceMaterials() {
        return this.referenceMaterials;
    }

    /**
     * @return styleFeature
     */
    public String getStyleFeature() {
        return this.styleFeature;
    }

    /**
     * @return writingTheme
     */
    public String getWritingTheme() {
        return this.writingTheme;
    }

    public static final class Builder extends Request.Builder<RunStyleWritingRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private java.util.List < String > learningSamples; 
        private java.util.List < String > referenceMaterials; 
        private String styleFeature; 
        private String writingTheme; 

        private Builder() {
            super();
        } 

        private Builder(RunStyleWritingRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.learningSamples = request.learningSamples;
            this.referenceMaterials = request.referenceMaterials;
            this.styleFeature = request.styleFeature;
            this.writingTheme = request.writingTheme;
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
         * learningSamples.
         */
        public Builder learningSamples(java.util.List < String > learningSamples) {
            String learningSamplesShrink = shrink(learningSamples, "learningSamples", "json");
            this.putBodyParameter("learningSamples", learningSamplesShrink);
            this.learningSamples = learningSamples;
            return this;
        }

        /**
         * referenceMaterials.
         */
        public Builder referenceMaterials(java.util.List < String > referenceMaterials) {
            String referenceMaterialsShrink = shrink(referenceMaterials, "referenceMaterials", "json");
            this.putBodyParameter("referenceMaterials", referenceMaterialsShrink);
            this.referenceMaterials = referenceMaterials;
            return this;
        }

        /**
         * styleFeature.
         */
        public Builder styleFeature(String styleFeature) {
            this.putBodyParameter("styleFeature", styleFeature);
            this.styleFeature = styleFeature;
            return this;
        }

        /**
         * writingTheme.
         */
        public Builder writingTheme(String writingTheme) {
            this.putBodyParameter("writingTheme", writingTheme);
            this.writingTheme = writingTheme;
            return this;
        }

        @Override
        public RunStyleWritingRequest build() {
            return new RunStyleWritingRequest(this);
        } 

    } 

}
