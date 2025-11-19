// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link CreateDesktopImageRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopImageRequest</p>
 */
public class CreateDesktopImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCleanUserData")
    private Boolean autoCleanUserData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStartUpConfig")
    private Boolean enableStartUpConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartUpFilePathList")
    private java.util.List<String> startUpFilePathList;

    private CreateDesktopImageRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.autoCleanUserData = builder.autoCleanUserData;
        this.description = builder.description;
        this.desktopId = builder.desktopId;
        this.diskType = builder.diskType;
        this.enableStartUpConfig = builder.enableStartUpConfig;
        this.imageName = builder.imageName;
        this.sessionId = builder.sessionId;
        this.startUpFilePathList = builder.startUpFilePathList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return autoCleanUserData
     */
    public Boolean getAutoCleanUserData() {
        return this.autoCleanUserData;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return enableStartUpConfig
     */
    public Boolean getEnableStartUpConfig() {
        return this.enableStartUpConfig;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return startUpFilePathList
     */
    public java.util.List<String> getStartUpFilePathList() {
        return this.startUpFilePathList;
    }

    public static final class Builder extends Request.Builder<CreateDesktopImageRequest, Builder> {
        private String apiKey; 
        private Boolean autoCleanUserData; 
        private String description; 
        private String desktopId; 
        private String diskType; 
        private Boolean enableStartUpConfig; 
        private String imageName; 
        private String sessionId; 
        private java.util.List<String> startUpFilePathList; 

        private Builder() {
            super();
        } 

        private Builder(CreateDesktopImageRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.autoCleanUserData = request.autoCleanUserData;
            this.description = request.description;
            this.desktopId = request.desktopId;
            this.diskType = request.diskType;
            this.enableStartUpConfig = request.enableStartUpConfig;
            this.imageName = request.imageName;
            this.sessionId = request.sessionId;
            this.startUpFilePathList = request.startUpFilePathList;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * AutoCleanUserData.
         */
        public Builder autoCleanUserData(Boolean autoCleanUserData) {
            this.putQueryParameter("AutoCleanUserData", autoCleanUserData);
            this.autoCleanUserData = autoCleanUserData;
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
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * EnableStartUpConfig.
         */
        public Builder enableStartUpConfig(Boolean enableStartUpConfig) {
            this.putQueryParameter("EnableStartUpConfig", enableStartUpConfig);
            this.enableStartUpConfig = enableStartUpConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * StartUpFilePathList.
         */
        public Builder startUpFilePathList(java.util.List<String> startUpFilePathList) {
            String startUpFilePathListShrink = shrink(startUpFilePathList, "StartUpFilePathList", "json");
            this.putQueryParameter("StartUpFilePathList", startUpFilePathListShrink);
            this.startUpFilePathList = startUpFilePathList;
            return this;
        }

        @Override
        public CreateDesktopImageRequest build() {
            return new CreateDesktopImageRequest(this);
        } 

    } 

}
