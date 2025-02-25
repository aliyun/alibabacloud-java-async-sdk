// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModulesByPageRequest} extends {@link RequestModel}
 *
 * <p>ListModulesByPageRequest</p>
 */
public class ListModulesByPageRequest extends Request {
    @Query
    @NameInMap("CustomParentId")
    private String customParentId;

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
    @NameInMap("ModuleType")
    private String moduleType;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("Source")
    private String source;

    private ListModulesByPageRequest(Builder builder) {
        super(builder);
        this.customParentId = builder.customParentId;
        this.description = builder.description;
        this.hasOwnerApp = builder.hasOwnerApp;
        this.moduleId = builder.moduleId;
        this.moduleName = builder.moduleName;
        this.moduleType = builder.moduleType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.platform = builder.platform;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModulesByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customParentId
     */
    public String getCustomParentId() {
        return this.customParentId;
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
     * @return moduleType
     */
    public String getModuleType() {
        return this.moduleType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListModulesByPageRequest, Builder> {
        private String customParentId; 
        private String description; 
        private Boolean hasOwnerApp; 
        private String moduleId; 
        private String moduleName; 
        private String moduleType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String platform; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListModulesByPageRequest request) {
            super(request);
            this.customParentId = request.customParentId;
            this.description = request.description;
            this.hasOwnerApp = request.hasOwnerApp;
            this.moduleId = request.moduleId;
            this.moduleName = request.moduleName;
            this.moduleType = request.moduleType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.platform = request.platform;
            this.source = request.source;
        } 

        /**
         * CustomParentId.
         */
        public Builder customParentId(String customParentId) {
            this.putQueryParameter("CustomParentId", customParentId);
            this.customParentId = customParentId;
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
         * ModuleType.
         */
        public Builder moduleType(String moduleType) {
            this.putQueryParameter("ModuleType", moduleType);
            this.moduleType = moduleType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListModulesByPageRequest build() {
            return new ListModulesByPageRequest(this);
        } 

    } 

}
