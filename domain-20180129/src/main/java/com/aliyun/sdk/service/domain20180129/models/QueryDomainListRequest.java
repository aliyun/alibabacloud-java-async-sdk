// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryDomainListRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainListRequest</p>
 */
public class QueryDomainListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewEnabled")
    private Boolean autoRenewEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ccompany")
    private String ccompany;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dns")
    private String dns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainGroupId")
    private String domainGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndExpirationDate")
    private Long endExpirationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndRegistrationDate")
    private Long endRegistrationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByType")
    private String orderByType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderKeyType")
    private String orderKeyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductDomainType")
    private String productDomainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Registrar")
    private String registrar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartExpirationDate")
    private Long startExpirationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartRegistrationDate")
    private Long startRegistrationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private QueryDomainListRequest(Builder builder) {
        super(builder);
        this.autoRenewEnabled = builder.autoRenewEnabled;
        this.ccompany = builder.ccompany;
        this.dns = builder.dns;
        this.domainGroupId = builder.domainGroupId;
        this.domainName = builder.domainName;
        this.endExpirationDate = builder.endExpirationDate;
        this.endRegistrationDate = builder.endRegistrationDate;
        this.lang = builder.lang;
        this.orderByType = builder.orderByType;
        this.orderKeyType = builder.orderKeyType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productDomainType = builder.productDomainType;
        this.queryType = builder.queryType;
        this.registrar = builder.registrar;
        this.resourceGroupId = builder.resourceGroupId;
        this.startExpirationDate = builder.startExpirationDate;
        this.startRegistrationDate = builder.startRegistrationDate;
        this.tag = builder.tag;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewEnabled
     */
    public Boolean getAutoRenewEnabled() {
        return this.autoRenewEnabled;
    }

    /**
     * @return ccompany
     */
    public String getCcompany() {
        return this.ccompany;
    }

    /**
     * @return dns
     */
    public String getDns() {
        return this.dns;
    }

    /**
     * @return domainGroupId
     */
    public String getDomainGroupId() {
        return this.domainGroupId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endExpirationDate
     */
    public Long getEndExpirationDate() {
        return this.endExpirationDate;
    }

    /**
     * @return endRegistrationDate
     */
    public Long getEndRegistrationDate() {
        return this.endRegistrationDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return orderByType
     */
    public String getOrderByType() {
        return this.orderByType;
    }

    /**
     * @return orderKeyType
     */
    public String getOrderKeyType() {
        return this.orderKeyType;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productDomainType
     */
    public String getProductDomainType() {
        return this.productDomainType;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return registrar
     */
    public String getRegistrar() {
        return this.registrar;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startExpirationDate
     */
    public Long getStartExpirationDate() {
        return this.startExpirationDate;
    }

    /**
     * @return startRegistrationDate
     */
    public Long getStartRegistrationDate() {
        return this.startRegistrationDate;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<QueryDomainListRequest, Builder> {
        private Boolean autoRenewEnabled; 
        private String ccompany; 
        private String dns; 
        private String domainGroupId; 
        private String domainName; 
        private Long endExpirationDate; 
        private Long endRegistrationDate; 
        private String lang; 
        private String orderByType; 
        private String orderKeyType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String productDomainType; 
        private String queryType; 
        private String registrar; 
        private String resourceGroupId; 
        private Long startExpirationDate; 
        private Long startRegistrationDate; 
        private java.util.List<Tag> tag; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainListRequest request) {
            super(request);
            this.autoRenewEnabled = request.autoRenewEnabled;
            this.ccompany = request.ccompany;
            this.dns = request.dns;
            this.domainGroupId = request.domainGroupId;
            this.domainName = request.domainName;
            this.endExpirationDate = request.endExpirationDate;
            this.endRegistrationDate = request.endRegistrationDate;
            this.lang = request.lang;
            this.orderByType = request.orderByType;
            this.orderKeyType = request.orderKeyType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productDomainType = request.productDomainType;
            this.queryType = request.queryType;
            this.registrar = request.registrar;
            this.resourceGroupId = request.resourceGroupId;
            this.startExpirationDate = request.startExpirationDate;
            this.startRegistrationDate = request.startRegistrationDate;
            this.tag = request.tag;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * AutoRenewEnabled.
         */
        public Builder autoRenewEnabled(Boolean autoRenewEnabled) {
            this.putQueryParameter("AutoRenewEnabled", autoRenewEnabled);
            this.autoRenewEnabled = autoRenewEnabled;
            return this;
        }

        /**
         * <p>The name of the domain owner.</p>
         * 
         * <strong>example:</strong>
         * <p>广州金烨再生资源回收有限公司</p>
         */
        public Builder ccompany(String ccompany) {
            this.putQueryParameter("Ccompany", ccompany);
            this.ccompany = ccompany;
            return this;
        }

        /**
         * Dns.
         */
        public Builder dns(String dns) {
            this.putQueryParameter("Dns", dns);
            this.dns = dns;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;The ID of the domain group. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation.
         * &lt;props=&quot;intl&quot;&gt;The ID of the domain group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder domainGroupId(String domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * <p>The domain name to query.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the expiration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder endExpirationDate(Long endExpirationDate) {
            this.putQueryParameter("EndExpirationDate", endExpirationDate);
            this.endExpirationDate = endExpirationDate;
            return this;
        }

        /**
         * <p>The end of the registration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder endRegistrationDate(Long endRegistrationDate) {
            this.putQueryParameter("EndRegistrationDate", endRegistrationDate);
            this.endRegistrationDate = endRegistrationDate;
            return this;
        }

        /**
         * <p>The language for API error messages. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * <p>The default value is <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The sort order for the results. Valid values:</p>
         * <ul>
         * <li><p><strong>ASC</strong>: Ascending.</p>
         * </li>
         * <li><p><strong>DESC</strong>: Descending.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is <strong>DESC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderByType(String orderByType) {
            this.putQueryParameter("OrderByType", orderByType);
            this.orderByType = orderByType;
            return this;
        }

        /**
         * <p>The field to use for sorting. Valid values:</p>
         * <ul>
         * <li><p><strong>RegistrationDate</strong>: Sorts by registration date.</p>
         * </li>
         * <li><p><strong>ExpirationDate</strong>: Sorts by expiration date.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>By default, the results are sorted by the time they were added to the system.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RegistrationDate</p>
         */
        public Builder orderKeyType(String orderKeyType) {
            this.putQueryParameter("OrderKeyType", orderKeyType);
            this.orderKeyType = orderKeyType;
            return this;
        }

        /**
         * <p>The page number for the paginated results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
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
         * <p>The domain type. Valid values:</p>
         * <ul>
         * <li><p><strong>New gTLD</strong>: new generic top-level domain.</p>
         * </li>
         * <li><p><strong>gTLD</strong>: generic top-level domain.</p>
         * </li>
         * <li><p><strong>ccTLD</strong>: country-code top-level domain.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>New gTLD</p>
         */
        public Builder productDomainType(String productDomainType) {
            this.putQueryParameter("ProductDomainType", productDomainType);
            this.productDomainType = productDomainType;
            return this;
        }

        /**
         * <p>The type of list to return. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Domain names that require urgent renewal.</p>
         * </li>
         * <li><p><strong>2</strong>: Domain names that require urgent redemption.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * Registrar.
         */
        public Builder registrar(String registrar) {
            this.putQueryParameter("Registrar", registrar);
            this.registrar = registrar;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2indvyxgpfti</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The start of the expiration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder startExpirationDate(Long startExpirationDate) {
            this.putQueryParameter("StartExpirationDate", startExpirationDate);
            this.startExpirationDate = startExpirationDate;
            return this;
        }

        /**
         * <p>The start of the registration date range. The value is a Unix timestamp in milliseconds. Currently, only queries by day are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder startRegistrationDate(Long startRegistrationDate) {
            this.putQueryParameter("StartRegistrationDate", startRegistrationDate);
            this.startRegistrationDate = startRegistrationDate;
            return this;
        }

        /**
         * <p>A list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The user\&quot;s client IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public QueryDomainListRequest build() {
            return new QueryDomainListRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainListRequest} extends {@link TeaModel}
     *
     * <p>QueryDomainListRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>备注</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>标签1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
