// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigTemplatesRequest</p>
 */
public class DescribeConfigTemplatesRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    @Query
    @NameInMap("TemplateSearch")
    private String templateSearch;

    private DescribeConfigTemplatesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
        this.templateSearch = builder.templateSearch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigTemplatesRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateSearch
     */
    public String getTemplateSearch() {
        return this.templateSearch;
    }

    public static final class Builder extends Request.Builder<DescribeConfigTemplatesRequest, Builder> {
        private String appId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String templateName; 
        private String templateSearch; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigTemplatesRequest response) {
            super(response);
            this.appId = response.appId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.templateName = response.templateName;
            this.templateSearch = response.templateSearch;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateSearch.
         */
        public Builder templateSearch(String templateSearch) {
            this.putQueryParameter("TemplateSearch", templateSearch);
            this.templateSearch = templateSearch;
            return this;
        }

        @Override
        public DescribeConfigTemplatesRequest build() {
            return new DescribeConfigTemplatesRequest(this);
        } 

    } 

}
