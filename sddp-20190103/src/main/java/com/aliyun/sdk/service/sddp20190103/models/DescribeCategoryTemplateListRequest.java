// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeCategoryTemplateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCategoryTemplateListRequest</p>
 */
public class DescribeCategoryTemplateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageScenario")
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
         * <p>Page number for paginated queries. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>Set the language type for the request and response messages, default is <strong>zh_cn</strong>.
         * Values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese (Simplified)</li>
         * <li><strong>en_us</strong>: English (United States)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>When performing a paginated query, set the number of items per page. Default value is <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>API call scenario, default is <strong>null</strong>.
         * Values:</p>
         * <ul>
         * <li><strong>null</strong>: Old version</li>
         * <li><strong>0</strong>: Old version</li>
         * <li><strong>1</strong>: New version</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
