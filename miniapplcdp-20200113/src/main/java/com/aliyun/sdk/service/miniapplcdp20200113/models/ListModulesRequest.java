// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModulesRequest} extends {@link RequestModel}
 *
 * <p>ListModulesRequest</p>
 */
public class ListModulesRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("HasOwnerApp")
    private Boolean hasOwnerApp;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("ModuleName")
    private String moduleName;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("Source")
    private String source;

    private ListModulesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.hasOwnerApp = builder.hasOwnerApp;
        this.moduleId = builder.moduleId;
        this.moduleName = builder.moduleName;
        this.platform = builder.platform;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hasOwnerApp
     */
    public Boolean getHasOwnerApp() {
        return this.hasOwnerApp;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
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

    public static final class Builder extends Request.Builder<ListModulesRequest, Builder> {
        private String description; 
        private Boolean hasOwnerApp; 
        private String moduleId; 
        private String moduleName; 
        private String platform; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListModulesRequest request) {
            super(request);
            this.description = request.description;
            this.hasOwnerApp = request.hasOwnerApp;
            this.moduleId = request.moduleId;
            this.moduleName = request.moduleName;
            this.platform = request.platform;
            this.source = request.source;
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
         * HasOwnerApp.
         */
        public Builder hasOwnerApp(Boolean hasOwnerApp) {
            this.putQueryParameter("HasOwnerApp", hasOwnerApp);
            this.hasOwnerApp = hasOwnerApp;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
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

        @Override
        public ListModulesRequest build() {
            return new ListModulesRequest(this);
        } 

    } 

}
