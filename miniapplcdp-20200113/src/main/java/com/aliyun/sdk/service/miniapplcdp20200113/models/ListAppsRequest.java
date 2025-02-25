// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsRequest} extends {@link RequestModel}
 *
 * <p>ListAppsRequest</p>
 */
public class ListAppsRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("AppStatus")
    private String appStatus;

    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("CustomParentId")
    private String customParentId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("MainModuleId")
    private String mainModuleId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Template")
    private Boolean template;

    private ListAppsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appStatus = builder.appStatus;
        this.appType = builder.appType;
        this.customParentId = builder.customParentId;
        this.description = builder.description;
        this.mainModuleId = builder.mainModuleId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appStatus
     */
    public String getAppStatus() {
        return this.appStatus;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
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
     * @return mainModuleId
     */
    public String getMainModuleId() {
        return this.mainModuleId;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return template
     */
    public Boolean getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<ListAppsRequest, Builder> {
        private String appId; 
        private String appName; 
        private String appStatus; 
        private String appType; 
        private String customParentId; 
        private String description; 
        private String mainModuleId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String source; 
        private Boolean template; 

        private Builder() {
            super();
        } 

        private Builder(ListAppsRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.appStatus = request.appStatus;
            this.appType = request.appType;
            this.customParentId = request.customParentId;
            this.description = request.description;
            this.mainModuleId = request.mainModuleId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.source = request.source;
            this.template = request.template;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppStatus.
         */
        public Builder appStatus(String appStatus) {
            this.putQueryParameter("AppStatus", appStatus);
            this.appStatus = appStatus;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
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
         * MainModuleId.
         */
        public Builder mainModuleId(String mainModuleId) {
            this.putQueryParameter("MainModuleId", mainModuleId);
            this.mainModuleId = mainModuleId;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(Boolean template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public ListAppsRequest build() {
            return new ListAppsRequest(this);
        } 

    } 

}
