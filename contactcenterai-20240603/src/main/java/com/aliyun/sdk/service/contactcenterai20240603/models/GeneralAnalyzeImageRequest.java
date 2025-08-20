// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link GeneralAnalyzeImageRequest} extends {@link RequestModel}
 *
 * <p>GeneralAnalyzeImageRequest</p>
 */
public class GeneralAnalyzeImageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPrompt")
    private String customPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrls")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> imageUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateIds")
    private java.util.List<Long> templateIds;

    private GeneralAnalyzeImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.appId = builder.appId;
        this.customPrompt = builder.customPrompt;
        this.imageUrls = builder.imageUrls;
        this.stream = builder.stream;
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralAnalyzeImageRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return customPrompt
     */
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return imageUrls
     */
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return templateIds
     */
    public java.util.List<Long> getTemplateIds() {
        return this.templateIds;
    }

    public static final class Builder extends Request.Builder<GeneralAnalyzeImageRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String appId; 
        private String customPrompt; 
        private java.util.List<String> imageUrls; 
        private Boolean stream; 
        private java.util.List<Long> templateIds; 

        private Builder() {
            super();
        } 

        private Builder(GeneralAnalyzeImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.appId = request.appId;
            this.customPrompt = request.customPrompt;
            this.imageUrls = request.imageUrls;
            this.stream = request.stream;
            this.templateIds = request.templateIds;
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
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
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
         * <p>This parameter is required.</p>
         */
        public Builder imageUrls(java.util.List<String> imageUrls) {
            this.putBodyParameter("imageUrls", imageUrls);
            this.imageUrls = imageUrls;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * templateIds.
         */
        public Builder templateIds(java.util.List<Long> templateIds) {
            this.putBodyParameter("templateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public GeneralAnalyzeImageRequest build() {
            return new GeneralAnalyzeImageRequest(this);
        } 

    } 

}
