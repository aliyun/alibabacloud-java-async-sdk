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
 * {@link DescribeDataObjectsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataObjectsRequest</p>
 */
public class DescribeDataObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private Long domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCategoryCode")
    private Long fileCategoryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private Long fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberAccount")
    private Long memberAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelIds")
    private String modelIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelTagIds")
    private String modelTagIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentCategoryIds")
    private String parentCategoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductIds")
    private String productIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryName")
    private String queryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevels")
    private String riskLevels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private DescribeDataObjectsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.domainId = builder.domainId;
        this.featureType = builder.featureType;
        this.fileCategoryCode = builder.fileCategoryCode;
        this.fileType = builder.fileType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.memberAccount = builder.memberAccount;
        this.modelIds = builder.modelIds;
        this.modelTagIds = builder.modelTagIds;
        this.pageSize = builder.pageSize;
        this.parentCategoryIds = builder.parentCategoryIds;
        this.productIds = builder.productIds;
        this.queryName = builder.queryName;
        this.riskLevels = builder.riskLevels;
        this.serviceRegionId = builder.serviceRegionId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataObjectsRequest create() {
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
     * @return domainId
     */
    public Long getDomainId() {
        return this.domainId;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return fileCategoryCode
     */
    public Long getFileCategoryCode() {
        return this.fileCategoryCode;
    }

    /**
     * @return fileType
     */
    public Long getFileType() {
        return this.fileType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberAccount
     */
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * @return modelIds
     */
    public String getModelIds() {
        return this.modelIds;
    }

    /**
     * @return modelTagIds
     */
    public String getModelTagIds() {
        return this.modelTagIds;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentCategoryIds
     */
    public String getParentCategoryIds() {
        return this.parentCategoryIds;
    }

    /**
     * @return productIds
     */
    public String getProductIds() {
        return this.productIds;
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
    }

    /**
     * @return riskLevels
     */
    public String getRiskLevels() {
        return this.riskLevels;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeDataObjectsRequest, Builder> {
        private Integer currentPage; 
        private Long domainId; 
        private Integer featureType; 
        private Long fileCategoryCode; 
        private Long fileType; 
        private String instanceId; 
        private String lang; 
        private Long memberAccount; 
        private String modelIds; 
        private String modelTagIds; 
        private Integer pageSize; 
        private String parentCategoryIds; 
        private String productIds; 
        private String queryName; 
        private String riskLevels; 
        private String serviceRegionId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataObjectsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.domainId = request.domainId;
            this.featureType = request.featureType;
            this.fileCategoryCode = request.fileCategoryCode;
            this.fileType = request.fileType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.memberAccount = request.memberAccount;
            this.modelIds = request.modelIds;
            this.modelTagIds = request.modelTagIds;
            this.pageSize = request.pageSize;
            this.parentCategoryIds = request.parentCategoryIds;
            this.productIds = request.productIds;
            this.queryName = request.queryName;
            this.riskLevels = request.riskLevels;
            this.serviceRegionId = request.serviceRegionId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>Page number for the paginated query. Default value: 1.</p>
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
         * <p>ID of the data domain to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
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
         * <p>File category code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fileCategoryCode(Long fileCategoryCode) {
            this.putQueryParameter("FileCategoryCode", fileCategoryCode);
            this.fileCategoryCode = fileCategoryCode;
            return this;
        }

        /**
         * <p>OSS file types that are supported for recognition.</p>
         * <blockquote>
         * <p>You can obtain the supported OSS file types by calling <a href="https://help.aliyun.com/document_detail/2536492.html">DescribeDocTypes</a>, using the Code field value from the response. This parameter is only valid for querying OSS-type assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder fileType(Long fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>Keyword for the asset instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8vb54hn2g9j191ddz</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language type for request and response messages, default is <strong>zh_cn</strong>. Values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese.</li>
         * <li><strong>en_us</strong>: English.</li>
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
         * <p>Member account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        public Builder memberAccount(Long memberAccount) {
            this.putQueryParameter("MemberAccount", memberAccount);
            this.memberAccount = memberAccount;
            return this;
        }

        /**
         * <p>Model IDs of the industry template, separated by commas.</p>
         * <blockquote>
         * <p>You can obtain the industry template model identifier ID by calling <a href="https://help.aliyun.com/document_detail/2536491.html">DescribeTemplateAllRules</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder modelIds(String modelIds) {
            this.putQueryParameter("ModelIds", modelIds);
            this.modelIds = modelIds;
            return this;
        }

        /**
         * <p>Data labels to be queried, separated by commas. Values:</p>
         * <ul>
         * <li><strong>101</strong>: Personal Sensitive Information.</li>
         * <li><strong>102</strong>: Personal Information.</li>
         * <li><strong>107</strong>: General Information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101,102</p>
         */
        public Builder modelTagIds(String modelTagIds) {
            this.putQueryParameter("ModelTagIds", modelTagIds);
            this.modelTagIds = modelTagIds;
            return this;
        }

        /**
         * <p>When performing a paginated query, set the maximum number of data asset instances to display per page. Default value: <strong>10</strong>.</p>
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
         * <p>List of parent category IDs for the template to be queried, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>234,236,238</p>
         */
        public Builder parentCategoryIds(String parentCategoryIds) {
            this.putQueryParameter("ParentCategoryIds", parentCategoryIds);
            this.parentCategoryIds = parentCategoryIds;
            return this;
        }

        /**
         * <p>It is recommended to fill in the list of product IDs to be queried, separated by commas. Values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: OSS</li>
         * <li><strong>3</strong>: ADB-MYSQL</li>
         * <li><strong>4</strong>: TableStore</li>
         * <li><strong>5</strong>: RDS</li>
         * <li><strong>6</strong>: SELF_DB</li>
         * <li><strong>7</strong>: PolarDB-X</li>
         * <li><strong>8</strong>: PolarDB</li>
         * <li><strong>9</strong>: ADB-PG</li>
         * <li><strong>10</strong>: OceanBase</li>
         * <li><strong>11</strong>: MongoDB</li>
         * <li><strong>25</strong>: Redis</li>
         * </ul>
         * <blockquote>
         * <p>OSS is mutually exclusive with other products, meaning if OSS is included in the query, no other products can be listed; by default, non-OSS products are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1,5</p>
         */
        public Builder productIds(String productIds) {
            this.putQueryParameter("ProductIds", productIds);
            this.productIds = productIds;
            return this;
        }

        /**
         * <p>Keyword for the data object to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>t_sddp_selfmysql_pers0</p>
         */
        public Builder queryName(String queryName) {
            this.putQueryParameter("QueryName", queryName);
            this.queryName = queryName;
            return this;
        }

        /**
         * <p>Specify the risk levels of the data assets to be queried, separated by commas if multiple.</p>
         * <ul>
         * <li><strong>2</strong>: S1, low risk level.</li>
         * <li><strong>3</strong>: S2, medium risk level.</li>
         * <li><strong>4</strong>: S3, high risk level.</li>
         * <li><strong>5</strong>: S4, highest risk level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevels(String riskLevels) {
            this.putQueryParameter("RiskLevels", riskLevels);
            this.riskLevels = riskLevels;
            return this;
        }

        /**
         * <p>Region where the asset is located. Values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: North China 2 (Beijing).</li>
         * <li><strong>cn-zhangjiakou</strong>: North China 3 (Zhangjiakou).</li>
         * <li><strong>cn-huhehaote</strong>: North China 5 (Hohhot).</li>
         * <li><strong>cn-hangzhou</strong>: East China 1 (Hangzhou).</li>
         * <li><strong>cn-shanghai</strong>: East China 2 (Shanghai).</li>
         * <li><strong>cn-shenzhen</strong>: South China 1 (Shenzhen).</li>
         * <li><strong>cn-hongkong</strong>: Hong Kong, China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        /**
         * <p>Industry template ID.</p>
         * <blockquote>
         * <p>You can obtain the industry template identifier ID by calling <a href="https://help.aliyun.com/document_detail/2399296.html">DescribeCategoryTemplateList</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeDataObjectsRequest build() {
            return new DescribeDataObjectsRequest(this);
        } 

    } 

}
