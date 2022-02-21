// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>SearchAlertRulesRequest</p>
 */
public class SearchAlertRulesRequest extends Request {
    @Query
    @NameInMap("AppType")
    private String appType;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Pid")
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SystemRegionId")
    private String systemRegionId;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("Type")
    private String type;

    private SearchAlertRulesRequest(Builder builder) {
        super(builder);
        this.appType = builder.appType;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.systemRegionId = builder.systemRegionId;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return systemRegionId
     */
    public String getSystemRegionId() {
        return this.systemRegionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SearchAlertRulesRequest, Builder> {
        private String appType; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String pid; 
        private String regionId; 
        private String systemRegionId; 
        private String title; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SearchAlertRulesRequest response) {
            super(response);
            this.appType = response.appType;
            this.currentPage = response.currentPage;
            this.pageSize = response.pageSize;
            this.pid = response.pid;
            this.regionId = response.regionId;
            this.systemRegionId = response.systemRegionId;
            this.title = response.title;
            this.type = response.type;
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SystemRegionId.
         */
        public Builder systemRegionId(String systemRegionId) {
            this.putQueryParameter("SystemRegionId", systemRegionId);
            this.systemRegionId = systemRegionId;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SearchAlertRulesRequest build() {
            return new SearchAlertRulesRequest(this);
        } 

    } 

}
