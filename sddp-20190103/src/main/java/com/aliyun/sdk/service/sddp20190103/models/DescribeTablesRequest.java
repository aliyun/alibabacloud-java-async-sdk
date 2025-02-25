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
 * {@link DescribeTablesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTablesRequest</p>
 */
public class DescribeTablesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageId")
    private Long packageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelId")
    private Long riskLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private DescribeTablesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.name = builder.name;
        this.packageId = builder.packageId;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleId = builder.ruleId;
        this.serviceRegionId = builder.serviceRegionId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTablesRequest create() {
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
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return packageId
     */
    public Long getPackageId() {
        return this.packageId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return riskLevelId
     */
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
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

    public static final class Builder extends Request.Builder<DescribeTablesRequest, Builder> {
        private Integer currentPage; 
        private Long instanceId; 
        private String lang; 
        private String name; 
        private Long packageId; 
        private Integer pageSize; 
        private String productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Long ruleId; 
        private String serviceRegionId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTablesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.name = request.name;
            this.packageId = request.packageId;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleId = request.ruleId;
            this.serviceRegionId = request.serviceRegionId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The page number of the page to return. Default value: 1.</p>
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
         * <p>The ID of the data asset to which the table belongs. You can call the <a href="~~DescribeInstances~~">DescribeInstances</a> operation to obtain the ID of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese</li>
         * <li><strong>en_us</strong>: English</li>
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
         * <p>The search keyword. Fuzzy match is supported. For example, if you specify test, all tables whose names contain test are retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the package to which the table belongs. You can call the <a href="~~DescribePackages~~">DescribePackages</a> operation to obtain the ID of the package.</p>
         * 
         * <strong>example:</strong>
         * <p>555555</p>
         */
        public Builder packageId(Long packageId) {
            this.putQueryParameter("PackageId", packageId);
            this.packageId = packageId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
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
         * <p>The name of the service to which the table belongs, such as MaxCompute, OSS, and ApsaraDB RDS. For more information about the types of data assets from which Data Security Center (DSC) can scan for sensitive data, see <a href="https://help.aliyun.com/document_detail/212906.html">Supported data assets</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the service to which the table belongs. You can call the <a href="~~DescribeDataAssets~~">DescribeDataAssets</a> operation to obtain the ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The sensitivity level of the table. Each sensitivity level ID corresponds to a sensitivity level name. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
         * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
         * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
         * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
         * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * <p>The ID of the sensitive data detection rule that the table hits. You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the ID of the sensitive data detection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>333322</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The region in which DSC is activated. For more information, see <a href="https://help.aliyun.com/document_detail/214257.html">Supported regions</a>.</p>
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
         * <p>The ID of the industry-specific rule template.</p>
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
        public DescribeTablesRequest build() {
            return new DescribeTablesRequest(this);
        } 

    } 

}
