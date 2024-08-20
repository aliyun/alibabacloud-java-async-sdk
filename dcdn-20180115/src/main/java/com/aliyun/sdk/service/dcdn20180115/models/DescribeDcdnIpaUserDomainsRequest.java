// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnIpaUserDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnIpaUserDomainsRequest</p>
 */
public class DescribeDcdnIpaUserDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckDomainShow")
    private Boolean checkDomainShow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainSearchType")
    private String domainSearchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainStatus")
    private String domainStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuncFilter")
    private String funcFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuncId")
    private String funcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeDcdnIpaUserDomainsRequest(Builder builder) {
        super(builder);
        this.checkDomainShow = builder.checkDomainShow;
        this.domainName = builder.domainName;
        this.domainSearchType = builder.domainSearchType;
        this.domainStatus = builder.domainStatus;
        this.funcFilter = builder.funcFilter;
        this.funcId = builder.funcId;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnIpaUserDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkDomainShow
     */
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainSearchType
     */
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    /**
     * @return domainStatus
     */
    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return funcFilter
     */
    public String getFuncFilter() {
        return this.funcFilter;
    }

    /**
     * @return funcId
     */
    public String getFuncId() {
        return this.funcId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnIpaUserDomainsRequest, Builder> {
        private Boolean checkDomainShow; 
        private String domainName; 
        private String domainSearchType; 
        private String domainStatus; 
        private String funcFilter; 
        private String funcId; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnIpaUserDomainsRequest request) {
            super(request);
            this.checkDomainShow = request.checkDomainShow;
            this.domainName = request.domainName;
            this.domainSearchType = request.domainSearchType;
            this.domainStatus = request.domainStatus;
            this.funcFilter = request.funcFilter;
            this.funcId = request.funcId;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder checkDomainShow(Boolean checkDomainShow) {
            this.putQueryParameter("CheckDomainShow", checkDomainShow);
            this.checkDomainShow = checkDomainShow;
            return this;
        }

        /**
         * The domain name that is used as a keyword to filter domain names. Fuzzy match is supported.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The search method. Default value: full_match. Valid values:
         * <p>
         * 
         * *   **fuzzy_match**: fuzzy match
         * *   **pre_match**: prefix match
         * *   **suf_match**: suffix match
         * *   **full_match**: exact match
         */
        public Builder domainSearchType(String domainSearchType) {
            this.putQueryParameter("DomainSearchType", domainSearchType);
            this.domainSearchType = domainSearchType;
            return this;
        }

        /**
         * The status of the domain name. Valid values:
         * <p>
         * 
         * *   **online**: enabled
         * *   **offline**: disabled
         * *   **configuring**: configuring
         * *   **configure_failed**: configuration failed
         * *   **checking**: reviewing
         * *   **check_failed:** review failed
         */
        public Builder domainStatus(String domainStatus) {
            this.putQueryParameter("DomainStatus", domainStatus);
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * The status of the feature.
         * <p>
         * 
         * *   config: The feature is enabled.
         * *   unconfig: The feature is not enabled.
         */
        public Builder funcFilter(String funcFilter) {
            this.putQueryParameter("FuncFilter", funcFilter);
            this.funcFilter = funcFilter;
            return this;
        }

        /**
         * The ID of the feature. For example, a value of 7 specifies the feature of configuring an expiration rule for a specific directory. For more information about feature IDs, see [Parameters for configuring features for domain names](~~410622~~).
         */
        public Builder funcId(String funcId) {
            this.putQueryParameter("FuncId", funcId);
            this.funcId = funcId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The page number. Valid values: **1** to **100000**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of domain names per page. Default value: **20**.**** Valid values: **1** to **500**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags of the command.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeDcdnIpaUserDomainsRequest build() {
            return new DescribeDcdnIpaUserDomainsRequest(this);
        } 

    } 

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

            /**
             * The tag key. Valid values of N: 1 to 20. You can call the TagDcdnResources operation to set a tag for a domain name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. Valid values of N: 1 to 20.
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
