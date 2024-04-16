// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModuleRequest} extends {@link RequestModel}
 *
 * <p>CreateModuleRequest</p>
 */
public class CreateModuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Icon")
    private String icon;

    @Query
    @NameInMap("MinimumPlatformVersion")
    private String minimumPlatformVersion;

    @Query
    @NameInMap("ModuleName")
    @Validation(required = true)
    private String moduleName;

    @Query
    @NameInMap("ModuleType")
    private String moduleType;

    @Query
    @NameInMap("Platform")
    @Validation(required = true)
    private String platform;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceModuleId")
    private String sourceModuleId;

    @Query
    @NameInMap("TargetAppSource")
    private String targetAppSource;

    private CreateModuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.icon = builder.icon;
        this.minimumPlatformVersion = builder.minimumPlatformVersion;
        this.moduleName = builder.moduleName;
        this.moduleType = builder.moduleType;
        this.platform = builder.platform;
        this.source = builder.source;
        this.sourceModuleId = builder.sourceModuleId;
        this.targetAppSource = builder.targetAppSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return minimumPlatformVersion
     */
    public String getMinimumPlatformVersion() {
        return this.minimumPlatformVersion;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return moduleType
     */
    public String getModuleType() {
        return this.moduleType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceModuleId
     */
    public String getSourceModuleId() {
        return this.sourceModuleId;
    }

    /**
     * @return targetAppSource
     */
    public String getTargetAppSource() {
        return this.targetAppSource;
    }

    public static final class Builder extends Request.Builder<CreateModuleRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String icon; 
        private String minimumPlatformVersion; 
        private String moduleName; 
        private String moduleType; 
        private String platform; 
        private String source; 
        private String sourceModuleId; 
        private String targetAppSource; 

        private Builder() {
            super();
        } 

        private Builder(CreateModuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.icon = request.icon;
            this.minimumPlatformVersion = request.minimumPlatformVersion;
            this.moduleName = request.moduleName;
            this.moduleType = request.moduleType;
            this.platform = request.platform;
            this.source = request.source;
            this.sourceModuleId = request.sourceModuleId;
            this.targetAppSource = request.targetAppSource;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Icon.
         */
        public Builder icon(String icon) {
            this.putQueryParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * MinimumPlatformVersion.
         */
        public Builder minimumPlatformVersion(String minimumPlatformVersion) {
            this.putQueryParameter("MinimumPlatformVersion", minimumPlatformVersion);
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * ModuleType.
         */
        public Builder moduleType(String moduleType) {
            this.putQueryParameter("ModuleType", moduleType);
            this.moduleType = moduleType;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * SourceModuleId.
         */
        public Builder sourceModuleId(String sourceModuleId) {
            this.putQueryParameter("SourceModuleId", sourceModuleId);
            this.sourceModuleId = sourceModuleId;
            return this;
        }

        /**
         * TargetAppSource.
         */
        public Builder targetAppSource(String targetAppSource) {
            this.putQueryParameter("TargetAppSource", targetAppSource);
            this.targetAppSource = targetAppSource;
            return this;
        }

        @Override
        public CreateModuleRequest build() {
            return new CreateModuleRequest(this);
        } 

    } 

}
