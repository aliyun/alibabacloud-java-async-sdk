// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>RegisterMediaInfoRequest</p>
 */
public class RegisterMediaInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaTags")
    private String mediaTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegisterConfig")
    private String registerConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartTagTemplateId")
    private String smartTagTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private RegisterMediaInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.businessType = builder.businessType;
        this.cateId = builder.cateId;
        this.clientToken = builder.clientToken;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.inputURL = builder.inputURL;
        this.mediaTags = builder.mediaTags;
        this.mediaType = builder.mediaType;
        this.overwrite = builder.overwrite;
        this.referenceId = builder.referenceId;
        this.registerConfig = builder.registerConfig;
        this.smartTagTemplateId = builder.smartTagTemplateId;
        this.title = builder.title;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaInfoRequest create() {
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
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputURL
     */
    public String getInputURL() {
        return this.inputURL;
    }

    /**
     * @return mediaTags
     */
    public String getMediaTags() {
        return this.mediaTags;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * @return registerConfig
     */
    public String getRegisterConfig() {
        return this.registerConfig;
    }

    /**
     * @return smartTagTemplateId
     */
    public String getSmartTagTemplateId() {
        return this.smartTagTemplateId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<RegisterMediaInfoRequest, Builder> {
        private String regionId; 
        private String businessType; 
        private Long cateId; 
        private String clientToken; 
        private String coverURL; 
        private String description; 
        private String inputURL; 
        private String mediaTags; 
        private String mediaType; 
        private Boolean overwrite; 
        private String referenceId; 
        private String registerConfig; 
        private String smartTagTemplateId; 
        private String title; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterMediaInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.businessType = request.businessType;
            this.cateId = request.cateId;
            this.clientToken = request.clientToken;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.inputURL = request.inputURL;
            this.mediaTags = request.mediaTags;
            this.mediaType = request.mediaType;
            this.overwrite = request.overwrite;
            this.referenceId = request.referenceId;
            this.registerConfig = request.registerConfig;
            this.smartTagTemplateId = request.smartTagTemplateId;
            this.title = request.title;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
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
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * CateId.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CoverURL.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InputURL.
         */
        public Builder inputURL(String inputURL) {
            this.putQueryParameter("InputURL", inputURL);
            this.inputURL = inputURL;
            return this;
        }

        /**
         * MediaTags.
         */
        public Builder mediaTags(String mediaTags) {
            this.putQueryParameter("MediaTags", mediaTags);
            this.mediaTags = mediaTags;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * Overwrite.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * ReferenceId.
         */
        public Builder referenceId(String referenceId) {
            this.putQueryParameter("ReferenceId", referenceId);
            this.referenceId = referenceId;
            return this;
        }

        /**
         * RegisterConfig.
         */
        public Builder registerConfig(String registerConfig) {
            this.putQueryParameter("RegisterConfig", registerConfig);
            this.registerConfig = registerConfig;
            return this;
        }

        /**
         * SmartTagTemplateId.
         */
        public Builder smartTagTemplateId(String smartTagTemplateId) {
            this.putQueryParameter("SmartTagTemplateId", smartTagTemplateId);
            this.smartTagTemplateId = smartTagTemplateId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * WorkflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public RegisterMediaInfoRequest build() {
            return new RegisterMediaInfoRequest(this);
        } 

    } 

}
