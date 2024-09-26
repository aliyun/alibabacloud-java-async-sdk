// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCommentGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunCommentGenerationRequest</p>
 */
public class RunCommentGenerationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("length")
    private String length;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("numComments")
    private String numComments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceMaterial")
    private String sourceMaterial;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("style")
    private String style;

    private RunCommentGenerationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.length = builder.length;
        this.numComments = builder.numComments;
        this.sourceMaterial = builder.sourceMaterial;
        this.style = builder.style;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommentGenerationRequest create() {
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
     * @return length
     */
    public String getLength() {
        return this.length;
    }

    /**
     * @return numComments
     */
    public String getNumComments() {
        return this.numComments;
    }

    /**
     * @return sourceMaterial
     */
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    /**
     * @return style
     */
    public String getStyle() {
        return this.style;
    }

    public static final class Builder extends Request.Builder<RunCommentGenerationRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String length; 
        private String numComments; 
        private String sourceMaterial; 
        private String style; 

        private Builder() {
            super();
        } 

        private Builder(RunCommentGenerationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.length = request.length;
            this.numComments = request.numComments;
            this.sourceMaterial = request.sourceMaterial;
            this.style = request.style;
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
         * length.
         */
        public Builder length(String length) {
            this.putBodyParameter("length", length);
            this.length = length;
            return this;
        }

        /**
         * numComments.
         */
        public Builder numComments(String numComments) {
            this.putBodyParameter("numComments", numComments);
            this.numComments = numComments;
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
         * style.
         */
        public Builder style(String style) {
            this.putBodyParameter("style", style);
            this.style = style;
            return this;
        }

        @Override
        public RunCommentGenerationRequest build() {
            return new RunCommentGenerationRequest(this);
        } 

    } 

}
