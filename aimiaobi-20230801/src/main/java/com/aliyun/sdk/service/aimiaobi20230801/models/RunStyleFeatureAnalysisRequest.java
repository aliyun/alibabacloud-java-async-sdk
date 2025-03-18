// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunStyleFeatureAnalysisRequest} extends {@link RequestModel}
 *
 * <p>RunStyleFeatureAnalysisRequest</p>
 */
public class RunStyleFeatureAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Contents")
    private java.util.List<String> contents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaterialIds")
    private java.util.List<Long> materialIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunStyleFeatureAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contents = builder.contents;
        this.materialIds = builder.materialIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunStyleFeatureAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contents
     */
    public java.util.List<String> getContents() {
        return this.contents;
    }

    /**
     * @return materialIds
     */
    public java.util.List<Long> getMaterialIds() {
        return this.materialIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunStyleFeatureAnalysisRequest, Builder> {
        private String regionId; 
        private java.util.List<String> contents; 
        private java.util.List<Long> materialIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunStyleFeatureAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contents = request.contents;
            this.materialIds = request.materialIds;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Contents.
         */
        public Builder contents(java.util.List<String> contents) {
            String contentsShrink = shrink(contents, "Contents", "json");
            this.putBodyParameter("Contents", contentsShrink);
            this.contents = contents;
            return this;
        }

        /**
         * MaterialIds.
         */
        public Builder materialIds(java.util.List<Long> materialIds) {
            String materialIdsShrink = shrink(materialIds, "MaterialIds", "json");
            this.putBodyParameter("MaterialIds", materialIdsShrink);
            this.materialIds = materialIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2setzb9x4ewsd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunStyleFeatureAnalysisRequest build() {
            return new RunStyleFeatureAnalysisRequest(this);
        } 

    } 

}
