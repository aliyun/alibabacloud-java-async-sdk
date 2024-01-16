// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoryTemplateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCategoryTemplateListRequest</p>
 */
public class DescribeCategoryTemplateListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("FeatureType")
    private Integer featureType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("UsageScenario")
    private Integer usageScenario;

    private DescribeCategoryTemplateListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.featureType = builder.featureType;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.usageScenario = builder.usageScenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoryTemplateListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return usageScenario
     */
    public Integer getUsageScenario() {
        return this.usageScenario;
    }

    public static final class Builder extends Request.Builder<DescribeCategoryTemplateListRequest, Builder> {
        private Integer currentPage; 
        private Integer featureType; 
        private String lang; 
        private Integer pageSize; 
        private Integer usageScenario; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCategoryTemplateListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.featureType = request.featureType;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.usageScenario = request.usageScenario;
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
         * FeatureType.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * UsageScenario.
         */
        public Builder usageScenario(Integer usageScenario) {
            this.putQueryParameter("UsageScenario", usageScenario);
            this.usageScenario = usageScenario;
            return this;
        }

        @Override
        public DescribeCategoryTemplateListRequest build() {
            return new DescribeCategoryTemplateListRequest(this);
        } 

    } 

}
