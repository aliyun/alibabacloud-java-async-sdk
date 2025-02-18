// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListCloudResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListCloudResourcesRequest</p>
 */
public class ListCloudResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIds")
    private java.util.List<Long> certIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudName")
    private String cloudName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProduct")
    private String cloudProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    private String secretId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private ListCloudResourcesRequest(Builder builder) {
        super(builder);
        this.certIds = builder.certIds;
        this.cloudName = builder.cloudName;
        this.cloudProduct = builder.cloudProduct;
        this.currentPage = builder.currentPage;
        this.keyword = builder.keyword;
        this.secretId = builder.secretId;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIds
     */
    public java.util.List<Long> getCertIds() {
        return this.certIds;
    }

    /**
     * @return cloudName
     */
    public String getCloudName() {
        return this.cloudName;
    }

    /**
     * @return cloudProduct
     */
    public String getCloudProduct() {
        return this.cloudProduct;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListCloudResourcesRequest, Builder> {
        private java.util.List<Long> certIds; 
        private String cloudName; 
        private String cloudProduct; 
        private Integer currentPage; 
        private String keyword; 
        private String secretId; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudResourcesRequest request) {
            super(request);
            this.certIds = request.certIds;
            this.cloudName = request.cloudName;
            this.cloudProduct = request.cloudProduct;
            this.currentPage = request.currentPage;
            this.keyword = request.keyword;
            this.secretId = request.secretId;
            this.showSize = request.showSize;
        } 

        /**
         * <p>The certificate IDs.</p>
         */
        public Builder certIds(java.util.List<Long> certIds) {
            String certIdsShrink = shrink(certIds, "CertIds", "json");
            this.putQueryParameter("CertIds", certIdsShrink);
            this.certIds = certIds;
            return this;
        }

        /**
         * <p>The cloud service provider.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Tencent</li>
         * <li>Huawei</li>
         * <li>Aws</li>
         * <li>aliyun</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        public Builder cloudName(String cloudName) {
            this.putQueryParameter("CloudName", cloudName);
            this.cloudName = cloudName;
            return this;
        }

        /**
         * <p>The cloud service.</p>
         * <p>Valid values when CloudName is set to aliyun:</p>
         * <ul>
         * <li>SLB: Classic Load Balancer (CLB). This value is available only on the China site (aliyun.com).</li>
         * <li>LIVE: ApsaraVideo Live. This value is available only on the China site (aliyun.com).</li>
         * <li>webHosting: Cloud Web Hosting. This value is available only on the China site (aliyun.com).</li>
         * <li>VOD: ApsaraVideo VOD. This value is available only on the China site (aliyun.com).</li>
         * <li>CR: Container Registry. This value is available only on the China site (aliyun.com).</li>
         * <li>DCDN: Dynamic Content Delivery Network (DCDN).</li>
         * <li>DDOS: Anti-DDoS.</li>
         * <li>CDN: Alibaba Cloud CDN (CDN).</li>
         * <li>ALB: Application Load Balancer (ALB).</li>
         * <li>APIGateway: API Gateway.</li>
         * <li>FC: Function Compute.</li>
         * <li>GA: Global Accelerator (GA).</li>
         * <li>MSE: Microservices Engine (MSE).</li>
         * <li>NLB: Network Load Balancer (NLB).</li>
         * <li>OSS: Object Storage Service (OSS).</li>
         * <li>SAE: Serverless App Engine (SAE).</li>
         * <li>WAF: Web Application Firewall (WAF).</li>
         * </ul>
         * <p>Valid values when CloudName is set to Tencent:</p>
         * <ul>
         * <li>TencentCDN: Content Delivery Network (CDN).</li>
         * <li>TencentCLB: CLB.</li>
         * <li>TencentWAF: WAF.</li>
         * </ul>
         * <p>Valid value when CloudName is set to Huawei:</p>
         * <ul>
         * <li>HuaweiCDN: CDN.</li>
         * </ul>
         * <p>Valid values when CloudName is set to Aws:</p>
         * <ul>
         * <li>AwsCloudFront: Amazon CloudFront.</li>
         * <li>AwsCLB: CLB.</li>
         * <li>AwsALB: ALB.</li>
         * <li>AwsNLB: NLB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        public Builder cloudProduct(String cloudProduct) {
            this.putQueryParameter("CloudProduct", cloudProduct);
            this.cloudProduct = cloudProduct;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
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
         * <p>The keyword of the domain name or instance ID bound to the cloud resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-instanceId</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The AccessKey ID that is used to access cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListCloudResourcesRequest build() {
            return new ListCloudResourcesRequest(this);
        } 

    } 

}
